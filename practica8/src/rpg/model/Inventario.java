package rpg.model;

public class Inventario {

    private int idPersonaje;
    private int idItem;
    private int cantidad;

    // CONSTRUCTOR
    public Inventario(int idPersonaje, int idItem, int cantidad) {
        this.idPersonaje = idPersonaje;
        this.idItem = idItem;
        this.cantidad = cantidad;
    }

    // GETTER
    public int getIdPersonaje() { return idPersonaje; }
    public int getIdItem() { return idItem; }
    public int getCantidad() { return cantidad; }

    // SETTER
    public void setIdPersonaje(int idPersonaje) { this.idPersonaje = idPersonaje; }
    public void setIdItem(int idItem) { this.idItem = idItem; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
}