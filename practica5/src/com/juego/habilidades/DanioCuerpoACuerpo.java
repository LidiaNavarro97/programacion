package com.juego.habilidades;

public class DanioCuerpoACuerpo implements Habilidad{

    private int usos= 5; // el numero de usos disponibles
    private int valor; //cantidad de vida que cura
    private String nombre;

    public DanioCuerpoACuerpo( String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre + "(" +usos+ "usos)";
    }

    public int usar() {
        usos--;
        return valor;
    }

    public boolean tieneUsos() {
        return usos>0;
    }
}
