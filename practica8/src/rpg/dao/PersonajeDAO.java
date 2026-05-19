package rpg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonajeDAO {

    public PersonajeDAO() {
    }

    public void insertPersonaje(String nombre, int idRaza, int idClase, int idCiudadActual) {

        String sql = "INSERT INTO Personajes (nombre, nivel, oro, vida_actual, id_raza, id_clase, id_ciudad_actual) VALUES (?, 1, 100, 100, ?, ?, ?)";

        try (Connection conexion = ConexionDB.getConexion();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, nombre);
            ps.setInt(2, idRaza);
            ps.setInt(3, idClase);
            ps.setInt(4, idCiudadActual);
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateCiudad(int idCiudad) {

        String sql = "UPDATE Personajes SET id_ciudad_actual = " + idCiudad + "FROM Ciudades WHERE " + idCiudad + " = Ciudades.id " +
                "AND Personajes.nivel >= Ciudades.nivel_minimo_acceso ";

        try (Connection conexion = ConexionDB.getConexion();
             PreparedStatement ps = conexion.prepareStatement(sql)) {



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
