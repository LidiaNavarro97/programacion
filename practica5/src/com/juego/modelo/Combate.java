package com.juego.modelo;

import java.util.Scanner;
import com.juego.habilidades.Habilidad;
import java.util.*;
import com.juego.habilidades.*;

// Clase que maneja un combate entre dos personajes
public class Combate {

    private Personaje p1;
    private Personaje p2;
    private Scanner sc = new Scanner(System.in);

    // Inicia el combate entre dos personajes
    public void iniciar(Personaje a, Personaje b) {

    public void iniciarCombate() {

        boolean combateActivo = true; // para saber si el combate sigue activo
        int turno = 1; //contador de turno
        Personaje t = a; // jugador con turno
        Personaje r = b; // rival

        while (combateActivo) {

            System.out.println("TURNO " + turno); //para mostrar el turno
            System.out.println(p1.getVistaPersonaje()); //para mostrar el estado de los personajes
            System.out.println(p2.getVistaPersonaje());
        while (a.getVida() > 0 && b.getVida() > 0) {

            System.out.println("\nTurno: " + t.getNombre());
            // turno 1
            System.out.println("Turno de " + p1.getNombre());
            Habilidad habP1 = elegirHabilidad(p1);
            habP1.usar(p2);

            // Mostrar habilidades disponibles con sus usos
            int i = 1;
            for (Habilidad h : t.getHabilidades()) {
                System.out.println(i++ + ". " + h.getNombre() + " (Usos: " + h.getUsosRestantes() + ")");
            }
            // Comprobar si p2 ha muerto
            if (p2.getVida() <= 0) {
                System.out.println(p2.getNombre() + "derrotado");
                combateActivo = false;
                break;
            }

            // turno 2
            System.out.println("Turno de " + p2.getNombre());
            Habilidad habP2 = elegirHabilidad(p2);
            habP2.usar(p1);

            // Comprobar si p1 ha muerto
            if (p1.getVida() <= 0) {
                System.out.println(p1.getNombre() + " derrotado");
                combateActivo = false;
            }

            turno++; //si nadie ha muerto empieza un nuevo turno
        }

        // ganador
        if (p1.getVida() > 0) {
            System.out.println("El ganador es " + p1.getNombre());
        } else {
            System.out.println("El ganador es " + p2.getNombre());
        }
    }

    // Elegir habilidad
    private Habilidad elegirHabilidad(Personaje p) {

        System.out.println("Elige una habilidad:");
        Habilidad[] habilidades = p.getHabilidades(); // vemos todas las habilidades del personaje
            // Leer habilidad elegida
            int op;
            while (true) {
                System.out.print("Elige habilidad: ");
                if (sc.hasNextInt()) {
                    op = sc.nextInt() - 1;
                    sc.nextLine(); // limpiar buffer
                    if (op >= 0 && op < t.getHabilidades().size()) {
                        Habilidad h = t.getHabilidades().get(op);
                        if (h.tieneUsos()) {
                            int v = h.usar();

                            // Diferencia curación de daño
                            if (h instanceof CuraCuerpoACuerpo) {
                                t.curar(v);
                                System.out.println(t.getNombre() + " se cura " + v + " HP");
                            } else {
                                r.danio(v);
                                System.out.println(t.getNombre() + " hace " + v + " de daño a " + r.getNombre());
                            }
                            break;
                        } else {
                            System.out.println("Sin usos! Elige otra habilidad.");
                        }
                    } else {
                        System.out.println("Opción inválida, elige otra habilidad.");
                    }
                } else {
                    System.out.println("Por favor ingresa un número válido.");
                    sc.nextLine(); // limpiar entrada inválida
                }
            }

        for (int i = 0; i < habilidades.length; i++) { //recorro todas las habilidades
            System.out.println(i + habilidades[i].getNombre()); // muestro todas las habilidades
        }
            // Mostrar estado actual
            System.out.println(a.getNombre() + ": " + a.getVida() + " HP");
            System.out.println(b.getNombre() + ": " + b.getVida() + " HP");

            // Cambiar turno
            Personaje aux = t;
            t = r;
            r = aux;
        }

        // declaro una variale que le llamamos opcion
        int opcion;
        // para ver si la opcion es valida
        do {
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion >= habilidades.length);
        // Mostrar ganador
        System.out.println("\nGANADOR: " + (a.getVida() > 0 ? a.getNombre() : b.getNombre()));
    }

        //devolver la habilidad que he elegido
        return habilidades[opcion];
    }
}

