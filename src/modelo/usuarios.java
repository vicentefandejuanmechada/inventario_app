/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author admin1
 */
public class usuarios {
  private Integer id_user;
  private Integer id_del_tipo_user;
  private String nombre_user;
  private String passw_user;
  private String  e_mail_user;

    public usuarios(Integer id_user, Integer id_del_tipo_user, String nombre_user, String passw_user, String e_mail_user) {
        this.id_user = id_user;
        this.id_del_tipo_user = id_del_tipo_user;
        this.nombre_user = nombre_user;
        this.passw_user = passw_user;
        this.e_mail_user = e_mail_user;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public Integer getId_del_tipo_user() {
        return id_del_tipo_user;
    }

    public void setId_del_tipo_user(Integer id_del_tipo_user) {
        this.id_del_tipo_user = id_del_tipo_user;
    }

    public String getNombre_user() {
        return nombre_user;
    }

    public void setNombre_user(String nombre_user) {
        this.nombre_user = nombre_user;
    }

    public String getPassw_user() {
        return passw_user;
    }

    public void setPassw_user(String passw_user) {
        this.passw_user = passw_user;
    }

    public String getE_mail_user() {
        return e_mail_user;
    }

    public void setE_mail_user(String e_mail_user) {
        this.e_mail_user = e_mail_user;
    }
 
    public usuarios(){
        
    }

}
