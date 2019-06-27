/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utils;

//Importações
import com.model.Visitante;
import com.mongodb.BasicDBObject;
import com.mongodb.client.*;
import static com.mongodb.client.model.Filters.*;
import org.bson.Document;

/**
 *
 * @author Administrador
 */
public class BancoDeDados {

    //atributos
    private MongoDatabase database;
    private Document documento;
    private MongoCollection<BasicDBObject> collection1;
    private MongoCollection<Document> collection;
    private MongoClient DB;
    
    //construtor
    public BancoDeDados() {
    }

    public void iniciar() {
        DB = MongoClients.create("mongodb://localhost:27017");
    }

    public Document inserir(Visitante visitante) {
        database = DB.getDatabase("Visitante");
        Document documento = new Document("Nome", visitante.getNome())
                .append("Data de Nascimento", visitante.getDataNascimento())
                .append("Documento", visitante.getDoc().getNumeroDoc())
                .append("Tipo", visitante.getDoc().getTipoDoc())
                .append("Nome da Mãe", visitante.getNomeMae())
                .append("Paciente", visitante.getPaciente())
                .append("Local", visitante.getLocal())
                .append("Vínculo", visitante.getVinculo())
                .append("Data de Entrada", visitante.getDataEntrada())
                .append("Imagem", visitante.getImagem());
        return documento;
    }

    public void Add(Document doc) {
        collection = database.getCollection("Visitante");
        collection.insertOne(doc);
    }

    public FindIterable<Document> buscaNome(String nome) {
        database = DB.getDatabase("Visitante");
        collection = database.getCollection("Visitante");
        FindIterable<Document> busca = collection.find().filter(regex("Nome", nome));
        return busca;
    }
    
    public Document buscaDoc(String doc){
        database = DB.getDatabase("Visitante");
        collection = database.getCollection("Visitante");
        Document busca = new Document("Documento", doc);
        Object encontrado = collection.find(busca).first();        
        return (Document)encontrado;
    }
    
    public Document teste(FindIterable<Document> teste){        
        database = DB.getDatabase("Visitante");
        collection = database.getCollection("Visitante");
        FindIterable<Document> entrada = teste;
        Document encontrado = entrada.first();
        return encontrado;
    }
    /*
    public AggregateIterable<Document> contadorBusca(String nome) {
        database = DB.getDatabase("Visitante");
        collection = database.getCollection("Visitante");
        AggregateIterable<Document> busca = collection.aggregate(Arrays.asList(
                Aggregates.match(regex("Nome", nome)),
                Aggregates.count()));
        return busca;
    }
    */
    public long contadorBusca(String nome){
        database = DB.getDatabase("Visitante");
        collection = database.getCollection("Visitante");
        long contador = collection.countDocuments(regex("Nome", nome));
        return contador;
    }
}
