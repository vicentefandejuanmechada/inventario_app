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
public class Ventas {
    private int id_venta;
    private String nombre_del_prodvendido;
    private int id_prod;
    private int precio_prod;
    private int total_venta; 
    private int Cantidad_del_producto;

    public Ventas(int id_venta, String nombre_del_prodvendido, int id_prod, int precio_prod, int total_venta, int Cantidad_del_producto) {
        this.id_venta = id_venta;
        this.nombre_del_prodvendido = nombre_del_prodvendido;
        this.id_prod = id_prod;
        this.precio_prod = precio_prod;
        this.total_venta = total_venta;
        this.Cantidad_del_producto = Cantidad_del_producto;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getNombre_del_prodvendido() {
        return nombre_del_prodvendido;
    }

    public void setNombre_del_prodvendido(String nombre_del_prodvendido) {
        this.nombre_del_prodvendido = nombre_del_prodvendido;
    }

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public int getPrecio_prod() {
        return precio_prod;
    }

    public void setPrecio_prod(int precio_prod) {
        this.precio_prod = precio_prod;
    }

    public int getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(int total_venta) {
        this.total_venta = total_venta;
    }

    public int getCantidad_del_producto() {
        return Cantidad_del_producto;
    }

    public void setCantidad_del_producto(int Cantidad_del_producto) {
        this.Cantidad_del_producto = Cantidad_del_producto;
    }

   
      public Ventas(){
        
    }
    
}
