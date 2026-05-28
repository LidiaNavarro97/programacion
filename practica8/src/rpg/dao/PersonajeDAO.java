package rpg.dao;

import rpg.exception.NivelInsuficienteException;
import rpg.model.Item;
import rpg.model.Personaje;

import java.sql.*;
import java.util.ArrayList;

public class PersonajeDAO {

    public PersonajeDAO() {
    }

    public void insertPersonaje(String nombre, int idRaza, int idClase, int idCiudadActual) {

        String sql = "INSERT INTO Personajes (nombre, nivel, oro, vida_actual, id_raza, id_clase, id_ciudad_actual) VALUES (?, 1, 100, 100, ?, ?, ?)";

        try (Connection conexion = ConexionDB.getConexion();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, nombre);
            ps.setInt(2, idRaza);
            ps.setInt(3, idClase);
            ps.setInt(4, idCiudadActual);
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateCiudad(int idPersonaje, int idCiudad) throws NivelInsuficienteException {

        String sql = "UPDATE Personajes " +
                "SET id_ciudad_actual = ? " +
                "WHERE Personajes.id = ? " +
                "AND Personajes.nivel >= (SELECT nivel_minimo_acceso " +
                "FROM Ciudades " +
                "WHERE id = ?) ";

        try (Connection conexion = ConexionDB.getConexion();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, idCiudad);
            ps.setInt(2, idPersonaje);
            ps.setInt(3, idCiudad);

            int filasAfectadas = ps.executeUpdate();


            if (filasAfectadas == 0) {
                throw new NivelInsuficienteException("Nivel insuficiente para acceder a esa ciudad.");
            }


        } catch (SQLException e) {
            throw new NivelInsuficienteException("Nivel insuficiente. ");
        }

    }

    public ArrayList<Personaje> obtenerPersonaje() {

        String sql = " SELECT * FROM Personajes";

        ArrayList<Personaje> listaPersonajes = new ArrayList<>();

        try (Connection conexion = ConexionDB.getConexion();
             Statement st = conexion.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                listaPersonajes.add(new Personaje(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("nivel"),
                        rs.getInt("oro"),
                        rs.getInt("vida_actual"),
                        rs.getInt("id_raza"),
                        rs.getInt("id_clase"),
                        rs.getInt("id_ciudad_actual")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaPersonajes;
    }


    public int updateOro(Personaje personaje, Item item) {

        String sql = " UPDATE Personajes " +
                " SET oro = ? " +
                " WHERE id = ? " +
                " AND oro >= (SELECT precio_oro " +
                             "FROM Items " +
                             "WHERE id = ? )";

        return 0;
    }


}
