import java.util.Scanner;

public class ejercicio2 {
    public static void main (String[] args){

// Escribe un programa que solicite 20 números enteros.
// Estos números debemos de introducirlo en un array de 4 filas por 5 columnas.
// El programa mostrará las sumas parciales de filas y en las columnas el mayor número de la columna.
// La suma total debe aparecer en la esquina inferior derecha.


        Scanner sc = new Scanner(System.in); //para leer datos del usuario
        int FILAS = 4;
        int COLUMNAS = 5;
        int[][] matriz = new int[FILAS][COLUMNAS]; // Array bidimensional donde se guardan los 20 números
        int[] sumaFilas = new int[FILAS];
        int[] mayorColumnas = new int[COLUMNAS];
        int sumaTotal = 0;

        // para meter los numeros
        System.out.println("Introduce 20 números enteros:");
        for (int i = 0; i < FILAS; i++) { // Bucle para recorrer las filas
            for (int j = 0; j < COLUMNAS; j++) { //otro for dentro para recorrer las columnas
                System.out.print("Número [" + (i + 1) + "," + (j + 1) + "]: ");  // Pedimos un número
                matriz[i][j] = sc.nextInt(); //guardamos el numero en la matriz
            }
        }
        // calcular la suma de filas
        for (int i = 0; i < FILAS; i++) {
            int suma = 0; // Acumulador para la suma de la fila
            for (int j = 0; j < COLUMNAS; j++) {
                suma += matriz[i][j];// Sumamos cada elemento de la fila
            }
            sumaFilas[i] = suma; // Guardamos la suma en el array sumaFilas
            sumaTotal += suma; // Acumulamos la suma total
        }
        // calcular el mayor numero de cada columna
        for (int j = 0; j < COLUMNAS; j++) {
            int mayor = matriz[0][j]; // Tomamos el primer valor como inicial
            for (int i = 1; i < FILAS; i++) { // Recorremos el resto de filas
                if (matriz[i][j] > mayor) { // Si encontramos uno mayor, lo sustituimos
                    mayor = matriz[i][j];
                }
            }
            mayorColumnas[j] = mayor; // Guardamos el mayor de esa columna
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
            System.out.printf("%6d", mayorColumnas[j]); // Mostramos el mayor de cada columna
        }
        System.out.printf(" | TOTAL = %d\n", sumaTotal); // Mostramos la suma total

        sc.close();

    }
}
