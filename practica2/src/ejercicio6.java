import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        //Programa Java que guarda en un array 10 números enteros que se leen por teclado.
        //A continuación se recorre el array y
        //calcula cuántos números son positivos, cuántos negativos y cuántos ceros.


        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        // Leer 10 números desde teclado
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Contar positivos, negativos y ceros
        for (int numero : numeros) {
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        // Mostrar resultados
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);

    }
}


