import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        //Crea un array que contenga 5 números. Realiza un programa que te muestre por pantalla SOLO el más pequeño de ellos.

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        //Pedir 5 numeros al usuario

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el numero: " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int menor = numeros[0];

        // Recorrer el array en busca del numero mas menor

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("El numero mas pequeño es: " + menor);
    }
}
