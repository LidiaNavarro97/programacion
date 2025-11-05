import java.util.Random;

public class ejercicio5 {
    public static void main (String[] args){

        // Crear un programa que cuando se le introduzca números enteros rellene un array de 6 filas por 10 columnas con números enteros positivos
        // comprendidos entre 0 y 1000 (ambos incluidos).
        // A continuación, el programa deberá:
        //    • dar la posición del número máximo y mínimo
        //    • la suma total de todas las filas y columnas
        //    • la suma de todas las columnas
        //    • la suma de todas las filas.

            // primero declaro las variables de filas y columnas y su matriz
            int filas = 6;
            int columnas = 10;
            int[][] matriz = new int[filas][columnas];
            Random rand = new Random();

            // hacer una matriz con números aleatorios entre 0 y 1000
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    matriz[i][j] = rand.nextInt(1001);
                }
            }

            // Mostrar la matriz que he hecho antes
            System.out.println("Matriz: ");
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.printf("%5d ", matriz[i][j]);
                }
                System.out.println();
            }

            // declaro las variables para el máximo, mínimo y sus posiciones
            int max = matriz[0][0];
            int min = matriz[0][0];
            int filaMax = 0, colMax = 0, filaMin = 0, colMin = 0;

            // para buscar el máximo y mínimo con el for
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (matriz[i][j] > max) {
                        max = matriz[i][j];
                        filaMax = i;
                        colMax = j;
                    }
                    if (matriz[i][j] < min) {
                        min = matriz[i][j];
                        filaMin = i;
                        colMin = j;
                    }
                }
            }

            // mostrar las posiciones del máximo y mínimo
            System.out.println("\nNúmero máximo: " + max + " en posición (" + filaMax + ", " + colMax + ")");
            System.out.println("Número mínimo: " + min + " en posición (" + filaMin + ", " + colMin + ")");

            // Calcular la suma total
            int sumaTotal = 0;
            for (int[] fila : matriz) {
                for (int num : fila) {
                    sumaTotal += num;
                }
            }
            System.out.println("\nSuma total de todos los elementos: " + sumaTotal);

            // Suma de cada fila
            System.out.println("\nSuma de cada fila:");
            for (int i = 0; i < filas; i++) {
                int sumaFila = 0;
                for (int j = 0; j < columnas; j++) {
                    sumaFila += matriz[i][j];
                }
                System.out.println("Fila " + i + " : " + sumaFila);
            }

            // Suma de cada columna
            System.out.println("\nSuma de cada columna:");
            for (int j = 0; j < columnas; j++) {
                int sumaColumna = 0;
                for (int i = 0; i < filas; i++) {
                    sumaColumna += matriz[i][j];
                }
                System.out.println("Columna " + j + " : " + sumaColumna);
            }
    }
}
