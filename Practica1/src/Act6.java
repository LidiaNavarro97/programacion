import java.util.Scanner;

public class Act6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce dos numeros para calcular su suma, resta, division y multiplicacion");
        System.out.print("x=");
        int x = s.nextInt();
        System.out.print("y=");
        int y = s.nextInt();
        int suma= x + y;
        int resta= x - y;
        double division =(double)x / (double)y;
        int multiplicacion = x * y;


        System.out.println("El resultado de la suma es" + suma);
        System.out.println("El resultado de la resta es" + resta);
        System.out.println("El resultado de la division es" + division);
        System.out.println("El resultado de la multiplicacion es" + multiplicacion);
    }
}
