package rpg.dao;

import rpg.model.Clase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClaseDAO {

    public ClaseDAO() {
    }

    public List<Clase> obtenerClases() {

        List<Clase> listaClases = new ArrayList<Clase>();
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