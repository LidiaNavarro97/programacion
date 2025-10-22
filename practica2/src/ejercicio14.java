import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {


        //    • Cree una lista de Strings (ArrayList<String>).
        //    • Pida al usuario nombres por teclado hasta que introduzca la palabra "fin".
        //    • Luego pida un nombre a buscar y diga si está en la lista o no, mostrando también en qué posición se encuentra si existe.

        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        //pedir nombres a los usuarios
        System.out.println("Introduce nombres (escribe fin para terminar): " );
        while (true) {
            String nombre =  sc.nextLine();
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }
            nombres.add(nombre);
        }

        //pedir el nombre:
        System.out.print("Introduce un nombre para buscar: ");
        String nombrebuscado = sc.nextLine();

        //comprobamos que este en la lista
        if (nombres.contains(nombrebuscado)) {
            int posicion = nombres.indexOf(nombrebuscado) +1;
            System.out.println("El nombre " + nombrebuscado + " está en la lista, en la posicion: " + posicion);
        } else {
            System.out.println("El nombre" + nombrebuscado + "no esta en la lista");
        }
    }

}
