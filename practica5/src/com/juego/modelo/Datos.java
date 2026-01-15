package com.juego.modelo;

//Esta clase es para representar las estadisticas de los personajes
public class Datos {

    //Atributos del personaje
    private int fuerza;
    private int inteligencia;
    private int destreza;
    private int vidaMax;

    //CONSTRUCTOR
    public Datos( int fuerza, int inteligencia, int destreza, int vidaMax) {
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.destreza = destreza;
        this.vidaMax = vidaMax;
    }

    //Aplicar un bonus a las estadisticas
    public void bonus( int fuerza, int inteligencia, int destreza){
        this.fuerza += fuerza;
        this.inteligencia +=  inteligencia;
        this.destreza += destreza;
    }

    //Devuelve la vida maxima del personaje
    public int getVidaMax() {
        return vidaMax;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getDestreza() {
        return destreza;
    }

}
