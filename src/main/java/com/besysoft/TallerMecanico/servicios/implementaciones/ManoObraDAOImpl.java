package com.besysoft.TallerMecanico.servicios.implementaciones;

import com.besysoft.TallerMecanico.modelo.entidades.ManoObra;
import com.besysoft.TallerMecanico.repositorios.ManoObraRepository;
import com.besysoft.TallerMecanico.servicios.contratos.ManoObraDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ManoObraDAOImpl implements ManoObraDAO {

    @Autowired
    private ManoObraRepository repository;

    @Override
    public List<ManoObra> findAll() {
        return null;
    }

    @Override
    public ManoObra findByOrdenTrabajo_Id(Long id) {
        return null;
    }
}
