import javax.imageio.stream.FileCacheImageOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class bloque2 {
    public static void main() {


        //EJERCICIO 7)
        // Crea un HashMap<String, ArrayList<String>>.
        // La clave es el nombre del gremio (ej: "Magos") y el valor es una lista de sus miembros.
        // Agrega 2 gremios con 3 miembros cada uno y
        // programa una función que imprima solo los miembros de un gremio específico.

        System.out.println("Ejercicio 7: ");

        //Creo el HashMap, donde su valor es un ArrayList, de nombre gremios
        HashMap<String, ArrayList<String>> gremios = new HashMap<>();

        //Creo el ArrayList de nombre magos para el gremio y le añado tres miembros.
        ArrayList<String> magos = new ArrayList<>();
        magos.add("Josemi");
        magos.add("Judas");
        magos.add("Lidia");

        //Creo el ArrayList de nombre guerrero para el gremio y le añado tres miembros.
        ArrayList<String> guerrero = new ArrayList<>();
        guerrero.add("Diego");
        guerrero.add("Mateo");
        guerrero.add("Daniel");

        //Añado los grmios al HashMap
        //"Magos" y "Guerrreros" son las claves, y magos y guerrero los valores (que son listas)
        gremios.put("Magos", magos);
        gremios.put("Guerreros", guerrero);

        // Llamo al metodo imprimirGremio, para en este caso llamar solo a los miembros del gremio "Guerreros"
        imprimirGremio(gremios, "Guerreros");

        //EJERCICIO 8)
        //Crea un HashMap<String, HashSet<String>>
        //donde cada Monstruo tiene un set de Objetos que puede soltar.
        //Reto: Si el "Trasgo" suelta una "Espada Oxidada" y
        // tú intentas añadirle otra "Espada Oxidada" por error,
        // el sistema debe ignorarlo automáticamente.

        System.out.println("Ejercicio 8)");

        //Creo un HashMap donde la clave es un nombre y el valor es un HashSet con los objetos que puede soltar
        HashMap<String, HashSet<String>> monstruos = new HashMap<>();
        //Creo un HashSet para el loot del Trasgo
        HashSet<String> loot = new HashSet<>();

        // Añadimos objetos al loot
        loot.add("Espada Oxidada");
        loot.add("Martillo");
        //Asocio el loot al monstruo "Trasgo"
        monstruos.put("Trasgo", loot);

        //Intento añadir un objeto duplicado
        boolean duplicado = monstruos.get("Trasgo").add("Espada Oxidada");

        System.out.println("¿Se ha añadido otra vez la espada? -> " + duplicado);
        System.out.println("Loot del Trasgo: " + monstruos.get("Trasgo"));

        //EJERCICIO 9)
        //Crea un HashMap<String, HashMap<String, Integer>>.
        //◦ La clave principal es el Nombre del Jugador.
        //◦ El valor es OTRO HashMap que contiene sus estadísticas
        //      (ej: {"Fuerza": 18, "Destreza": 12}).
        //◦ Reto: Escribe el código para buscar a "Conan" y sumarle +2 a su estadística de "Fuerza".

        System.out.println("Ejercicio 9: ");

        //Creo un HashMap con clave tipo String y de Valor un HashMap de estadisticas
        HashMap<String, HashMap<String, Integer>> estadisticas = new HashMap<>();
        //Creo el HashMap de estadísticas para el jugador Conan
        HashMap<String, Integer> estadisticasConan = new HashMap<>();

        //Añado las estadísticas de Conan
        estadisticasConan.put("Destreza", 12);
        estadisticasConan.put("Fuerza", 18);
        //Asociamos el HashMap de estadísticas al jugador "Conan"
        estadisticas.put("Conan", estadisticasConan);

        // Comprobamos si el jugador "Conan" existe en el HashMap
        if (estadisticas.containsKey("Conan")) {
            //Miro el HashMap de estadísticas de Conan
            HashMap<String, Integer> est = estadisticas.get("Conan");
            //Compruebo si Conan tiene la estadística "Fuerza"
            if (est.containsKey("Fuerza")) {
                est.put("Fuerza", est.get("Fuerza") + 2); // Aumento la Fuerza en +2
                //Muestro el nuevo valor de la Fuerza
                System.out.println(" Nueva Fuerza -> " + est.get("Fuerza"));
            }
        }

        //EJERCICIO 10)
        // Tienes un HashMap<String, ArrayList<String>> de Gremios (como en el ej. 7).
        // Escribe un algoritmo que recorra todos los gremios y verifique si un aventurero llamado "Judas" está escondido en alguno de ellos.
        // Si lo encuentra,debe imprimir en qué gremio está y eliminarlo de la lista de ese gremio inmediatamente.

        System.out.println("Ejercicio 10: ");
        //Llamo al metodo eliminarTraidor
        eliminarTraidor(gremios, "Judas");
    }

    public static void eliminarTraidor(HashMap<String, ArrayList<String>> gremios, String traidor) {
        // Recorro el HashMap usando entrySet(), el getValue me da la lista de miembros y el getKey el nombre del gremio
        for (Map.Entry<String, ArrayList<String>> entry : gremios.entrySet()) {
            // Obtenemos la lista de miembros del gremio actual
            ArrayList<String> miembros = entry.getValue();
            // Comprobamos si el traidor está en este gremio
            if (miembros.contains(traidor)) {
                // Muestro en qué gremio se ha encontrado
                System.out.println("Traidor " + traidor + " encontrado en el gremio de los " + entry.getKey());
                miembros.remove(traidor); //Elimino al traidor
                //Muestro los gremios que quedan
                System.out.println("Traidor eliminado. Miembros restantes -> " + miembros);
                return; //Salgo porque ya lo he encontrado
            }
        }
        System.out.println("Traidor no encontrado.");
    }


    public static void imprimirGremio(HashMap<String, ArrayList<String>> gremios, String nombreGremio) {
        // Comprobamos si el gremio existe en el HashMap y muestro el nombre del gremio
        if (gremios.containsKey(nombreGremio)) {
            System.out.println("Miembros del gremio " + nombreGremio + ":");
            // Recorremos la lista de miembros del gremio
            for (String miembro : gremios.get(nombreGremio)) {
                System.out.println("- " + miembro);
            }
        } else {
            System.out.println("El gremio no existe.");
        }
    }

}