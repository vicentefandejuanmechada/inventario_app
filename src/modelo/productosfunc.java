package modelo;



import java.awt.List;
import java.sql.*;
import java.util.ArrayList;

public class productosfunc {
    Connection conn;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean InsertarProd(Producto pro){
        String sql = "INSERT INTO productos (orden_producto,nombre_producto,precio_prod,cantidad_producto, fecha_vencimiento ) VALUES (?,?,?,?,?)";
        try{
            conn = cn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,pro.getOrden_producto());
            ps.setString(2,pro.getNombre_producto());
            ps.setInt(3,pro.getPrecio_prod());
            ps.setFloat(4,pro.getCantidad_producto());
            ps.setString(5, pro.getFecha_vencimiento());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
            
        }
        
    }
    
    
    
    
   public ArrayList ListaProducto() throws SQLException{
        ArrayList Listaprod = new ArrayList();
        String sql = "SELECT * from productos";
        try{
         conn = cn.getConn();
         ps = conn.prepareStatement(sql);
         rs = ps.executeQuery();
         while(rs.next()){
            System.out.print(rs.getInt(1));
        }   
        }catch(SQLException e){
            System.out.println(e.toString());
        }
          return Listaprod; 
   }
    
}
