package com.juego.habilidades;

public interface Habilidad {
    String getNombre();     // Nombre de la habilidad
    int usar();             // Devuelve el valor del efecto
    boolean tieneUsos();    // Indica si se puede seguir usando

    int getUsosRestantes();

}

