package com.besysoft.TallerMecanico.comandos;

//import com.springsimplespasos.universidad.universidadbackend.servicios.contratos.PersonaDAO;


import com.besysoft.TallerMecanico.modelo.entidades.Empleado;
import com.besysoft.TallerMecanico.modelo.entidades.enumeradores.TipoEmpleado;
import com.besysoft.TallerMecanico.servicios.contratos.EmpleadoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Deprecated
@Component
@Order(1)
public class InitCommand implements CommandLineRunner {

    @Autowired
    @Qualifier(value = "empleadoDAOImpl")
    private EmpleadoDAO servicioEmpleado;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("--------- ************ Empleados Command ************ ---------");

        Iterable<Empleado> iEmpleado = ((EmpleadoDAO) servicioEmpleado).buscarEmpleadoPorTipo(TipoEmpleado.ADMINISTRATIVO);

        iEmpleado.forEach(System.out::println);
    }
}