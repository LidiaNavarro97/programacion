package com.rpg.model;

public class Item {

    private String id;
    private String nombre;
    private String tipo;
    private int valor;
    private int peso;

    public Item( String id, String nombre, String tipo, int valor, int peso){

        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
        this.peso = peso;

    }

    //GET

    public String getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public int getValor(){
        return valor;
    }
    public int getPeso() { return peso; }

    //SET

    public void setId(String id){
        this.id = id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setValor(int valor){
        this.valor = valor;
    }
    public void setPeso(int peso) { this.peso = peso; }

}
