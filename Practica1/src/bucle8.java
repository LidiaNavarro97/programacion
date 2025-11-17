import java.util.Scanner;

public class bucle8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Dime 10 numeros enteros:");

        String result = "";

        for(int i=0; i<10; i++){
             result = s.nextLine() + result;
        }
        System.out.println(result);
    }
}
