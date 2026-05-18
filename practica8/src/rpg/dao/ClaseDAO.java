package rpg.dao;

import rpg.model.Clase;

import java.sql.*;
import java.util.ArrayList;


public class ClaseDAO {

    public ClaseDAO() {
    }

    public ArrayList<Clase> obtenerClases() {

        ArrayList<Clase> listaClases = new ArrayList<>();
        String sql = "SELECT * FROM Clases_RPG";

        try (Connection conexion = ConexionDB.getConexion();
             Statement st = conexion.createStatement();
             ResultSet rs = st.executeQuery(sql);) {

            while(rs.next()){
                listaClases.add(new Clase(
                        rs.getInt("id"),
                        rs.getString("nombre")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaClases;
    }
}