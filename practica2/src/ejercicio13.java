import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {

        //    • Cree una lista de enteros (ArrayList<Integer>).
        //    • Pida números por teclado hasta que el usuario introduzca un número negativo (ese no se añade).
        //    • Muestre por pantalla todos los números de la lista y la suma total de los mismos.


        //crear una lista de enteros:
        ArrayList<Integer> ListaNumeros = new ArrayList<>();

        //crear un scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        //pedir numeros hasta que se meta uno negativo (ese no se añade)
        System.out.println("Introduce numeros enteros y para terminar introduce uno negativo: ");
        while (true) {
            System.out.print("Numero: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break; //para salirnos del bucle
            }
            ListaNumeros.add(numero); //añadir el numero a la lista si es positivo o cero
        }
        //mostrar todos los numeros de la lista
        System.out.println("Numero introducidos: ");
        for (int num: ListaNumeros) {
            System.out.print(num + " ");
        }
        System.out.println(); //salto de linea

        //calcular y mostrar la suma total
        int suma = 0;
        for (int num: ListaNumeros) {
            suma += num;
        }
        System.out.println("Suma total : " + suma);

    }
}
