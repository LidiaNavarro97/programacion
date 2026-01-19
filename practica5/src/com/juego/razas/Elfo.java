package com.juego.razas;

import com.juego.modelo.Datos;

public class Elfo implements Raza {
    public String getNombre(){
        return "ELFO";
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
        // Más destreza e inteligencia
        return new Datos(0, 1, 2, 95);
    }
}
