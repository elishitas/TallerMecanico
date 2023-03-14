package com.besysoft.TallerMecanico.modelo.entidades;

public class Mecanico extends Persona{

    private Character activo;

    private String especialidad;

    public Mecanico() {
    }

    public Mecanico(Integer id, String apellido, String celular, Direccion direccion, Character activo, String especialidad) {
        super(id, apellido, celular, direccion);
        this.activo = activo;
        this.especialidad = especialidad;
    }

    public Character getActivo() {
        return activo;
    }

    public void setActivo(Character activo) {
        this.activo = activo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
