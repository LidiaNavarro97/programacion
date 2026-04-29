package rpg.dao;

import rpg.model.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonajeDAO {

    private List<Personaje> listaPersonajes;

    public PersonajeDAO() {
        this.listaPersonajes = new ArrayList<>();
    }

    public List<Personaje> cargarPersonajes(List<Item> items) {
        try {

            ConexionDB conexionBD = new ConexionDB();


            ClaseDAO claseDAO = new ClaseDAO();
            List<Clase> clases = claseDAO.cargarClases();

            RazaDAO razaDAO = new RazaDAO();
            List<Raza> razas = razaDAO.cargarRazas();

            CiudadDAO ciudadDAO = new CiudadDAO();
            List<Ciudad> ciudades = ciudadDAO.cargarCiudades();

            HabilidadDAO habilidadDAO = new HabilidadDAO();
            List<Habilidad> listaHabilidades = habilidadDAO.cargarHabilidades();


            //SEGUIR HACIENDO

        }
    }

    public void insertarPersonaje(Personaje p) {

        String sql = "INSERT INTO PERSONAJES (nombre, nivel, oro, vida_actual, id_raza, id_clase, id_ciudad_actual) " +
                "VALUES ('" + p.getNombre() + "', " + p.getNivel() + ", " + p.getOro() + ", " +
                p.getVidaActual() + ", " + p.getIdRaza().getId() + ", " +
                p.getIdClase().getId() + ", " + p.getIdCiudadActual().getId() + ")";
        try {
            ConexionDB con = new ConexionDB();
            con.ejecutarUpdate(sql);
        } catch (SQLException e) {
            System.err.println("Error al insertar personaje: " + e.getMessage());
        }
    }

    public void actualizarCiudad(int idPersonaje, int idNuevaCiudad) {
        String sql = "UPDATE PERSONAJES SET id_ciudad_actual = " + idNuevaCiudad + " WHERE id = " + idPersonaje;
        try {
            ConexionDB con = new ConexionDB();
            con.ejecutarUpdate(sql);
        } catch (SQLException e) {
            System.err.println("Error al actualizar ciudad en BBDD: " + e.getMessage());
        }
    }

    public void actualizarPersonaje(Personaje p) {
        String sql = "UPDATE PERSONAJES SET " +
                "oro = " + p.getOro() + ", " +
                "id_ciudad_actual = " + p.getCiudad().getId() + ", " +
                "vida_actual = " + p.getVidaActual() + " " +
                "WHERE id = " + p.getId();

        try {
            ConexionDB con = new ConexionDB();
            con.ejecutarUpdate(sql);
            System.out.println("Base de datos actualizada para: " + p.getNombre());
        } catch (SQLException e) {
            System.err.println("Error al actualizar personaje en la BBDD: " + e.getMessage());
        }
    }
}
