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
                case 1:
                    crearHospital();
                    break;
                case 2:
                    crearArea();
                    break;
                case 3:
                    crearMedico();
                    break;
                case 4:
                    modificarMedico();
                    break;
                case 5:
                    modificarHospital();
                    break;
                case 6:
                    calcularAntiguedad();
                    break;
                case 7:
                    calcularSueldoNeto();
                    break;
                case 8:
                    comprobarEdad();
                    break;
                case 9:
                    proporcionMedicos();
                    break;
                case 10:
                    capacidadArea();
                    break;
                case 11:
                    compararAreas();
                    break;
                case 12:
                    contratosPorAnios();
                    break;
                case 0:
                    System.out.println("Saliendo.");
                    break;
                default:
                    System.out.println("Opcion incorrecta.");

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
        System.out.print("DNI del médico: ");
        String dni = s.nextLine();

        Medico m = buscarMedico(dni);
        if (m == null) {
            System.out.println("No encontrado.");
            return;
        }

        System.out.println("""
            1. Cambiar sueldo bruto
            2. Cambiar área
            """);

        int op = s.nextInt();
        s.nextLine();

        if (op == 1) {
            System.out.print("Nuevo sueldo: ");
            double nuevo = s.nextDouble();
            s.nextLine();
            m.setSueldoBruto(nuevo);
        } else if (op == 2) {
            System.out.println("Seleccione nueva área:");
            for (int i = 0; i < areas.size(); i++) {
                System.out.println(i + ". " + areas.get(i).getNombre());
            }
            int index = s.nextInt();
            s.nextLine();
            m.cambiarArea(areas.get(index));
        }

        System.out.println("Médico modificado.");
    }

    private static void crearMedico() {
        // Validar que haya áreas
        if (areas.isEmpty()) {
            System.out.println("No hay áreas registradas.");
            return;
        }

        // Pedir datos del médico
        System.out.print("Nombre médico: ");
        String nombre = s.nextLine();

        System.out.print("DNI: ");
        String dni = s.nextLine();

        System.out.print("Edad: ");
        int edad = s.nextInt();
        s.nextLine();

        System.out.print("Sexo: ");
        String sexo = s.nextLine();

        System.out.print("Sueldo bruto: ");
        double sueldo = s.nextDouble();
        s.nextLine();

        System.out.print("Fecha inicio (AAAA-MM-DD): ");
        LocalDate fecha = LocalDate.parse(s.nextLine());

        // Mostrar áreas disponibles
        System.out.println("Seleccione área:");
        for (int i = 0; i < areas.size(); i++) {
            System.out.println(i + ". " + areas.get(i).getNombre());
        }

        int index = s.nextInt();
        s.nextLine();

        Areas area = areas.get(index);

        // Crear médico
        Medico m = new Medico(nombre, area, dni, edad, sexo, sueldo, fecha);
        medicos.add(m);

        // Crear contrato automáticamente
        Contrato c = new Contrato(LocalDate.now(), m, area.getHospital());
        contratos.add(c);

        System.out.println("Médico creado correctamente.");
    }

    private static void crearArea() {
        if (hospitales.isEmpty()) { //validar que haya hospitales, y que no este la lista vacia
            System.out.println("No hay hospitales disponibles.");
            return; //salir si no hay hospitales
        }
        //mostrar hospitales disponibles
        System.out.println("Seleccione hospital por índice:");
        for (int i = 0; i < hospitales.size(); i++) {
            System.out.println(i + ". " + hospitales.get(i).getNombre());
        }

        int index = s.nextInt(); //lee el numero entero desde el teclado
        s.nextLine(); //para limpiar despues del scanner

        Hospital h = hospitales.get(index);

        //pedir datos a area
        System.out.print("Nombre área: ");
        String nombre = s.nextLine();

        System.out.print("Identificador: ");
        String id = s.nextLine();

        //Validar que no exista ya un área con ese ID en el hospital
        if (h.existeArea(id)) {
            System.out.println("Ya existe un área con ese ID.");
            return;
        }


        System.out.print("Planta: ");
        int planta = s.nextInt();
        s.nextLine();

        //crear area
        Areas a = new Areas(nombre, id, planta, h);

        //añadirlos a la lista
        areas.add(a);
        h.getAreas().add(a);

        System.out.println("Área creada correctamente.");
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