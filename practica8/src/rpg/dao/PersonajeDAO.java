package rpg.dao;

import rpg.model.Personaje;
import java.sql.*;

public class PersonajeDAO {

    // para meter un personaje nuevo en la base de datos
    public void insertar(String nombre, int idRaza, int idClase) {
        // Uso "?" para que Java se encargue de poner los valores de forma segura (me lo ha dicho la IA)
        // Le pongo nivel 1, 100 de oro y 100 de vida como dice la practica
        String sql = "INSERT INTO Personajes (nombre, nivel, oro, vida_actual, id_raza, id_clase, id_ciudad_actual) " +
                "VALUES (?, 1, 100, 100, ?, ?, 1)";

        try (Connection connection = ConexionDB.obtenerConexion();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            // los "?" los tengo que sustituir por las variables que recibo en el metodo
            ps.setString(1, nombre); // el nombre
            ps.setInt(2, idRaza);    // id de la raza
            ps.setInt(3, idClase);   // id de la clase

            // ExecuteUpdate se usa para INSERT, UPDATE y DELETE, para cambiar cosas de la tabla
            ps.executeUpdate();
            System.out.println("Personaje " + nombre + " guardado correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al crear el personaje en la base de datos. ");
            e.printStackTrace();
        }
    }

    // Para actualizar la ciudad donde esta el personaje
    public void viajar(int idPersonaje, int idCiudadDestino) {

        // Hacemos un UPDATE filtrando por el id del personaje
        String sql = "UPDATE Personajes " +
                        "SET id_ciudad_actual = ? " +
                        "WHERE id = ?";

        try (Connection connection = ConexionDB.obtenerConexion();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, idCiudadDestino); // Nuevo destino
            ps.setInt(2, idPersonaje);     // A quien muevo
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("No se pudo cambiar al personaje de ciudad. ");
            e.printStackTrace();
        }
    }
}