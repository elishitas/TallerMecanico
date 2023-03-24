package com.besysoft.TallerMecanico.servicios.contratos;

import com.besysoft.TallerMecanico.modelo.entidades.DetalleOrdenTrabajo;

public interface DetalleOrdenTrabajoDAO {

    DetalleOrdenTrabajo findByRepuesto_Id(Integer id);
}
