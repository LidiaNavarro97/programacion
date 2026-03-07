package com.rpg.services;

import com.rpg.handler.DatoInvalidoException;
import com.rpg.handler.RecursoNoEncontradoException;
import com.rpg.model.Ciudades;
import com.rpg.model.Item;
import com.rpg.model.Personaje;
import com.rpg.utils.JsonHelper;
import com.rpg.utils.TxtHelper;

import java.awt.*;
import java.lang.classfile.ClassFile;
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

        System.out.println("---------------------------"); //para que quede mejor al ejecutarlo

        System.out.println("Cargando items...");
        items = JsonHelper.leerItem();

        System.out.println("---------------------------");

        System.out.println("Cargando personajes...");
        personajes = JsonHelper.leerPersonaje();


    //hago un foreach para crear un mapa de items, asi guardo la clave id y el valor que seria el objeto Item

        for (Item i : items) {
            mapaItems.put(i.getId(), i);
        }
        System.out.println("---------------------------");
        System.out.println("Items cargados: " + mapaItems.size());
    }


    //CREO UN PERSONAJE NUEVO

    public void crearPersonaje(String nombre, String raza, int nivel, List<String> idsItems)
            throws RecursoNoEncontradoException, DatoInvalidoException {


        //creo un personaje
        Personaje nuevo = new Personaje(nombre, raza, nivel);

        //lista donde voy a guardar los items de verdad
        List<Item> equipo = new ArrayList<>();

        //para el log del nivel
        if (nivel < 0) {
            throw new DatoInvalidoException("Nivel negativo no permitido");
        }

        //recorro los ids
        for (String id : idsItems) {
            Item item = mapaItems.get(id); //busco el item en el mapa

            //para el log de los item
            if (item != null) {
                equipo.add(item); //si existe lo añado al equipo
            } else {
                throw new RecursoNoEncontradoException("Item no encontrado: " + id);
            }

        }

        //asigno el equipo al personaje nuevo y lo añado a la lista
        nuevo.setEquipo(equipo);
        personajes.add(nuevo);
        System.out.println("Personaje creado: " + nombre);
    }


    //muestro el personaje

    public void mostrarPersonaje () {

        for (Personaje p : personajes) {
            System.out.println("Personajes: " + p.getNombre());

            for (Item i : p.getEquipo()) {
                System.out.println(" Item: " + i.getNombre());
            }
        }
    }

    //Este metodo en el JsonHelper me lo ha hecho ChatGPT
    public void guardarCambios() {
        JsonHelper.guardarPersonajes(personajes);
    }

    public void guardarPersonajes() {
        JsonHelper.guardarPersonajes(personajes);
        System.out.println("Personajes guardados correctamente. ");
    }


}
