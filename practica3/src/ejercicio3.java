import java.util.Random;
import java.util.Scanner;

public class ejercicio3 {
    public static void main (String[] args){

    //Modifica el programa anterior de tal forma que los números que se introducen en el array se generen de forma aleatoria
    // (valores entre 1 y 1999).
    // copiar y pegar el ejercicio anterior pero cambiar la parte donde se meten los numeros y hacerlo aleatorio con un random

        Scanner sc = new Scanner(System.in); //Lo puse en la practica pero realmente está mal ya que aqui no se usa porque es aleatoriamente
        int FILAS = 4;
        int COLUMNAS = 5;
        int[][] matriz = new int[FILAS][COLUMNAS]; // Array bidimensional donde se guardan los numeros aleatorios
        int[] sumaFilas = new int[FILAS];
        int[] mayorColumnas = new int[COLUMNAS];
        int sumaTotal = 0;
        Random rand = new Random(); //para generar numeros aleatorios


        // Genera los números aleatorios
        System.out.println("Se muestran 20 números aleatorios entre 1 y 1999...\n");
        for (int i = 0; i < FILAS; i++) { //recorre filas
            for (int j = 0; j < COLUMNAS; j++) { //recorre columnas
                matriz[i][j] = rand.nextInt(1999) + 1; // genera valores entre 1 y 1999
                                                      // Al sumarle +1, el rango pasa a ser de 1 a 1999
            }
        }
        // calcular la suma de filas
        for (int i = 0; i < FILAS; i++) {
            int suma = 0;
            for (int j = 0; j < COLUMNAS; j++) {
                suma += matriz[i][j]; //acumula la suma de la fila
            }
            sumaFilas[i] = suma; // Guardamos la suma de la fila
            sumaTotal += suma; // Acumulamos el total global
        }
        // calcular el mayor numero de cada columna
        for (int j = 0; j < COLUMNAS; j++) {
            int mayor = matriz[0][j];  // Primer valor de la columna como referencia inicial
            for (int i = 1; i < FILAS; i++) {
                if (matriz[i][j] > mayor) { // Si encontramos uno mayor, lo guardamos
                    mayor = matriz[i][j];
                }
            }
            mayorColumnas[j] = mayor; // Guardamos el mayor de la columna
        }

        // mostrar la matriz con sumas
        System.out.println("\nTABLA:\n");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.printf("%6d", matriz[i][j]); // Imprime valores alineados
            }
            System.out.printf(" | Σ fila %d = %d\n", i + 1, sumaFilas[i]); // Muestra suma de la fila
        }

        // mostrar los numeros mayores y el total
        System.out.println("-------------------------------------------------");
        for (int j = 0; j < COLUMNAS; j++) {
            System.out.printf("%6d", mayorColumnas[j]);  // Imprime el mayor de cada columna
        }
        System.out.printf(" | TOTAL = %d\n", sumaTotal); // Imprime el total general

        sc.close(); //por lo que dije al principio esto no se usaria


    }
}
