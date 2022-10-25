
package modelo;
import java.sql.*;

public class Conexion {
   
    

    public static String url = "jdbc:mariadb://localhost:3306/inventario";
    public static String usuario = "root";
    public static String pass = "root";
    public static String clase = "org.mariadb.jdbc.Driver";
    Connection conn;    
    ResultSet rs;
    PreparedStatement ps ;
    //private String result;
     public Connection getConn() throws SQLException
      {
     
      try
      {
          Class.forName(clase);
          conn = DriverManager.getConnection(url,usuario,pass);
          System.out.print("conexion correcta");
      }catch(ClassNotFoundException e){
          System.err.println("conexion incorrecta");
          System.err.println(e);
      }
      return conn;
      }
   
    
}
