package rpg.dao;

import rpg.model.Ciudad;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CiudadDAO {

    public CiudadDAO(){}


    public ArrayList<Ciudad> obtenerCiudades(){

        String sql = "SELECT * FROM Ciudades";

        ArrayList<Ciudad> listaCiudades = new ArrayList<>();

        try(Connection conexion = ConexionDB.getConexion();
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql)) {

            while(rs.next()){
                listaCiudades.add(new Ciudad(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getInt("nivel_minimo_acceso")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaCiudades;
    }

}
