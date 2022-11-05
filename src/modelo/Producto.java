 
package modelo;


public class Producto {
    private int orden_producto;
    private String nombre_producto;
    private int precio_prod;
    private float cantidad_producto;
    private String fecha_vencimiento;
    private String descripcion;

    public int getOrden_producto() {
        return orden_producto;
    }

    public void setOrden_producto(int orden_producto) {
        this.orden_producto = orden_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getPrecio_prod() {
        return precio_prod;
    }

    public void setPrecio_prod(int precio_prod) {
        this.precio_prod = precio_prod;
    }

    public float getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(float cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto(int orden_producto, String nombre_producto, int precio_prod, float cantidad_producto, String fecha_vencimiento, String descripcion) {
        this.orden_producto = orden_producto;
        this.nombre_producto = nombre_producto;
        this.precio_prod = precio_prod;
        this.cantidad_producto = cantidad_producto;
        this.fecha_vencimiento = fecha_vencimiento;
        this.descripcion = descripcion;
    }

    
    public Producto(){
        
    }

    
   
}
