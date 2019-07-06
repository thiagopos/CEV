package com.model;

public class Funcionario extends Pessoa {

    private String periodo;
    private String usuario;
    private String senha;
    private String grupo;
    
    public Funcionario() {
    }

    public Funcionario(String nome, String dataNascimento, Documento doc,
            String periodo, String usuario, String senha, String grupo) {
        super(nome, dataNascimento, doc);
        this.periodo = periodo;        
        this.usuario = usuario;
        this.senha = senha;
        this.grupo = grupo;
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

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
        
    
}
