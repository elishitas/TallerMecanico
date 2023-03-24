package com.besysoft.TallerMecanico.servicios.contratos;

import com.besysoft.TallerMecanico.modelo.entidades.ManoObra;

import java.util.List;

public interface ManoObraDAO {

    List<ManoObra> findAll();
    ManoObra findByOrdenTrabajo_Id(Long id);
}
