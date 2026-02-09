public class main {
    public static void main (String[] args) {

        //CREO DOS MEDICOS
        Medico m1 = new Medico("Lidia", "32215487R", 28, "Mujer", "Endocrino");
        Medico m2 = new Medico("Diego", "32215454P", 40, "Hombre", "Medico de Familia");

        //CREO DOS ENFERMEROS
        Enfermero e1 = new Enfermero("Isabel", "58547152L", 54, "Mujer", "Salud Mental");
        Enfermero e2 = new Enfermero("Adrian", "58547157M", 30, "Hombre", "Centro de salud");

        //CREO DOS PACIENTES
        Paciente p1 = new Paciente("Daniel", "65872432K",13,"Hombre","Rotura de tobillo");
        Paciente p2 = new Paciente("Mari", "65872432G",23,"Mujer","Esguince");
    }


}
