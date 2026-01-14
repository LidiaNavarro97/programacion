package com.juego.habilidades;

public class CuraCuerpoACuerpo implements Habilidad{

    private int usos= 3;
    private int valor;
    private String nombre;

    public CuraCuerpoACuerpo( String nombre, int valor) {
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
