package Entities.OperacionesOcultas;

import java.util.Date;

public class RegistroEscalvos {
    private Date ultimo_acceso;
    private String nivel_cifrado;

    public RegistroEscalvos(Date ultimo_acceso, String nivel_cifrado) {
        this.ultimo_acceso = ultimo_acceso;
        this.nivel_cifrado = nivel_cifrado;
    }

    // Getters and Setters


    public Date getUltimo_acceso() {
        return ultimo_acceso;
    }

    public void setUltimo_acceso(Date ultimo_acceso) {
        this.ultimo_acceso = ultimo_acceso;
    }

    public String getNivel_cifrado() {
        return nivel_cifrado;
    }

    public void setNivel_cifrado(String nivel_cifrado) {
        this.nivel_cifrado = nivel_cifrado;
    }

    // functions of the class

    public void registrarTurno(){

    }
}
