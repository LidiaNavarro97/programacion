package rpg.model;

public class Raza {

    private int id;
    private String nombre;
    private int bonificadorVida;
    private int bonificadorFuerza;

    // CONSTRUCTOR
    public Raza(int id, String nombre, int bonificadorVida, int bonificadorFuerza) {
        this.id = id;
        this.nombre = nombre;
        this.bonificadorVida = bonificadorVida;
        this.bonificadorFuerza = bonificadorFuerza;
    }

    // GETTER
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public int getBonificadorVida() {
        return bonificadorVida;
    }
    public int getBonificadorFuerza() {
        return bonificadorFuerza;
    }

    // SETTER
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setBonificadorVida(int bonificadorVida) {
        this.bonificadorVida = bonificadorVida;
    }
    public void setBonificadorFuerza(int bonificadorFuerza) {
        this.bonificadorFuerza = bonificadorFuerza;
    }

}
