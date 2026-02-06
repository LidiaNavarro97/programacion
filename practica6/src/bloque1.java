import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class bloque1 {

        // EJERCICIO 1)

        // 1) El Registro de Muertes: Crea un ArrayList llamado registroCombate. Añade 5 eventos
        //(ej: "Orco derrotado", "Poción usada"). Luego, muestra el tercer evento que ocurrió.

    public static void main(String[] args) {

        System.out.println("Ejercicio 1: ");
        // Creo un array llamado registroCombate
        ArrayList<String> registroCombate = new ArrayList<>();

        // Le añado 5 nombres de eventos.
        registroCombate.add("Orco derrotado");
        registroCombate.add("Poción usada");
        registroCombate.add("Tesoro encontrado");
        registroCombate.add("Dragón vencido");
        registroCombate.add("Nivel completado");

        System.out.println("Evento: " + registroCombate.get(2));


        // EJERCICIO 2)

        // 2) El Censo Único: Crea un HashSet de nombres de villanos.
        // Intenta añadir a "Morgoth" dos veces.
        // Al final, imprime el tamaño del Set para demostrar que no se duplicó.

        System.out.println("Ejercicio 2: ");
        // Creo un HashSet de nombre villanos.
        HashSet<String> villanos = new HashSet<>();
        // Añado nombres, y repito uno dos veces para que no me lo duplique en el tamaño.
        villanos.add("Sauron");
        villanos.add("Morgoth");
        villanos.add("Morgoth");
        // Imprimo el tamaño del Hashset.
        System.out.println("Tamaño: " + villanos.size());


        // EJERCICIO 3)

        // 3) Crea un HashMap<String, Integer> donde la clave sea el nombre del aventurero
        // y el valor su cantidad de oro.
        //Añade a 3 héroes y muestra el oro de uno de ellos usando su nombre.

        System.out.println("Ejercicio 3: ");
        // Creacion de un hashmap de nombre heroes
        HashMap<String, Integer> heroes = new HashMap<>();
        // Añado 3 heroes al HashMap, con su clave y su valor
        heroes.put("Lidia", 200);
        heroes.put("Daniel", 300);
        heroes.put("Diego", 400);
        // Imprimo el valor de uno de ellos usando su nombre:
        System.out.println("Oro de Lidia: " + heroes.get("Lidia"));


        // EJERCICIO 4)

        // 4) Usando el ArrayList del ejercicio 1,
        // elimina el evento más antiguo (índice 0) y
        // añade uno nuevo al final ("Dragón avistado")

        System.out.println("Ejercicio 4: ");
        // Borro el primer elemento
        registroCombate.remove(0);
        // Añado un nuevo al final de la lista
        registroCombate.add("Dragon Avisado");

        System.out.println("Evento: " + registroCombate);


        // EJERCICIO 5)

        // 5) Crea un HashMap<String, Double> con nombres de hechizos y sus costos de maná.
        // Usa un bucle para imprimir todos los hechizos que cuesten más de 50 de maná.

        System.out.println("Ejercicio 5: ");
        // Creo un HasMup
        HashMap<String, Double> hechizos = new HashMap<>();
        // Creo los nombres de los hechizos y sus costes.
        hechizos.put("Rayo", 70.0);
        hechizos.put("Bola", 40.0);
        hechizos.put("Hielo", 60.0);
        System.out.println("Hechizos que cuestan más de 50");

        //Bucle para imprimir todos los hechizos que cuesten mas de 50
        for (Map.Entry<String, Double> entry : hechizos.entrySet()) {
            if (entry.getValue() > 50) {
                System.out.println(" - " + entry.getKey() + " : " + entry.getValue());
            }
        }

        // EJERCICIO 6)

        // 6) En tu HashSet de villanos, verifica si "Sauron" está presente.
        // Si está, elimínalo porque ha sido derrotado.

        System.out.println("Ejercicio 6: ");

        if (villanos.contains("Sauron")) {
            villanos.remove("Sauron");

            System.out.println("Sauron ha sido derrotado.");
        }
    }
}