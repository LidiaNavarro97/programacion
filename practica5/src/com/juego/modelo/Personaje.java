package com.juego.modelo;

import com.juego.clases.Clase;
import com.juego.habilidades.Habilidad;
import com.juego.razas.Raza;

import java.util.ArrayList;
import java.util.List;

public class Personaje {

    private String nombre;
    private Clase clase;
    private Raza raza;
    private Datos datos;
    private int vidaActual;
    private List<Habilidad> habilidades;

    public Personaje(String nombre, Clase clase, Raza raza) {
        this.nombre = nombre;
        this.clase = clase;
        this.raza = raza;
        this.vidaActual = 100; // por ejemplo

        //cargar las habilidades desde la clase
        habilidades = new ArrayList<>();
        for (Habilidad h : clase.getHabilidades()) {
            habilidades.add(h);
        }
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

    public int[] getHabilidades() {
        return habilidades;
    }
    public void danio(int cantidad) {

    }
}