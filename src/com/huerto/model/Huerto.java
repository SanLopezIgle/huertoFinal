package com.huerto.model;

public class Huerto {
    // Atributos huerto
    private Integer idHuerto;
    private Planta planta;

    // Constructores huerto
    public Huerto(Integer idHuerto){
        this.idHuerto = idHuerto;
    }
    public Huerto(Integer idHuerto, Planta planta) {
        this.idHuerto = idHuerto;
        this.planta = planta;
    }

    // Getters y setters huerto

    public Integer getIdHuerto() {
        return idHuerto;
    }

    public void setIdHuerto(Integer idHuerto) {
        this.idHuerto = idHuerto;
    }

    public Planta getPlanta() {
        return planta;
    }

    public void setPlanta(Planta planta) {
        this.planta = planta;
    }
}
