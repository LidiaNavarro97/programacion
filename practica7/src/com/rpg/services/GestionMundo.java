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
import com.rpg.utils.LoggerCustom;

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

        System.out.println("----------------------------------------");
        System.out.println("CIUDADES: ");
        System.out.println("----------------------------------------");
        ciudades = TxtHelper.leerCiudades();

        System.out.println("----------------------------------------");
        System.out.println("ITEMS: ");
        System.out.println("----------------------------------------");
        items = JsonHelper.leerItem();

        System.out.println("----------------------------------------");
        System.out.println("PERSONAJES: ");
        System.out.println("----------------------------------------");
        personajes = JsonHelper.leerPersonaje();


        //hago un foreach para crear un mapa de items, asi guardo la clave id y el valor que seria el objeto Item

        for (Item i : items) {
            mapaItems.put(i.getId(), i);
        }
        System.out.println("----------------------------------------");
        System.out.println("Items: " + mapaItems.size());
        System.out.println("Personajes: " + personajes.size());
        System.out.println("----------------------------------------");
    }


    //CREO UN PERSONAJE NUEVO

    public void crearPersonaje(String nombre, String raza, int nivel, List<String> idsItems) {

        try {

            if (nivel < 0) {
                throw new DatoInvalidoException("Nivel negativo no permitido");
            }

            Personaje nuevo = new Personaje(nombre, raza, nivel);

            List<Item> equipo = new ArrayList<>();

            for (String id : idsItems) {

                Item item = mapaItems.get(id);

                if (item == null) {
                    throw new RecursoNoEncontradoException("Item no encontrado: " + id);
                }

                equipo.add(item);
            }

            nuevo.setEquipo(equipo);//asigno el equipo al personaje nuevo y lo añado a la lista
            personajes.add(nuevo);

            System.out.println("PERSONAJES NUEVOS CREADOS: ");
            System.out.println("Personaje nuevo: " + nombre);
            System.out.println("----------------------------------------");

        } catch (DatoInvalidoException | RecursoNoEncontradoException e) {

            LoggerCustom.logError(e.getMessage());

        }
    }


    //muestro el personaje

    public void mostrarPersonaje() {

        int contador = 1; //pobgo este contador para que quede mas bonito a la hora de mostrarlo por pantalla
        for (Personaje p : personajes) { //recorro los personajes
            System.out.println("PERSONAJE " + contador++);
            System.out.println("Personajes: " + p.getNombre() + " -> Nivel: " + p.getNivel());
            for (Item i : p.getEquipo()) { //los item q tiene cada personaje
                System.out.println(" Items: " + i.getNombre());
            }
            System.out.println("----------------------------------------");
        }
    }

    //Este metodo en el JsonHelper me lo ha hecho ChatGPT

    public void guardarPersonajes() {
        JsonHelper.guardarPersonajes(personajes); //guardo los personajes en el json
        System.out.println("Personajes guardados correctamente. ");
    }
}

