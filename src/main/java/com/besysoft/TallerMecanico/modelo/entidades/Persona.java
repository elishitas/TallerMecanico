package com.besysoft.TallerMecanico.modelo.entidades;

import java.io.Serializable;
import java.util.Objects;

public abstract class Persona implements Serializable {

    private Integer id;

    private String apellido;

    private String celular;

    private Direccion direccion;

    public Persona() {
    }

    public Persona(Integer id, String apellido, String celular, Direccion direccion) {
        this.id = id;
        this.apellido = apellido;
        this.celular = celular;
        this.direccion = direccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", apellido='" + apellido + '\'' +
                ", celular='" + celular + '\'' +
                ", direccion=" + direccion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return id.equals(persona.id) && celular.equals(persona.celular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, celular);
    }
}
