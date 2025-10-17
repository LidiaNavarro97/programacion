import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        // Crea un programa en Java que:
        // 1. Pida al usuario por teclado 10 números enteros y los guarde en un array.
        // 2. Recorra el array para encontrar:
        //    ▪ El valor máximo y la posición en la que aparece.
        //    ▪ El valor mínimo y la posición en la que


        // desclaramos los 10 numeros

        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // pedir al usuario 10 numeros enteros

        System.out.println("Teclee 10 numeros enteros: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        //valor maximo y minimo y su posicion

        int max = numeros[0];
        int posmax = 0;
        int min = numeros[0];
        int posmin = 0;

        // recorrer el array

        for (int i = 1; i < 10; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
                posmax = i;
            }
            if (numeros[i] < min) {
                min = numeros[i];
                posmin = i;

            }
            }

        //mostrar los resultados

        System.out.println("RESULTADOS");
        System.out.println("Valor máximo: " + max + " posición: " + posmax);
        System.out.println("Valor mínimo: " + min + " posición: " + posmin);
    }
}
