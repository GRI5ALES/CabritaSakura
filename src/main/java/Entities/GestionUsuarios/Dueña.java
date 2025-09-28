package Entities.GestionUsuarios;

import java.util.Date;

public class Dueña extends Usuario {

    private String clave_maestra;
    private Date fecha_coronacion;

    public Dueña(
            int id,
            String nombre,
            String email,
            String password_hash,
            String role,
            String fecha_registro,
            String estado_cuenta
    ) {
        super(
                id,
                nombre,
                email,
                password_hash,
                role,
                fecha_registro,
                estado_cuenta
        );
    }

    // Getters and Setters

    public String getClave_maestra() {
        return clave_maestra;
    }

    public void setClave_maestra(String clave_maestra) {
        this.clave_maestra = clave_maestra;
    }

    public Date getFecha_coronacion() {
        return fecha_coronacion;
    }

    public void setFecha_coronacion(Date fecha_coronacion) {
        this.fecha_coronacion = fecha_coronacion;
    }

    // functions of the class

    public void editarRegistroEsclavos(){

    }

    public void leerRegistroEsclavos(){

    }

    public void eliminarRegistroEsclavos() {

    }

    public void crearRegistroEsclavos(){
    }

}
