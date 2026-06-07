package rpg.model;

public class Habilidad {

    private int id;
    private String nombre;
    private int dañoBase;
    private int usosMaximos;
    private int idClase;

    // CONSTRUCTOR
    public Habilidad(int id, String nombre, int dañoBase, int usosMaximos, int idClase) {
        this.id = id;
        this.nombre = nombre;
        this.dañoBase = dañoBase;
        this.usosMaximos = usosMaximos;
        this.idClase = idClase;
    }

    // GETTER
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getDañoBase() { return dañoBase; }
    public int getUsosMaximos() { return usosMaximos; }
    public int getIdClase() { return idClase; }

    // SETTER
    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDañoBase(int dañoBase) { this.dañoBase = dañoBase; }
    public void setUsosMaximos(int usosMaximos) { this.usosMaximos = usosMaximos; }
    public void setIdClase(int idClase) { this.idClase = idClase; }
}