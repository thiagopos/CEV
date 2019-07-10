package com.model;

import java.util.List;

public class Paciente extends Pessoa {
    
    private String registroHospitalar;
    private char sexoBiologico;
    private List<Visita> visitas;
    
    public Paciente() {
        
    }

    public Paciente(String registroHospitalar, char sexoBiologico, List<Visita> visitas, String nome, String dataNascimento, Documento documento) {
        super(nome, dataNascimento, documento);
        this.registroHospitalar = registroHospitalar;
        this.sexoBiologico = sexoBiologico;
        this.visitas = visitas;
    }
    
    public String getRegistroHospitalar() {
        return registroHospitalar;
    }

    public void setRegistroHospitalar(String registroHospitalar) {
        this.registroHospitalar = registroHospitalar;
    }

    public char getSexoBiologico() {
        return sexoBiologico;
    }

    public void setSexoBiologico(char sexoBiologico) {
        this.sexoBiologico = sexoBiologico;
    }    

    public List<Visita> getVisitas() {
        return visitas;
    }

    public void setVisitas(List<Visita> visitas) {
        this.visitas = visitas;
    }  
    
}
