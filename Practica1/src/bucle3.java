import java.util.Scanner;

public class bucle3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduce el primer numero:");
        int a = s.nextInt();
        System.out.print("Introduce el segundo numero:");
        int b = s.nextInt();
        System.out.print("Introduce el tercer numero:");
        int c = s.nextInt();
        int menor, medio, mayor;

        if (a <= b && a <= c) {
            menor = a;
            if (b <= c) {
                medio = b;
                mayor = c;
            } else {
                medio = c;
                mayor = b;
            }
        } else if (b <= a && b <= c) {
            menor = b;
            if (a <= c) {
                medio = a;
                mayor = c;
            } else {
                medio = c;
                mayor = a;
            }
        } else {
            menor = c;
            if (a <= b) {
                medio = a;
                mayor = b;
            } else {
                medio = b;
                mayor = a;
            }
        }
        System.out.println("Los numeros ordenados son:" + menor + "," + medio + "," + mayor);
    }

}
