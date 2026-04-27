package com.rpg.utils;
import com.rpg.model.Ciudades;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TxtHelper {

    public TxtHelper(){ }

    public static List<Ciudades> leerCiudades() {

        List<Ciudades> listaCiudades = new ArrayList<>();

        try {
            List<String> lineas = Files.readAllLines(
                    Paths.get("practica7/ficheros/ciudades.txt"));

            for (String linea : lineas) {

                String[] s = linea.split(";");

                Ciudades c = new Ciudades(
                        s[0],
                        Integer.parseInt(s[1]),
                        s[2],
                        Integer.parseInt(s[3])
                );

                listaCiudades.add(c);
            }

            for (Ciudades c : listaCiudades) {
                System.out.println(c.getNombre());
            }


        } catch (IOException e) {
            System.out.println("No se ha podido abrir el fichero -> " + e.getMessage());
            return listaCiudades;
        }

        return listaCiudades;
    }
}
