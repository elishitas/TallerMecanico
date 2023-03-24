package com.besysoft.TallerMecanico.servicios.implementaciones;

import com.besysoft.TallerMecanico.modelo.entidades.Mecanico;
import com.besysoft.TallerMecanico.repositorios.EmpleadoRepository;
import com.besysoft.TallerMecanico.repositorios.MecanicoRepository;
import com.besysoft.TallerMecanico.servicios.contratos.MecanicoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MecanicoDAOImpl implements MecanicoDAO {

    @Autowired
    private MecanicoRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Mecanico> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Mecanico> buscarPorCelular(String celular) {
        return repository.buscarPorCelular(celular);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<Mecanico> findMecanicoPorApellido(String apellido) {
        return repository.findMecanicoPorApellido(apellido);
    }
}
