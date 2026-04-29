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


            ResultSet rsPerso = conexionBD.conectar("SELECT * FROM PERSONAJES");
            while (rsPerso.next()) {

                Clase clase = claseDAO.esClase(rsPerso.getInt("id_clase"));
                Raza raza = razaDAO.esRaza(rsPerso.getInt("id_raza"));
                Ciudad ciudad = ciudadDAO.esCiudad(rsPerso.getInt("id_ciudad_actual"));

                if (clase != null && raza != null && ciudad != null) {
                    Personaje p = new Personaje(
                            rsPerso.getInt("id"),
                            rsPerso.getString("nombre"),
                            rsPerso.getInt("nivel"),
                            rsPerso.getInt("oro"),
                            rsPerso.getInt("vida_actual"),
                            raza, clase, ciudad
                    );
                    listaPersonajes.add(p);
                }
            }


            ResultSet rsHab = conexionBD.conectar("SELECT * FROM PERSONAJES_HABILIDADES");

            while (rsHab.next()) {
                int idPerso = rsHab.getInt("id_personaje");
                int idHab = rsHab.getInt("id_habilidad");


                for (Personaje p : listaPersonajes) {
                    if (p.getId() == idPerso) {

                        for (Habilidad h : listaHabilidades) {
                            if (h.getId() == idHab) {
                                p.añadirHabilidad(h);
                            }
                        }
                    }
                }
            }
            for(Personaje p : listaPersonajes) {
                ResultSet rsInv = conexionBD.conectar("SELECT id_item FROM INVENTARIOS WHERE id_personaje = " + p.getId());

                while (rsInv.next()) {
                    int idItemBuscado = rsInv.getInt("id_item");
                    for (Item i : items) {
                        if (i.getId() == idItemBuscado) {
                            p.añadirItem(i);
                        }
                    }
                }
            }

        } catch (SQLException e) {
            System.err.println("Error en PersonajeDAO: " + e.getMessage());
        }
        return listaPersonajes;
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
