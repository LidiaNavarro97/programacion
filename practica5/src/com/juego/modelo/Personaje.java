package com.juego.modelo;

import com.juego.clases.Clase;
import com.juego.habilidades.Habilidad;
import com.juego.razas.Raza;

public class Personaje {

    private String nombre;
    private Clase clase;
    private Raza raza;
    private Datos datos;
    private int vidaActual;

    public Personaje(String nombre, Clase clase, Raza raza) {
        this.nombre = nombre;
        this.clase = clase;
        this.raza = raza;
        this.vidaActual = 100; // por ejemplo
    }

    // los get

    public int getVida() {
        return vidaActual;
    }

    public String getNombre() {
        return nombre;
    }

    public Clase getClase() {
        return clase;
    }

    public Raza getRaza() {
        return raza;
    }

    public String getVistaPersonaje() {
        return nombre + " | " + clase + " | " + raza + " | Vida: " + vidaActual;
    }

    public void setVida(int vidaActual) {
        this.vidaActual = vidaActual;
    }
}