public class ejercicio1 {
    public static void main (String[] args){

        // Define un array de números tipo double de 3 filas por 7 columnas con nombre doub y asigna los valores según la siguiente tabla.
        // Muestra el contenido de todos los elementos del array dispuestos en forma de tabla como se muestra en la figura.

        // Creamos un array bidimensional de números decimales con el double

       double [][] doub = {
                {0,30,2,0,0,5},
                {75,0,0,0,0,0},
                {0,0,-2,9,0,11},
        };
       //creamos otro array de tipo boolean
        // para indicar las posiciones que estan vacias con un true y rellenas con un false

        boolean[][] vacio = {
                {false,false,false,true,true,false},
                {false,true,true,true,false,false},
                {true,true,false,false,true,false},
        };

        //Imprime el título de la primera columna alineado a la izquierda en un espacio de 10 caracteres
        System.out.printf("%-10s", "Array num");

        // Bucle para imprimir los encabezados de cada columna
        for (int j = 0; j < doub[0].length; j++) {
            System.out.printf("%12s","Columna "+j);
        }
        System.out.println();

        // Línea separadora
        imprimirLinea(doub[0].length);

        //recorremos las filas para mostrar su contenido
        for (int i = 0; i < doub.length; i++) { // recorre filas
            System.out.printf("%-10s","Fila "+i); // Imprime el nombre de la fila (fila0, etc)
            for (int j = 0; j < doub[i].length; j++) { //recorre columnas
                if (vacio[i][j]) {// Si el array vacio dice true, esa casilla no tiene número
                    System.out.printf("%12s", " "); //el esapcio en blanco
                }else {
                    System.out.printf("%12.0f", doub[i][j]); // muestra el numero sin decimales

            }
        }
            System.out.println();
            imprimirLinea(doub[0].length); //otra linea de separacion
        }
    }

    // dibujar una línea horizontal de separacion para la tabla
    static void imprimirLinea(int columnas) {
        System.out.print("-------------");
        for (int i = 0; i < columnas; i++) {// Se repite una parte por cada columna
            System.out.print("+-----------");
        }
        System.out.println("+"); //cierra la linea con el caracter +
    }
}
