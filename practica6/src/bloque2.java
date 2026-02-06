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

        HashMap<String, ArrayList<String>> gremios = new HashMap<>();

        ArrayList<String> magos = new ArrayList<>();
        magos.add("Josemi");
        magos.add("Judas");
        magos.add("Lidia");

        ArrayList<String> guerrero = new ArrayList<>();
        guerrero.add("Diego");
        guerrero.add("Mateo");
        guerrero.add("Daniel");

        gremios.put("Magos", magos);
        gremios.put("Guerreros", guerrero);

        imprimirGremio(gremios, "Guerreros");

        //EJERCICIO 8)
        //Crea un HashMap<String, HashSet<String>>
        //donde cada Monstruo tiene un set de Objetos que puede soltar.
        //Reto: Si el "Trasgo" suelta una "Espada Oxidada" y
        // tú intentas añadirle otra "Espada Oxidada" por error,
        // el sistema debe ignorarlo automáticamente.

        System.out.println("Ejercicio 8)");

        HashMap<String, HashSet<String>> monstruos = new HashMap<>();
        HashSet<String> loot = new HashSet<>();

        loot.add("Espada Oxidada");
        loot.add("Martillo");
        monstruos.put("Trasgo", loot);

        //Intento de duplicado
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

        HashMap<String, HashMap<String, Integer>> estadisticas = new HashMap<>();

        HashMap<String, Integer> estadisticasConan = new HashMap<>();

        estadisticasConan.put("Destreza",12);
        estadisticasConan.put("Fuerza",18);
        estadisticas.put("Conan", estadisticasConan);

        if (estadisticas.containsKey("Conan")) {
            HashMap<String, Integer> est = estadisticas.get("Conan");
            if (est.containsKey("Fuerza")) {
                est.put("Fuerza", est.get("Fuerza") + 2);
                System.out.println(" Nueva Fuerza -> " + est.get("Fuerza"));
            }
        }

        //EJERCICIO 10)
        // Tienes un HashMap<String, ArrayList<String>> de Gremios (como en el ej. 7).
        // Escribe un algoritmo que recorra todos los gremios y verifique si un aventurero llamado "Judas" está escondido en alguno de ellos.
        // Si lo encuentra,debe imprimir en qué gremio está y eliminarlo de la lista de ese gremio inmediatamente.

        System.out.println("Ejercicio 10: ");

        eliminarTraidor(gremios, "Judas");
    }

        public static void eliminarTraidor(HashMap<String, ArrayList<String>> gremios, String traidor) {
            for (Map.Entry<String, ArrayList<String>> entry : gremios.entrySet()) {
                ArrayList<String> miembros = entry.getValue();
                if (miembros.contains(traidor)) {
                    System.out.println("Traidor " + traidor + " encontrado en el gremio de los " + entry.getKey());
                    miembros.remove(traidor);
                    System.out.println("Traidor eliminado. Miembros restantes -> " + miembros);
                    return;
                }
            }
            System.out.println("Traidor no encontrado.");
        }


        public static void imprimirGremio(HashMap<String, ArrayList<String>> gremios, String nombreGremio) {
            if (gremios.containsKey(nombreGremio)) {
                System.out.println("Miembros del gremio " + nombreGremio + ":");
                for (String miembro : gremios.get(nombreGremio)) {
                    System.out.println("- " + miembro);
                }
            } else {
                System.out.println("El gremio no existe.");
            }
        }

}
