package com.juego.habilidades;

public class CuraCuerpoACuerpo implements Habilidad{

    private int usos= 3; // el numero de usos disponibles
    private int valor; //cantidad de vida que cura
    private String nombre;

    public CuraCuerpoACuerpo( String nombre, int valor) {
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

    // indica si esta habilidad aun tiene usos disponibles
    public boolean tieneUsos() {
        return usos>0;
    }
    
}
