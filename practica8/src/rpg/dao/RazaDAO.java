package rpg.dao;

import rpg.model.Raza;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RazaDAO {


    public RazaDAO() {
    }

    public List<Raza> obtenerRazas() {

        List<Raza> listaRazas = new ArrayList<Raza>();
        String sql = "SELECT * FROM Razas";

        try (Connection conexion = ConexionDB.getConexion();
             Statement st = conexion.createStatement();
             ResultSet rs = st.executeQuery(sql);) {

            while (rs.next()) {
                listaRazas.add(new Raza(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("bonificador_vida"),
                        rs.getInt("bonificador_fuerza")

                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
        return listaRazas;
    }

}
