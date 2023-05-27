package com.huerto.model;

public class Planta {
    // Definimos un enum para poder especificar la especie de cada planta
    public enum Especie{
        TOMATE, LECHUGA, MANGO, ZANAHORIA;
    }

    // Atributo planta
    private Especie especie;

    // Constructores planta
    public Planta(){

    }
    public Planta(Especie especie){
        this.especie = especie;
    }

    // Getters y setters planta
    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
}
