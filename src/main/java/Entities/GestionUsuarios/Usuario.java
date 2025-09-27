package Entities.GestionUsuarios;

import java.util.Date;

public abstract class Usuario {
    private int id;
    private String nombre;
    private String email;
    private String password_hash;
    private String role;
    private Date fecha_registro;
    private String estado_cuenta;

    public Usuario(
            int id,
            String nombre,
            String email,
            String password_hash,
            String role,
            Date fecha_registro,
            String estado_cuenta
    ){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password_hash = password_hash;
        this.role = role;
        this.fecha_registro = fecha_registro;
        this.estado_cuenta = estado_cuenta;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getEstado_cuenta() {
        return estado_cuenta;
    }

    public void setEstado_cuenta(String estado_cuenta) {
        this.estado_cuenta = estado_cuenta;
    }
}
