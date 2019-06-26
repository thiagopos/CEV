package com.model;

public class Documento {

    private String numeroDoc;
    private String tipoDoc;

    public Documento() {
    }

    public Documento(String numero, String tipo) {
        this.numeroDoc = numero;
        this.tipoDoc = tipo;
    }

    public String getNumeroDoc() {
        return numeroDoc;
    }

    public void setNumeroDoc(String numero) {
        this.numeroDoc = numero;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipo) {
        this.tipoDoc = tipo;
    }

}
