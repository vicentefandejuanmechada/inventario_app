/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author admin1
 */
public class ventasfunc {
       Connection conn;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    Ventas vs = new Ventas();
    
      public boolean InsertarVenta(Ventas vs){
        String sql="INSERT INTO ventas (nombre_del_prodvendido,id_prod,precio_prod,total_venta,cantidad_del_producto) values(?,?,?,?,?)";
        
        try {
        conn = cn.getConn();
        ps= conn.prepareStatement(sql);
        ps.setString(1, vs.getNombre_del_prodvendido());
        ps.setInt(2, vs.getId_prod());
        ps.setInt(3, vs.getPrecio_prod());
        ps.setInt(4, vs.getTotal_venta());
        ps.setInt(5, vs.getCantidad_del_producto());
        ps.execute();
            System.out.println("    funciono se vendio un producto");
        return true;
        } catch (SQLException e) {
            System.out.println("    no funciono no se creo");
            System.err.println(e);
        }
        return false;
    }
      
       public Ventas venid(Integer id_prod){
        String sql = "SELECT * from ventas WHERE id_prod=?";
        try {
            conn = cn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,id_prod);
            
            rs=ps.executeQuery();
            if(rs.next()){
                vs.setId_prod(rs.getInt("id_prod"));
                System.out.println("funciono la verficacion");
            }
        } catch (SQLException e) {
            System.out.println("no funciono la verficacion ");
            System.out.println(e);
        }
        return vs;
    }
    
}
