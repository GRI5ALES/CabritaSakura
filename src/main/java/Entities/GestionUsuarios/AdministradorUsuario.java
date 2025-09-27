package Entities.GestionUsuarios;

import java.util.Date;

public class AdministradorUsuario extends Usuario{
    private String nivel_acceso;
    public AdministradorUsuario(
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

    // Getters and Setters

    public String getNivel_acceso() {
        return nivel_acceso;
    }

    public void setNivel_acceso(String nivel_acceso) {
        this.nivel_acceso = nivel_acceso;
    }

    // functions of the class

    public void editarUsuario(){

    }

    public void eliminarUsuario() {

    }

    public void crearUsuario(){
    }

    public void leerUsuario(){
    }


}
