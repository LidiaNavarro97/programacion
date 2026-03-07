package com.rpg.services;

import com.rpg.model.Ciudades;
import com.rpg.model.Item;
import com.rpg.model.Personaje;
import com.rpg.utils.JsonHelper;
import com.rpg.utils.TxtHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestionMundo {

    //listo las clases

    private List<Ciudades> ciudades;
    private List<Personaje> personajes;
    private List<Item> items;

    //hago un map para buscar los items por el id del objeto Item
    private Map<String, Item> mapaItems;


    //CONSTRUCTOR

    public GestionMundo() {
        ciudades = new ArrayList<>();
        items = new ArrayList<>();
        personajes = new ArrayList<>();
        mapaItems = new HashMap<>();
    }

    //cargo los datos

    public void cargarTodo() {

        System.out.println("Cargando ciudades...");
        ciudades = TxtHelper.leerCiudades();

        System.out.println("Cargando items...");
        items = JsonHelper.leerItem();

        System.out.println("Cargando personajes...");
        personajes = JsonHelper.leerPersonaje();


    //hago un foreach para crear un mapa de items, asi guardo la clave id y el valor que seria el objeto Item

        for (Item i : items) {
            mapaItems.put(i.getId(), i);
        }

        System.out.println("Items cargados: " + mapaItems.size());
    }


}
