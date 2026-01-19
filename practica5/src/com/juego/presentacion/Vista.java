package com.juego.presentacion;

import com.juego.habilidades.Habilidad;
import com.juego.modelo.Personaje;
import java.util.*;

public class Vista {

    private Scanner sc = new Scanner(System.in);

    public String pedirNombre() {
        System.out.print("Introduce el nombre del personaje: ");
        return sc.nextLine();
    }

    public void menu() {
        System.out.println("\n1. Combatir");
        System.out.println("2. Crear personaje");
        System.out.println("3. Salir");
    }
}