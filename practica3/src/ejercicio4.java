import java.util.Random;
import java.util.Scanner;

public class ejercicio4 {
    public static void main (String[] args) throws InterruptedException {

        //Modifica el programa anterior de tal forma que las sumas parciales y la suma total aparezcan en la pantalla con un pequeño retraso,
        // dando la impresión de que el ordenador se queda “pensando” antes de mostrar los números.


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

        // Calculo la suma de filas
        for (int i = 0; i < FILAS; i++) {
            int suma = 0;
            for (int j = 0; j < COLUMNAS; j++) {
                suma += matriz[i][j];
            }
            sumaFilas[i] = suma;
            sumaTotal += suma;
        }

        // Calculo el número mayor de cada columna
        for (int j = 0; j < COLUMNAS; j++) {
            int mayor = matriz[0][j];
            for (int i = 1; i < FILAS; i++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
            mayorColumnas[j] = mayor;
        }

        // Mostrar la matriz con sumas
        System.out.println("\nTABLA:\n");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.printf("%6d", matriz[i][j]);
            }
            // aqui simulo un pausa antes de mostrar la suma de cada fila
            Thread.sleep(500);
            System.out.printf(" | Σ fila %d = %d\n", i + 1, sumaFilas[i]);
        }

        // aqui se simula otra pausa antes de mostrar los resultados finales
        Thread.sleep(700);
        System.out.println("-------------------------------------------------");
        for (int j = 0; j < COLUMNAS; j++) {
            System.out.printf("%6d", mayorColumnas[j]);
        }

        // simulo otra pausa antes de mostrar el total
        Thread.sleep(1000);
        System.out.printf(" | TOTAL = %d\n", sumaTotal);

        sc.close();
    }
}
