import java.util.*;

public class bloque3 {

    public static void main(String[] args) {


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
        // EL List.of sirve para crear la lista de forma rapida y que no se pueda modificar
        ciudades.put("Guada", new ArrayList<>(List.of("Espada", "Escudo", "Poción", "Arco", "Casco", "Anillo")));

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
        //Usa un HashMap<String, List<HashSet<String>>>. La clave es el Nombre de la Mazmorra.
        // El valor es una Lista de todas las veces que se ha completado (Raids).
        // Cada entrada en la lista es un HashSet con los nombres de los jugadores que participaron (para evitar que el mismo jugador cuente dos veces en la misma incursión).
        //  • El Reto: Escribe un algoritmo que recorra todo el historial y encuentre al "Jugador Mas Valioso" (el nombre que mas veces aparece en todas las incursiones de todas las mazmorras).

        System.out.println("\nEJERCICIO 13:");

        // Creo el HashMap principal
        // La clave es el nombre de la mazmorra
        // El valor es la lista de incursiones (raids)
        HashMap<String, List<HashSet<String>>> historial = new HashMap<>();

        // MAZMORRA 1. Lista de raids

        List<HashSet<String>> raidsGuada = new ArrayList<>();

        // Primer raid
        raidsGuada.add(new HashSet<>(Set.of("Josemi", "Luis", "Carlos")));
        // Segundo raid
        raidsGuada.add(new HashSet<>(Set.of("Josemi", "Mario")));

        // Añado la mazmorra que le he llamado "guadaña oscura" al historial
        historial.put("Guadaña Oscura", raidsGuada);

        //  MAZMORRA 2. Lista de raids

        List<HashSet<String>> raidsFuego = new ArrayList<>();

        // Primer raid
        raidsFuego.add(new HashSet<>(Set.of("Luis", "Josemi")));
        // Segundo raid
        raidsFuego.add(new HashSet<>(Set.of("Carlos", "Mario", "Josemi")));

        // Añadimos la mazmorra que le he llamado "templo del fuego" al historial
        historial.put("Templo del Fuego", raidsFuego);

        // HashMap para contar cuántas veces aparece cada jugador
        // La clave es el nombre del jugador
        // El valor es el número de participaciones
        HashMap<String, Integer> contadorJugadores = new HashMap<>();

        // Recorremos todas las listas de raids del historial
        for (List<HashSet<String>> listaRaids : historial.values()) {
            // Recorremos cada raid de la lista
            for (HashSet<String> raid : listaRaids) {
                // Recorremos cada jugador del raid
                for (String jugador : raid) {

                    // Si el jugador ya existe, sumamos 1
                    // Si no existe, empieza en 0 y sumamos 1
                    contadorJugadores.put(jugador, contadorJugadores.getOrDefault(jugador, 0) + 1
                    );
                }
            }
        }

        // Variables para guardar al jugador más valioso
        String jugadorMasValioso = "";
        int maxParticipaciones = 0;

        // Recorremos el mapa de jugadores para encontrar el máximo
        for (Map.Entry<String, Integer> entry : contadorJugadores.entrySet()) {
            // Si este jugador tiene más participaciones que el anterior max
            if (entry.getValue() > maxParticipaciones) {
                maxParticipaciones = entry.getValue();
                jugadorMasValioso = entry.getKey();
            }
        }

        // Resultado final
        System.out.println("Jugador Más Valioso: " + jugadorMasValioso);
        System.out.println("Participaciones totales: " + maxParticipaciones);

        System.out.println("--------------------------------------------------------------------------------------");


        //EJERCICIO 14)
        //Crea un HashMap<String, List<String>> que almacene los mensajes enviados por cada jugador.
        // • El Reto: Crea un sistema que analice los últimos 3 mensajes de cada jugador (en su ArrayList).
        // Si un jugador tiene 2 mensajes idénticos dentro de sus últimos 3,
        // añade su nombre a un HashSet<String> llamado jugadoresSilenciados y limpia su historial de mensajes.

        System.out.println("\nEJERCICIO 14:");

        // Creo un HashMap que guarda los mensajes de cada jugador
        // La clave es el nombre del jugador
        // El valor es la lista de mensajes enviados por ese jugador
        HashMap<String, List<String>> mensajes = new HashMap<>();

        // Añado mensajes de ejemplo
        mensajes.put("Josemi", new ArrayList<>(List.of("Hola", "Adios", "Hola")));
        mensajes.put("Lidia", new ArrayList<>(List.of("Vendo espada", "Vendo escudo", "Vendo armadura")));
        mensajes.put("Daniel", new ArrayList<>(List.of("Spam", "Spam", "Spam")));

        // HashSet para guardar a los jugadores silenciados
        // No permite duplicados
        HashSet<String> jugadoresSilenciados = new HashSet<>();

        // Recorremos todos los jugadores y sus mensajes
        for (Map.Entry<String, List<String>> entry : mensajes.entrySet()) {

            // Nombre del jugador
            String jugador = entry.getKey();

            // Lista de mensajes del jugador
            List<String> listaMensajes = entry.getValue();

            // Solo analizamos si tiene al menos 3 mensajes
            if (listaMensajes.size() >= 3) {

                // Obtenemos los últimos 3 mensajes
                int tamaño = listaMensajes.size();
                List<String> ultimosTres = listaMensajes.subList(tamaño - 3, tamaño);

                // HashSet para comprobar mensajes repetidos
                HashSet<String> mensajesUnicos = new HashSet<>(ultimosTres);

                // Si hay menos mensajes únicos que mensajes totales,
                // significa que hay mensajes repetidos
                if (mensajesUnicos.size() < ultimosTres.size()) {

                    // Añadimos el jugador al HashSet de silenciados
                    jugadoresSilenciados.add(jugador);
                    // Limpiamos su historial de mensajes
                    listaMensajes.clear();
                }
            }
        }

        // Mostramos los jugadores silenciados
        System.out.println("Jugadores silenciados por spam:");
        System.out.println(jugadoresSilenciados);

        // Mostramos el historial final de mensajes
        System.out.println("\nHistorial de mensajes tras el filtro:");
        System.out.println(mensajes);

        System.out.println("--------------------------------------------------------------------------------------");

        //EJERCICIO 15)
        // Imagina una estructura HashMap<String, PriorityQueue<Double>> (o usa un ArrayList y ordénalo).
        // La clave es el Nombre del Item (ej: "Excalibur") y el valor es una lista de las Pujas actuales (números decimales).
        // ◦ El Reto: Escribe un metodo procesarVenta que:
        //   1. Tome el item con la puja más alta.
        //   2. Verifique en un HashMap<String, Double> de Saldos de Jugadores si el mejor postor tiene suficiente oro.
        //   3. Si tiene éxito, transfiere el oro y elimina el item del mercado. Si no, elimina esa puja y pasa a la siguiente más alta.

        System.out.println("\nEJERCICIO 15:");

        // Creamos la casa de subastas
        casaSubastas casa = new casaSubastas();

        // Creamos jugadores
        casa.agregarJugador("Merlin", 500);
        casa.agregarJugador("Lancelot", 300);
        casa.agregarJugador("Josemi", 1000);

        // Creamos item
        casa.agregarItem("Excalibur");

        // Creamos pujas
        casa.agregarPuja("Excalibur", new puja("Merlin", 600));
        casa.agregarPuja("Excalibur", new puja("Lancelot", 250));
        casa.agregarPuja("Excalibur", new puja("Josemi", 800));

        // Procesamos la venta
        casa.procesarVenta("Excalibur");

        // Mostramos los saldos finales
        casa.mostrarSaldos();
    }
    // MÉTODOS


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
}




