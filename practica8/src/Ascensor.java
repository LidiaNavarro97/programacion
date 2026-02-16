import java.util.HashSet;

public class Ascensor extends Maquinaria{

    private int idAscensor;
    private boolean vip;
    private HashSet<String> acceso;

    public Ascensor(int idAscensor, boolean vip, String funcion) {
        super(funcion);

        this.idAscensor = idAscensor;
        this.vip = vip;
        this.acceso = acceso;
    }

    public void validacionBiometrica(String dniPersona, int ordenLlegada) {

        String registro= "Oren de llegada: " + ordenLlegada + "DNI: " + dniPersona;
        acceso.add(registro);

        System.out.println("Acceso valido para: " + dniPersona);

    }
}
