package com.huerto.controller;

import com.huerto.view.*;

public class HuertoController {

    private HuertoIU principal;
    private HuertoCatalogoIU catalogoIU;
    private HuertoPersonalizadoIU personalizadoIU;

    public HuertoController (HuertoIU principal, HuertoCatalogoIU catalogoIU, HuertoPersonalizadoIU personalizadoIU){
        this.principal = principal;
        this.catalogoIU = catalogoIU;
        this.personalizadoIU = personalizadoIU;

        // Asignamos los controladores a los botones
        principal.getbHuertoExistente().addActionListener(e -> abrirHuertoCatalogoUI());
        principal.getbHuertoNuevo().addActionListener(e -> abrirHuertoPersonalizadoUI());
    }

    /**
     * Metodo que abre la ventana de HuertoCatalagoUI
     */
    private void abrirHuertoCatalogoUI(){
        catalogoIU.setVisible(true);
        personalizadoIU.setVisible(false);
    }

    /**
     * Metodo que abre la ventana de HuertoPersonalizadoUI
     */
    private void abrirHuertoPersonalizadoUI(){
        personalizadoIU.setVisible(true);
        catalogoIU.setVisible(false);
    }
}
