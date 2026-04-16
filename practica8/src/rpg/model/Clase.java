package rpg.model;

public class Clase {

    private int id;
    private String nombre;

    // CONSTRUCTOR
    public Clase(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // GETTER
    public int getId() { return id; }
    public String getNombre() { return nombre; }

    // SETTER
    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
