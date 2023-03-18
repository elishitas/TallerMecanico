package com.besysoft.TallerMecanico.modelo.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
    @Digits(integer = 17,fraction = 2)
    private BigDecimal valor;

    @OneToMany(mappedBy = "repuesto")
    private List<DetalleOrdenTrabajo> detalleOrdenTrabajos=new ArrayList<>();
}
