package Entities.SubsitemaComercial;

import java.time.LocalDate;

public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private int unidades_stock;
    private LocalDate fecha_lanzamiento;
    private Categoria categoria;

    public Producto(int id, String nombre, String descripcion, int unidades_stock, LocalDate fecha_lanzamiento, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unidades_stock = unidades_stock;
        this.fecha_lanzamiento = fecha_lanzamiento;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUnidades_stock() {
        return unidades_stock;
    }

    public void setUnidades_stock(int unidades_stock) {
        this.unidades_stock = unidades_stock;
    }

    public LocalDate getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(LocalDate fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
