package com.model;

public class Funcionario extends Pessoa {

    private String periodo;
    private String usuario;
    private String senha;
    private Grupo grupo;
    
    public Funcionario() {
    }

    public Funcionario(String nome, String dataNascimento, Documento doc,
            String periodo, String senha, Grupo grupo) {
        super(nome, dataNascimento, doc);
        this.periodo = periodo;
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

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
        
    
}
