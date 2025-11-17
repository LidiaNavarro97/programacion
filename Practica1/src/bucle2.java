import java.util.Scanner;

public class bucle2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce un numero de dia de la semana:");
        int dia = s.nextInt();

        String nombreDelDia ="";

        switch (dia) {
            case 1 -> nombreDelDia = "Lunes";
            case 2 -> nombreDelDia = "Martes";
            case 3 -> nombreDelDia = "Miercoles";
            case 4 -> nombreDelDia = "Jueves";
            case 5 -> nombreDelDia = "Viernes";
            case 6 -> nombreDelDia = "Sabado";
            case 7 -> nombreDelDia = "Domingo";
        }
        System.out.println("Dia de la semana" + dia + ":" + nombreDelDia);
    }
}
