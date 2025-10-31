import java.util.Scanner;

public class ejercicio2 {
    public static void main (String[] args){

// Escribe un programa que solicite 20 números enteros.
// Estos números debemos de introducirlo en un array de 4 filas por 5 columnas.
// El programa mostrará las sumas parciales de filas y en las columnas el mayor número de la columna.
// La suma total debe aparecer en la esquina inferior derecha.


        Scanner sc = new Scanner(System.in);
        int FILAS = 4;
        int COLUMNAS = 5;
        int[][] matriz = new int[FILAS][COLUMNAS];
        int[] sumaFilas = new int[FILAS];
        int[] mayorColumnas = new int[COLUMNAS];
        int sumaTotal = 0;

        // para meter los numeros
        System.out.println("Introduce 20 números enteros:");
        for (int i = 0; i < FILAS; i++) { //para las filas
            for (int j = 0; j < COLUMNAS; j++) { //otro for dentro para las columnas
                System.out.print("Número [" + (i + 1) + "," + (j + 1) + "]: ");
                matriz[i][j] = sc.nextInt();
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
