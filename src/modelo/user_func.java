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
import vistas.*;

/**
 *
 * @author admin1
 */
public class user_func {
    Connection conn;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    usuarios us = new usuarios();
    //metodo q inserta usuarios
    public boolean InsertarUser(usuarios us){
        String sql="INSERT INTO users (id_del_tipo_de_user ,nombre_user,passw_user,e_mail_user) values(?,?,?,?)";
        
        try {
        conn = cn.getConn();
        ps= conn.prepareStatement(sql);
        ps.setInt(1, us.getId_del_tipo_user());
        ps.setString(2, us.getNombre_user());
        ps.setString(3, us.getPassw_user());
        ps.setString(4, us.getE_mail_user());
        ps.execute();
            System.out.println("    funciono se creo un nuevo user");
        return true;
        } catch (SQLException e) {
            System.out.println("    no funciono no se creo");
            System.err.println(e);
        }
        return false;
    }
    
    //metodo q elimina cualquier usuario cual su tipo de id sea = 2 
    public boolean Eliminaruser(int id_user){
        String sql= "DELETE FROM users WHERE id_user=? and users.id_del_tipo_de_user=2";
        try {
            conn = cn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id_user);
            ps.execute();
            System.out.println("    funciono el delete USER");
            
            return true;
        } catch (SQLException e) {
            System.out.println("No funciono");
            System.out.println(e);
        return false;
        }
        }
    
    //metodo que seleciona todo los usuarios que tengan el id de tipo de user = 1
    
    public usuarios log(String nombre_user, String passw_user){
        String sql = "SELECT * from users WHERE nombre_user=? and  passw_user=? and id_del_tipo_de_user = 1";
        try {
            conn = cn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setString(1,nombre_user);
            ps.setString(2,passw_user);
            rs=ps.executeQuery();
            if(rs.next()){
                us.setNombre_user(rs.getString("nombre_user"));
                us.setPassw_user(rs.getString("passw_user"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return us;
    }
     public usuarios logu(String nombre_user, String passw_user){
        String sql = "SELECT * from users WHERE nombre_user=? and  passw_user=? and id_del_tipo_de_user = 2";
        try {
            conn = cn.getConn();
            ps = conn.prepareStatement(sql);
            ps.setString(1,nombre_user);
            ps.setString(2,passw_user);
            rs=ps.executeQuery();
            if(rs.next()){
                us.setNombre_user(rs.getString("nombre_user"));
                us.setPassw_user(rs.getString("passw_user"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return us;
    }
}
