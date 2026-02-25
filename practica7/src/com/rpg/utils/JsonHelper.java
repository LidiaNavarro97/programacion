package com.rpg.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rpg.model.Item;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JsonHelper {

    public JsonHelper(){}

    public static List<Item> leerItem() {

        List<Item> listaItem = new ArrayList<>();

        try {
            FileReader reader = new FileReader("practica7/ficheros/items.json");
            Gson g = new Gson();
            List<Item> lista = g.fromJson(reader, new TypeToken<List<Item>>() {}.getType());

            for (Item l : lista) {
                System.out.println(l.getNombre());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return listaItem;
    }
}


