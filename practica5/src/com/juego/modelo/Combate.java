package com.juego.modelo;

import java.util.Scanner;
import com.juego.habilidades.Habilidad;

public class Combate {

    private Personaje p1;
    private Personaje p2;
    private Scanner sc = new Scanner(System.in);

    public Combate(Personaje p1, Personaje p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void iniciarCombate() {

        boolean combateActivo = true; // para saber si el combate sigue activo
        int turno = 1; //contador de turno

        while (combateActivo) {

            System.out.println("TURNO " + turno); //para mostrar el turno
            System.out.println(p1.getVistaPersonaje()); //para mostrar el estado de los personajes
            System.out.println(p2.getVistaPersonaje());

            // turno 1
            System.out.println("Turno de " + p1.getNombre());
            Habilidad habP1 = elegirHabilidad(p1);
            habP1.usar(p2);

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

        for (int i = 0; i < habilidades.length; i++) { //recorro todas las habilidades
            System.out.println(i + habilidades[i].getNombre()); // muestro todas las habilidades
        }

        // declaro una variale que le llamamos opcion
        int opcion;
        // para ver si la opcion es valida
        do {
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion >= habilidades.length);

        //devolver la habilidad que he elegido
        return habilidades[opcion];
    }
}

