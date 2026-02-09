package com.juego.presentacion;

import com.juego.modelo.*;
import com.juego.razas.*;
import com.juego.clases.*;

// Clase Presentador: conecta la vista con el modelo
// Controla el flujo del juego
public class Presentador {

    private Vista vista; // vista a usar
    private GestorPersonaje gestor; // gestor de personajes

    public Presentador(Vista v, GestorPersonaje g) {
        vista = v;
        gestor = g;
    }

    // Inicia el juego mostrando el menú y manejando opciones
    public void iniciar() {

        int op;
        do {
            vista.menu();
            op = vista.leer();

            switch (op) {
                case 1 -> jugar();  // inicia un combate
                case 2 -> crear();  // crea un personaje
            }

        } while (op != 3); // sale al elegir opción 3
    }

    // Metodo para iniciar un combate entre dos personajes
    private void jugar() {

        vista.listar(gestor.get()); // lista personajes disponibles

        int a = vista.pedir("Jugador 1: "); // pide índice del jugador 1
        int b = vista.pedir("Jugador 2: "); // pide índice del jugador 2

        new Combate().iniciar(
                gestor.get().get(a),
                gestor.get().get(b)
        );
    }

    // Metodo para crear un personaje
    private void crear() {

        vista.mensaje("Nombre:");
        String n = vista.leerTexto();

        Raza r = elegirRaza(); // elige raza
        Clase c = elegirClase(); // elige clase

        gestor.add(new Personaje(n, r, c)); // crea el personaje y lo agrega
        vista.mensaje("✔ Creado");
    }

    // Selección de raza por parte del usuario
    private Raza elegirRaza() {

        vista.mensaje("""
        \nRazas
        1.Humano
        2.Elfo
        3.Enano""");

        return switch (vista.leer()) {
            case 1 -> PrecargaDeDatos.crearHumano();
            case 2 -> PrecargaDeDatos.crearElfo();
            default -> PrecargaDeDatos.crearEnano();
        };
    }

    // Selección de clase por parte del usuario
    private Clase elegirClase() {

        vista.mensaje("""
        \nClases
        1.Guerrero
        2.Paladin
        3.Monje
        4.Picaro
        5.Druida
        6.Sacerdote
        7.Mago
        8.Bardo""");

        return switch (vista.leer()) {
            case 1 -> PrecargaDeDatos.crearGuerrero();
            case 2 -> PrecargaDeDatos.crearPaladin();
            case 3 -> PrecargaDeDatos.crearMonje();
            case 4 -> PrecargaDeDatos.crearPicaro();
            case 5 -> PrecargaDeDatos.crearDruida();
            case 6 -> PrecargaDeDatos.crearSacerdote();
            case 7 -> PrecargaDeDatos.crearMago();
            default -> PrecargaDeDatos.crearBardo();
        };
    }

}