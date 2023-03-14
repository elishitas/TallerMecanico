package com.besysoft.TallerMecanico.modelo.entidades;

import java.math.BigDecimal;

public class Repuesto {

    private Integer id;

    private String marca;

    private String modelo;

    private BigDecimal valor;

    public Repuesto() {
    }

    public Repuesto(Integer id, String marca, String modelo, BigDecimal valor) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
