package com.huerto.model;

public class Huerto {
    // Atributos huerto
    private Integer idHuerto;
    private String estado;

    // Constructores huerto
    public Huerto(){

    }
    public Huerto(Integer idHuerto, String estado) {
        this.idHuerto = idHuerto;
        this.estado = estado;
    }

    // Getters y setters huerto

    public Integer getIdHuerto() {
        return idHuerto;
    }

    public void setIdHuerto(Integer idHuerto) {
        this.idHuerto = idHuerto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
