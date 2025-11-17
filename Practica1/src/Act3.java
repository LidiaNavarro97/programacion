import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la cantidad en euros");

        double euros=  s.nextDouble();

        double tasaCambio= 166.386;

        double pesetas= euros * tasaCambio;

        System.out.println( euros + "En euros equivale a" + pesetas + "pesetas");

    }
}
