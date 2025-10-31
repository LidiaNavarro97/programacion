import java.util.Random;
import java.util.Scanner;

public class ejercicio3 {
    public static void main (String[] args){

//Modifica el programa anterior de tal forma que los números que se introducen en el array se generen de forma aleatoria
// (valores entre 1 y 1999).
        // copiar y pegar el ejercicio anterior pero cambiar la parte donde se meten los numeros y hacerlo aleatorio con un random

        Scanner sc = new Scanner(System.in);
        int FILAS = 4;
        int COLUMNAS = 5;
        int[][] matriz = new int[FILAS][COLUMNAS];
        int[] sumaFilas = new int[FILAS];
        int[] mayorColumnas = new int[COLUMNAS];
        int sumaTotal = 0;
        Random rand = new Random();


        // Genera los números aleatorios
        System.out.println("Se muestran 20 números aleatorios entre 1 y 1999...\n");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                matriz[i][j] = rand.nextInt(1999) + 1; // genera valores entre 1 y 1999
            }
        }
        // calcular la suma de filas
        for (int i = 0; i < FILAS; i++) {
            int suma = 0;
            for (int j = 0; j < COLUMNAS; j++) {
                suma += matriz[i][j];
            }
            sumaFilas[i] = suma;
            sumaTotal += suma;
        }
        // calcular el mayor numero de cada columna
        for (int j = 0; j < COLUMNAS; j++) {
            int mayor = matriz[0][j];
            for (int i = 1; i < FILAS; i++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
            mayorColumnas[j] = mayor;
        }

        // mostrar la matriz con sumas
        System.out.println("\nTABLA:\n");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.printf("%6d", matriz[i][j]);
            }
            System.out.printf(" | Σ fila %d = %d\n", i + 1, sumaFilas[i]);
        }

        // mostrar los numeros mayores y el total
        System.out.println("-------------------------------------------------");
        for (int j = 0; j < COLUMNAS; j++) {
            System.out.printf("%6d", mayorColumnas[j]);
        }
        System.out.printf(" | TOTAL = %d\n", sumaTotal);

        sc.close();


    }
}
