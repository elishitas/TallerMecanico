package com.besysoft.TallerMecanico.servicios.implementaciones;

import com.besysoft.TallerMecanico.modelo.entidades.Vehiculo;
import com.besysoft.TallerMecanico.repositorios.VehiculoRepository;
import com.besysoft.TallerMecanico.servicios.contratos.VehiculoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoDAOImpl implements VehiculoDAO {

    @Autowired
    private VehiculoRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Optional<Vehiculo> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Optional<Vehiculo> findByPatente(String patente) {
        return repository.findByPatente(patente);
    }

    @Override
    public Vehiculo create(Vehiculo vehiculo) {
        return null;
    }

    @Override
    @Transactional
    public Vehiculo save(Vehiculo vehiculo) {
        return repository.save(vehiculo);
    }

    @Override
    public List<Vehiculo> findAll() {
        return repository.findAll();
    }


}
