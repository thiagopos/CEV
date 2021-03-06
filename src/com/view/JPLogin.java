package com.view;

import com.model.Funcionario;
import com.sun.glass.events.KeyEvent;
import com.utils.BancoDeDados;

public class JPLogin extends javax.swing.JPanel {
    private final JFPrincipal principal;
    
    public JPLogin(JFPrincipal principal) {
        initComponents();
        this.principal = principal;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        cmpUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        cmpSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnPrimeiroAcesso = new javax.swing.JButton();

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUsuario.setText("Usuário");

        cmpUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSenha.setText("Senha");

        cmpSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmpSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmpSenhaKeyPressed(evt);
            }
        });

        btnEntrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnPrimeiroAcesso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPrimeiroAcesso.setText("Primeiro acesso ?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmpSenha)
                    .addComponent(cmpUsuario)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblSenha))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnPrimeiroAcesso, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrimeiroAcesso)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        BancoDeDados bd = new BancoDeDados();
        String usuario = cmpUsuario.getText().trim();
        String senha = new String(cmpSenha.getPassword());
        Funcionario logado = bd.login(usuario, senha);        
        principal.setFuncionarioLogado(logado); 
        principal.acesso();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void cmpSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnEntrar.doClick();
        }
    }//GEN-LAST:event_cmpSenhaKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnPrimeiroAcesso;
    private javax.swing.JPasswordField cmpSenha;
    private javax.swing.JTextField cmpUsuario;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
