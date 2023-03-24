package com.besysoft.TallerMecanico.servicios.contratos;

import com.besysoft.TallerMecanico.modelo.entidades.Mecanico;

import java.util.List;
import java.util.Optional;

public interface MecanicoDAO {

    List<Mecanico> findAll();
    Optional<Mecanico> buscarPorCelular(String celular);
    Iterable<Mecanico> findMecanicoPorApellido(String apellido);
}
