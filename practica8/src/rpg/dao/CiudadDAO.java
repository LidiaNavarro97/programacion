package rpg.dao;

import rpg.model.Ciudad;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CiudadDAO {

    // asi saco la lista de todas las ciudades de la tabla
    public List<Ciudad> obtenerTodasCiudades() {
        List<Ciudad> lista = new ArrayList<>();

        // consulto todas las filas
        String sql = "SELECT * FROM Ciudades";

        // cogido de los apuntes para que la conexion se cierre sola al terminar
        try (Connection connection = ConexionDB.obtenerConexion();
             Statement statement = connection.createStatement();
             ResultSet resulset = statement.executeQuery(sql)) {

            // Mientras que el ResultSet tenga una fila siguiente sigo leyendo
            while (resulset.next()) {
                // Creo el objeto ciudad con los datos que saco de las columnas de la BBDD
                Ciudad c = new Ciudad(
                        resulset.getInt("id"),
                        resulset.getString("nombre"),
                        resulset.getInt("nivel_minimo_acceso")
                );
                lista.add(c); // Añado la ciudad a mi lista
            }
        } catch (SQLException e) {
            // Si algo falla para que me avise
            System.out.println("Error al cargar las ciudades: " + e.getMessage());
            e.printStackTrace();
        }
        return lista; // Devuelvo la lista llena al programa principal
    }

    // para buscar una ciudad por su id
    // y para saber que nivel minimo de acceso pide esa ciudad

    public Ciudad obtenerPorId(int idBusqueda) {

        String sql = "SELECT * " +
                "FROM Ciudades " +
                "WHERE id = ?";

        try (Connection connection = ConexionDB.obtenerConexion();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setInt(1, idBusqueda);

            ResultSet resulset = ps.executeQuery();

            if (resulset.next()) {
                // Creamos y devolvemos el objeto Ciudad con los datos de la tabla
                return new Ciudad(
                        resulset.getInt("id"),
                        resulset.getString("nombre"),
                        resulset.getInt("nivel_minimo_acceso")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar la ciudad en la base de datos.");
            e.printStackTrace();
        }

        // Si no encuentra la ciudad, devuelve null (nada)
        return null;
    }
}