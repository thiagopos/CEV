package com.model;

import java.util.Date;

public class Visita {
    private Visitante visitante;
    private String vinculo;
    private Date data;    
    private String local;    
    private Funcionario responsavel;

    public Visita() {
        
    }

    public Visita(Visitante visitante, String vinculo, Date data, String local, Funcionario responsavel) {
        this.visitante = visitante;
        this.vinculo = vinculo;
        this.data = data;
        this.local = local;
        this.responsavel = responsavel;
    }

    public String getVinculo() {
        return vinculo;
    }

    public void setVinculo(String vinculo) {
        this.vinculo = vinculo;
    }    

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
    }

    public Date getData() {        
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Funcionario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Funcionario responsavel) {
        this.responsavel = responsavel;
    }
    
}
