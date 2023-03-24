package com.besysoft.TallerMecanico.repositorios;

import com.besysoft.TallerMecanico.modelo.entidades.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {

    //@Query
    Optional<Vehiculo> findByPatente(String patente);
}
