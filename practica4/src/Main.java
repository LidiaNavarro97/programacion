import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //LISTAS

    static ArrayList<Hospital> hospitales = new ArrayList<>();
    static ArrayList<Areas> areas = new ArrayList<>();
    static ArrayList<Direccion> direcciones = new ArrayList<>();
    static ArrayList<Medico> medicos = new ArrayList<>();
    static ArrayList<Contrato> contratos = new ArrayList<>();


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        cargarDatosIniciales();
        MenuGestor.ejecutarMenuPrincipal();
    }

    //CARGA DE DATOS
    public static void cargarDatosIniciales() {


        Equipamiento eq1 = new Equipamiento("Equipamiento1", "C1", 2005);
        Equipamiento eq2 = new Equipamiento("Equipamiento2", "C2", 2018);



        Paciente p1 = new Paciente("32901245R", "Lidia", "Mujer");
        Paciente p2 = new Paciente("32901248L", "Jose", "Hombre");

        //1.HOSPITALES
        //Creo dos hospitales
        Hospital h1 = new Hospital("Hospital Central", "H001", "Calle Angustias");
        Hospital h2 = new Hospital("Hospital del Sur", "H002", "Calle Milagros");

        //añado los hospitales a la lista de hospitales
        hospitales.add(h1);
        hospitales.add(h2);


        //2.AREAS
        //Creo tres areas distintas, cada una asociada a un hospital
        Areas a1 = new Areas("Cardiologia", "CAR1", 2, h1);
        Areas a2 = new Areas("Pediatria", "CAR2", 1, h1);
        Areas a3 = new Areas("Urgencias", "CAR3", 0, h2);

        //Llamo al metodo de agregarArea para añadirla
        //cada una dentro de la lista interna del hospital correspondiente
        h1.agregarArea(a1);
        h1.agregarArea(a2);
        h2.agregarArea(a3);
        //También guardo las áreas en la lista general areas
        areas.add(a1);
        areas.add(a2);
        areas.add(a3);


        //3.MEDICOS
        //Creo dos medicos
        Medico m1 = new Medico("Joselito", a1, "32901234R", 28, "Hombre", 2500, 2020-11-20);
        Medico m2 = new Medico("Lidia", a2, "32098743L", 30, "Mujer", 3400, 2022-10-15);

        medicos.add(m1);
        medicos.add(m2);

        //4.CONTRATO
        //Creo dos contratos, cada uno asociado a un medico y a un hospital
        Contrato c1 = new Contrato(2020-11-20, m1, h1);
        Contrato c2 = new Contrato(2022-10-15, m2, h2);
        //Guardo los contratos en la lista general de contratos
        contratos.add(c1);
        contratos.add(c2);

        //5.DIRECCION
        //Creo dos direcciones
        Direccion dir1 = new Direccion("Calle Segovia", 25, 28502, "Jerez de la frontera", "Cádiz");
        Direccion dir2 = new Direccion("Calle Mandarina", 12, 28503, "Jerez de la frontera", "Cádiz");
        //Las añado a la lista general de direcciones
        direcciones.add(dir1);
        direcciones.add(dir2);

    }



    }



