package com.besysoft.TallerMecanico.servicios.implementaciones;

import com.besysoft.TallerMecanico.modelo.entidades.OrdenTrabajo;
import com.besysoft.TallerMecanico.repositorios.OrdenTrabajoRepository;
import com.besysoft.TallerMecanico.servicios.contratos.OrdenTrabajoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public class OrdenTrabajoDAOImpl implements OrdenTrabajoDAO {

    @Autowired
    private OrdenTrabajoRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<OrdenTrabajo> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<OrdenTrabajo> findById(Integer id) {
        return repository.findById(id);
    }
}
