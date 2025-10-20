import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {


        //En España cada persona está identificada con un Documento Nacional de Identidad (DNI)
        //En el que figura un número y una letra, por ejemplo 56999545W.
        //Realiza un programa donde le pidas al usuario SOLO el número del dni y el programa te devuelva la letra.
        //Para calcular la letra solo tienes que dividir el número del DNI entre 23,
        //El resto de esta división se corresponde con la posición de la letra en el abecedario.
        //Utiliza un array para guardar CADA letra del abecedario.

        Scanner sc = new Scanner(System.in);

        // Array con las letras del DNI segun nos dice google
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'};

        // Pedimos al usuario solo el número del DNI sin las letras
        System.out.print("Introduce el número del DNI (SIN LETRAS): ");
        int numeroDNI = sc.nextInt();

        // Calculamos la posición
        int resto = numeroDNI % 23;

        // Obtenemos la letra correspondiente
        char letra = letras[resto];

        // Mostrar el resultado
        System.out.println("La letra del DNI " + numeroDNI + " es: " + letra);

    }
}
