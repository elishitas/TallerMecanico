package com.besysoft.TallerMecanico.modelo.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@MappedSuperclass
public class Direccion implements Serializable {

    @Column(length = 255, name = "calle", nullable = false)
    private String calle;

    @Column(length = 255, name = "codigo_postal", nullable = false)
    private String codigoPostal;

    @Column(length = 255, name = "departamento", nullable = false)
    private String departamento;

    @Column(length = 255, name = "localidad", nullable = false)
    private String localidad;

    @Column(length = 255, name = "numero", nullable = false)
    private String numero;

    @Column(length = 255, name = "piso", nullable = false)
    private String piso;

}
