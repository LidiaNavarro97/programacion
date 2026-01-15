package com.juego.razas;

import com.juego.modelo.Datos;

public class Humano implements Raza {
    public String getNombre() {
        return "HUMANO";
    }

    public Datos getDatosBase() {
        // mas equilibrado
        return new Datos(1, 1, 1, 100);
    }
}