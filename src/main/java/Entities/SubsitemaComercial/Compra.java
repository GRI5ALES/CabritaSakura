package Entities.SubsitemaComercial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compra {
    private int id;
    private LocalDate fecha;
    private double total;
    private String estado;
    private List<LineaCompra> lineas;

    public Compra(String estado, double total, LocalDate fecha, int id) {
        this.estado = estado;
        this.total = total;
        this.fecha = fecha;
        this.id = id;
        this.lineas = new ArrayList<>();
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

    public List<LineaCompra> getLineas() {
        return lineas;
    }

    public void setLineas(List<LineaCompra> lineas) {
        this.lineas = lineas;
    }

    public void anadirLineaCompra(LineaCompra linea){

        this.lineas.add(linea);

    }
}
