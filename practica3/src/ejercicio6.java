import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ejercicio6 {
    public static void main (String[] args){

        //Modifica el programa anterior de tal forma que no se repita ningún número en el array
        //además de que tiene que estar comprendido en un rango entre 20-40.

        // primero declaro las variables de filas y columnas y su matriz
        int filas = 4;
        int columnas = 5;
        int[][] numeros = new int[filas][columnas];


        //una lista con numeros del 20 al 40
        ArrayList<Integer> lista= new ArrayList<>();
        for (int i = 20; i <=40 ; i++) {
            lista.add(i);
        }

        //mezclar los numeros  de la lista manualmente
        Random random = new Random();
        for (int i = 0; i < lista.size(); i++) {
           int posAleatorio= random.nextInt(lista.size());

           int aux = lista.get(i);
           lista.set(i, lista.get(posAleatorio));
           lista.set(posAleatorio, aux);

        }

        //las variables para el maximo y el minimo
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxFila = 0, maxCol = 0, minFila = 0, minCol = 0;

        //rellenar la matriz sin repetir
        int index = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                numeros[i][j] = lista.get(index);
                index++;

            //buscar maximo y minimo
            if (numeros[i][j] > max) {
                max = numeros[i][j];
                maxFila = i;
                maxCol = j;
            }
            if (numeros[i][j] < min) {
                min = numeros[i][j];
                minFila = i;
                minCol = j;
            }
            }
        }



    }

