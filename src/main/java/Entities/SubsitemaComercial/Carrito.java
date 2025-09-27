package Entities.SubsitemaComercial;

import java.time.LocalDate;

public class Carrito {
    private int id;
    private LocalDate fecha_creacion;


    public Carrito(int id){
        this.id = id;
        this.fecha_creacion = LocalDate.now();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha_creacion(){
        return this.fecha_creacion;
    }

    public void anadirLineaCarrito(){

    }


}
