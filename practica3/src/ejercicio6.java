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
        int[] numeros = new int[21];
        int indice = 0;
        for (int i = 20; i <= 40; i++) {
            numeros[indice++] = i;
        }

        // Mezclar manualmente el array
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            int posAleatoria = random.nextInt(numeros.length);
            int aux = numeros[i];
            numeros[i] = numeros[posAleatoria];
            numeros[posAleatoria] = aux;
        }

        // Variables para el máximo y mínimo
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxFila = 0, maxCol = 0, minFila = 0, minCol = 0;

        // rellenamos la matriz sin repetir valores
        int index = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                num[i][j] = numeros[index++];
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

        // Calcular sumas
        int sumaTotal = 0;
        int[] sumaFilas = new int[filas];
        int[] sumaColumnas = new int[columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sumaFilas[i] += num[i][j];
                sumaColumnas[j] += num[i][j];
                sumaTotal += num[i][j];
            }
        }

        // Mostrar los resultasdo de la tabla
        System.out.println("------------------------- TABLA -------------------------");
        System.out.printf("%-6s", " "); // un espacio para el encabezado de ls fila
        for (int j = 0; j < columnas; j++) {
            System.out.printf("%6s", "C" + j);
        }
        System.out.printf("%10s\n", "Suma Fila");

        for (int i = 0; i < filas; i++) {
            System.out.printf("Fila %-2d", i);
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%6d", num[i][j]);
            }
            System.out.printf("%10d\n", sumaFilas[i]);
        }

        System.out.printf("%-6s", "Suma");
        for (int j = 0; j < columnas; j++) {
            System.out.printf("%6d", sumaColumnas[j]);
        }
        System.out.printf("%10d TOTAL", sumaTotal);

        // Mostrar máximo y mínimo
        System.out.println();
        System.out.printf("Máximo: %d en [%d][%d]\n", max, maxFila, maxCol);
        System.out.printf("Mínimo: %d en [%d][%d]\n", min, minFila, minCol);
    }
}

