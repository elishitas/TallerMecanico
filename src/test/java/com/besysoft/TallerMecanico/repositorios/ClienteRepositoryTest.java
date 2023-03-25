package com.besysoft.TallerMecanico.repositorios;

import com.besysoft.TallerMecanico.datos.DatosDummy;
import com.besysoft.TallerMecanico.modelo.entidades.Cliente;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;



@DataJpaTest
class ClienteRepositoryTest {
    /*
    @Autowired
    ClienteRepository clienteRepository;

    @Test
    @DisplayName("Buscar Clientes por Correo")
    void findByCorreoElectronico() {
x
        //given
        Cliente cliente01 = DatosDummy.cliente01();
        clienteRepository.save(cliente01);
        Cliente cliente02 = DatosDummy.cliente02();
        clienteRepository.save(cliente02);
        Cliente cliente03 = DatosDummy.cliente03();
        clienteRepository.save(cliente03);

        //when
        Cliente expected = clienteRepository.findByCorreoElectronico("cliente")
                .orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
        List<Cliente> resultList = Collections.singletonList(expected);

        //then
        if (resultList.size() == 2) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }

         */
}