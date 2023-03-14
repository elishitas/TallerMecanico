package com.besysoft.TallerMecanico.modelo.entidades;

import com.besysoft.TallerMecanico.modelo.enumeradores.TipoEmpleado;

public class Empleado extends Persona{
    private TipoEmpleado tipoEmpleado;

    public Empleado() {
    }

    public Empleado(Integer id, String apellido, String celular, Direccion direccion, TipoEmpleado tipoEmpleado) {
        super(id, apellido, celular, direccion);
        this.tipoEmpleado = tipoEmpleado;
    }

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
}
