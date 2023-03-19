package com.besysoft.TallerMecanico.repositorios;

import com.besysoft.TallerMecanico.modelo.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {
}
