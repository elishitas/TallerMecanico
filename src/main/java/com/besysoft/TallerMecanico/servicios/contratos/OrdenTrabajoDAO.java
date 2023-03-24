package com.besysoft.TallerMecanico.servicios.contratos;

import com.besysoft.TallerMecanico.modelo.entidades.OrdenTrabajo;

import java.util.List;
import java.util.Optional;

public interface OrdenTrabajoDAO {

    List<OrdenTrabajo> findAll();

    Optional<OrdenTrabajo> findById(Integer id);
}
