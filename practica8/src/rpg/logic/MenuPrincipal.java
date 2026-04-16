package rpg.logic;

import rpg.dao.*;
import rpg.exception.NivelInsuficienteException;
import rpg.model.*;
import rpg.utils.Log;
import java.util.List;
import java.util.Scanner;

public class MenuPrincipal {

    // Necesitamos los DAO para poder trabajar con la base de datos
    private PersonajeDAO personajeDAO = new PersonajeDAO();
    private RazaDAO razaDAO = new RazaDAO();
    private CiudadDAO ciudadDAO = new CiudadDAO();
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
                    menuViajar();
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

    private void menuViajar() {

        System.out.print("Pon tu ID de personaje: ");
        int idPerso = sc.nextInt();

        System.out.print("¿A qué ciudad quieres ir? (Pon el ID de la ciudad): ");
        int idCiu = sc.nextInt();

        // la información de la base de datos para comparar, con los metodos que he hecho en las clases DAO
        Personaje p = personajeDAO.obtenerPorId(idPerso);
        Ciudad destino = ciudadDAO.obtenerPorId(idCiu);

        // Comprobar el nivel y viajar
        try {
            // Miramos si el nivel del personaje es menor que el que pide la ciudad
            if (p.getNivel() < destino.getNivelMinimoAcceso()) {

                // Si tiene poco nivel lanzo el error y se para aqui
                throw new NivelInsuficienteException("No puedes pasar porque necesitas nivel " + destino.getNivelMinimoAcceso());

            } else {
                // Si el nivel es igual o mayor, entonces si puede viajar
                personajeDAO.viajar(idPerso, idCiu);

                System.out.println("Viaje con éxito. Ahora estás en " + destino.getNombre());

                // Guardamos el mensaje en el log
                Log.guardarLog(p.getNombre() + " viajó a " + destino.getNombre());
            }

        } catch (NivelInsuficienteException e) {
            System.out.println("ERROR: " + e.getMessage());

            Log.guardarLog("Fallo al viajar: " + e.getMessage());
        }
    }


}