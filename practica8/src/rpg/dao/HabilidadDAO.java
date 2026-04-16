package rpg.dao;

import rpg.model.Habilidad;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HabilidadDAO {

    // busco habilidades segun la clase

    public List<Habilidad> obtenerPorClase(int idClase) {
        List<Habilidad> lista = new ArrayList<>();

        String sql = "SELECT *" +
                    "FROM Habilidades ";

        try (Connection connection = ConexionDB.obtenerConexion();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            // guardo el resultado en resultset
            try (ResultSet resultset = ps.executeQuery()) {
                while (resultset.next()) {
                    lista.add(new Habilidad(
                            resultset.getInt("id"),
                            resultset.getString("nombre"),
                            resultset.getInt("daño_base"),
                            resultset.getInt("usos_maximos"),
                            resultset.getInt("id_clase")
                    ));
                }
            }
        } catch (SQLException e) {
            System.out.println("Fallo al buscar habilidades por clase. ");
            e.printStackTrace();
        }
        return lista;
    }
}