package com.rpg.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rpg.model.Item;
import com.rpg.model.Personaje;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class JsonHelper {

    public JsonHelper(){}

    public static List<Item> leerItem() {

        List<Item> listaItem = new ArrayList<>();

        try {
            FileReader reader = new FileReader("practica7/ficheros/items.json");
            Gson g = new Gson();
            listaItem = g.fromJson(reader, new TypeToken<List<Item>>() {}.getType());

            for (Item l : listaItem) {
                System.out.println(l.getNombre());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return listaItem;
    }

    public static List<Personaje> leerPersonaje() {

        List<Personaje> listaPersonaje = new ArrayList<>();

        try {
            FileReader reader = new FileReader("practica7/ficheros/personajes.json");
            Gson g = new Gson();
            listaPersonaje = g.fromJson(reader, new TypeToken<List<Personaje>>() {}.getType());

            for (Personaje p : listaPersonaje){
                System.out.println(p.getNombre());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return listaPersonaje;
    }


    //ESTO ME LO HA HECHO CHATGPT, me quede aqui atascada no sabia como hacer esta parte.

    public static void guardarPersonajes (List<Personaje> personajes) {

        try {
            Gson gson = new Gson();
            FileWriter writer = new FileWriter("practica7/ficheros/personajes.json");

            gson.toJson(personajes, writer); //gson cpnvierte la lista a JSON y la escribe en el archivo
            writer.close(); //cerramos el archivo
            System.out.println("Personajes guardados correctamente.");

        } catch (Exception e) {
            System.out.println("Error guardando los personajes.");
        }
    }
}


