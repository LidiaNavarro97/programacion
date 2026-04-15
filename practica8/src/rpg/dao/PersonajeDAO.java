package rpg.dao;

import rpg.model.Personaje;
import rpg.exception.NivelInsuficienteException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonajeDAO {

    // Creo el personaje
    public void crearPersonajeDani() {

        String sql = "INSERT INTO Personajes (nombre, nivel, oro, vida_actual, id_raza, id_clase, id_ciudad_actual) " +
                "VALUES ('Dani', 1, 100, 100, 1, 1, 1)";

        Connection con = ConexionDB.obtenerConexion();
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("He guardado a Dani en la BBDD.");
        } catch (SQLException e) {
            System.out.println("Error: Dani ya existe o la BBDD ha fallado.");
        } finally {
            ConexionDB.cerrarConexion(con);
        }
    }

    // Viajar de ciudad

    public void viajar(int idCiudadDestino) throws NivelInsuficienteException {
        // Primero necesito sacar a Dani de la BBDD para saber su nivel actual
        Personaje dani = buscarDaniPorNombre("Dani");

        // Necesito saber que nivel pide la ciudad
        int nivelMinimoCiudad = obtenerNivelMinimoCiudad(idCiudadDestino);

        // Siguiendo la regla miro si dani tiene nivel suficiente
        if (dani.getNivel() < nivelMinimoCiudad) {
            // Si no tiene nivel, lanzo la excepción y el metodo se para aquí
            throw new NivelInsuficienteException("Dani no puede entrar: Es nivel " +
                    dani.getNivel() + " y piden nivel " + nivelMinimoCiudad);
        }

        // Si el nivel es correcto hago el UPDATE
        String sql = "UPDATE Personajes " +
                "SET id_ciudad_actual = ? " +
                "WHERE nombre = 'Dani'";
        // Llamamos a la clase de conexión para poder entrar a la BBDD.
        Connection con = ConexionDB.obtenerConexion();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            // En la primera interrogación (1), pon el valor de la variable idCiudadDestino".
            ps.setInt(1, idCiudadDestino);
            ps.executeUpdate();

            // Si no hay errores:
            System.out.println("Dani ha viajado con éxito a la ciudad " + idCiudadDestino);

            //Si sale mal, capturo el fallo
        } catch (SQLException e) {
            System.out.println("Error al actualizar la ciudad en la BBDD.");
        } finally {
            ConexionDB.cerrarConexion(con);
        }
    }

    // MÉTODOS AUXILIARES
    // Este busca a Dani para que sepamos su nivel y oro actual
    public Personaje buscarDaniPorNombre(String nombre) {
        String sql = "SELECT * FROM Personajes WHERE nombre = '" + nombre + "'";
        Connection con = ConexionDB.obtenerConexion();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return new Personaje(
                        rs.getInt("id"), rs.getString("nombre"), rs.getInt("nivel"),
                        rs.getInt("oro"), rs.getInt("vida_actual"), rs.getInt("id_raza"),
                        rs.getInt("id_clase"), rs.getInt("id_ciudad_actual")
                );
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return null;
    }

    // consulto la tabla Ciudades para ver el nivel minimo
    private int obtenerNivelMinimoCiudad(int idCiudad) {
        String sql = "SELECT nivel_minimo_acceso FROM Ciudades WHERE id = " + idCiudad;
        Connection con = ConexionDB.obtenerConexion();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getInt("nivel_minimo_acceso");
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return 0; // Si no la encuentra devuelve 0 por defecto
    }
}