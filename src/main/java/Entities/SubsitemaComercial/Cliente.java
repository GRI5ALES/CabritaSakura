package Entities.SubsitemaComercial;

import Entities.GestionUsuarios.Usuario;

import java.util.Date;
import java.util.List;

public class Cliente extends Usuario {
    private String direccion_envio;
    private int telefono;
    private List<MetodoPago> metodos_pago;


    public Cliente(int id, String nombre, String email, String password_hash, String role, Date fecha_registro, String estado_cuenta, String direccion_envio, int telefono, List<MetodoPago> metodos_pago) {
        super(id, nombre, email, password_hash, role, fecha_registro, estado_cuenta);
        this.direccion_envio = direccion_envio;
        this.telefono = telefono;
        this.metodos_pago = metodos_pago;
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
}
