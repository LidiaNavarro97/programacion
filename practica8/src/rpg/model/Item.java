package rpg.model;

public class Item {

    private int id;
    private String nombre;
    private String tipo;
    private int precioOro;
    private int bonificadorAtaque;
    private int bonificadorDefensa;

    public Item(int id, String nombre, String tipo, int precioOro, int bonificadorAtaque, int bonificadorDefensa) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioOro = precioOro;
        this.bonificadorAtaque = bonificadorAtaque;
        this.bonificadorDefensa = bonificadorDefensa;
    }

    //GET
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public int getPrecioOro() {
        return precioOro;
    }
    public int getBonificadorAtaque() {
        return bonificadorAtaque;
    }
    public int getBonificadorDefensa() {
        return bonificadorDefensa;
    }

    //SET
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setPrecioOro(int precioOro) {
        this.precioOro = precioOro;
    }
    public void setBonificadorAtaque(int bonificadorAtaque) {
        this.bonificadorAtaque = bonificadorAtaque;
    }
    public void setBonificadorDefensa(int bonificadorDefensa) {
        this.bonificadorDefensa = bonificadorDefensa;
    }

}

