package com.utils;

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
                .append("Imagem", visitante.getImagem());
        return documento;
    }

    private Document toDocument(Funcionario funcionario) {
        Document documento = new Document("Nome", funcionario.getNome())
                .append("Data de Nascimento", funcionario.getDataNascimento())
                .append("Documento", funcionario.getDoc().getNumeroDoc())
                .append("Tipo", funcionario.getDoc().getTipoDoc())
                .append("", funcionario.getPeriodo())
                .append("", funcionario.getUsuario())
                .append("", funcionario.getSenha())
                .append("", funcionario.getAcesso());
        return documento;
    }

    public ArrayList<Visitante> buscaNome(String nome) {
        MongoClient client = MongoClients.create(CONNECTION);
        MongoDatabase database = client.getDatabase("Visitante");
        MongoCollection<Document> visitantes;
        visitantes = database.getCollection("Visitantes");

        ArrayList<Document> result = (ArrayList<Document>) visitantes.find()
                .filter(regex("Nome", nome)).into(new ArrayList<Document>());

        client.close();
        return toArrayList(result);
    }

    private ArrayList<Visitante> toArrayList(ArrayList<Document> visitantes) {
        ArrayList<Visitante> listaVisitantes = new ArrayList();
        Visitante visitante = new Visitante();
        for (Document d : visitantes) {
            listaVisitantes.add(parseDocument(d));
        }
    }

    private Visitante parseDocument(Document d) {
        Visitante visitante = new Visitante();
        String jsonString = d.toJson();
        d = Document.parse(jsonString);;
        visitante.setDataNascimento((String) d.get("Data de Nascimento"));
        visitante
        d.get("Documento"));
        ((String) d.get("Tipo"));
        ((String) d.get("Nome da Mãe"));
        (String) d.get("Paciente"));
        (String) d.get("Local"));
        (String) d.get("Vínculo"));
        setImage(B64.decodeToImage((String) d.get("Imagem")));
    }

    public Document buscaDoc(String doc) {
        database1 = DB.getDatabase("Visitante");
        collection = database1.getCollection("Visitante");
        Document busca = new Document("Documento", doc);
        Object encontrado = collection.find(busca).first();
        return (Document) encontrado;
    }

    public Document teste(FindIterable<Document> teste) {
        database1 = DB.getDatabase("Visitante");
        collection = database1.getCollection("Visitante");
        FindIterable<Document> entrada = teste;
        Document encontrado = entrada.first();
        return encontrado;
    }

    public long contadorBusca(String nome) {
        database1 = DB.getDatabase("Visitante");
        collection = database1.getCollection("Visitante");
        long contador = collection.countDocuments(regex("Nome", nome));
        return contador;
    }
}
