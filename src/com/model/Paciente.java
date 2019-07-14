package com.model;

import java.util.List;

public class Paciente{
    
    private String nome;
    private String registroHospitalar;
    private List<Visita> visitas;   
    
    public Paciente() {
    }

    public Paciente(String nome, String registroHospitalar, List<Visita> visitas) {
        this.nome = nome;
        this.registroHospitalar = registroHospitalar;
        this.visitas = visitas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistroHospitalar() {
        return registroHospitalar;
    }

    public void setRegistroHospitalar(String registroHospitalar) {
        this.registroHospitalar = registroHospitalar;
    }

    public List<Visita> getVisitas() {
        return visitas;
    }

    public void setVisitas(List<Visita> visitas) {
        this.visitas = visitas;
    }   
    
}
