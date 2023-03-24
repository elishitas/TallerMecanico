package com.besysoft.TallerMecanico.comandos;

import com.besysoft.TallerMecanico.modelo.entidades.Direccion;
import com.besysoft.TallerMecanico.modelo.entidades.Empleado;
import com.besysoft.TallerMecanico.modelo.entidades.enumeradores.TipoEmpleado;

import java.math.BigDecimal;
@Deprecated
public class ObjetosDummy {

    public static Empleado getEmpleadoUno(){
       return new Empleado(null,"Domingue","1161810720",new Direccion("Davel","1854","8","Longchamos","2020","8"),"Lucrecia Rigoberta",TipoEmpleado.ADMINISTRATIVO);
    }


}
