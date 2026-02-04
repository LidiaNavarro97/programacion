package com.juego.clases;
import com.juego.habilidades.CuraCuerpoACuerpo;
import com.juego.habilidades.DanioADistancia;
import com.juego.habilidades.DanioCuerpoACuerpo;
import com.juego.habilidades.Habilidad;

public class Druida implements Clase{

    //nombres de las habilidades
    private String nombre_ataque;
    private String nombre_cura;
    private String nombre_distancia;

    //valores de las habilidades
    private int valor_ataque;
    private int valor_cura;
    private int valor_distancia;

    public Druida( String nombre_ataque, String nombre_cura, String nombre_distancia, int valor_ataque, int valor_cura, int valor_distancia) {
        this.nombre_ataque = nombre_ataque;
        this.nombre_cura = nombre_cura;
        this.nombre_distancia = nombre_distancia;
        this.valor_cura = valor_cura;
        this.valor_ataque = valor_ataque;
        this.valor_distancia = valor_distancia;
    };

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
                new DanioADistancia(nombre_distancia, valor_distancia),
                new CuraCuerpoACuerpo(nombre_cura, valor_cura),
                new DanioCuerpoACuerpo(nombre_ataque,valor_ataque),
        };
    }
}

