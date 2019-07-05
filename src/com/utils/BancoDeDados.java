package com.utils;

import com.model.Documento;
import com.model.Funcionario;
import com.model.Visitante;
import com.mongodb.client.*;
import static com.mongodb.client.model.Filters.*;
import java.util.ArrayList;
import org.bson.Document;

/*  A refatoração desta classe se fez necessária para que as demais 
classes do projeto não tivessem que tratar da camada de banco de dados,
como a manipulação de objetos do tipo Document ou tratar a conexão com o
banco de dados.
    Os metodos add() são responsáveis por receber os objetos, iniciar a
conexão com o banco de dados, persistir os dados e fechar a conexão.
    Ainda não foram implementados os objetos que farão os updates nos dados
cadastrados de visitente, e a possibilidade de deletar cadastros de funcionários,
algo que ainda não foi pensado no modelo (my fault).
    Também será implementado um método que faz a busca pelo usuario e senha do 
funcionário, de forma que desonere a classe JPInicio que esta responsavel por 
todo o tratamento.
    Essa será a unica classe que importa os pacotes do MongoDB, quando isso 
for possível saberemos que o código esta refatorado.
*/


public class BancoDeDados {
    
    private final String CONNECTION = "mongodb://localhost:27017";
        
    //ADD VISITANTE      
    public void add(Visitante visitante) {
        MongoClient client = MongoClients.create(CONNECTION);
        MongoDatabase database = client.getDatabase("Visitante");
        MongoCollection<Document> visitantes;
        visitantes = database.getCollection("Visitantes");
        visitantes.insertOne(toDocument(visitante));
        client.close();
    }
    //ADD FUNCIONARIO 
    public void add(Funcionario funcionario) {
        MongoClient client = MongoClients.create(CONNECTION);
        MongoDatabase database = client.getDatabase("Funcionario");
        MongoCollection<Document> funcionarios;
        funcionarios = database.getCollection("Funcionarios");
        funcionarios.insertOne(toDocument(funcionario));
        client.close();
        System.out.println("Funcionario adicionado");
    }
    
    //CONVERTE VISITANTE PARA DOCUMENT
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
    //CONVERTE VISITANTE PARA DOCUMENT
    private Document toDocument(Funcionario funcionario) {
        Document documento = new Document("Nome", funcionario.getNome())
                .append("Data de Nascimento", funcionario.getDataNascimento())
                .append("Documento", funcionario.getDoc().getNumeroDoc())
                .append("Tipo", funcionario.getDoc().getTipoDoc())
                .append("Periodo", funcionario.getPeriodo())
                .append("Usuario", funcionario.getUsuario())
                .append("Senha", funcionario.getSenha());
                //.append("Acesso", funcionario.getGrupo());
        return documento;
    }
    //BUSCA NOME REGEX
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
    
    //CRIA ARRAYLIST DE OBJETOS
    private ArrayList<Visitante> toArrayList(ArrayList<Document> visitantes) {
        
        ArrayList<Visitante> listaVisitantes = new ArrayList();
        
        for (Document d : visitantes)
            listaVisitantes.add(parseDocument(d));
                
        return listaVisitantes;
        
    }
    
    // FAZ O PARSE DE VISITANTES
    private Visitante parseDocument(Document d) {      
               
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
            (String) d.get("Imagem")           
        );
        
        return visitante;
        
    }
    
    //DAQUI PRA FRENTE NADA FEITO
    
    public Document buscaDoc(String documento) {
        MongoClient client = MongoClients.create(CONNECTION);
        MongoDatabase database = client.getDatabase("Visitante");
        MongoCollection<Document> visitantes;
        visitantes = database.getCollection("Visitantes");        
        Object encontrado = visitantes.find(
            new Document("Documento", documento)).first();
        return (Document) encontrado;
    }
    
    /*

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
    } */
}
