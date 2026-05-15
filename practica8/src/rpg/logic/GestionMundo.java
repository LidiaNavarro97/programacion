package rpg.logic;

import rpg.dao.RazaDAO;
import rpg.model.Raza;
import rpg.ui.Vista;

import java.util.ArrayList;


public class GestionMundo {

    private Vista vista;
    private RazaDAO razaDAO;


    public GestionMundo() {
        this.vista = new Vista();
        this.razaDAO = new RazaDAO();
        iniciar();
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
        this.vista.mostrarMensaje("Crea tu personaje -> ");
        String nombre = this.vista.pedirNombre(); //guardamos el nombre que el cliente mete en esa variable
        ArrayList<Raza> listaRazas = this.razaDAO.obtenerRazas(); //guardamos la raza en una lista de razas
        int idRaza = this.vista.mostrarRazas(listaRazas); //guardamos el id que elige el cliente en idRaza

        //mientras el id (nº q meta) sea menor a 0 o mayor al que haya en la lista... tiene q meter un nº valido
        while(idRaza < 0 || idRaza > listaRazas.size()){
            this.vista.mostrarMensaje("Introduce una raza correcta. ");
            idRaza = this.vista.mostrarRazas(listaRazas); // se vuelve a guardar en la variable arriba creada
        }



    }

}
