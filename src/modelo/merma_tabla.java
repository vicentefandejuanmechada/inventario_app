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
public class merma_tabla {
    
  private Integer id_merma; 
  private String nombre_prod_mermmado;
  private Integer precio_prod_mermado;
  private Integer id_producto;
  private float cantidad_productos_mermados;

    public Integer getId_merma() {
        return id_merma;
    }

    public void setId_merma(Integer id_merma) {
        this.id_merma = id_merma;
    }

    public String getNombre_prod_mermmado() {
        return nombre_prod_mermmado;
    }

    public void setNombre_prod_mermmado(String nombre_prod_mermmado) {
        this.nombre_prod_mermmado = nombre_prod_mermmado;
    }

    public Integer getPrecio_prod_mermado() {
        return precio_prod_mermado;
    }

    public void setPrecio_prod_mermado(Integer precio_prod_mermado) {
        this.precio_prod_mermado = precio_prod_mermado;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public float getCantidad_productos_mermados() {
        return cantidad_productos_mermados;
    }

    public void setCantidad_productos_mermados(float cantidad_productos_mermados) {
        this.cantidad_productos_mermados = cantidad_productos_mermados;
    }

    public merma_tabla(Integer id_merma, String nombre_prod_mermmado, Integer precio_prod_mermado, Integer id_producto, float cantidad_productos_mermados) {
        this.id_merma = id_merma;
        this.nombre_prod_mermmado = nombre_prod_mermmado;
        this.precio_prod_mermado = precio_prod_mermado;
        this.id_producto = id_producto;
        this.cantidad_productos_mermados = cantidad_productos_mermados;
    }
    
    
}
