import java.util.Scanner;

public class Act5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la cantidad en pesetas");

        double pesetas=  s.nextDouble();

        double tasaCambio= 166.386;

        double euros= (double) pesetas / (double)tasaCambio;

        System.out.println( pesetas + "En pesetas equivale a" + euros + "euros");

    }
}

