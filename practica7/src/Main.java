import java.util.ArrayList;
import java.util.List;

import com.rpg.handler.SobrecargaEquipamiento;
import com.rpg.services.GestionMundo;
import com.rpg.utils.LoggerCustom;

public class Main {

        public static void main(String[] args) throws SobrecargaEquipamiento {

            GestionMundo gm = new GestionMundo();
            gm.cargarTodo(); //Carga todos los datos del archivo


            List<String> items = new ArrayList<>(); //listo los items para el primer personaje
            items.add("A01"); //le voy a poner estos items a mi personaje daniel
            gm.crearPersonaje("Daniel", "Humano", 100,10 ,2, items); //aqui le meto un nivel negativo para q me de error

            gm.validacionDatos();


            //List<String> ids = new ArrayList<>();
            // ids.add("A02");
           // gm.crearPersonaje("Lidia", "Elfo", 3, 90, 20, ids); //le he añadido un item que no existe para q de error

            gm.mostrarPersonaje(); //muestro los personajes cargados

            //comento y descomento el siguiente metodo para comprobaciones sin que se me guarden en el archivo

            gm.guardarPersonajes(); //guardo los cambios en el json
        }
    }