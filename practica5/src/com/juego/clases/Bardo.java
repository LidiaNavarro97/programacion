package com.juego.clases;

import com.juego.habilidades.CuraCuerpoACuerpo;
import com.juego.habilidades.DanioADistancia;
import com.juego.habilidades.DanioCuerpoACuerpo;
import com.juego.habilidades.Habilidad;

public class Bardo implements Clase{

    public String getNombre() {
        return "BARDO";
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
        return 90;
    }

    public Habilidad[] getHabilidades () {
        return new Habilidad[] {
                new DanioADistancia("Nota discordante", 12),
                new CuraCuerpoACuerpo("Balada recorfontante", 15),
                new DanioCuerpoACuerpo("Ritmo cortante",22),
        };
    }
}

