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
public class accion_func {
    Connection conn;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
     public boolean RestarProd(Acciones acres){
        // orde=id que se mostrara en la aplicacion
        String sql = "INSERT INTO acciones (accion,Descripcion_de_accion,objeto_manipulado,cantidad_manipulada) VALUES (?,?,?,?)";
        try{
            conn = cn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setString(1,acres.getAccion());
            ps.setString(2, acres.getDescripcion_de_accion());
             ps.setString(3, acres.getObjeto_manipulado());
            ps.setInt(4, acres.getCantidad_manipulada());
            ps.execute();
            
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
            
        }
        
    }
    
}
