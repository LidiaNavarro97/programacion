public class ejercicio1 {
    public static void main (String[] args){

        // Define un array de números tipo double de 3 filas por 7 columnas con nombre doub y asigna los valores según la siguiente tabla.
        // Muestra el contenido de todos los elementos del array dispuestos en forma de tabla como se muestra en la figura.

        double [][] doub = {
                {0,30,2,0,0,5},
                {75,0,0,0,0,0},
                {0,0,-2,9,0,11},
        };
        // para indicar las posiciones que estan vacias con un true y rellenas con un false

        boolean[][] vacio = {
                {false,false,false,true,true,false},
                {false,true,true,true,false,false},
                {true,true,false,false,true,false},
        };

        //para alinear las columnas bien
        System.out.printf("%-10s", "Array num");

        //recorrer las columnas para para imprimir sus nombres
        for (int j = 0; j < doub[0].length; j++) {
            System.out.printf("%12s","Columna"+j);
        }
        System.out.println();

        // Línea separadora
        imprimirLinea(doub[0].length);

        //recorremos las filas para imprimir sus numeros
        for (int i = 0; i < doub.length; i++) {
            System.out.printf("%-10s","Fila"+i);
            for (int j = 0; j < doub[i].length; j++) {
                if (vacio[i][j]) {
                    System.out.printf("%12s", " "); //el esapcio en blanco
                }else {
                    System.out.printf("%12.0f", doub[i][j]); // muestra el numero

            }
        }
            System.out.println();
            imprimirLinea(doub[0].length);
        }
    }

    // dibujar una línea horizontal
    static void imprimirLinea(int columnas) {
        System.out.print("-------------");
        for (int i = 0; i < columnas; i++) {
            System.out.print("+-----------");
        }
        System.out.println("+");
    }
}
