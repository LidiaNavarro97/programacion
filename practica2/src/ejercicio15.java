import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {

        // Crea un programa que:
        //    • Cree una lista de enteros (ArrayList<Integer>).
        //    • Pida al usuario 10 números enteros y los añada a la lista.
        //    • Elimine los valores duplicados manteniendo solo el primero que apareció.
        //    • Ordene la lista de menor a mayor y la muestre por pantalla.

        // Crear la lista de enteros
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario 10 números en la lista
        System.out.println("Introduce 10 números enteros: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int num = sc.nextInt();
            lista.add(num);
        }

        // crear dos bucles para que vayan comparando cada posicion
        for (int k = 0; k <lista.size(); k++) {
            for (int j = 1; j < lista.size(); j++) {
                if (lista.get(k).equals(lista.get(j)) && k != 1) {
                    lista.remove(j);
                    j--;

                }
            }
        }

        //con este comando se ordena de menor a mayor
        lista.sort(null);
        System.out.println(lista);
    }
}
