public class ejercicio2 {

    // Muestra por pantalla todos los elementos de un array de números enteros separados por un espacio.
}
    public static void main (String[] args){
    int[] numeros = {1,2,3,4,5};

    System.out.println("Elementos del array: ");

    //separados por un espacio
    for(int i = 0; i < numeros.length; i++) {
        System.out.print(numeros[i]+" ");
    }

    System.out.println();
}
