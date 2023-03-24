package com.besysoft.TallerMecanico.servicios.contratos;

import com.besysoft.TallerMecanico.modelo.entidades.Empleado;
import com.besysoft.TallerMecanico.modelo.entidades.enumeradores.TipoEmpleado;

import java.util.List;


public interface EmpleadoDAO{

    List<Empleado> findAll();
    Empleado save(Empleado empleado);
    Iterable<Empleado> buscarEmpleadoPorTipo(TipoEmpleado tipoEmpleado);
}