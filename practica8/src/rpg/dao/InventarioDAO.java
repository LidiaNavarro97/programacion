package rpg.dao;

import java.sql.*;

public class InventarioDAO {

    // Para registrar que un personaje ha comprado un item

    public void agregarItem(int idPersonaje, int idItem) {

        // La tabla Inventarios es una relacion N a M entre personajes e items
        String sql = "INSERT INTO Inventarios (id_personaje, id_item, cantidad) VALUES (?, ?, 1)";

        try (Connection connection = ConexionDB.obtenerConexion();
             PreparedStatement ps = connection.prepareStatement(sql)) {

            //para rellenar los huecos de los "?"
            ps.setInt(1, idPersonaje);
            ps.setInt(2, idItem);

            //uso esto porque estoy cambiando la base de datos
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error: No se pudo añadir el item al inventario. ");
            e.printStackTrace(); //esto dice la linea exacta donde ha fallado
        }
    }
}