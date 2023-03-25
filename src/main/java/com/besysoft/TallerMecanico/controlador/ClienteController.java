package com.besysoft.TallerMecanico.controlador;

import com.besysoft.TallerMecanico.modelo.entidades.Cliente;
import com.besysoft.TallerMecanico.modelo.entidades.Vehiculo;
import com.besysoft.TallerMecanico.servicios.implementaciones.ClienteDAOImpl;
import com.besysoft.TallerMecanico.servicios.implementaciones.TallerServiceDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Clientes")
public class ClienteController {

    @Autowired
    private TallerServiceDAOImpl tallerServiceDAO;

    @PostMapping
    public ResponseEntity<Cliente> crearCliente(@RequestBody Cliente nuevoCliente) {
        Cliente clienteCreado = nuevoCliente;
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteCreado);
    }

    @PostMapping("/clientes-vehiculos")
    public ResponseEntity<?> agregarClienteVehiculo(@RequestBody Cliente clienteVehiculo) {
        // Validar si el cliente existe
        Cliente cliente = Cliente.obtenerPorId(clienteVehiculo.getIdCliente());
        if (cliente == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encontrado");
        }

        // Validar si el vehiculo existe
        Vehiculo vehiculo = Vehiculo.obtenerPorId(clienteVehiculo.getIdVehiculo());
        if (vehiculo == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Vehiculo no encontrado");
        }

        // Agregar el cliente-vehiculo
        clienteVehiculo.agregarClienteVehiculo(clienteVehiculo);

        return ResponseEntity.ok("Cliente-Vehiculo agregado correctamente");
    }
}
