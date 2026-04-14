package rpg.model;

public class Personaje {
    private int id;
    private String nombre;
    private int nivel;
    private int oro;
    private int vidaActual;
    private int idRaza;
    private int idClase;
    private int idCiudadActual;

    // Constructor
    public Personaje(int id, String nombre, int nivel, int oro, int vidaActual, int idRaza, int idClase, int idCiudadActual) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.oro = oro;
        this.vidaActual = vidaActual;
        this.idRaza = idRaza;
        this.idClase = idClase;
        this.idCiudadActual = idCiudadActual;
    }

    // Get
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNivel() {
        return nivel;
    }
    public int getOro() {
        return oro;
    }
    public int getVidaActual() {
        return vidaActual;
    }
    public int getIdRaza() {
        return idRaza;
    }
    public int getIdClase() {
        return idClase;
    }
    public int getIdCiudadActual() {
        return idCiudadActual;
    }

    // Set

    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public void setOro(int oro) {
        this.oro = oro;
    }
    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }
    public void setIdRaza(int idRaza) {
        this.idRaza = idRaza;
    }
    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }
    public void setIdCiudadActual(int idCiudadActual) {
        this.idCiudadActual = idCiudadActual;
    }

}