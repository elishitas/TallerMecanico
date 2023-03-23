package com.besysoft.TallerMecanico.repositorios;

import com.besysoft.TallerMecanico.modelo.entidades.ManoDeObra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ManoDeObraRepository extends JpaRepository<ManoDeObra, Integer> {

    Optional<ManoDeObra> findByOrdenTrabajo_Id(Long id);

    List<ManoDeObra> findByMecanico_Id(Long id);
}
