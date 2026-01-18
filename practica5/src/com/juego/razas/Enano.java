package com.juego.razas;

import com.juego.modelo.Datos;

public class Enano implements Raza {
    public String getNombre(){
        return "ENANO";
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
        // Más fuerza y vida
        return new Datos(2, 0, 0, 120);
    }
}
