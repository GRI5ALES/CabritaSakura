package Entities.SubsitemaComercial;

import java.time.LocalDate;

public class Compra {
    private int id;
    private LocalDate fecha;
    private double total;
    private String estado;

    public Compra(String estado, double total, LocalDate fecha, int id) {
        this.estado = estado;
        this.total = total;
        this.fecha = fecha;
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void anadirLineaCompra(){

    }
}
