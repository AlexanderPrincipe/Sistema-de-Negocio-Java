
package tabla;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Conexion {
    
    
    // Conexion con la BD en la nube
    public static final String URL = "jdbc:mysql://54.175.48.207:3306/heroku_fb8fc7b3b7789cc?autoReconnect=true&useSSL=false";
    public static final String usuario = "b88ac98fc118d2";
    public static final String contraseña = "8daa2e44";
    
    
    // Conexion con la BD localhost
    //public static final String URL = "jdbc:mysql://localhost:3306/lavanderia?autoReconnect=true&useSSL=false";
    //public static final String usuario = "alexander";
    //public static final String contraseña = "Alexrrlalh25!";
    
    public Connection getConnection(){
        Connection conexion = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL,usuario,contraseña);
            //JOptionPane.showMessageDialog(this, "Conexion exitosa");
            
        }catch(Exception ex) {
            System.out.println("Error, " + ex);
        }
        
        return conexion;
    }
    
}
