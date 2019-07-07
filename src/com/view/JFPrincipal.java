package com.view;

import com.model.Funcionario;
import javax.swing.JPanel;

public class JFPrincipal extends javax.swing.JFrame {      
    private Funcionario funcionarioLogado;
    
    public JFPrincipal() {
        initComponents();
        setPanel(new JPLogin(this));
        
    }  
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mnBar = new javax.swing.JMenuBar();
        mnMenu = new javax.swing.JMenu();
        mnItemCadastro = new javax.swing.JMenuItem();
        mnItemFuncionario = new javax.swing.JMenuItem();
        mnItemRelatorio = new javax.swing.JMenuItem();
        mnItemSair = new javax.swing.JMenuItem();
        mnItemDesenvolvedores = new javax.swing.JMenu();
        mnDesenvolvedores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(280, 215));
        setResizable(false);
        getContentPane().setLayout(null);

        mnBar.setMinimumSize(null);
        mnBar.setName(""); // NOI18N

        mnMenu.setText("Menu");

        mnItemCadastro.setText("Visitantes");
        mnItemCadastro.setEnabled(false);
        mnItemCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemCadastroActionPerformed(evt);
            }
        });
        mnMenu.add(mnItemCadastro);

        mnItemFuncionario.setText("Funcionários");
        mnItemFuncionario.setEnabled(false);
        mnItemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemFuncionarioActionPerformed(evt);
            }
        });
        mnMenu.add(mnItemFuncionario);

        mnItemRelatorio.setText("Relatório");
        mnItemRelatorio.setEnabled(false);
        mnMenu.add(mnItemRelatorio);

        mnItemSair.setText("Sair");
        mnItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemSairActionPerformed(evt);
            }
        });
        mnMenu.add(mnItemSair);

        mnBar.add(mnMenu);

        mnItemDesenvolvedores.setText("Sobre");

        mnDesenvolvedores.setText("Desenvolvedores");
        mnItemDesenvolvedores.add(mnDesenvolvedores);

        mnBar.add(mnItemDesenvolvedores);

        setJMenuBar(mnBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnItemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemFuncionarioActionPerformed
        setPanel(new JPFuncionario());
    }//GEN-LAST:event_mnItemFuncionarioActionPerformed

    private void mnItemCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemCadastroActionPerformed
        setPanel(new JPCadastro());
    }//GEN-LAST:event_mnItemCadastroActionPerformed

    private void mnItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemSairActionPerformed
        this.setPanel(new JPLogin(this));
        //System.exit(0);        
    }//GEN-LAST:event_mnItemSairActionPerformed
    
    private void setPanel(JPanel panel){ 
        this.getContentPane().removeAll();
        this.setContentPane(panel);
        this.repaint();
        this.pack();
    }
    
    public static void main(String args[]) {               
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(() -> {
            new JFPrincipal().setVisible(true);
        });
    }

    public Funcionario getFuncionarioLogado() {
        return funcionarioLogado;
    }

    public void setFuncionarioLogado(Funcionario funcionarioLogado) {
        this.funcionarioLogado = funcionarioLogado;
    }
    
    public void acesso(){
        switch(funcionarioLogado.getGrupo()){
            case "Funcionário":                
                mnItemCadastro.setEnabled(true);
                setPanel(new JPCadastro());
                //this.pack();
            break;
            case "Moderador":
            break;                
            case "Admin":
                mnItemFuncionario.setEnabled(true);
                setPanel(new JPFuncionario());
                //this.pack();
            break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar mnBar;
    private javax.swing.JMenuItem mnDesenvolvedores;
    private javax.swing.JMenuItem mnItemCadastro;
    private javax.swing.JMenu mnItemDesenvolvedores;
    private javax.swing.JMenuItem mnItemFuncionario;
    private javax.swing.JMenuItem mnItemRelatorio;
    private javax.swing.JMenuItem mnItemSair;
    private javax.swing.JMenu mnMenu;
    // End of variables declaration//GEN-END:variables
}
