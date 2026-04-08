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
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getBonificadorVida() { return bonificadorVida; }
    public int getBonificadorFuerza() { return bonificadorFuerza; }
}
