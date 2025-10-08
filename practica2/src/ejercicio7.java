
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

       //Programa Java que llene un array con 10 números enteros que se leen por teclado.
        // A continuación calcula y muestra la media de los valores positivos y la de los valores negativos del array.


        //lo declaramos
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        int sumaPositivos = 0;
        int cantidadPositivos = 0;
        int sumaNegativos = 0;
        int cantidadNegativos = 0;

        System.out.println("Introduce 10 números enteros:");
        for (int i=0; i<numeros.length; i++) {

            System.out.print("Número" + (i+1) + ": ");
            numeros[i] = scanner.nextInt();

            //segun el signo
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                cantidadPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                cantidadNegativos++;
            }
        }

        //para calcular las medias
        double mediaPositivos = (cantidadPositivos > 0) ? (double) sumaPositivos / cantidadPositivos : 0;
        double mediaNegativos = (cantidadNegativos > 0) ? (double) sumaNegativos / cantidadNegativos : 0;


        System.out.println("Resultados: ");

        if (cantidadPositivos > 0) {
            System.out.println("Media de positivos: " + mediaPositivos);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        if (cantidadNegativos > 0) {
            System.out.println("Media de negativos: " + mediaNegativos);
        } else {
            System.out.println("No se ingresaron números negativos.");
        }
    }
}
