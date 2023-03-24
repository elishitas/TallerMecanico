package com.besysoft.TallerMecanico.servicios.contratos;

import com.besysoft.TallerMecanico.exception.InvalidException;
import com.besysoft.TallerMecanico.modelo.entidades.Cliente;
import com.besysoft.TallerMecanico.modelo.entidades.ManoObra;
import com.besysoft.TallerMecanico.modelo.entidades.OrdenTrabajo;
import com.besysoft.TallerMecanico.modelo.entidades.Repuesto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TallerServiceDAO {
        void recibirClienteYVehiculo(Integer empleadoId, Cliente cliente) throws InvalidException;

        void generarOrdenDeTrabajo(Integer empleadoId, String nivelCombustible, Integer kilometraje, String detalleFalla, String patenteVehiculo, Integer mecanicoId) throws InvalidException;

        List<ManoObra> listarManosDeObraAsignadas(Integer mecanicoId);

        void iniciarReparacion(Integer manoObraid);

        void finalizarReparacion(Integer manoObraId, String detalle, Integer duracion_hs);

        void cargarRepuestos(Integer manoObraId, Repuesto repuestos, Integer cantidad);

        void ordenParaFacturar(Integer manoObraId);

        void facturar(Integer empleadoId, OrdenTrabajo ordenTrabajo) throws InvalidException;

        @Transactional
        void entregarVehiculo(Integer empleadoId, Integer ordenTrabajoId) throws InvalidException;
}


