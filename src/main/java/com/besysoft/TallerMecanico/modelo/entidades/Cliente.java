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
@Table(name = "clientes")
public class Cliente extends Persona{

    @Column(length = 255, name = "correo_electronico", nullable = false)
    private String correoElectronico;

    @Column(length = 15, name = "telefono_linea", nullable = false)
    private String telefonoLinea;

    @ManyToMany(fetch = FetchType.LAZY,mappedBy = "clientes")
    private List<Vehiculo> vehiculos;

}
