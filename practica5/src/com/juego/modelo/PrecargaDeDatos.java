package com.juego.modelo;

import com.juego.razas.*;
import com.juego.clases.*;

// Clase que precarga personajes de ejemplo en el juego
public class PrecargaDeDatos {

    // Metodo estático que recibe un gestor de personajes y agrega personajes predeterminados
    public static void cargar(GestorPersonaje g){

        // Se crean y agregan personajes con nombre, raza y clase
        g.add(new Personaje("Merlin", new Humano(), new Guerrero()));
        g.add(new Personaje("Ozuna", new Enano(), new Paladin()));
        g.add(new Personaje("Lili", new Humano(), new Monje()));
        g.add(new Personaje("Lola", new Elfo(), new Picaro()));
        g.add(new Personaje("Oblak", new Elfo(), new Druida()));
        g.add(new Personaje("Fatima", new Humano(), new Sacerdote()));
        g.add(new Personaje("Merlin", new Elfo(), new Mago()));
        g.add(new Personaje("Emma", new Humano(), new Bardo()));
    }
}