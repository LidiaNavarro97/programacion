

import java.util.Scanner;
public class ejercicio8 {
        public static void main(String[] args) {

            //Leer la altura de N personas y calcular la altura media.
            //Calcular cuántas personas tienen una altura superior a la media y cuántas tienen una altura inferior a la media.
            //El valor de N se pide por teclado y debe ser entero positivo.

            //declaro
            Scanner scanner = new Scanner(System.in);
            int N;

            // Pido el valor de N mirando que sea positivo

            do {
                System.out.print("¿Cuántas personas vas a calcular? (un número entero positivo): ");
                N = scanner.nextInt();
            } while (N <= 0);

            double[] alturas = new double[N];
            double suma = 0;

            // Leo la altura

            for (int i = 0; i < N; i++) {
                System.out.print("Altura de la persona " + (i + 1) + ":"); //Aqui hay un error que tengo que corregir
                alturas[i] = scanner.nextDouble();
                suma += alturas[i];
            }

            // Calculo la media
            double media = suma / N;

            // Contar cuántas están por encima o debajo de la media

            int superiores = 0;
            int inferiores = 0;

            for (double altura : alturas) {
                if (altura > media) {
                    superiores++;
                } else if (altura < media) {
                    inferiores++;
                }
            }

            // Mostrar resultados

            System.out.printf("Altura media: (en metros) ", media);
            System.out.println("Personas con altura superior a la media: " + superiores);
            System.out.println("Personas con altura inferior a la media: " + inferiores);
        }
}
