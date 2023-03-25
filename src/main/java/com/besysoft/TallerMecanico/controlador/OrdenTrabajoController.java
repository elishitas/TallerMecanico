package com.besysoft.TallerMecanico.controlador;

import com.besysoft.TallerMecanico.exception.InvalidException;
import com.besysoft.TallerMecanico.modelo.entidades.Cliente;
import com.besysoft.TallerMecanico.servicios.implementaciones.TallerServiceDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orden-trabajo")
public class OrdenTrabajoController {

    private final TallerServiceDAOImpl tallerServiceDAO;

    @Autowired
    public OrdenTrabajoController(TallerServiceDAOImpl tallerServiceDAO) {
        this.tallerServiceDAO = tallerServiceDAO;
    }

    @PostMapping("/recibir-cliente-vehiculo")
    public ResponseEntity<?> recibirClienteYVehiculo(@RequestParam Integer empleadoId, @RequestBody Cliente cliente) {
        try {
            tallerServiceDAO.recibirClienteYVehiculo(empleadoId, cliente);
            return ResponseEntity.ok().build();
        } catch (InvalidException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}