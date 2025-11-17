import java.util.Scanner;

public class bucle1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Introduce la hora de 00 a 23:");
            int hora = s.nextInt();

            if (hora >= 6 && hora <= 12) {
                System.out.println("Buenos dias");
            } else if (hora >= 13 && hora <= 20) {
                System.out.println("Buenas tardes");
            } else if ((hora >= 21 && hora <= 23) || (hora >= 0 && hora <= 5)) {
                System.out.println("Buenas noches");
            } else {
                System.out.println("Hora invalida");
            }
            break;
        }
    }
}