package com.besysoft.TallerMecanico.modelo.entidades;

import com.besysoft.TallerMecanico.modelo.entidades.enumeradores.TipoEmpleado;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false, exclude = "id")
@Table(name = "empleados")
public class Empleado extends Persona{

    @Column(name = "tipo_empleado")
    @Enumerated(EnumType.STRING)
    private TipoEmpleado tipoEmpleado;

    public Empleado(Integer id, String apellido, String celular, Direccion direccion, String nombres, TipoEmpleado tipoEmpleado) {
        super(id, apellido, celular, direccion, nombres);
        this.tipoEmpleado = tipoEmpleado;
    }


}
