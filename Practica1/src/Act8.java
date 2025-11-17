import java.util.Scanner;

public class Act8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce un dia de la semana: ");
        String dia = s.nextLine();

        if (dia.equals("Lunes")) {
            System.out.println("Primera hora: Digitalizacion ");
        }
        else if (dia.equals("Martes")) {
            System.out.println("Primera hora: Sistemas Informaticos ");
        }
        else if (dia.equals("Miercoles")) {
            System.out.println("Primera hora: Sistemas Informaticos ");
        }
        else if (dia.equals("Jueves")) {
            System.out.println("Primera hora: Entorno ");
        }
        else if (dia.equals("Viernes")) {
            System.out.println("Primera hora: Programacion ");
        }

        }

    }

