import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //PRECARGA DE DATOS

        ArrayList<Hospital> hospitales = new ArrayList<>();
        ArrayList<Areas> areas = new ArrayList<>();
        ArrayList<Direccion> direcciones = new ArrayList<>();
        ArrayList<Medico> medicos = new ArrayList<>();
        ArrayList<Contrato> contratos = new ArrayList<>();

        //1.HOSPITALES
        Hospital h1 = new Hospital("Hospital Central", "H001", "Calle Angustias");
        Hospital h2 = new Hospital("Hospital del Sur", "H002", "Calle Milagros");


        //2.AREAS
        Areas a1 = new Areas("Cardiologia","CAR1", 2, h1);
        Areas a2 = new Areas("Pediatria","CAR2", 1, h1);
        Areas a3 = new Areas("Urgencias","CAR3", 0, h2);

        h1.agregarArea(a1);
        h1.agregarArea(a2);
        h2.agregarArea(a3);

        //3.MEDICOS
        Medico m1 = new Medico("Joselito",a1,"32901234R", 28, "Hombre", 2500,20-11-2020);
        Medico m2 = new Medico("Lidia", a2, 32098743L, 30, "Mujer", 3400, 15-10-2022);

        a2.aumentarMedicos();
        a1.aumentarMedicos();

        System.out.println(a1.getNumMedicos());

        Areas a = h1.getAreas().get(0);
        System.out.println(a.getNombre());


    }
}