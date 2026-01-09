package com.juego.clases;

public class Clase {
    private String nombre;
    private int bonusFuerza;
    private int bonusDestreza;
    private int bonusInteligencia;
    private int vidaMaxima;

    public Clase(String nombre, int bonusFuerza, int bonusDestreza,
                 int bonusInteligencia, int vidaMaxima) {
        this.nombre = nombre;
        this.bonusFuerza = bonusFuerza;
        this.bonusDestreza = bonusDestreza;
        this.bonusInteligencia = bonusInteligencia;
        this.vidaMaxima = vidaMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public int getBonusFuerza() {
        return bonusFuerza;
    }

    public int getBonusDestreza() {
        return bonusDestreza;
    }

    public int getBonusInteligencia() {
        return bonusInteligencia;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }
}
