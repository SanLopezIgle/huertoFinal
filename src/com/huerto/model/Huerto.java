package com.huerto.model;

import java.util.ArrayList;

public class Huerto {
    // Atributos huerto
    private Integer idHuerto;
    private ArrayList<Planta> planta;

    // Constructores huerto
    public Huerto(Integer idHuerto){
        this.idHuerto = idHuerto;
    }
    public Huerto(Integer idHuerto, ArrayList<Planta> planta) {
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

    public ArrayList<Planta> getPlanta() {
        return planta;
    }

    public void setPlanta(ArrayList<Planta> planta) {
        this.planta = planta;
    }
}
