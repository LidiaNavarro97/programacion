package com.juego.modelo;

import com.juego.razas.*;
import com.juego.clases.*;

// Clase para crear datos precargados de razas, clases y personajes
public class PrecargaDeDatos {

    // Carga inicial de personajes al juego
    public static void cargar(GestorPersonaje g) {

        g.add(new Personaje("Lulu", crearHumano(), crearGuerrero()));
        g.add(new Personaje("Vargan", crearEnano(), crearPaladin()));
        g.add(new Personaje("Merlin", crearElfo(), crearMago()));
    }

    // Métodos para crear razas con atributos iniciales
    public static Raza crearHumano() {
        return new Humano("Humano", 5, 5, 5, 100);
    }

    public static Raza crearElfo() {
        return new Elfo("Elfo", 4, 6, 7, 90);
    }

    public static Raza crearEnano() {
        return new Enano("Enano", 7, 4, 4, 110);
    }

    // Métodos para crear clases y asignar habilidades
    public static Clase crearGuerrero() {
        return new Guerrero("Corte Brutal", "Lanzamiento de hacha",
                        "Grito de Guerra", 5,
                25, 10);
    }

    public static Clase crearPaladin() {
        return new Paladin("Espada Sagrada", "Juicio Celestial",
                        "Luz Divina", 15,
                18, 10);
    }

    public static Clase crearMonje() {
        return new Monje("Puño del Dragón", "Onda Chi",
                        "Meditación", 8,
                17, 18);
    }

    public static Clase crearPicaro() {
        return new Picaro("Puñalada", "Daga Arrojadiza",
                        "Vendaje Rápido", 6,
                22, 20);
    }

    public static Clase crearDruida() {
        return new Druida("Garra Salvaje", "Raíces Enredadoras",
                        "Recrecimiento", 20,
                10, 15);
    }

    public static Clase crearSacerdote() {
        return new Sacerdote("Golpe Bendito", "Luz Castigadora",
                        "Sanación Mayor", 25,
                8, 12);
    }

    public static Clase crearMago() {
        return new Mago("Bastón Arcano", "Bola de Fuego",
                        "Escudo Mágico", 5,
                5, 40);
    }

    public static Clase crearBardo() {
        return new Bardo("Golpe Rítmico", "Nota Letal",
                        "Canción Curativa", 14,
                10, 18);
    }

}