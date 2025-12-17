//Clase hijo -> Paciente

public class Paciente extends Persona implements Humano{
    private String enfermedad;

    public Paciente(String nombre, String dni, int edad, String sexo, String enfermedad) {
        super(nombre, dni, edad, sexo);

        this.enfermedad = enfermedad;
    }

    //GET

    public String getEnfermedad() {
        return enfermedad;
    }

    //SET

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    @Override
    public void beber() {

    }

    @Override
    public void dormir() {

    }

    @Override
    public void estaEnfermo() {

    }

    @Override
    public void comer() {

    }
}
