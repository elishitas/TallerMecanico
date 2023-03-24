package com.besysoft.TallerMecanico.repositorios;

import com.besysoft.TallerMecanico.modelo.entidades.DetalleOrdenTrabajo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DetalleOrdenTrabajoRepository extends JpaRepository<DetalleOrdenTrabajo, Integer> {

    Optional<DetalleOrdenTrabajo> findByRepuesto_Id(Integer id);
}
