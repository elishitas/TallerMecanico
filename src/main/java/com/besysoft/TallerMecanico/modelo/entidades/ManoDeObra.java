package com.besysoft.TallerMecanico.modelo.entidades;

import java.time.Duration;

public class ManoDeObra {

    private Integer id;

    private Duration duracionHs;

    public ManoDeObra() {
    }

    public ManoDeObra(Integer id, Duration duracionHs) {
        this.id = id;
        this.duracionHs = duracionHs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Duration getDuracionHs() {
        return duracionHs;
    }

    public void setDuracionHs(Duration duracionHs) {
        this.duracionHs = duracionHs;
    }
}
