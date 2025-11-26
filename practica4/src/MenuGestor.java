import java.util.ArrayList;
import java.util.Scanner;

public class MenuGestor {
    static ArrayList<Hospital> hospitales = new ArrayList<>();
    static ArrayList<Areas> areas = new ArrayList<>();
    static ArrayList<Direccion> direcciones = new ArrayList<>();
    static ArrayList<Medico> medicos = new ArrayList<>();
    static ArrayList<Contrato> contratos = new ArrayList<>();

    public MenuGestor(ArrayList<Hospital> hospitales, ArrayList<Areas> areas,
                      ArrayList<Direccion> direcciones, ArrayList<Medico> medicos, ArrayList<Contrato> contratos) {

    this.hospitales = hospitales;
    this.areas = areas;
    this.direcciones = direcciones;
    this.medicos = medicos;
    this.contratos = contratos;

    }


private static Scanner s= new Scanner(System.in);

private static void ejecutarMenuPrincipal() {

    int option;

    do {
        System.out.println("1.Crear Hospital: ");
        System.out.println("2.Crear Area: ");
        System.out.println("3.Crear Medico: ");
        System.out.println("4.Modificar Medico: ");
        System.out.println("5.Modificar Hospital: ");
        System.out.println("6.Calcular Antiguedad: ");
        System.out.println("7.Calcular sueldo neto: ");
        System.out.println("8.Comprobar edad: ");
        System.out.println("9.Proporcion de médicos: ");
        System.out.println("10.Capacidad de area: ");
        System.out.println("11. Comparar areas ");
        System.out.println("12. Contratos por año: ");

        System.out.println("Opcion: ");
        option = s.nextInt();
        s.nextLine(); //para limpiar

        switch (option) {
            case 1 : crearHospital(); break;
            case 2 : crearArea(); break;
            case 3 : crearMedico(); break;
            case 4 : modificarMedico(); break;
            case 5 : modificarHospital(); break;
            case 6 : calcularAntiguedad(); break;
            case 7 : calcularSueldoNeto(); break;
            case 8 : comprobarEdad(); break;
            case 9 : proporcionMedicos(); break;
            case 10 : capacidadArea(); break;
            case 11 : compararAreas(); break;
            case 12 : contratosPorAnios(); break;
            case 0: System.out.println("Saliendo."); break;
            default:System.out.println("Opcion incorrecta.");

        }
    } while (option != 0);

}

    private static void contratosPorAnios() {
    }

    private static void compararAreas() {
    }

    private static void capacidadArea() {
    }

    private static void proporcionMedicos() {
    }

    private static void comprobarEdad() {
    }

    private static void calcularSueldoNeto() {
    }

    private static void calcularAntiguedad() {
    }

    private static void modificarHospital() {
    }

    private static void modificarMedico() {
    }

    private static void crearMedico() {
    }

    private static void crearArea() {
    }

    private static void crearHospital() {
    }