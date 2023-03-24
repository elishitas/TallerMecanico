package com.besysoft.TallerMecanico.servicios.contratos;

import com.besysoft.TallerMecanico.modelo.entidades.Vehiculo;

import java.util.List;
import java.util.Optional;

public interface VehiculoDAO{

    Optional<Vehiculo> findById(Integer id);

    List<Vehiculo> findAll();

    Optional<Vehiculo> findByPatente(String patente);

    Vehiculo create(Vehiculo vehiculo);

    Vehiculo save(Vehiculo vehiculo);


}
