package com.juego.presentacion;

import com.juego.modelo.*;
import com.juego.razas.*;
import com.juego.clases.*;

public class Presentador {

    private Vista vista;
    private GestorPersonaje gestor;

    public Presentador(Vista vista, GestorPersonaje gestor) {
        this.vista = vista;
        this.gestor = gestor;
    }

}