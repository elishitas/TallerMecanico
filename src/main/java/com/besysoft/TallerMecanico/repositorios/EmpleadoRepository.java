package com.besysoft.TallerMecanico.repositorios;

import com.besysoft.TallerMecanico.modelo.entidades.Empleado;
import com.besysoft.TallerMecanico.modelo.entidades.enumeradores.TipoEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface EmpleadoRepository extends JpaRepository <Empleado, Integer> {

    @Query("select e from Empleado e where e.tipoEmpleado = ?1")
    Iterable<Empleado> findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado);

}