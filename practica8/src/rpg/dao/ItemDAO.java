package rpg.dao;

import rpg.model.Item;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ItemDAO {

    public ItemDAO() {
    }

    public ArrayList<Item> obtenerItems() {

        String sql = "SELECT * FROM Items";

        ArrayList<Item> listaItems = new ArrayList<>();

        try (Connection conexion = ConexionDB.getConexion();
             Statement st = conexion.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while(rs.next()){
                listaItems.add(new Item(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("tipo"),
                        rs.getInt("precio_oro"),
                        rs.getInt("bonificador_ataque"),
                        rs.getInt("bonificador_defensa")
                        ));
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaItems;
    }
}