package com.besysoft.TallerMecanico.comandos;

import com.besysoft.TallerMecanico.modelo.entidades.Vehiculo;
import com.besysoft.TallerMecanico.servicios.contratos.VehiculoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Deprecated
@Component
@Order(3)
public class VehiculosCommand implements CommandLineRunner {

    @Autowired
    private VehiculoDAO servicio;

    @Override
    public void run(String... args) throws Exception {
        /*System.out.println("--------- ************ Vehiculos Command ************ ---------");

        Vehiculo fiat = new Vehiculo(null, 2020, "verde", "Fiat", "1988", "HHH");
        Vehiculo ford = new Vehiculo(null, 2020, "verde", "Fiat", "1988", "jjj");
        Vehiculo honda = new Vehiculo(null, 2020, "verde", "Fiat", "1988", "lll");
        Vehiculo volkswagen = new Vehiculo(null, 2020, "verde", "Fiat", "1988", "mmm");

        servicio.save(fiat);
        servicio.save(ford);
        servicio.save(honda);
        servicio.save(volkswagen);*/

        //System.out.println(save.toString());

        Optional<Vehiculo> vehiculos = servicio.findByPatente("HHH");
        System.out.println(vehiculos);
        //vehiculos.findAll(System.out::println);

    }
}
