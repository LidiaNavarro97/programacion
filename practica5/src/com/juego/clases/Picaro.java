package com.juego.clases;

import com.juego.habilidades.CuraCuerpoACuerpo;
import com.juego.habilidades.DanioADistancia;
import com.juego.habilidades.DanioCuerpoACuerpo;
import com.juego.habilidades.Habilidad;

public class Picaro implements Clase {
    public String getNombre() {
        return "PICARO";
    }
    public int fuerza() {
        return 0;
    }
    public int inteligencia() {
        return 0;
    }
    public int destreza() {
        return 3;
    }
    public int vida() {
        return 105;
    }

    public Habilidad[] getHabilidades () {
        return new Habilidad[] {
                new DanioADistancia("Daga envenenada", 18),
                new CuraCuerpoACuerpo("Venda improvisada", 10),
                new DanioCuerpoACuerpo("Puñalada sombria", 20),
        };
    }
}
