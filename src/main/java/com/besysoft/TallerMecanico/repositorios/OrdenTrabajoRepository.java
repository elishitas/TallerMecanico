package com.besysoft.TallerMecanico.repositorios;

import com.besysoft.TallerMecanico.modelo.entidades.OrdenTrabajo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenTrabajoRepository extends JpaRepository<OrdenTrabajo, Integer> {
}
