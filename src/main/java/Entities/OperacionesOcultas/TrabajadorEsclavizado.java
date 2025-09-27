package Entities.OperacionesOcultas;

import Entities.Produccion.Fabrica;

import java.util.Date;

public class TrabajadorEsclavizado {
    private int id;
    private String nombre;
    private String pais_origen;
    private int edad;
    private Date fecha_captura;
    private String salud;
    private Fabrica asignado;

    public TrabajadorEsclavizado(int id, String nombre, String pais_origen, int edad, Date fecha_captura, String salud, Fabrica asignado) {
        this.id = id;
        this.nombre = nombre;
        this.pais_origen = pais_origen;
        this.edad = edad;
        this.fecha_captura = fecha_captura;
        this.salud = salud;
        this.asignado = asignado;
    }

    // Getters and Setters


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

    public String getPais_origen() {
        return pais_origen;
    }

    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFecha_captura() {
        return fecha_captura;
    }

    public void setFecha_captura(Date fecha_captura) {
        this.fecha_captura = fecha_captura;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }

    public Fabrica getAsignado() {
        return asignado;
    }

    public void setAsignado(Fabrica asignado) {
        this.asignado = asignado;
    }

    // functions of the class

    public void asignarFabrica(){

    }
}
