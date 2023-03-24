package com.besysoft.TallerMecanico.modelo.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Duration;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@Table(name = "mano_obra")
public class ManoObra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "detalle", nullable = false)
    private String detalle;

    @Column(name = "duracion_hs", nullable = false)
    private Duration duracionHs;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "mecanico_id")
    private Mecanico mecanico;

    @ManyToOne
    @JoinColumn(name = "orden_trabajo_id")
    private OrdenTrabajo ordenTrabajo;

}
