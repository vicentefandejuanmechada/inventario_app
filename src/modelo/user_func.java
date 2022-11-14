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
public class user_func {
    Connection conn;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
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
}
