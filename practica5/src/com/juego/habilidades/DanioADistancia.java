package com.juego.habilidades;

public class DanioADistancia implements Habilidad{

    private int usos= 1; // el numero de usos disponibles
    private int valor; //cantidad de vida que cura
    private String nombre;

    public DanioADistancia( String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }
    // devuelve el nombre de la habilidad con sus usos restantes
    public String getNombre() {
        return nombre + "(" +usos+ "usos)";
    }


    // usa la habilidad, decrementa ese uso y devuelve el valor de la curacion
    public int usar() {
        usos--;
        return valor;
    }

    public boolean tieneUsos() {
        return usos>0;
    }
}
