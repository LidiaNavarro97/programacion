import java.time.LocalDate;
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


    private static Scanner s = new Scanner(System.in);

    static void ejecutarMenuPrincipal() {

    }

    private static void crearMedico() {
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


    private static void crearMedico() {

        }

    private static void crearArea() {

        }


    private static void crearHospital() {
        System.out.print("Nombre hospital: ");
        String nombre = s.nextLine();
        System.out.print("CIF: ");
        String cif = s.nextLine();
        System.out.print("Calle: ");
        String calle = s.nextLine();
        System.out.print("Número: ");
        int num = s.nextInt();
        System.out.print("Código postal: ");
        int cp = s.nextInt();
        System.out.print("Localidad: ");
        String loc = s.nextLine();
        System.out.print("Provincia: ");
        String prov = s.nextLine();

        Direccion d = new Direccion(calle, num, cp, loc, prov);
        Hospital h = new Hospital(nombre, cif, d);
        Main.hospitales.add(h);

        System.out.println("Hospital creado: " + h);
    }

}