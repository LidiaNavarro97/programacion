package rpg.ui;

import java.util.Scanner;

public class Vista {

    private Scanner sc;

    public Vista(){
        sc = new Scanner(System.in);
    }

    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public int mostrarOpciones(){
        System.out.println(" 1- Crear personaje. ");
        System.out.println(" 2- Viajar de ciudad. ");
        System.out.println(" 3- Comprar Items. ");
        System.out.println(" 4- Cobro de impuestos. ");
        System.out.println(" 5- Combate. ");
        System.out.println(" 6- Salir. ");
        System.out.println(" Introduzca una opcion: ");


        while(!sc.hasNextInt()){
                System.out.println("Introduzca un valor correcto: ");
            sc.next();
        }

        return sc.nextInt();

    }

    public String pedirNombre(){
        System.out.println("Escribe el nombre de tu personaje: ");
        sc.nextLine();
        return sc.nextLine();
    }

}
