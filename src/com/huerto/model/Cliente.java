package com.huerto.model;

public class Cliente {
    // Atributos cliente
    private Integer idCliente;
    private String nombre;

    // Constructores cliente
    public Cliente(){

    }

    public Cliente(Integer idCliente, String nombre){
        this.idCliente = idCliente;
        this.nombre = nombre;
    }

    // Getters y setters cliente
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
