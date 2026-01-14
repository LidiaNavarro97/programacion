package com.juego.clases;

import com.juego.habilidades.CuraCuerpoACuerpo;
import com.juego.habilidades.DanioADistancia;
import com.juego.habilidades.DanioCuerpoACuerpo;
import com.juego.habilidades.Habilidad;

public class Mago implements Clase {

    public String getNombre() {
        return "MAGO";
    }
    public int fuerza() {
        return 0;
    }
    public int inteligencia() {
        return 3;
    }
    public int destreza() {
        return 0;
    }
    public int vida() {
        return 110;
    }

    public Habilidad[] getHabilidades () {
        return new Habilidad[] {
                new DanioADistancia("Bola de fuego", 25),
                new CuraCuerpoACuerpo("Restauracion mistica", 9),
                new DanioCuerpoACuerpo("Descarga arcana", 10),
        };
    }
}

