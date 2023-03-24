package com.besysoft.TallerMecanico.comandos;

import com.besysoft.TallerMecanico.modelo.entidades.Direccion;
import com.besysoft.TallerMecanico.modelo.entidades.Empleado;
import com.besysoft.TallerMecanico.modelo.entidades.enumeradores.TipoEmpleado;
import com.besysoft.TallerMecanico.servicios.contratos.EmpleadoDAO;
import com.besysoft.TallerMecanico.servicios.implementaciones.EmpleadoDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Deprecated
public class EmpleadoCommand implements CommandLineRunner {

    @Autowired
    @Qualifier(value = "empleadoDAOImpl")
    private EmpleadoDAO servicio;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--------- ************ Empleados Command ************ ---------");

        Empleado empleado1 = new Empleado(null,"Domingue","1161810720",new Direccion("Davel","1854","8","Longchamos","2020","8"),"Lucrecia Rigoberta",TipoEmpleado.ADMINISTRATIVO);
        Empleado save = servicio.save(empleado1);
        System.out.println(save.toString());

        //Iterable<Empleado> iEmpleado = ((EmpleadoDAO) servicioEmpleado).buscarEmpleadoPorTipo(TipoEmpleado.ADMINISTRATIVO);

        //iEmpleado.forEach(System.out::println);
    }

}