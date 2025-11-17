import java.util.Scanner;

public class bucle7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Muestra la tabla de multiplicar del siguiente numero:");
        int numero = s.nextInt();
                System.out.println("Tabla de multiplicar del " + numero +":");
        for (int i=1 ; i<= 10 ; i++) {
            System.out.println(numero + "x" + i + "=" + (numero * i));
        }
    }
}
