public class ejercicio5 {
    public static void main (String[] args){

        // Crear un programa que cuando se le introduzca números enteros rellene un array de 6 filas por 10 columnas con números enteros positivos
        // comprendidos entre 0 y 1000 (ambos incluidos).
        // A continuación, el programa deberá:
        //    • dar la posición del número máximo y mínimo
        //    • la suma total de todas las filas y columnas
        //    • la suma de todas las columnas
        //    • la suma de todas las filas.

        //defino primero las variables

        int [][] numeros = new int[6][10];
        int max = 0;
        int min = 0;
        int posfilamin = 0;
        int posfilamax = 0;
        int poscolumnamin = 0;
        int poscolumnamax = 0;
        int numactual;
        int stotal = 0;
        int sumafila;
        int sumacolumna;

        //ahora voy a generar los elementos y meterlos en la matriz para hacer a la vez las sumas
        for (int i = 0; i < numeros.length; i++) {
            //ahora metemos la variale suma para que cuente de nuevo la suma
            sumafila = 0;
            // ahora con este bucle recorremos la fila, metemos otro for dentro
            for (int j = 0; j < numeros[i].length ; j++) {
                //generamos el numero aleatorio que se va a meter en el array
                numactual= (int)(Math.random()*1001);
                //añadimos la suma total de los numeros
                stotal+=numactual;
                //añadimos al array
                numeros[i][j] = numactual;
                //y lo añadimos a la suma de la fila
                sumafila+= numactual;

                //ahora vamos a hacer unos if para comparar cual es el maximo y le minimo del array
                //con este ponemos que en la primera iteraccion del bucle ponga el numero actual como verdadero y como falso
                if (i== 0 && j==0) {
                    max= numactual;
                    min= numactual;
                }
                //ahora aqui si el numero que es el actual es mayor que el que ya era maximo, el numero maximo es el numero actual
                if (numactual>max){
                    max= numactual;
                    posfilamax= i;
                    poscolumnamax= j;
                }
                //lo mismo que arriba pero con el minimo
                if (numactual<min){
                    min=numactual;
                    posfilamin= i;
                    poscolumnamin= j;
                }
                //vamos imprimiendo la suma de las filas
                System.out.printf("La suma de la fila %d es %d" , i+1, sumafila);
                System.out.print("%n");
            }
            //ahora hacemos un for que recorra las columnas en vez de las filas
            for (int j = 0; j < numeros[0].length; j++) {
                sumacolumna=0;
                //con este for dentro recorremos las columnas sumando los valores de cada vez
                for (int i = 0; i < numeros.length; i++) {
                    sumacolumna+= numeros[i][j];
                }
            //

            }

        }

    }
}
