package com.model;

public class Funcionario extends Pessoa {

    private String periodo;
    private String senha;

    public Funcionario() {
    }

    public Funcionario(String nome, String dataNascimento, Documento doc,
            String periodo, String senha) {
        super(nome, dataNascimento, doc);
        this.periodo = periodo;
        this.senha = senha;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }
}
