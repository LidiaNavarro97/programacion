package com.rpg.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerCustom {

    private static String rutaLog = "practica7/ficheros/info.log";

    //hago un metodo para eecribir los errrores en el log

    public static void logError(String mensaje) {

        //el formato lo he buscado

        try{

            FileWriter fw = new FileWriter(rutaLog, true); //abro el archivo
            BufferedWriter bw = new BufferedWriter(fw); //esto se supone que mejora la escritura
            LocalDateTime ahora = LocalDateTime.now(); // fecha actual
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); //formato de la fecha
            String fecha = ahora.format(formato);

            // Crear linea del log
            String linea = "[" + fecha + "] ERROR: " + mensaje;

            bw.write(linea);// Escribir en el archivo
            bw.newLine();// Salto de linea
            bw.close();// Cerrar writer


        } catch(IOException e){

            System.out.println("Error escribiendo en el log.");

        }
    }

}
