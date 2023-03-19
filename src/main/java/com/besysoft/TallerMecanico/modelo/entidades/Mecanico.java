package com.besysoft.TallerMecanico.modelo.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name = "mecanicos")
public class Mecanico extends Persona{

    @Column(name = "activo", nullable = false)
    private Character activo;

    @Column(length = 255, name = "especialidad", nullable = false)
    private String especialidad;

    @OneToMany(mappedBy = "mecanico")
    private List<ManoDeObra> manoDeObra;

}
