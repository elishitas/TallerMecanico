package com.besysoft.TallerMecanico.repositorios;

import com.besysoft.TallerMecanico.modelo.entidades.Mecanico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface MecanicoRepository extends JpaRepository<Mecanico, Integer> {

    @Query("select m from Mecanico m where m.celular = ?1")
    Optional<Mecanico> buscarPorCelular(String celular);

    @Query("select m from Mecanico m where m.apellido like %?1%")
    Iterable<Mecanico> findMecanicoPorApellido(String apellido);
}
