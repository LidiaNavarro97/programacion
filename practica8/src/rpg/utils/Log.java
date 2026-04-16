package rpg.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log {

    // Nombre del archivo donde voy a guardar to
    private static final String LOG = "info.log";

    public static void guardarLog(String mensaje) {

        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fechaFormateada = ahora.format(formato);

        // para escribir en el archivo
        // El true es para que no borre lo anterior sino que añada al final
        try (FileWriter fw = new FileWriter(LOG, true);
             PrintWriter pw = new PrintWriter(fw)) {

            pw.println("[" + fechaFormateada + "] " + mensaje);

        } catch (IOException e) {
            //si hay algun error
            System.out.println("Error crítico: No se pudo escribir en el archivo log.");
            e.printStackTrace();
        }
    }
}