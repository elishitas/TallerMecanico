package com.besysoft.TallerMecanico.repositorios;

import com.besysoft.TallerMecanico.modelo.entidades.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface VehiculoRepositorio extends JpaRepository<Vehiculo, Integer> {
}
