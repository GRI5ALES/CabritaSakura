package Entities.Produccion;

public class Desarrolladorproducto {
    private int id;
    private String especialidad;

    public Desarrolladorproducto(int id, String especialidad) {
        this.id = id;
        this.especialidad = especialidad;
    }

    // Getters and Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
