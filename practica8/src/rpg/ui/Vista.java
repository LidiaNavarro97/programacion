package rpg.ui;

import rpg.model.Raza;

import java.util.ArrayList;
import java.util.Scanner;

public class Vista {

    private Scanner sc;

    public Vista(){
        sc = new Scanner(System.in);
    }

    public void mostrarMensaje(String mensaje){ //metodo al q llamaremos siempre para imprimir un mensaje
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

    public int mostrarRazas(ArrayList<Raza> listaRazas){ //dentro ponemos lo que requiere el metodo desde fuera
        System.out.println("Lista de razas: ");
        
        for (int i=0 ; i < listaRazas.size(); i++){ // recorremos la lista de Razas
          System.out.println((i+1)+ " - " + listaRazas.get(i).getNombre());
          // la posicion +1 para que empiece con orden logico
          // mostramos el nombre de la raza
            
        }
        while(!sc.hasNextInt()){
            System.out.println("Introduzca un valor correcto: ");
            sc.next();
        }

        return sc.nextInt() -1; //el -1 es para que muestre nuestro orden logico
    }

}
