package com.besysoft.TallerMecanico.modelo.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@Table(name = "repuestos")
public class Repuesto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(length = 255, name = "marca", nullable = false)
    private String marca;

    @Column(length = 255, name = "modelo", nullable = false)
    private String modelo;

    @Column(length = 255, name = "repuesto", nullable = false)
    private String repuesto;

    @Column(length = 255, name = "valor", nullable = false)
    private BigDecimal valor;

}
