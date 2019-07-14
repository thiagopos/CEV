package com.utils;

import com.google.gson.Gson;
import com.model.Funcionario;
import com.model.Paciente;
import com.model.Visita;
import com.model.Visitante;
import com.mongodb.client.*;
import static com.mongodb.client.model.Filters.*;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

public class BancoDeDados {

    MongoClient client = MongoClients.create("mongodb://localhost:27017");
    MongoDatabase database = client.getDatabase("CEV");
    private final Gson gson = new Gson();
    
    //refatorar
    public Paciente buscaRH(String rh) {
        MongoCollection<Document> visitas;
        visitas = database.getCollection("Visitas");
        Document encontrado = visitas.find(
                new Document("RH", rh)).first();

        if (encontrado != null) {            
            return parsePaciente(encontrado);
        } else {
            return buscaBancoAGHU(rh);
        }
    }
    //refatorar
    public List<Visitante> busca(String rh) {        
        MongoCollection<Document> visitantes;
        visitantes = database.getCollection("Visitas");

        Document result = visitantes.find(new Document("registroHospitalar", rh)).first();
                      
        Paciente encontrado = gson.fromJson(result.toJson(), Paciente.class);
        
        ArrayList<Visitante> v = new ArrayList();
        
        encontrado.getVisitas().forEach((a) -> {
            v.add(a.getVisitante());
        });
        
        return v;
    }

    public Paciente buscaBancoAGHU(String rh) {

        MongoDatabase d = client.getDatabase("Paciente");
        MongoCollection<Document> pacientes;
        pacientes = d.getCollection("Pacientes");
        Document encontrado = pacientes.find(
                new Document("RH", rh)).first();
        return parsePaciente(encontrado);
    }

    public boolean usuarioExistente(String usuario) {

        MongoCollection<Document> funcionarios;
        funcionarios = database.getCollection("Funcionarios");

        Document result = funcionarios.find(
                new Document("usuario", usuario)).first();
        return result != null;
    }  

    public void add(Paciente paciente) {
        MongoCollection<Document> visitas;
        visitas = database.getCollection("Visitas");
        Document existente = visitas.find(
                new Document("registroHospitalar", paciente.getRegistroHospitalar())).first();
        if (existente != null) {            
            Paciente aux = gson.fromJson(existente.toJson(), Paciente.class);
            aux.getVisitas().add(paciente.getVisitas().get(0));
            visitas.findOneAndDelete(
                    new Document("registroHospitalar", paciente.getRegistroHospitalar()));
            visitas.insertOne(Document.parse(gson.toJson(aux)));
            add(paciente.getVisitas().get(0).getVisitante());
        } else {
            visitas.insertOne(Document.parse(gson.toJson(paciente)));
            add(paciente.getVisitas().get(0).getVisitante());
        }

    }

    public void add(Visitante visitante) {

        MongoCollection<Document> visitantes;
        visitantes = database.getCollection("Visitantes");
        visitantes.insertOne(Document.parse(gson.toJson(visitante)));

    }

    public void add(Funcionario funcionario) {

        MongoCollection<Document> funcionarios;
        funcionarios = database.getCollection("Funcionarios");
        funcionarios.insertOne(Document.parse(gson.toJson(funcionario)));

    }  
    

    public ArrayList<Visitante> buscaNome(String nome) {

        MongoCollection<Document> visitantes;
        visitantes = database.getCollection("Visitantes");

        ArrayList<Document> result = (ArrayList<Document>) visitantes.find()
                .filter(regex("nome", nome)).into(new ArrayList<>());

        return toArrayList(result);
    }

    private ArrayList<Visitante> toArrayList(ArrayList<Document> visitantes) {

        ArrayList<Visitante> listaVisitantes = new ArrayList();

        visitantes.forEach((d) -> {
            listaVisitantes.add(
                    gson.fromJson(d.toJson(), Visitante.class));
        });

        return listaVisitantes;

    }

    public Funcionario login(String usuario, String senha) {

        MongoCollection<Document> funcionarios;
        funcionarios = database.getCollection("Funcionarios");

        Document result = funcionarios.find().filter(
                new Document("usuario", usuario).append("senha", senha)).first();

        if (result != null) {
            return gson.fromJson(result.toJson(), Funcionario.class);
        }
        return null;
    }

    private Paciente parsePaciente(Document p) {
        List<Visita> lista = new ArrayList();
        lista.add(new Visita());
        p = Document.parse(p.toJson());
        Paciente paciente = new Paciente(
                (String) p.get("Nome"),
                (String) p.get("RH"),
                lista
        );

        return paciente;

    }

    public Visitante buscaDocumento(String documento) {

        MongoCollection<Document> visitantes;
        visitantes = database.getCollection("Visitantes");
        Document encontrado = visitantes.find(
                new Document("documento", documento)).first();
        return gson.fromJson(encontrado.toJson(), Visitante.class);
    }

}
