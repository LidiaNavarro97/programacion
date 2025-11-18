import java.util.Random;
import java.util.Scanner;

public class ejercicio4 {
    public static void main (String[] args) throws InterruptedException {

        //Modifica el programa anterior de tal forma que las sumas parciales y la suma total aparezcan en la pantalla con un pequeño retraso,
        // dando la impresión de que el ordenador se queda “pensando” antes de mostrar los números.


        Scanner sc = new Scanner(System.in); //esto tambien esta mal ya que aqui tampoco se usa como en el anterior
        int FILAS = 4;
        int COLUMNAS = 5;
        int[][] matriz = new int[FILAS][COLUMNAS];
        int[] sumaFilas = new int[FILAS];
        int[] mayorColumnas = new int[COLUMNAS];
        int sumaTotal = 0;
        Random rand = new Random(); //npara generar numerso aleatorios

        // Genera los números aleatorios
        System.out.println("Se muestran 20 números aleatorios entre 1 y 1999...\n");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                matriz[i][j] = rand.nextInt(1999) + 1; // nextInt(1999) produce números entre 0 y 1998
                                                 // +1 ajusta el rango para obtener números entre 1 y 1999
            }
        }

        // Calculo la suma de filas
        for (int i = 0; i < FILAS; i++) {
            int suma = 0; // Acumulador de sumas por fila
            for (int j = 0; j < COLUMNAS; j++) {
                suma += matriz[i][j];
            }
            sumaFilas[i] = suma; // Guardamos la suma obtenida
            sumaTotal += suma;  // También se suma al acumulado total
        }

        // Calculo el número mayor de cada columna
        for (int j = 0; j < COLUMNAS; j++) {
            int mayor = matriz[0][j]; // Se toma como referencia inicial el primer valor de la columna
            for (int i = 1; i < FILAS; i++) {
                if (matriz[i][j] > mayor) { // Si encontramos un valor mayor, lo guardamos
                    mayor = matriz[i][j];
                }
            }
            mayorColumnas[j] = mayor; // Guardamos el mayor de la columna
        }

        // Mostrar la matriz con sumas
        System.out.println("\nTABLA:\n");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.printf("%6d", matriz[i][j]); // Imprime cada valor con formato alineado
            }
            // Antes de mostrar la suma de la fila, se pausa 500 ms (medio segundo)
            Thread.sleep(500);
            System.out.printf(" | Σ fila %d = %d\n", i + 1, sumaFilas[i]);
        }

        // aqui se simula otra pausa antes de mostrar los resultados finales
        Thread.sleep(700); // Pausa antes de mostrar valores máximos de las columnas
        System.out.println("-------------------------------------------------");
        for (int j = 0; j < COLUMNAS; j++) {
            System.out.printf("%6d", mayorColumnas[j]);
        }

        // simulo otra pausa antes de mostrar el total
        Thread.sleep(1000);// Última pausa antes de mostrar la suma total
        System.out.printf(" | TOTAL = %d\n", sumaTotal);

        sc.close();
    }
}
