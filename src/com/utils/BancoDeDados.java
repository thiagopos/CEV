package com.utils;

import com.model.Documento;
import com.model.Funcionario;
import com.model.Visitante;
import com.mongodb.client.*;
import static com.mongodb.client.model.Filters.*;
import java.util.ArrayList;
import org.bson.Document;


public class BancoDeDados {
    
    private final String CONNECTION = "mongodb://localhost:27017";        
    
    public void add(Visitante visitante) {
        MongoClient client = MongoClients.create(CONNECTION);
        MongoDatabase database = client.getDatabase("Visitante");
        MongoCollection<Document> visitantes;
        visitantes = database.getCollection("Visitantes");
        visitantes.insertOne(toDocument(visitante));
        client.close();
    }    
    
    public void add(Funcionario funcionario) {
        MongoClient client = MongoClients.create(CONNECTION);
        MongoDatabase database = client.getDatabase("Funcionario");
        MongoCollection<Document> funcionarios;
        funcionarios = database.getCollection("Funcionarios");
        funcionarios.insertOne(toDocument(funcionario));
        client.close();        
    }    
   
    private Document toDocument(Visitante visitante) {
        Document documento = new Document("Nome", visitante.getNome())
                .append("Data de Nascimento", visitante.getDataNascimento())
                .append("Documento", visitante.getDoc().getNumeroDoc())
                .append("Tipo", visitante.getDoc().getTipoDoc())
                .append("Nome da Mãe", visitante.getNomeMae())
                .append("Paciente", visitante.getPaciente())
                .append("Local", visitante.getLocal())
                .append("Vínculo", visitante.getVinculo())
                .append("Data de Entrada", visitante.getDataEntrada())
                .append("Imagem", B64.encodeToString(visitante.getImagem(), "JPG"));
        return documento;
    }
    
    private Document toDocument(Funcionario funcionario) {
        Document documento = new Document("Nome", funcionario.getNome())
                .append("Data de Nascimento", funcionario.getDataNascimento())
                .append("Documento", funcionario.getDoc().getNumeroDoc())
                .append("Tipo", funcionario.getDoc().getTipoDoc())
                .append("Periodo", funcionario.getPeriodo())
                .append("Usuario", funcionario.getUsuario())
                .append("Senha", funcionario.getSenha())
                .append("Grupo", funcionario.getGrupo());
        return documento;
    }
   
    public ArrayList<Visitante> buscaNome(String nome) {
        MongoClient client = MongoClients.create(CONNECTION);
        MongoDatabase database = client.getDatabase("Visitante");
        MongoCollection<Document> visitantes;
        visitantes = database.getCollection("Visitantes");

        ArrayList<Document> result = (ArrayList<Document>) visitantes.find()
                .filter(regex("Nome", nome)).into(new ArrayList<>());

        client.close();
        return toArrayList(result);
    }
    
    private ArrayList<Visitante> toArrayList(ArrayList<Document> visitantes) {
        
        ArrayList<Visitante> listaVisitantes = new ArrayList();
        
        visitantes.forEach((d) -> {
            listaVisitantes.add(parseVisitante(d));
        });
                
        return listaVisitantes;
        
    } 
    
    private Funcionario parseFuncionario(Document d) {      
               
        d = Document.parse(d.toJson());
        Funcionario funcionario = new Funcionario(
            (String) d.get("Nome"),
            (String) d.get("Data de Nascimento"),
            new Documento(
                (String) d.get("Documento"), 
                (String) d.get("Tipo")),
            (String) d.get("Periodo"),
            (String) d.get("Usuario"),
            (String) d.get("Senha"),
            (String) d.get("Grupo")            
        );
        
        return funcionario;
        
    }
    
    private Visitante parseVisitante(Document d) {      
               
        d = Document.parse(d.toJson());
        Visitante visitante = new Visitante(
            (String) d.get("Nome"),
            (String) d.get("Data de Nascimento"),
            new Documento(
                (String) d.get("Documento"), 
                (String) d.get("Tipo")),
            (String) d.get("Nome da Mãe"),
            (String) d.get("Paciente"),
            (String) d.get("Local"),
            (String) d.get("Vínculo"),
            (String) d.get("Data de Entrada"),
            B64.decodeToImage((String) d.get("Imagem"))           
        );
        
        return visitante;
        
    }
    
    public Funcionario login(String usuario, String senha){
        MongoClient client = MongoClients.create(CONNECTION);
        MongoDatabase database = client.getDatabase("Funcionario");
        MongoCollection<Document> funcionarios;
        funcionarios = database.getCollection("Funcionarios");
        
        Document result = funcionarios.find().filter(
            new Document("Usuario", usuario).append("Senha", senha)).first();
        if(result!=null)
           return parseFuncionario(result);
        return null;
    }
    
    public boolean usuarioExistente(String usuario){
        MongoClient client = MongoClients.create(CONNECTION);
        MongoDatabase database = client.getDatabase("Funcionario");
        MongoCollection<Document> funcionarios;
        funcionarios = database.getCollection("Funcionarios");
        
        try{
            Document result = funcionarios.find().filter(
            new Document("Usuario", usuario)).first();
            return (!result.isEmpty());
        } catch(NullPointerException ex){
            return false;
        }      
       
    }
    
    public Visitante buscaDocumento(String documento) {
        MongoClient client = MongoClients.create(CONNECTION);
        MongoDatabase database = client.getDatabase("Visitante");
        MongoCollection<Document> visitantes;
        visitantes = database.getCollection("Visitantes");        
        Document encontrado = visitantes.find(
            new Document("Documento", documento)).first();
        return parseVisitante(encontrado);
    }    
    
}
