package Entities.SubsitemaComercial;

import Entities.GestionUsuarios.Usuario;

import java.util.List;

public class Cliente extends Usuario {
    private String direccion_envio;
    private int telefono;
    private List<MetodoPago> metodos_pago;


    public Cliente(int id, String nombre, String email, String password_hash, String role, String fecha_registro, String estado_cuenta, String direccion_envio, int telefono, List<MetodoPago> metodos_pago) {
        super(id, nombre, email, password_hash, role, fecha_registro, estado_cuenta);
        this.direccion_envio = direccion_envio;
        this.telefono = telefono;
        this.metodos_pago = metodos_pago;
    }

    public Cliente(String nombre, String email, String password_hash, String role) {
        super(nombre, email, password_hash,  role);
    }

    public String getDireccion_envio() {
        return direccion_envio;
    }

    public void setDireccion_envio(String direccion_envio) {
        this.direccion_envio = direccion_envio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<MetodoPago> getMetodos_pago() {
        return metodos_pago;
    }

    public void setMetodos_pago(List<MetodoPago> metodos_pago) {
        this.metodos_pago = metodos_pago;
    }

    public void comprar(){

    }

    public void asignarCarrito(){

    }

    public void asignarMetodoPago(){

    }

    public String getPassword() {
        return this.getPassword_hash();
    }

    public String getInfo(){
        return "Nombre: " + this.getNombre() + "\nemail: " + this.getEmail() + "\npassword: " + this.getPassword_hash();
    }
}
