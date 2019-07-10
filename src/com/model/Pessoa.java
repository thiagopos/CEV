package com.model;

public abstract class Pessoa {

    private String nome;
    private Documento doc;
    private String dataNascimento;

    public Pessoa() {
    }

    public Pessoa(String nome, String dataNascimento, Documento documento) {
        this.nome = nome;
        this.doc = documento;
        this.dataNascimento = dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public Documento getDoc() {
        return doc;
    }

    public void setDoc(Documento doc) {
        this.doc = doc;
    }
}
