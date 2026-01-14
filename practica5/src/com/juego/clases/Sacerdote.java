package com.juego.clases;

import com.juego.habilidades.CuraCuerpoACuerpo;
import com.juego.habilidades.DanioADistancia;
import com.juego.habilidades.DanioCuerpoACuerpo;
import com.juego.habilidades.Habilidad;

public class Sacerdote implements Clase {
    public String getNombre() {
        return "SACERDOTE";
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
        return 95;
    }

    public Habilidad[] getHabilidades () {
        return new Habilidad[] {
                new DanioADistancia("Luz purificada",10),
                new CuraCuerpoACuerpo("Sanacion milagrosa", 40),
                new DanioCuerpoACuerpo("Castigo divino", 12),
        };
    }
}

