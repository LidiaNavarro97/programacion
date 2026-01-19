package com.juego.modelo;

import java.util.Scanner;
import com.juego.habilidades.*;

public class Combate {

    Personaje p1;
    Personaje p2;

    private Scanner sc = new Scanner(System.in);

    public Combate(Personaje p1, Personaje p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void combate1() {
        int contador = 1;

        while(p1.getVida()>0 && p2.getVida()>0) {
            System.out.println("Turno" +contador);
            System.out.println(p1.getVistaPersonaje());
            System.out.println(p2.getVistaPersonaje());

            //elegir la habilidad
            this.elegirHabilidad();

            //efecto habilidades
            this.efectoHabilidades();
            contador++;
        }

        if(p1.getVida()==0) {
            System.out.println("El ganador es P1");
        }
        else {
            System.out.println("El ganador es P2");
        }
    }

    private void elegirHabilidad() {
    }

    private void efectoHabilidades() {
    }


}