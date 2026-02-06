import java.util.*;

public class bloque3 {
    public static void main(String[]) {



        // EJERCICIO 11)
        //Crea un HashMap<String, Double> con los precios base de varios items.
        // Luego, crea un HashMap<String, ArrayList<String>> que represente las Ciudades y los Items en Stock que tienen.
        // ◦ El Reto: Escribe un metodo que reciba el nombre de una ciudad.
        //Si la ciudad tiene más de 5 items en stock, aplica un "impuesto de lujo" aumentando un 10% el precio de sus items en el mapa de precios base solo para esa transacción.

        System.out.println("EJERCICIO 11: ");

        //Creo el HashMap para almacenar el precio base de cada item
        HashMap<String, Double> preciosBase = new HashMap<>();

        // Añadimos los precios base de los ítems
        preciosBase.put("Espada", 100.0);
        preciosBase.put("Escudo", 80.0);
        preciosBase.put("Poción", 20.0);
        preciosBase.put("Arco", 90.0);
        preciosBase.put("Casco", 60.0);
        preciosBase.put("Anillo", 200.0);

        // Creo el HashMap que relaciona ciudades con los ítems que tienen en stock
        HashMap<String, ArrayList<String>> ciudades = new HashMap<>();
        // Añado la ciudad "Guada" con su lista de ítems
        ciudades.put("Guada", new ArrayList<>(List.of("Espada", "Escudo", "Poción", "Arco", "Casco", "Anillo" )));

        // Mostramos los precios de los ítems en la ciudad Guada
        mostrarPreciosCiudad("Guada", preciosBase, ciudades);


        System.out.println("--------------------------------------------------------------------------------------");


        // EJERCICIO 12)
        //Crea una estructura HashMap<String, HashMap<String, Boolean>>.
        //La primera clave es el Nombre de la Clase (ej: "Paladín").
        //El segundo Map contiene las Habilidades y un booleano que indica si están Bloqueadas o Desbloqueadas.
        //◦ El Reto: Crea una función que, al desbloquear la habilidad "Golpe Divino", verifique automáticamente si el jugador tiene desbloqueada la habilidad "Enfoque" (del mismo mapa). Si no la tiene, no puede desbloquear "Golpe Divino" y debe lanzar un mensaje de error.

            System.out.println("\nEJERCICIO 12:");

        //Creo un Hasmap principal  llamado clases, aue dentro de ese hay otro con las habilidades del paladin
        HashMap<String, HashMap<String, Boolean>> clases = new HashMap<>();

        // HashMap de habilidades del Paladín
        // true  -> habilidad desbloqueada
        // false -> habilidad bloqueada
        HashMap<String, Boolean> habilidadesPaladin = new HashMap<>();
        habilidadesPaladin.put("Enfoque", true);
        habilidadesPaladin.put("Golpe Divino", false);

        // Asocio las habilidades a la clase Paladín
        clases.put("Paladín", habilidadesPaladin);

        // Intento desbloquear la habilidad Golpe Divino
        desbloquearGolpeDivino(clases, "Paladín");

        System.out.println("--------------------------------------------------------------------------------------");

        //EJERCICIO 13)
        //Crea una estructura HashMap<String, HashMap<String, Boolean>>.
        // La primera clave es el Nombre de la Clase (ej: "Paladín").
        // El segundo Map contiene las Habilidades y un booleano que indica si están Bloqueadas o Desbloqueadas.

        System.out.println("\nEJERCICIO 13:");


        //EJERCICIO 14)
        //Crea una función que, al desbloquear la habilidad "Golpe Divino", verifique automáticamente si el jugador tiene desbloqueada la habilidad "Enfoque" (del mismo mapa).
        // Si no la tiene, no puede desbloquear "Golpe Divino" y debe lanzar un mensaje de error.

        System.out.println("\nEJERCICIO 14:");


        //EJERCICIO 15)
        //Crea un HashMap<String, List<String>> que almacene los mensajes enviados por cada jugador.
        //◦ El Reto: Crea un sistema que analice los últimos 3 mensajes de cada jugador (en su ArrayList).
        // Si un jugador tiene 2 mensajes idénticos dentro de sus últimos 3, añade su nombre a un HashSet<String> llamado jugadoresSilenciados y limpia su historial de mensajes.

        System.out.println("\nEJERCICIO 15:");



        //EJERCICIO 16)
        //Imagina una estructura HashMap<String, PriorityQueue<Double>> (o usa un ArrayList y ordénalo).
        // La clave es el Nombre del Item (ej: "Excalibur") y el valor es una lista de las Pujas actuales (números decimales).
        // ◦ El Reto: Escribe un metodo procesarVenta que:
        //   1. Tome el item con la puja más alta.
        //   2. Verifique en un HashMap<String, Double> de Saldos de Jugadores si el mejor postor tiene suficiente oro.
        //   3. Si tiene éxito, transfiere el oro y elimina el item del mercado. Si no, elimina esa puja y pasa a la siguiente más alta.

        System.out.println("\nEJERCICIO 16:");

        HashMap<String, PriorityQueue<Double>> subastas = new HashMap<>();

        // MÉTODOS
    }

        // metodo del ejercicio 11

        // Muestro los precios de una ciudad aplicando impuesto si tiene mucho stock
        public static void mostrarPreciosCiudad(String ciudad,
                HashMap<String, Double> preciosBase,
                HashMap<String, ArrayList<String>> ciudades) {

            ArrayList<String> stock = ciudades.get(ciudad);// Obtengo los ítems disponibles en la ciudad
            boolean impuesto = stock.size() > 5; // Si hay más de 5 ítems, se aplica impuesto de lujo

            System.out.println("Precios en " + ciudad + ":");

            // Recorremos todos los ítems de la ciudad
            for (String item : stock) {
                double precio = preciosBase.get(item);
                if (impuesto) { // Aplicamos el 10% extra si hay impuesto
                    precio *= 1.10;
                }
                System.out.println(item + " -> " + precio + " oro");
            }
        }

        // metodo del ejercicio 12

        // Intenta desbloquear la habilidad Golpe Divino
        public static void desbloquearGolpeDivino(
            HashMap<String, HashMap<String, Boolean>> clases, String nombreClase) {

        // Obtengo las habilidades de la clase
            HashMap<String, Boolean> habilidades = clases.get(nombreClase);

        // Comprobamos si Enfoque está desbloqueado
            if (!habilidades.get("Enfoque")) {
                System.out.println("ERROR: Debes desbloquear Enfoque primero.");
                return;
            }
            // Si cumple la condición, desbloqueamos Golpe Divino
            habilidades.put("Golpe Divino", true);
            System.out.println("Golpe Divino desbloqueado correctamente.");
        }

        // metodo del ejercicio 13


        // metodo del ejercicio 14


        // metodo del ejercicio 15

    }