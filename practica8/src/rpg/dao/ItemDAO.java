package rpg.dao;

import rpg.model.Item;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemDAO {

    // con este metodo saco todos los items para que el jugador pueda ver la tienda
    public List<Item> obtenerTodosItem() {
        List<Item> lista = new ArrayList<>();
        String sql = "SELECT * FROM Items";

        try (Connection connection = ConexionDB.obtenerConexion();
             Statement statement = connection.createStatement();
             ResultSet resulset = statement.executeQuery(sql)) {

            while (resulset.next()) {
                // Meto cada item en la lista
                lista.add(new Item(
                        resulset.getInt("id"),
                        resulset.getString("nombre"),
                        resulset.getString("tipo"),
                        resulset.getInt("precio_oro"),
                        resulset.getInt("bonificador_ataque"),
                        resulset.getInt("bonificador_defensa")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar con la tabla de Items. ");
            e.printStackTrace();
        }
        return lista;
    }
}