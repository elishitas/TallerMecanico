package com.besysoft.TallerMecanico.modelo.entidades;

public class Cliente extends Persona{

    private String telefonoLinea;

    private String correoElectronico;

    public Cliente() {
    }

    public Cliente(Integer id, String apellido, String celular, Direccion direccion, String telefonoLinea, String correoElectronico) {
        super(id, apellido, celular, direccion);
        this.telefonoLinea = telefonoLinea;
        this.correoElectronico = correoElectronico;
    }
}
