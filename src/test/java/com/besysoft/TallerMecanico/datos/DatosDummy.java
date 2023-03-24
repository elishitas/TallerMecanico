package com.besysoft.TallerMecanico.datos;

import com.besysoft.TallerMecanico.modelo.entidades.Cliente;
import com.besysoft.TallerMecanico.modelo.entidades.Direccion;
import com.besysoft.TallerMecanico.modelo.entidades.Persona;
import com.besysoft.TallerMecanico.modelo.entidades.Vehiculo;

import java.math.BigDecimal;
import java.util.Arrays;

public class DatosDummy {
    public static Cliente cliente01(){
        Vehiculo vehiculo = new Vehiculo(null,2021,"rojo","Fiat", "Descapotable", "aaaaa");
        return new Cliente("cliente01@cliente.com","0142335581", Arrays.asList(vehiculo));
    }

    public static Cliente cliente02(){
        Vehiculo vehiculo = new Vehiculo(null,1999,"rojo","Fiat", "Descapotable", "bbbbb");
        return new Cliente("cliente02@cliente.com","0112335581", Arrays.asList(vehiculo));
    }

    public static Cliente cliente03(){
        Vehiculo vehiculo = new Vehiculo(null,1998,"rojo","Fiat", "Descapotable", "ccccc");
        return new Cliente("cliente03@cliente.com","0114235581", Arrays.asList(vehiculo));
    }

}
