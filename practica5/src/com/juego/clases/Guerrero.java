package com.juego.clases;

import com.juego.habilidades.CuraCuerpoACuerpo;
import com.juego.habilidades.DanioADistancia;
import com.juego.habilidades.DanioCuerpoACuerpo;
import com.juego.habilidades.Habilidad;

public class Guerrero implements Clase{
    public String getNombre() {
        return "GUERRERO";
    }
    public int fuerza() {
        return 3;
    }
    public int inteligencia() {
        return 0;
    }
    public int destreza() {
        return 0;
    }
    public int vida() {
        return 120;
    }

    public Habilidad[] getHabilidades () {
        return new Habilidad[] {
                new DanioADistancia("Lanzamiento de hacha", 12),
                new CuraCuerpoACuerpo("Segundo aliento",8),
                new DanioCuerpoACuerpo("Golpe devastador", 23),
        };
    }
}

