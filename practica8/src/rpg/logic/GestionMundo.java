package rpg.logic;

import rpg.ui.Vista;


public class GestionMundo {

    private Vista vista;

    public GestionMundo() {
        this.vista = new Vista();
        iniciar();
    }

    public void iniciar() {
        this.vista.mostrarMensaje("Comienza el viaje. ");
        int opcion = this.vista.mostrarOpciones();

        while (opcion < 0 || opcion > 6) {
            opcion = this.vista.mostrarOpciones();
        }


        // dentro del parentesis la variable que yo quiero controlar
        // y en cada case las diferentes opciones que hay
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
        this.vista.pedirNombre();

    }

}
