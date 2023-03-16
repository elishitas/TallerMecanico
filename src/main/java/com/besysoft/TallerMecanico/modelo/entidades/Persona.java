package com.besysoft.TallerMecanico.modelo.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Data
@MappedSuperclass
public abstract class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(length = 255, name = "apellido", nullable = false)
    private String apellido;

    @Column(length = 15, name = "celular", nullable = false)
    private String celular;

    @Embedded
    private Direccion direccion;

    @Column(length = 255, name = "nombres", nullable = false)
    private String nombres;

}
