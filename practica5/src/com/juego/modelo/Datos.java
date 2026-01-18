package com.juego.modelo;

//Esta clase es para representar las estadisticas de los personajes

// Clase que representa las estadísticas base de un personaje
public class Datos {

    // Atributos del personaje: fuerza, inteligencia, destreza y vida máxima
    private int fuerza, inteligencia, destreza, vidaMax;

    // Constructor: inicializa las estadísticas base
    public Datos(int fuerza, int inteligencia, int destreza, int vidaMax){
        this.fuerza = fuerza;       // fuerza base
        this.inteligencia = inteligencia;       // inteligencia base
        this.destreza = destreza;       // destreza base
        vidaMax = vidaMax;      // vida máxima base
    }

    // Aplica un bonus a las estadísticas (por ejemplo, de la clase del personaje)
    public void bonus(int f, int i, int d){
        this.fuerza += f;      // suma bonus a la fuerza
        this.inteligencia += i;      // suma bonus a la inteligencia
        this.destreza += d;      // suma bonus a la destreza
    }

    // Devuelve la vida máxima del personaje
    public int getVidaMax(){
        return vidaMax;
    }
}
