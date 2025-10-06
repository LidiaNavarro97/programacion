public class ejercicio4 {
    public static void main(String[] args) {
        //Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100.
        // Obtén la suma de todos ellos y la media.

        int [] numeros =  new int[100];
        int suma = 0;

        //Rellenar del 1 al 100:

        for (int i=0; i < numeros.length; i++) {
            numeros[i] = i + 1;
            suma += numeros[i];
        }

        //Calcular la media

        double media = (double) suma / numeros.length;

        System.out.println(" Suma: " + suma);
        System.out.println(" Media: " + media);
    }
    }
