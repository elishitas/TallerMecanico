package com.besysoft.TallerMecanico.modelo.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@Table(name = "vehiculos")
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "anio", nullable = false)
    private Integer anio;

    @Column(length = 255, name = "color", nullable = false)
    private  String color;

    @Column(length = 255, name = "marca", nullable = false)
    private  String marca;

    @Column(length = 255, name = "modelo", nullable = false)
    private String modelo;

    @Column(length = 255, name = "patente", nullable = false, unique = true)
    private String patente;

    public Vehiculo(Integer id, Integer anio, String color, String marca, String modelo, String patente) {
        this.id = id;
        this.anio = anio;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "cliente_vehiculo",
            joinColumns = @JoinColumn(name = "cliente_id"),
            inverseJoinColumns = @JoinColumn(name = "vehiculo_id"))
    private List<Cliente> clientes;

}
