package com.besysoft.TallerMecanico.servicios.implementaciones;

import com.besysoft.TallerMecanico.modelo.entidades.DetalleOrdenTrabajo;
import com.besysoft.TallerMecanico.repositorios.DetalleOrdenTrabajoRepository;
import com.besysoft.TallerMecanico.servicios.contratos.DetalleOrdenTrabajoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class DetalleOrdenTrabajoDAOImpl implements DetalleOrdenTrabajoDAO {

    @Autowired
    private  DetalleOrdenTrabajoRepository repository;

    public DetalleOrdenTrabajoDAOImpl (DetalleOrdenTrabajoRepository detalleOrdenTrabajoRepository) {
        this.repository = detalleOrdenTrabajoRepository;
    }


    @Override
    @Transactional(readOnly = true)
    public DetalleOrdenTrabajo findByRepuesto_Id(Integer id) {
        return repository.findByRepuesto_Id(id).orElseThrow();
    }
}

