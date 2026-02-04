package com.juego.clases;

import com.juego.habilidades.Habilidad;

public interface Clase {
    String getNombre();
    int fuerza();
    int inteligencia();
    int destreza();
    int vida();

    Habilidad[] getHabilidades();
}

