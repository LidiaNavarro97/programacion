import java.util.Scanner;

public class Act7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce la base del rectangulo:");
        double base = s.nextDouble();

        System.out.println("Introduce la altura del rectangulo:");
        double altura = s.nextDouble();

        double area = base * altura;

        System.out.println("El area del rectangulo es:" + area);

    }
}
