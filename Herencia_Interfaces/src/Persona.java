//Clase PADRE -> Persona

public class Persona implements Humano {

    private String nombre;
    private String dni;
    private int edad;
    private String sexo;

    //Constructor de la SuperClase/Padre

    public Persona(String nombre, String dni, int edad, String sexo) {

        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.sexo = sexo;
    }

    //GET

    public String getNombre() {
        return nombre;
    }
    public String getDni() {
        return dni;
    }
    public int getEdad() {
        return edad;
    }
    public String getSexo() {
        return sexo;
    }

    //SET


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //METODOS

    public void atender() {


    }


    @Override
    public void comer() {

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
}
