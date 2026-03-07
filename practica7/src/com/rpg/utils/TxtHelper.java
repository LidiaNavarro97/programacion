package com.rpg.utils;
import com.rpg.model.Ciudades;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TxtHelper {

    public TxtHelper() {
    }

    public static List<Ciudades> leerCiudades() {

        List<Ciudades> listaCiudades = new ArrayList<>();

        try {
            List<String> lineas = Files.readAllLines(
                    Paths.get("practica7/ficheros/ciudades.txt"));

            for (String linea : lineas) {

                try {

                    String[] s = linea.split(";");

                    if (s.length != 4) {
                        throw new Exception("Formato incorrecto: " + linea);
                    }

                    Ciudades c = new Ciudades(
                            s[0],
                            Integer.parseInt(s[1]),
                            s[2],
                            Integer.parseInt(s[3])
                    );

                    listaCiudades.add(c);


                } catch (IOException e) {
                    LoggerCustom.logError("Error leyendo ciudad : " + linea);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

        } catch (IOException e) {
            LoggerCustom.logError("No se pudo abrir ciudades.txt ");

        }

        return listaCiudades;
    }
}

