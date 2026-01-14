package com.juego.clases;

import com.juego.habilidades.CuraCuerpoACuerpo;
import com.juego.habilidades.DanioADistancia;
import com.juego.habilidades.DanioCuerpoACuerpo;
import com.juego.habilidades.Habilidad;

public class Druida implements Clase{
    public String getNombre() {
        return "DRUIDA";
    }
    public int fuerza() {
        return 2;
    }
    public int inteligencia() {
        return 1;
    }
    public int destreza() {
        return 0;
    }
    public int vida() {
        return 100;
    }

    public Habilidad[] getHabilidades () {
        return new Habilidad[] {
                new DanioADistancia("Espinas afiladas", 15),
                new CuraCuerpoACuerpo("Toque de la anturaleza", 10),
                new DanioCuerpoACuerpo("Garras salvajes", 18),
        };
    }
}

