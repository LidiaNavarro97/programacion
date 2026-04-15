package rpg.dao;

import java.sql.*;

public class InventarioDAO {

    // para añadir un item a Dani
    public void añadirItemADani(int idItem) {

        // Buscamos el ID de Dani, el 1 porque es el primero que he creado
        String sql = "INSERT INTO Inventarios (id_personaje, id_item, cantidad) VALUES (1, ?, 1)";
        Connection con = ConexionDB.obtenerConexion();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idItem);
            ps.executeUpdate();
            System.out.println("Item añadido al inventario de Dani.");
        } catch (SQLException e) {
            System.out.println("Error al guardar en el inventario.");
        } finally {
            ConexionDB.cerrarConexion(con);
        }
    }

}