package rpg.model;

public class Ciudad {

    private int id;
    private String nombre;
    private int nivelMinimoAcceso;

    // CONSTRUCTOR
    public Ciudad(int id, String nombre, int nivelMinimoAcceso) {
        this.id = id;
        this.nombre = nombre;
        this.nivelMinimoAcceso = nivelMinimoAcceso;
    }

    // GETTER
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getNivelMinimoAcceso() { return nivelMinimoAcceso; }

    // SETTER
    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setNivelMinimoAcceso(int nivelMinimoAcceso) { this.nivelMinimoAcceso = nivelMinimoAcceso; }
}
