package modelo;



import java.awt.List;
import java.sql.*;
import java.util.ArrayList;

public class productosfunc {
    Connection conn;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    //sentencia para insertar productos
    public boolean InsertarProd(Producto pro){
        // orde=id que se mostrara en la aplicacion
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
    
    
    
   
}
