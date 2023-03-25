package com.besysoft.TallerMecanico.servicios.implementaciones;

import com.besysoft.TallerMecanico.modelo.entidades.Cliente;
import com.besysoft.TallerMecanico.repositorios.ClienteRepository;
import com.besysoft.TallerMecanico.servicios.contratos.ClienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteDAOImpl implements ClienteDAO {

    @Autowired
    private ClienteRepository repository;


    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return repository.findAll();
    }
}
