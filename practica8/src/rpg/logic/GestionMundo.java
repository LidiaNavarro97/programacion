package rpg.logic;

import rpg.ui.Vista;

public class GestionMundo {

    private Vista vista;

    public GestionMundo(){
        this.vista = new Vista();
    }

    public void iniciar(){
        this.vista.mostrarMensaje("Comienza el viaje. ");

    }
}
