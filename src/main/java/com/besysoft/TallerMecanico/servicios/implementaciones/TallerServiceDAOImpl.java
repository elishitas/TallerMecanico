package com.besysoft.TallerMecanico.servicios.implementaciones;

import com.besysoft.TallerMecanico.exception.InvalidException;
import com.besysoft.TallerMecanico.modelo.entidades.*;
import com.besysoft.TallerMecanico.modelo.entidades.enumeradores.TipoOrdenTrabajo;
import com.besysoft.TallerMecanico.repositorios.*;
import com.besysoft.TallerMecanico.servicios.contratos.TallerServiceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.besysoft.TallerMecanico.modelo.entidades.enumeradores.TipoEmpleado.ADMINISTRATIVO;
import static com.besysoft.TallerMecanico.modelo.entidades.enumeradores.TipoEmpleado.RECEPCIONISTA;


public class TallerServiceDAOImpl implements TallerServiceDAO {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private OrdenTrabajoRepository ordenTrabajoRepository;

    @Autowired
    private ManoObraRepository manoObraRepository;

    @Autowired
    private RepuestoRepository repuestoRepository;

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    @Transactional
    public void recibirClienteYVehiculo(Integer empleadoId, Cliente cliente) throws InvalidException {

        Vehiculo vehiculo = cliente.getVehiculos().get(0);

        Empleado empleado = empleadoRepository.findById(empleadoId).orElseThrow();

        if (!Objects.equals(empleado.getTipoEmpleado(), RECEPCIONISTA)) {
            throw new InvalidException("Error: debe ser recepcionista para realizar esta acción");
        }

        Optional<Vehiculo> vehiculoExistente = this.vehiculoRepository.findByPatente(vehiculo.getPatente());
        Optional<Cliente> clienteExistente = this.clienteRepository.findByCorreoElectronico(cliente.getCorreoElectronico());

        if (vehiculoExistente.isPresent()) {
            if (clienteExistente.isPresent()) {
                clienteExistente.get().getVehiculos().add(vehiculoExistente.get());
                return;
            }
            cliente.setVehiculos(List.of(vehiculoExistente.get()));
            clienteRepository.save(cliente);
            return;
        }

        if (clienteExistente.isPresent()) {
            clienteExistente.get().getVehiculos().add(vehiculo);
            return;
        }

        clienteRepository.save(cliente);
    }



    @Override
    public void generarOrdenDeTrabajo(Integer empleadoId, String nivelCombustible, Integer kilometraje, String detalleFalla, String patenteVehiculo, Integer mecanicoId) throws InvalidException {

    }

    @Override
    @Transactional(readOnly = true)
    public List<ManoObra> listarManosDeObraAsignadas(Integer mecanicoId) {
        return this.manoObraRepository.findByMecanico_Id(mecanicoId).stream()
                .filter(x -> x.getOrdenTrabajo().getEstado() == TipoOrdenTrabajo.CREADA)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void iniciarReparacion(Integer manoObraId) {
        ManoObra manoObra = this.manoObraRepository.findById(manoObraId).orElseThrow();
        OrdenTrabajo ordenTrabajo = manoObra.getOrdenTrabajo();
        ordenTrabajo.setEstado(TipoOrdenTrabajo.EN_REPARACION);
        ordenTrabajoRepository.save(ordenTrabajo);
    }

    @Override
    @Transactional
    public void finalizarReparacion(Integer manoObraId, String detalle, Integer duracion_hs) {
        ManoObra manoObra = this.manoObraRepository.findById(manoObraId).orElseThrow();
        OrdenTrabajo ordenTrabajo = manoObra.getOrdenTrabajo();

        ordenTrabajo.setFechaFinReparacion(LocalDateTime.now());

        manoObra.setDetalle(detalle);
        manoObra.setDuracionHs(Duration.ofHours(duracion_hs));

        manoObraRepository.save(manoObra);
    }

    @Override
    @Transactional
    public void cargarRepuestos(Integer manoObraId, Repuesto repuesto, Integer cantidad) {
        DetalleOrdenTrabajo detalleOrdenTrabajo = new DetalleOrdenTrabajo();
        ManoObra manoObra = this.manoObraRepository.findById(manoObraId).orElseThrow();
        OrdenTrabajo ordenTrabajo = manoObra.getOrdenTrabajo();

        detalleOrdenTrabajo.setOrdenTrabajo(ordenTrabajo);
        detalleOrdenTrabajo.setRepuesto(repuesto);
        detalleOrdenTrabajo.setCantidad(cantidad);

        BigDecimal valor_total = repuesto.getValor().multiply(BigDecimal.valueOf(cantidad));
        detalleOrdenTrabajo.setValorTotal(valor_total);

        ordenTrabajoRepository.save(ordenTrabajo);
    }

    @Override
    @Transactional
    public void ordenParaFacturar(Integer manoObraId) {
        ManoObra manoObra = this.manoObraRepository.findById(manoObraId).orElseThrow();
        OrdenTrabajo ordenTrabajo = manoObra.getOrdenTrabajo();

        ordenTrabajo.setEstado(TipoOrdenTrabajo.PARA_FACTURAR);

        this.ordenTrabajoRepository.save(ordenTrabajo);
    }

    @Override
    @Transactional
    public void facturar(Integer empleadoId, OrdenTrabajo ordenTrabajo) throws InvalidException {

            Empleado empleado = empleadoRepository.findById(empleadoId)
                    .orElseThrow(() -> new InvalidException("Error: no se encontró el empleado"));

            if (!empleado.getTipoEmpleado().equals(ADMINISTRATIVO)) {
                throw new InvalidException("Error: debe ser administrativo para realizar esta acción");
            }

            ordenTrabajo.setFechaPago(LocalDateTime.now());
            ordenTrabajo.setEstado(TipoOrdenTrabajo.FACTURADA);
            ordenTrabajo.setAdministrativo(empleado);

            ordenTrabajoRepository.save(ordenTrabajo);
    }


    @Override
    @Transactional
    public void entregarVehiculo(Integer empleadoId, Integer ordenTrabajoId) throws InvalidException {

        Empleado empleado = this.empleadoRepository.findById(empleadoId).orElseThrow();

        if (!Objects.equals(empleado.getTipoEmpleado(), RECEPCIONISTA)) {
            throw new InvalidException("Error: debe ser recepcionista para realizar esta acción");
        }

        OrdenTrabajo ordenTrabajo = this.ordenTrabajoRepository.findById(ordenTrabajoId).orElseThrow();

        ordenTrabajo.setEstado(TipoOrdenTrabajo.CERRADA);

        this.ordenTrabajoRepository.save(ordenTrabajo);
    }
}
