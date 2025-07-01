
package utp.integrador.Model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getConexion(){
        Connection conexion = null;
        var bd = "sistemagestioncanchas";
        var url = "jdbc:mysql://localhost:3306/" + bd;
        var usuario = "root";
        var password = "1234";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch(Exception e){
            System.out.println("Error de conexion con la BD: " + e.getMessage());
        }
        return conexion;
    }
}