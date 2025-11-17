import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce dos numeros para calcular su multiplicacion");
        System.out.print("x=");
        int x = s.nextInt();
        System.out.print("y=");
        int y = s.nextInt();
        int multiplicacion = x * y;

        System.out.println("El resultado de la multiplicacion es" + multiplicacion);
    }
}
