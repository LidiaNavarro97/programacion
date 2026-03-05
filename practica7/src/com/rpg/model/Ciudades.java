package com.rpg.model;

public class Ciudades {

    private String nombre;
    private Integer poblacion;
    private String clima;
    private Integer riesgo;

    public Ciudades(String nombre, Integer poblacion, String clima, Integer riesgo) {

        this.nombre = nombre;
        this.poblacion = poblacion;
        this.clima = clima;
        this.riesgo = riesgo;

    }

    //GET

    public String getNombre(){
        return nombre;
    }
    public Integer getPoblacion(){
        return poblacion;
    }
    public String getClima(){
        return clima;
    }
    public Integer getRiesgo(){
        return riesgo;
    }

    //SET

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPoblacion(Integer poblacion){
        this.poblacion = poblacion;
    }
    public void setClima(String clima){
        this.clima = clima;
    }
    public void setRiesgo(Integer riesgo){
        this.riesgo = riesgo;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
