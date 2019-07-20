package com.model;

import java.awt.image.BufferedImage;

public class Visitante extends Pessoa {    
    
    private String nomeMae;    
    private String imagem;

    public Visitante() {
    }

    public Visitante(String nomeMae, String imagem, String nome, String dataNascimento, Documento documento) {
        super(nome, dataNascimento, documento);
        
        this.nomeMae = nomeMae;        
        this.imagem = imagem;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    
    
}
