package com.besysoft.TallerMecanico.controlador;

import com.besysoft.TallerMecanico.modelo.entidades.ManoObra;
import com.besysoft.TallerMecanico.modelo.entidades.Mecanico;
import com.besysoft.TallerMecanico.modelo.entidades.OrdenTrabajo;
import com.besysoft.TallerMecanico.repositorios.ManoObraRepository;
import com.besysoft.TallerMecanico.repositorios.MecanicoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/mecanicos")
public class MecanicoController {
    // ...

    @PatchMapping("/{mecanicoId}")
    public ResponseEntity<Void> actualizarMecanico(@PathVariable Integer mecanicoId, @RequestBody MecanicoRequest request) {
        Optional<Mecanico> optionalMecanico = MecanicoRepository.findById(mecanicoId);
        if (optionalMecanico.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        Mecanico mecanico = optionalMecanico.get();
        if (request.getNombre() != null) {
            mecanico.setNombre(request.getNombre());
        }
        if (request.getApellido() != null) {
            mecanico.setApellido(request.getApellido());
        }
        if (request.getEspecialidad() != null) {
            mecanico.setEspecialidad(request.getEspecialidad());
        }

        mecanicoRepository.save(mecanico);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{ordenTrabajoId}/ordenes-trabajo")
    public ResponseEntity<Void> actualizarOrdenTrabajo(@PathVariable Integer ordenTrabajoId, @RequestBody OrdenTrabajoRequest request) {
        Optional<OrdenTrabajo> optionalOrdenTrabajo = ordenTrabajoRepository.findById(ordenTrabajoId);
        if (optionalOrdenTrabajo.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        OrdenTrabajo ordenTrabajo = optionalOrdenTrabajo.get();
        if (request.getDetalleFalla() != null) {
            ordenTrabajo.setDetalleFalla(request.getDetalleFalla());
        }
        if (request.getKilometraje() != null) {
            ordenTrabajo.setKilometraje(request.getKilometraje());
        }
        if (request.getNivelCombustible() != null) {
            ordenTrabajo.setNivelCombustible(request.getNivelCombustible());
        }

        ordenTrabajoRepository.save(ordenTrabajo);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{manoObraId}/mano-obra")
    public ResponseEntity<Void> actualizarManoObra(@PathVariable Integer manoObraId, @RequestBody ManoObraRequest request) {
        Optional<ManoObra> optionalManoObra = ManoObraRepository.findById(manoObraId);
        if (optionalManoObra.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        ManoObra manoObra = optionalManoObra.get();
        if (request.getDescripcion() != null) {
            manoObra.setDescripcion(request.getDescripcion());
        }
        if (request.getHorasTrabajadas() != null) {
            manoObra.setHorasTrabajadas(request.getHorasTrabajadas());
        }
        if (request.getPrecioHora() != null) {
            manoObra.setPrecioHora(request.getPrecioHora());
        }

        ManoObraRepository.save(manoObra);
        return ResponseEntity.noContent().build();
    }
}