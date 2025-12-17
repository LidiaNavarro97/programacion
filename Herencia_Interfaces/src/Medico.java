//Clase hijo -> Medico

public class Medico extends Persona implements Humano{
    private String especialidad;


    public Medico(String nombre, String dni, int edad, String sexo, String especialidad) {
        super(nombre, dni, edad, sexo);

        this.especialidad = especialidad;
    }

    //GET

    public String getEspecialidad() {
        return especialidad;
    }

    //SET

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
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
