package rpg.dao;

import rpg.model.Raza;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RazaDAO {

    // para rellenar el menu cuando el usuario tiene que elegir raza
    public List<Raza> obtenerTodasRazas() {
        List<Raza> lista = new ArrayList<>();
        String sql = "SELECT * FROM Razas";

        try (Connection connection = ConexionDB.obtenerConexion();
             Statement statement = connection.createStatement();
             ResultSet resultset = statement.executeQuery(sql)) {

            // Voy fila por fila sacando la informacion
            while (resultset.next()) {

                // Uso el constructor la clase Raza
                Raza r = new Raza(
                        resultset.getInt("id"),
                        resultset.getString("nombre"),
                        resultset.getInt("bonificador_vida"),
                        resultset.getInt("bonificador_fuerza")
                );
                lista.add(r); //la añado a la lista
            }
        } catch (SQLException e) {
            System.out.println("Error al leer la tabla de Razas");
            e.printStackTrace();
        }
        return lista; //devuelvp la lista rellena
    }
}