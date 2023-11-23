package com.example.prestamo62;

public class Venderr {
    private int idalquiler;
    private String  idpersona;
    private String nombre;
    private String tipo;
    private String estado;

    public Venderr(int idalquiler, String idpersona, String nombre, String tipo, String estado) {
        this.idalquiler = idalquiler;
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.tipo = tipo;
        this.estado = estado;
    }

    public int getIdalquiler() {
        return idalquiler;
    }

    public void setIdalquiler(int idalquiler) {
        this.idalquiler = idalquiler;
    }

    public String getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(String idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}


