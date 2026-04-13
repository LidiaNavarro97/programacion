package rpg.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    // Datos de mi docker-compose
    private static final String URL = "jdbc:postgresql://localhost:5432/XRPG";
    private static final String USER = "xrpg_user";
    private static final String PASS = "xrpg_password";

    // Metodo para abrir la conexion
    public static Connection obtenerConexion() {
        Connection conexion = null;
        try {
            // Cargo el driver por si acaso
            Class.forName("org.postgresql.Driver");
            // Intento conectar
            conexion = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            System.out.println("Ojo, error al conectar: " + e.getMessage());
        }
        return conexion;
    }

    // Metodo para cerrar la conexion y no dejarla abierta
    public static void cerrarConexion(Connection conexion) {
        try {
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            System.out.println("No se pudo cerrar: " + e.getMessage());
        }
    }
}