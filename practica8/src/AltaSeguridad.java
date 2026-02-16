import java.util.HashSet;

public class AltaSeguridad extends Espacios{

    //Le añado yo atributos ya que no me ha puesto ninguno

    private String nombre;
    private HashSet<String> acceso;

    public AltaSeguridad(String nombre){
        super(tamanio);

        this.nombre = nombre;
        this.acceso = acceso;
    }

    public void validacionBiometrica(String dniPersona, int ordenLlegada) {

        String registro= "Oren de llegada: " + ordenLlegada + "DNI: " + dniPersona;
        acceso.add(registro);

        System.out.println("Acceso valido para: " + dniPersona);

    }
}
