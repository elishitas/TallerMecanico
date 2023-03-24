package com.besysoft.TallerMecanico.servicios.implementaciones;


import com.besysoft.TallerMecanico.modelo.entidades.Empleado;
import com.besysoft.TallerMecanico.modelo.entidades.enumeradores.TipoEmpleado;
import com.besysoft.TallerMecanico.repositorios.EmpleadoRepository;
import com.besysoft.TallerMecanico.servicios.contratos.EmpleadoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpleadoDAOImpl implements EmpleadoDAO {

    @Autowired
    private EmpleadoRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Empleado> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Empleado save(Empleado empleado) {
        return repository.save(empleado);
    }

    @Override
    public Iterable<Empleado> buscarEmpleadoPorTipo(TipoEmpleado tipoEmpleado) {
        return repository.findEmpleadoByTipoEmpleado(tipoEmpleado);
    }
}