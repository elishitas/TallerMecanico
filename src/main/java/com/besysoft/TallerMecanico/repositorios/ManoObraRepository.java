package com.besysoft.TallerMecanico.repositorios;

import com.besysoft.TallerMecanico.modelo.entidades.ManoObra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ManoObraRepository extends JpaRepository<ManoObra, Integer> {

    Optional<ManoObra> findByOrdenTrabajo_Id(Integer id);

    List<ManoObra> findByMecanico_Id(Integer id);
}
