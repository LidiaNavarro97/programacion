package rpg.ui;

import rpg.model.Clase;
import rpg.model.Raza;

import java.util.ArrayList;
import java.util.Optional;
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
        System.out.println("Elige una raza: ");
        
        for (int i=0 ; i < listaRazas.size(); i++){ // recorremos la lista de Razas
          System.out.println((i+1)+ " - " + listaRazas.get(i).getNombre());
          // la posicion +1 para que empiece con orden logico
          // mostramos el nombre de la raza
            
        }
        while(!sc.hasNextInt()){
            System.out.println("Introduzca un valor correcto: ");
            sc.next();
        }

        return sc.nextInt() -1;
        // el -1 hace que se le reste 1, es decir si elige el cliente el 1 (humano),
        // seria nuestra posicion 0 en Java
        // sino se hiciera eso se elegiria realmente la posicion dos que seria Orco
    }

    public int mostrarClases(ArrayList<Clase> listaClases){
        System.out.println("Elige una clase: ");

        for (int i=0; i < listaClases.size() ; i++) { // recorremos la lista de razas
            System.out.println((i+1) + " - " + listaClases.get(i).getNombre());

        }
        while(!sc.hasNextInt()){
            System.out.println("Introduzca un valor correcto: ");
            sc.next();
        }

        return sc.nextInt() -1;
    }

    //PREGUNTAR A MANU
    public int pedirIdPersonaje() {
        System.out.println("Introduce el id del personaje: ");
        while (!sc.hasNextInt()) {
            System.out.println("Introduce un valor correcto: ");
            sc.next();
        }
        return sc.nextInt();
    }

    public int pedirIdCiudad() {
        System.out.println("Introduce el id de la ciudad destino: ");
        while (!sc.hasNextInt()) {
            System.out.println("Introduce un valor correcto: ");
            sc.next();
        }
        return sc.nextInt();
    }

}
