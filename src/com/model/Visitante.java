package com.model;

import java.awt.image.BufferedImage;

public class Visitante extends Pessoa {

    private String local;
    private String vinculo;
    private String paciente;
    private String nomeMae;
    private String dataEntrada;
    private BufferedImage imagem;

    public Visitante() {
    }

    public Visitante(String nome, String dataNascimento, Documento doc,
                     String nomeMae, String paciente, String local, 
                     String vinculo, String dataEntrada, BufferedImage imagem) {
        super(nome, dataNascimento, doc);
        this.nomeMae = nomeMae;
        this.paciente = paciente;
        this.local = local;
        this.vinculo = vinculo;
        this.dataEntrada = dataEntrada;
        this.imagem = imagem;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public BufferedImage getImagem() {
        return imagem;
    }

    public void setImagem(BufferedImage imagem) {
        this.imagem = imagem;
    }    
    
}
