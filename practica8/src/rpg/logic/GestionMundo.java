package rpg.logic;

import rpg.dao.ClaseDAO;
import rpg.dao.PersonajeDAO;
import rpg.dao.RazaDAO;
import rpg.model.Clase;
import rpg.model.Raza;
import rpg.ui.Vista;

import java.util.ArrayList;


public class GestionMundo {

    private Vista vista;
    private RazaDAO razaDAO;
    private ClaseDAO claseDAO;
    private PersonajeDAO personajeDAO;


    public GestionMundo() {
        this.vista = new Vista();
        this.razaDAO = new RazaDAO();
        this.claseDAO = new ClaseDAO();
        this.personajeDAO = new PersonajeDAO();
        iniciar(); //Preguntar
    }

    public void iniciar() {
        this.vista.mostrarMensaje("Comienza el viaje. ");
        int opcion = this.vista.mostrarOpciones();

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
                System.out.println("Viajar.");
                break;

            default:
                System.out.println("Error.");

                break;
        }

    }

    public void crearPersonaje(){

        this.vista.mostrarMensaje("CREA TU PERSONAJE -> ");

        String nombre = this.vista.pedirNombre(); //guardamos el nombre que el cliente mete en esa variable

        ArrayList<Raza> listaRazas = this.razaDAO.obtenerRazas(); //guardamos la raza en una lista de razas
        int idRaza = this.vista.mostrarRazas(listaRazas); //guardamos el id que elige el cliente en idRaza

        ArrayList<Clase> listaClases = this.claseDAO.obtenerClases(); //guardamos la clase en una lista de Clases
        int idClase = this.vista.mostrarClases(listaClases); //guardamos el id que elige el cliente en idClase

        //mientras el id (nº q meta) sea menor a 0 o mayor al que haya en la lista... tiene q meter un nº valido
        while(idRaza < 0 || idRaza > listaRazas.size()){
            this.vista.mostrarMensaje("Introduce una raza correcta. ");
            idRaza = this.vista.mostrarRazas(listaRazas); // se vuelve a guardar en la variable arriba creada
        }

        while(idClase < 0 || idClase > listaClases.size()){
            this.vista.mostrarMensaje("Introduce una clase correcta. ");
            idClase = this.vista.mostrarClases(listaClases); // se vuelve a guardar en la variable arriba creada
        }

        //PREGUNTAR A MANU

        //coge el objeto Raza de la lista en la posicion que elige el usuario
        // de ese objeto Raza obtiene su id real de la BD
        // y eso lo guardo en idRazaReal y lo mismo con Clase
        int idRazaReal = listaRazas.get(idRaza).getId();
        int idClaseReal = listaClases.get(idClase).getId();

        // llamo al metodo insertPersonaje del DAO para guardar el personaje en la BD
        // le paso los 4 datos que necesita
        // el 1 es el id de la ciudad inicial (y unica que tengo)
        this.personajeDAO.insertPersonaje(nombre, idRazaReal, idClaseReal, 1);
        this.vista.mostrarMensaje("Personaje creado con éxito. ");




    }

}
