package Entities.GestionUsuarios;

import java.util.Date;

public class AdministradorContenido extends  Usuario {
    private String[] permisos_edicion;
    public AdministradorContenido(
            int id,
            String nombre,
            String email,
            String password_hash,
            String role,
            Date fecha_registro,
            String estado_cuenta
    ){
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

    // Geters and Setters

    public String[] getPermisos_edicion() {
        return permisos_edicion;
    }

    public void setPermisos_edicion(String[] permisos_edicion) {
        this.permisos_edicion = permisos_edicion;
    }

    // functions of the class

    public void editarContenido(){

    }

    public void leerProducto(){

    }

    public void eliminarProducto() {

    }

    public void crearProducto(){
    }

    public void editarProducto(){
    }
}
