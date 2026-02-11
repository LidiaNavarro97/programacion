public class puja {

        // Nombre del jugador que realiza la puja
        private String jugador;

        // Cantidad de oro que ofrece el jugador
        private double cantidad;

        // Constructor
        public puja(String jugador, double cantidad) {
            this.jugador = jugador;   // Guardamos el nombre
            this.cantidad = cantidad; // Guardamos la cantidad
        }

        // Get jugador
        public String getJugador() {
            return jugador;
        }

        // Get cantidad
        public double getCantidad() {
            return cantidad;
        }

        // para mostrar la puja de forma legible por pantalla
        public String toString() {
            return jugador + " -> " + cantidad + " oro";
        }
    }