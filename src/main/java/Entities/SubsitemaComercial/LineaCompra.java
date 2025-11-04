package Entities.SubsitemaComercial;

public class LineaCompra {
    private int cantidad;
    private double precio_unitario;
    private double subtotal;
    private Producto producto;

    public LineaCompra(int cantidad, Producto p) {
        this.cantidad = cantidad;
        this.producto = p;
    }




    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario() {
        this.precio_unitario = producto.getPrecio_unitario();
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal() {
        this.subtotal = precio_unitario * cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
