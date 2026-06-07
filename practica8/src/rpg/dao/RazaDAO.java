package rpg.dao;

import rpg.model.Raza;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RazaDAO {


    public RazaDAO() {
    }

    public ArrayList<Raza> obtenerRazas() {

        ArrayList<Raza> listaRazas = new ArrayList<>();
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
