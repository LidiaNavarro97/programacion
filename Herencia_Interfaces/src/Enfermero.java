//Clase hijo -> Enfermero

public class Enfermero extends Persona implements Humano{
    private String area;

    public Enfermero(String nombre, String dni, int edad, String sexo, String area) {
        super(nombre, dni, edad, sexo);

        this.area = area;
    }

    //GET

    public String getArea() {
        return area;
    }

    //SET

    public void setArea(String area) {
        this.area = area;
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
