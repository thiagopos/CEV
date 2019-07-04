package com.view;

import javax.swing.JPanel;

public class JFPrincipal extends javax.swing.JFrame {      
 
    public JFPrincipal() {
        initComponents();
        setPanel(new JPInicio());
    }  
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnMenu = new javax.swing.JMenu();
        mnItemCadastro = new javax.swing.JMenuItem();
        mnItemFuncionario = new javax.swing.JMenuItem();
        mnItemRelatorio = new javax.swing.JMenuItem();
        mnItemSair = new javax.swing.JMenuItem();
        mnItemDesenvolvedores = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(445, 445));
        setPreferredSize(new java.awt.Dimension(500, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jMenuBar1.setMinimumSize(null);
        jMenuBar1.setName(""); // NOI18N

        mnMenu.setText("Menu");

        mnItemCadastro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        mnItemCadastro.setText("Visitantes");
        mnItemCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemCadastroActionPerformed(evt);
            }
        });
        mnMenu.add(mnItemCadastro);

        mnItemFuncionario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        mnItemFuncionario.setText("Funcionários");
        mnItemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItemFuncionarioActionPerformed(evt);
            }
        });
        mnMenu.add(mnItemFuncionario);

        mnItemRelatorio.setText("Relatório");
        mnMenu.add(mnItemRelatorio);

        mnItemSair.setText("Sair");
        mnMenu.add(mnItemSair);

        jMenuBar1.add(mnMenu);

        mnItemDesenvolvedores.setText("Sobre");

        jMenuItem3.setText("Desenvolvedores");
        mnItemDesenvolvedores.add(jMenuItem3);

        jMenuBar1.add(mnItemDesenvolvedores);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnItemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemFuncionarioActionPerformed
        setPanel(new JPFuncionario());
    }//GEN-LAST:event_mnItemFuncionarioActionPerformed

    private void mnItemCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItemCadastroActionPerformed
        setPanel(new JPCadastro());
    }//GEN-LAST:event_mnItemCadastroActionPerformed
    
    private void setPanel(JPanel panel){        
        this.setContentPane(panel); 
    }
    
    public static void main(String args[]) {               
      
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
              
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem mnItemCadastro;
    private javax.swing.JMenu mnItemDesenvolvedores;
    private javax.swing.JMenuItem mnItemFuncionario;
    private javax.swing.JMenuItem mnItemRelatorio;
    private javax.swing.JMenuItem mnItemSair;
    private javax.swing.JMenu mnMenu;
    // End of variables declaration//GEN-END:variables
}
