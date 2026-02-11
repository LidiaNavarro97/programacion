import java.util.ArrayList;
import java.util.HashMap;

// Esta clase gestiona toda la lógica de la casa de subastas
public class casaSubastas {

    // creo HashMap llamado mercado
    // Clave-> nombre del item
    // Valor-> lista de pujas hechas por ese item
    private HashMap<String, ArrayList<puja>> mercado;

    // HashMap llamado saldos
    // Clave-> nombre del jugador
    // Valor-> cantidad de oro que tiene
    private HashMap<String, Double> saldos;

    // Constructor

    // Inicializa los HashMap cuando se crea la casa de subastas
    public casaSubastas() {
        mercado = new HashMap<>();
        saldos = new HashMap<>();
    }

    // Metodo para agregar un jugador con saldo inicial
    public void agregarJugador(String nombre, double saldoInicial) {

        // Guardamos en el HashMap el nombre del jugador y su saldo
        saldos.put(nombre, saldoInicial);
    }

    // Metodo para agregar un item al mercado
    public void agregarItem(String nombreItem) {

        // Creamos una nueva lista vacía de pujas para ese item
        mercado.put(nombreItem, new ArrayList<>());
    }

    // Metodo para agregar una puja a un item
    public void agregarPuja(String nombreItem, puja puja) {

        // Primero comprobamos que el item exista
        if (mercado.containsKey(nombreItem)) {

            // Si existe, añadimos la puja a la lista correspondiente
            mercado.get(nombreItem).add(puja);
        }
    }

    // METODO PRINCIPAL

    public void procesarVenta(String nombreItem) {

        // Comprobamos si el item existe en el mercado
        if (!mercado.containsKey(nombreItem)) {
            System.out.println("El item no existe.");
            return; // Salimos del metodo
        }

        // Obtenemos la lista de pujas asociadas a ese item
        ArrayList<puja> listaPujas = mercado.get(nombreItem);

        // Mientras haya pujas en la lista
        while (!listaPujas.isEmpty()) {

            // Suponemos inicialmente que la mejor puja es la primera
            puja mejorPuja = listaPujas.get(0);

            // Recorremos toda la lista para buscar la puja más alta
            for (puja p : listaPujas) {

                // Si encontramos una puja mayor que la actual mejor
                if (p.getCantidad() > mejorPuja.getCantidad()) {

                    // Actualizamos la mejor puja
                    mejorPuja = p;
                }
            }

            // traigo datos de la mejor puja encontrada
            String jugador = mejorPuja.getJugador();
            double cantidad = mejorPuja.getCantidad();

            // Obtenemos el saldo del jugador
            // Si no existe el jugador, devuelve 0.0 por defecto
            double saldoJugador = saldos.getOrDefault(jugador, 0.0);

            // Verificamos si el jugador tiene suficiente dinero
            if (saldoJugador >= cantidad) {

                // Restamos el dinero del saldo
                saldos.put(jugador, saldoJugador - cantidad);

                // Mostramos mensaje de éxito
                System.out.println("Venta realizada con éxito");
                System.out.println("Item: " + nombreItem);
                System.out.println("Ganador: " + jugador);
                System.out.println("Precio: " + cantidad);

                // Eliminamos el item completamente del mercado porq ya se ha vendido
                mercado.remove(nombreItem);

                // Terminamos el metodo porque la venta ya se realizó
                return;

            } else {

                // Si no tiene dinero suficiente
                System.out.println("El jugador " + jugador + " no tiene saldo suficiente. Se elimina su puja.");

                // Eliminamos SOLO esa puja
                // para intentar con la siguiente mejor
                listaPujas.remove(mejorPuja);
            }
        }
        // Si salimos del while significa que no había ninguna puja válida
        System.out.println("No hay pujas válidas para el item.");
    }

    // Metodo auxiliar para mostrar los saldos finales
    public void mostrarSaldos() {

        System.out.println("SALDOS: ");

        // Recorremos todas las claves ( los jugadores)
        for (String jugador : saldos.keySet()) {

            // Mostramos el nombre y su saldo actual
            System.out.println(jugador + ": " + saldos.get(jugador));
        }
    }
}