/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.utils.BancoDeDados;
import com.model.Documento;
import com.model.Funcionario;
import javax.swing.*;
import org.bson.Document;

/**
 *
 * @author x002559
 */
public class JPInicio extends javax.swing.JPanel {

    /**
     * Creates new form JPInicio
     */    
    MongoClient teste = MongoClients.create("mongodb://localhost:27017");
    JFrame principal = new JFrame();
    JPanel panel = new JPanel();
    JPCadastro painelC = new JPCadastro();
    JPFuncionario painelF = new JPFuncionario();
    private String usuario;
    private String senha;
    private Document busca;
    
    
    public JPInicio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        cmpUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        cmpSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUsuario.setText("Usuário");

        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSenha.setText("Senha");

        btnEntrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblSenha))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmpSenha)
                    .addComponent(cmpUsuario)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEntrar)
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
        
        BancoDeDados bd = new BancoDeDados();
        Documento documento = new Documento();
        
        bd.iniciar();
        
        usuario = cmpUsuario.getText();
        senha = String.valueOf(cmpSenha.getPassword());
        //busca = bd.validacaoFuncionario(usuario, senha);
        if (busca.get("Usuário").equals(usuario) && busca.get("Senha").equals(senha)){
            principal.setContentPane(painelF);
        }
        cmpUsuario.setText("");
        cmpSenha.setText("");
        
    }//GEN-LAST:event_btnEntrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JPasswordField cmpSenha;
    private javax.swing.JTextField cmpUsuario;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
