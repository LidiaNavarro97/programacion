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
