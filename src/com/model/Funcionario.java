package com.model;

public class Funcionario extends Pessoa {

    private String periodo;
    private String usuario;
    private String senha;
    private Enum acesso;
    
    
    public Funcionario() {
    }

    public Funcionario(String nome, String dataNascimento, Documento doc,
            String periodo, String senha, Enum acesso) {
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

    public Enum getAcesso() {
        return acesso;
    }

    public void setAcesso(Enum acesso) {
        this.acesso = acesso;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
        
    
}
