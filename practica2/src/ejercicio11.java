import java.util.Arrays;

public class ejercicio11 {
    public static void main(String[] args) {


        // Escribe un programa java que invierta el orden de los valores de un array.
        // Por invertir el orden de los valores de un array,
        // me refiero que el último pasa a ser el primero, el penúltimo el segundo y así sucesivamente.
        // PRUEBA CON UN ARRAY DE TAMAÑO 6.

        // Hacemos un array de tamaño 6
        int[] numeros = {1, 2, 3, 4, 5, 6};

        // creamos otro array con la misma longitud
        int[] arrayInvertido = new int[numeros.length];

        //llenar ese array con los valores del array original en orden inverso
        for (int i = 0; i < numeros.length; i++) {
            arrayInvertido[i] = numeros[numeros.length - 1 - i];
        }
        // imprimimos el array original y el invertido
        System.out.print("Array original: " + Arrays.toString(numeros));
        System.out.print("Array invertido: " + Arrays.toString(arrayInvertido));


    }
}



