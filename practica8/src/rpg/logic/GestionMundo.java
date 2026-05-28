package rpg.logic;

import rpg.dao.*;
import rpg.exception.FondosInsuficientesException;
import rpg.exception.NivelInsuficienteException;
import rpg.model.*;
import rpg.ui.Vista;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class GestionMundo {

    private Vista vista;
    private RazaDAO razaDAO;
    private ClaseDAO claseDAO;
    private PersonajeDAO personajeDAO;
    private CiudadDAO ciudadDAO;
    private ItemDAO itemDAO;


    public GestionMundo() {
        this.vista = new Vista();
        this.razaDAO = new RazaDAO();
        this.claseDAO = new ClaseDAO();
        this.personajeDAO = new PersonajeDAO();
        this.ciudadDAO = new CiudadDAO();
        this.itemDAO = new ItemDAO();

        iniciar(); //Preguntar
    }

    public void iniciar() {
        this.vista.mostrarMensaje("Comienza el viaje. ");

        int opcion = 0;

        do {
            opcion = this.vista.mostrarOpciones();

            while (opcion < 0 || opcion > 6) {
                opcion = this.vista.mostrarOpciones();
            }


            // dentro del parentesis la variable que yo quiero controlar
            // y en cada "case" las diferentes opciones que hay
            // con el case default hace lo que pongas ahi sino es ninguna de las otras opciones
            switch (opcion) {
                case 1:
                    crearPersonaje();
                    break;
                case 2:
                    viajarCiudad();
                    break;
                case 3:
                    comprarItems();
                    break;
                case 4:
                    System.out.println("Cobro de impuestos.");
                    break;
                case 5:
                    System.out.println("Combate.");
                    break;
                case 6:
                    this.vista.mostrarMensaje("Salir. ");
                    break;
                default:
                    System.out.println("Error.");
                    break;
            }

        } while (opcion != 6);
    }

    public void crearPersonaje() {

        this.vista.mostrarMensaje("CREA TU PERSONAJE -> ");

        String nombre = this.vista.pedirNombre(); //guardamos el nombre que el cliente mete en esa variable

        ArrayList<Raza> listaRazas = this.razaDAO.obtenerRazas(); //guardamos la raza en una lista de razas
        int posicionRaza = this.vista.mostrarRazas(listaRazas); //guardamos el id que elige el cliente en posicionRaza

        //mientras el id (nº q meta) sea menor a 0 o mayor al que haya en la lista... tiene q meter un nº valido
        while (posicionRaza < 0 || posicionRaza > listaRazas.size()) {
            this.vista.mostrarMensaje("Introduce una raza correcta. ");
            posicionRaza = this.vista.mostrarRazas(listaRazas); // se vuelve a guardar en la variable arriba creada
        }

        int idRaza = listaRazas.get(posicionRaza).getId();

        ArrayList<Clase> listaClases = this.claseDAO.obtenerClases(); //guardamos la clase en una lista de Clases
        int posicionClase = this.vista.mostrarClases(listaClases); //guardamos el id que elige el cliente en posicionClase

        while (posicionClase < 0 || posicionClase > listaClases.size()) {
            this.vista.mostrarMensaje("Introduce una clase correcta. ");
            posicionClase = this.vista.mostrarClases(listaClases); // se vuelve a guardar en la variable arriba creada
        }

        int idClase = listaClases.get(posicionClase).getId();

        //coge el objeto Raza de la lista en la posicion que elige el usuario
        // de ese objeto Raza obtiene su id real de la BD
        // y eso lo guardo en idRaza y lo mismo con Clase


        // llamo al metodo insertPersonaje del DAO para guardar el personaje en la BD
        // le paso los 4 datos que necesita
        // el 1 es el id de la ciudad inicial
        this.personajeDAO.insertPersonaje(nombre, idRaza, idClase, 1);
        this.vista.mostrarMensaje("Personaje creado con éxito. ");


    }

    public void viajarCiudad() {

        this.vista.mostrarMensaje("VIAJAR DE CIUDAD -> ");


        ArrayList<Personaje> listaPersonajes = this.personajeDAO.obtenerPersonaje();


        int posicionPersonaje = this.vista.mostrarPersonajes(listaPersonajes);

        while (posicionPersonaje < 0 || posicionPersonaje > listaPersonajes.size()) {

            this.vista.mostrarMensaje("Personaje incorrecto. Vuelve a introducirlo: ");

            posicionPersonaje = this.vista.mostrarPersonajes(listaPersonajes);
        }

        Personaje personaje = listaPersonajes.get(posicionPersonaje);


        ArrayList<Ciudad> listaCiudades = this.ciudadDAO.obtenerCiudades();

        int posicionCiudad = this.vista.mostrarCiudades(listaCiudades);

        while (posicionCiudad < 0 || posicionCiudad > listaCiudades.size()) {

            this.vista.mostrarMensaje("Ciudad incorrecta. Vuelve a introducirla: ");

            posicionCiudad = this.vista.mostrarCiudades(listaCiudades);
        }

        Ciudad ciudad = listaCiudades.get(posicionCiudad);


        try {
            if (personaje.getNivel() >= ciudad.getNivelMinimoAcceso()) {

                this.personajeDAO.updateCiudad(personaje.getId(), ciudad.getId());
                this.vista.mostrarMensaje("Viaje realizado con éxito.");

            } else {

                this.vista.mostrarMensaje("Error nivel insuficiente. ");

            }

            } catch(NivelInsuficienteException e){
                this.vista.mostrarMensaje("Error: " + e.getMessage());
            }
        }


        public void comprarItems () {

            this.vista.mostrarMensaje("COMPRA DE ITEMS -> ");

            ArrayList<Item> listaItems = this.itemDAO.obtenerItems();

            int posicionItem = this.vista.mostrarItems(listaItems);




        }


    }
