package com.juego.modelo;

import java.util.*;
import com.juego.razas.*;
import com.juego.clases.*;
import com.juego.habilidades.*;

// Clase que representa a un personaje del juego
public class Personaje {

    // Nombre del personaje
    private String nombre;

    // Estadísticas base del personaje (fuerza, inteligencia, destreza y vida máxima)
    private Datos datos;

    // Vida actual del personaje
    private int vida;

    // Lista de habilidades que posee el personaje
    private List<Habilidad> habilidades;

    // Constructor: recibe nombre, raza y clase del personaje
    public Personaje(String n,Raza r,Clase c){

        nombre=n;

        datos =new Datos(
                r.fuerza(),
                r.inteligencia(),
                r.destreza(),
                r.vida()
        );

        datos.aplicarBonus(
                c.fuerza(),
                c.inteligencia(),
                c.destreza()
        );

        datos.setVidaMax(c.vida());

        vida= datos.getVidaMax();

        habilidades=List.of(c.getHabilidades());
    }

    // Devuelve el nombre del personaje
    public String getNombre() {
        return nombre;
    }

    // Devuelve la vida actual del personaje
    public int getVida() {
        return vida;
    }

    // Devuelve la lista de habilidades del personaje
    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    // Aplica daño al personaje
    public void danio(int v) {
        vida -= v;         // Resta vida
        if (vida < 0)      // Evita vida negativa
            vida = 0;
    }

    // Aplica curación al personaje
    public void curar(int v) {
        vida += v;                          // Suma vida
        if (vida > datos.getVidaMax())      // Limita la vida al máximo permitido
            vida = datos.getVidaMax();
    }

    // Representación en texto del personaje: nombre y vida actual

    public String toString() {
        return nombre + " HP:" + vida;
    }

}