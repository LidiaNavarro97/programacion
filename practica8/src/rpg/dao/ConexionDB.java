package rpg.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionDB {

    // Datos de mi docker-compose
    private static final String URL = "jdbc:postgresql://localhost:5432/XRPG";
    private static final String USER = "xrpg_user";
    private static final String PASS = "xrpg_password";

    // Metodo para abrir la conexion
    public static Connection obtenerConexion() throws SQLException {

        //devuelve la conexion usando el DriverManager
        return DriverManager.getConnection(URL,USER,PASS);
    }


    public ResultSet conectar(String query) {

        //HACER
    }

    public void ejecutarUpdate(String sql) {

        //HACER
    }
}