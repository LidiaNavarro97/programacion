package com.juego.clases;

import com.juego.habilidades.CuraCuerpoACuerpo;
import com.juego.habilidades.DanioADistancia;
import com.juego.habilidades.DanioCuerpoACuerpo;
import com.juego.habilidades.Habilidad;

public class Paladin implements Clase{
    public String getNombre() {
        return "PALADIN";
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
        return 115;
    }

    public Habilidad[] getHabilidades () {
        return new Habilidad[] {
                new DanioADistancia("Juicio sagrado",15),
                new CuraCuerpoACuerpo("Imposicion de manos", 9),
                new DanioCuerpoACuerpo("Espada de la Fe", 20),
        };
    }
}

