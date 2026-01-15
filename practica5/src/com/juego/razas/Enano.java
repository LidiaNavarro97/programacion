package com.juego.razas;

import com.juego.modelo.Datos;

public class Enano implements Raza {
    public String getNombre(){
        return "ENANO";
    }

    public Datos getDatosBase() {
        // Más fuerza y vida
        return new Datos(2, 0, 0, 120);
    }
}
