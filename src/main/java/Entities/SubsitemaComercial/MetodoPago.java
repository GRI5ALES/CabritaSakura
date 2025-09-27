package Entities.SubsitemaComercial;

public class MetodoPago {
    private int id;
    private String tipo;
    private String titular;
    private String numero_enmascarado;


    public MetodoPago(int id, String tipo, String titular, String numero_enmascarado) {
        this.id = id;
        this.tipo = tipo;
        this.titular = titular;
        this.numero_enmascarado = numero_enmascarado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero_enmascarado() {
        return numero_enmascarado;
    }

    public void setNumero_enmascarado(String numero_enmascarado) {
        this.numero_enmascarado = numero_enmascarado;
    }
}
