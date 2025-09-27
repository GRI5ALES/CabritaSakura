package Entities.SubsitemaComercial;

public class LineaCarrito {
    private double subtotal;
    private int cantidad;

    public LineaCarrito(double subtotal, int cantidad) {
        this.subtotal = subtotal;
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void anadirProducto(){

    }
}
