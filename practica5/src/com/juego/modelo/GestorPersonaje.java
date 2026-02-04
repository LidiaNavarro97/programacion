package com.juego.modelo;

import com.juego.clases.Clase;
import com.juego.razas.Raza;
import java.util.*;

public class GestorPersonaje {

    // Lista interna que almacena los personajes
    private List<Personaje> lista = new ArrayList<>();

    // Crea y devuelve un personaje
    public Personaje crearPersonaje(String nombre, Clase clase, Raza raza) {
        return new Personaje(nombre, raza, clase);
    }

    // Metodo para agregar un personaje a la lista
    public void add(Personaje p){
        lista.add(p);
    }

    // Metodo para obtener la lista completa de personajes
    public List<Personaje> get(){
        return lista;
    }
}