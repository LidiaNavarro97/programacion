import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ejercicio6 {
    public static void main (String[] args){

        //Modifica el programa anterior de tal forma que no se repita ningún número en el array
        //además de que tiene que estar comprendido en un rango entre 20-40.

        // primero declaro las variables de filas y columnas y su matriz
        int filas = 4;
        int columnas = 5;
        int[][] num = new int[filas][columnas];


        // Array con números del 20 al 40
        int[] numeros = new int[21]; // 40 - 20 + 1 = 21 números
        int indice = 0;
        for (int i = 20; i <= 40; i++) {
            numeros[indice++] = i; // los vamos guardando de forma consecutiva
        }

        // Mezclar manualmente el array para evitar números repetidos
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            int posAleatoria = random.nextInt(numeros.length);
            int aux = numeros[i]; // intercambiamos los valores
            numeros[i] = numeros[posAleatoria];
            numeros[posAleatoria] = aux;
        }

        // Variables para el máximo y mínimo, dentro del array
        int max = Integer.MIN_VALUE; // valor mínimo posible para iniciar la búsqueda
        int min = Integer.MAX_VALUE; // valor máximo posible para iniciar la búsqueda
        int maxFila = 0, maxCol = 0, minFila = 0, minCol = 0;

        // rellenamos la matriz sin repetir valores
        int index = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                num[i][j] = numeros[index++];// asignamos el número y avanzamos en el array mezclado

                // Buscar máximo y mínimo
                if (num[i][j] > max) {
                    max = num[i][j];
                    maxFila = i;
                    maxCol = j;
                }
                if (num[i][j] < min) {
                    min = num[i][j];
                    minFila = i;
                    minCol = j;
                }
            }
        }

        // Calcular sumas total, por fila y por columna
        int sumaTotal = 0;
        int[] sumaFilas = new int[filas];
        int[] sumaColumnas = new int[columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaFilas[i] += num[i][j]; // suma de la fila actual
                sumaColumnas[j] += num[i][j];  // suma de la columna
                sumaTotal += num[i][j];  // suma total de todos los valores
            }
        }

        // Mostrar los resultasdo de la tabla
        System.out.println("------------------------- TABLA -------------------------");
        System.out.printf("%-6s", " "); // un espacio para alinear sobre las filas
        for (int j = 0; j < columnas; j++) {
            System.out.printf("%6s", "C" + j); //encabezados de columnas
        }
        System.out.printf("%10s\n", "Suma Fila");

        for (int i = 0; i < filas; i++) {
            System.out.printf("Fila %-2d", i); //muestra el nombre de las filas
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%6d", num[i][j]); // imprime los valores
            }
            System.out.printf("%10d\n", sumaFilas[i]); // imprime la suma de la fila
        }

        System.out.printf("%-6s", "Suma");  // etiqueta para las sumas de columnas
        for (int j = 0; j < columnas; j++) {
            System.out.printf("%6d", sumaColumnas[j]); // suma de cada columna
        }
        System.out.printf("%10d TOTAL", sumaTotal); // suma total de la matriz

        // Mostrar máximo y mínimo
        System.out.println();
        System.out.printf("Máximo: %d en [%d][%d]\n", max, maxFila, maxCol);
        System.out.printf("Mínimo: %d en [%d][%d]\n", min, minFila, minCol);
    }
}

