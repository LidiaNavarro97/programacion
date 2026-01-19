package com.juego.razas;

import com.juego.modelo.Datos;

public class Humano implements Raza {
    public String getNombre() {
        return "HUMANO";
    }
    public int fuerza() {
        return 0;
    }
    public int inteligencia() {
        return 0;
    }
    public int destreza() {
        return 0;
    }
    public int vida() {
        return 0;
    }

    public Datos getDatosBase() {
        // mas equilibrado
        return new Datos(1, 1, 1, 100);
    }
}