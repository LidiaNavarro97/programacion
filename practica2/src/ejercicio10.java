import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {

        //Crea un programa que muestre por pantalla la nota de un estudiante, de entre una lista de estudiantes con sus respectivas notas.
        // El nombre del estudiante lo introduce el usuario por teclado (usa la clase Scanner).
        // Utiliza un array para los nombres de los alumnos y otro para las notas.
        // ¿Serías capaz de hacerlo con un array Bidimensional?

        Scanner scanner = new Scanner(System.in);

        // Array bidimensional: el nombre y la nota
        String[][] alumnos = {
                {"Ana", "8.5"},
                {"Luis", "6.0"},
                {"María", "9.3"},
                {"Pedro", "7.2"},
                {"Lucía", "5.8"}
        };

        System.out.print("Introduce el nombre del estudiante: ");
        String nombrebuscado = scanner.nextLine();

        boolean encontrado = false;

        // Recorremos el array buscando el nombre

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i][0].equalsIgnoreCase(nombrebuscado)) {
                System.out.println("La nota de " + alumnos[i][0] + " es: " + alumnos[i][1]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Estudiante no encontrado.");
        }

    }
}
