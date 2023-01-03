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
public class Acciones {
    
   private int id_accion;
   private String accion;
   private String Descripcion_de_accion;
   private String objeto_manipulado;
   private int cantidad_manipulada;

    public Acciones(int id_accion, String accion, String Descripcion_de_accion, String objeto_manipulado, int cantidad_manipulada) {
        this.id_accion = id_accion;
        this.accion = accion;
        this.Descripcion_de_accion = Descripcion_de_accion;
        this.objeto_manipulado = objeto_manipulado;
        this.cantidad_manipulada = cantidad_manipulada;
    }

  

    public int getId_accion() {
        return id_accion;
    }

    public void setId_accion(int id_accion) {
        this.id_accion = id_accion;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getDescripcion_de_accion() {
        return Descripcion_de_accion;
    }

    public void setDescripcion_de_accion(String Descripcion_de_accion) {
        this.Descripcion_de_accion = Descripcion_de_accion;
    }

    public String getObjeto_manipulado() {
        return objeto_manipulado;
    }

    public void setObjeto_manipulado(String objeto_manipulado) {
        this.objeto_manipulado = objeto_manipulado;
    }

    public int getCantidad_manipulada() {
        return cantidad_manipulada;
    }

    public void setCantidad_manipulada(int cantidad_manipulada) {
        this.cantidad_manipulada = cantidad_manipulada;
    }

    public Acciones(){
        
    }
    
}
