public class Calculadora1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        int suma = num1 - num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);

        if (num2 != 0) {
            int division = num1 / num2;
            System.out.println("La división es: " + division);
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

    }
}

