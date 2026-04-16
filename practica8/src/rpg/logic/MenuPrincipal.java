package rpg.logic;

import rpg.dao.*;
import rpg.model.*;
import rpg.utils.Log;
import java.util.List;
import java.util.Scanner;

public class MenuPrincipal {

    // Necesitamos los DAO para poder trabajar con la base de datos
    private PersonajeDAO personajeDAO = new PersonajeDAO();
    private RazaDAO razaDAO = new RazaDAO();
    private Scanner sc = new Scanner(System.in);

    // Un metodo para mostrar el menu
    public void mostrarMenu() {
        int opcion = 0;

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Crear Personaje");
            System.out.println("2. Viajar de Ciudad");
            System.out.println("3. Ir a la Tienda");
            System.out.println("4. Sistema de Combate");
            System.out.println("5. Salir");

            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer del teclado

            switch (opcion) {
                case 1:
                    menuCrearPersonaje();
                    break;
                case 2:
                    System.out.println("Aqui llamare al metodo cuando lo tenga hecho y sepa, claro");
                    break;
                case 3:
                    System.out.println("Aqui llamare al metodo cuando lo tenga hecho y sepa, claro");
                    break;
                case 4:
                    System.out.println("Aqui llamare al metodo cuando lo tenga hecho y sepa, claro");
                    break;
                case 5:
                    System.out.println("Hasta luegoooo");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    private void menuCrearPersonaje() {
        System.out.print("Introduce el nombre del personaje: ");
        String nombre = sc.nextLine();

        // Mostramos las razas disponibles leyéndolas de la base de datos
        System.out.println("Selecciona una Raza:");
        List<Raza> razas = razaDAO.obtenerTodasRazas();
        for (Raza r : razas) {
            System.out.println(r.getId() + ". " + r.getNombre());
        }
        int idRaza = sc.nextInt();

        // suponemos que quiero guerrero que es la 1
        int idClase = 1;

        // Llamamos al DAO para que lo guarde en la BBDD
        personajeDAO.insertar(nombre, idRaza, idClase);

        // Registramos el evento en nuestro archivo log
        Log.guardarLog("Se ha creado el personaje: " + nombre);

        System.out.println("¡Personaje creado y registrado en el log!");
    }
}