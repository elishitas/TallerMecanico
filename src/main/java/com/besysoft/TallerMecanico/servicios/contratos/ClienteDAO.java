package com.besysoft.TallerMecanico.servicios.contratos;

import com.besysoft.TallerMecanico.modelo.entidades.Cliente;

import java.util.List;

public interface ClienteDAO {

    List<Cliente> findAll();

}
