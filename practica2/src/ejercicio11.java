public class ejercicio11 {
    public static void main(String[] args) {


        // Escribe un programa java que invierta el orden de los valores de un array.
        // Por invertir el orden de los valores de un array,
        // me refiero que el último pasa a ser el primero, el penúltimo el segundo y así sucesivamente.
        // PRUEBA CON UN ARRAY DE TAMAÑO 6.

        // Hacemos un array de tamaño 6
        int[] numeros = {1,2,3,4,5,6};

        // Mostrar el array original
        System.out.println("Array original:");
        mostrarArray(numeros);

        // Invertir el array
        invertirArray(numeros);

        // Mostrar el array invertido
        System.out.println("Array invertido:");
        mostrarArray(numeros);
    }

    // invertir los elementos del array
    public static void invertirArray(int[] array) {
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio < fin) {
            int temp = array[inicio];
            array[inicio] = array[fin];
            array[fin] = temp;

            inicio++;
            fin--;
        }
    }

    // mostrar los elementos del array
    public static void mostrarArray(int[] array) {
        for (int i=0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}



