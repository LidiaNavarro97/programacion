import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        //Crea un array de números donde le indicamos por teclado el tamaño del array,
        // rellenaremos el array con números aleatorios entre 0 y 9,
        // al final muestra por pantalla el valor de cada posición y la suma de todos los valores.

        Scanner sc = new Scanner(System.in);

        //Pedir el tamaño del array:

        System.out.print("Introduce el tamaño del array: ");
        int tamaño = sc.nextInt();

        //Ahora declaramos el array:

        int[] numeros = new int[tamaño];
        int suma = 0;

        // Relleno el array con números aleatorios entre 0 y 9

        for (int i = 0; i < tamaño; i++) {
            numeros[i] = (int) (Math.random() *10); //generar numeros del 0 al 9
            suma += numeros[i];
        }
        // Mostrar los valores y sus posiciones

        System.out.println("\nValores del array 'numeros':");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
        // Mostrar la suma total

        System.out.println("Suma total de los valores: " + suma);
    }

    }
