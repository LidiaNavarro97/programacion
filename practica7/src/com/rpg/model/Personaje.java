package com.rpg.model;

import java.util.ArrayList;
import java.util.List;

public class Personaje {

    private String nombre;
    private String raza;
    private int nivel;
    private int peso;
    private int fuerza;
    private List<Item> equipo;

    public Personaje(String nombre, String raza, int nivel, int peso, int fuerza){

        this.nombre = nombre;
        this.raza = raza;
        this.nivel = nivel;
        this.peso = peso;
        this.fuerza = fuerza;
        this.equipo = new ArrayList<>();
    }

    //GET

    public String getNombre(){
        return nombre;
    }
    public String getRaza(){
        return raza;
    }
    public int getNivel(){
        return nivel;
    }
    public int getPeso(){ return peso;}
    public int getFuerza(){ return fuerza;}
    public List<Item> getEquipo(){
        if (equipo == null) {
            equipo = new ArrayList<>(); //crear la lista sino existe
        }
        return equipo;
    }

    //SET

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    public void setPeso(int peso) { this.peso = peso; }
    public void setFuerza(int fuerza) { this.fuerza = fuerza; }
    public void setEquipo(List<Item> equipo) {
        this.equipo = equipo;
    }


}
