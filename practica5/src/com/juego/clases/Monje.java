package com.juego.clases;

import com.juego.habilidades.CuraCuerpoACuerpo;
import com.juego.habilidades.DanioADistancia;
import com.juego.habilidades.DanioCuerpoACuerpo;
import com.juego.habilidades.Habilidad;

public class Monje implements Clase{

    public String getNombre() {
        return "MONJE";
    }
    public int fuerza() {
        return 2;
    }
    public int inteligencia() {
        return 0;
    }
    public int destreza() {
        return 1;
    }
    public int vida() {
        return 110;
    }

    public Habilidad[] getHabilidades () {
        return new Habilidad[] {
                new DanioADistancia("Onda de chi", 5),
                new CuraCuerpoACuerpo("Armonia interior", 22),
                new DanioCuerpoACuerpo("Puño del dragon", 17),
        };
    }
}

