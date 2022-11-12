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
  private String nombre_user;
  private String  correo_contacto;
  private Integer id_tipo_de_user;

    public usuarios(Integer id_user, String nombre_user, String correo_contacto, Integer id_tipo_de_user) {
        this.id_user = id_user;
        this.nombre_user = nombre_user;
        this.correo_contacto = correo_contacto;
        this.id_tipo_de_user = id_tipo_de_user;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public String getNombre_user() {
        return nombre_user;
    }

    public void setNombre_user(String nombre_user) {
        this.nombre_user = nombre_user;
    }

    public String getCorreo_contacto() {
        return correo_contacto;
    }

    public void setCorreo_contacto(String correo_contacto) {
        this.correo_contacto = correo_contacto;
    }

    public Integer getId_tipo_de_user() {
        return id_tipo_de_user;
    }

    public void setId_tipo_de_user(Integer id_tipo_de_user) {
        this.id_tipo_de_user = id_tipo_de_user;
    }
    
}
