package Entities.Produccion;

public class Fabrica {
    private int id;
    private String pais;
    private String ciudad;
    private int capacidad;
    private String nivel_automatizacion;

    public Fabrica(int id, String pais, String ciudad, int capacidad, String nivel_automatizacion) {
        this.id = id;
        this.pais = pais;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
        this.nivel_automatizacion = nivel_automatizacion;
    }

    // Getters and Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getNivel_automatizacion() {
        return nivel_automatizacion;
    }

    public void setNivel_automatizacion(String nivel_automatizacion) {
        this.nivel_automatizacion = nivel_automatizacion;
    }
}
