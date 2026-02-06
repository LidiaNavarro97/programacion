import com.juego.presentacion.*;
import com.juego.modelo.*;

public class Main {
    public static void main(String[] args){

        GestorPersonaje gestor = new GestorPersonaje();
        PrecargaDeDatos.cargar(gestor);

        Vista vista = new VistaConsola();
        Presentador p = new Presentador(vista,gestor);

        p.iniciar();
    }

}