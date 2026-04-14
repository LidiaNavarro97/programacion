package rpg.dao;

import rpg.model.Raza;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RazaDAO {
    private List<Raza> razas;

    public RazaDAO(){
        this.razas = new ArrayList<>();
    }

    public List<Raza> cargarRazas(){
        // Limpio la lista por si acaso se llama dos veces al metodo
        razas.clear();

        String sql = "SELECT * FROM Razas";

        // Uso la conexion de mi clase auxiliar
        Connection con = ConexionDB.obtenerConexion();

        if (con != null) {
            try {
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()) {
                    // OJO: Los nombres de las columnas deben ser igual que en el init.sql
                    // En tu SQL pusiste "bonificador_vida", no "bonificadorVida"
                    Raza r = new Raza(
                            rs.getInt("id"),
                            rs.getString("nombre"),
                            rs.getInt("bonificador_vida"),
                            rs.getInt("bonificador_fuerza")
                    );
                    razas.add(r);
                }

                // Cierro
                rs.close();
                stmt.close();
                ConexionDB.cerrarConexion(con);

            } catch (SQLException e) {
                System.out.println("Error al leer las razas: " + e.getMessage());
            }
        }
        return razas;
    }
}