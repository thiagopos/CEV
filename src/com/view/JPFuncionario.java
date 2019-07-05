package com.view;

import com.model.Documento;
import com.model.Funcionario;
import com.model.Grupo;
import com.utils.BancoDeDados;
import com.utils.UppercaseDocumentFilter;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;

public class JPFuncionario extends javax.swing.JPanel {
    private Funcionario funcionario;
    private final DocumentFilter filter = new UppercaseDocumentFilter();
    
    public JPFuncionario() {
        initComponents();        
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        lblNome = new javax.swing.JLabel();
        cmpNome = new javax.swing.JTextField();
        ((AbstractDocument) cmpNome.getDocument()).setDocumentFilter(filter);
        lblDocumento = new javax.swing.JLabel();
        cmpDocumento = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        cmpListaDoc = new javax.swing.JComboBox<>();
        lnlUsuario = new javax.swing.JLabel();
        cmpUsuario = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        lblLocal = new javax.swing.JLabel();
        cmpPeriodo = new javax.swing.JComboBox<>();
        lblDtNasc = new javax.swing.JLabel();
        cmpDtNasc = new javax.swing.JFormattedTextField();
        btCadastrar = new javax.swing.JButton();
        cmpSenha = new javax.swing.JPasswordField();
        lblGrupo = new javax.swing.JLabel();
        cmpGrupo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cmpSenhaConfirmacao = new javax.swing.JPasswordField();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setPreferredSize(new java.awt.Dimension(489, 459));

        lblNome.setText("Nome:");

        lblDocumento.setText("Documento:");

        cmpDocumento.setToolTipText("");

        lblTipo.setText("Tipo:");

        cmpListaDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RG", "RE", "CPF", "CPTS" }));

        lnlUsuario.setText("Usuario:");

        lblSenha.setText("Senha:");

        lblLocal.setText("Periodo:");

        cmpPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diurno", "Noturno" }));

        lblDtNasc.setText("Data de Nascimento:");

        try {
            cmpDtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("    ## / ## / ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btCadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        lblGrupo.setText("Grupo");

        cmpGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Funcionário", "Moderador", "Admin" }));

        jLabel1.setText("Confirmação de Senha");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblGrupo)
                    .addComponent(lblNome)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lnlUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblSenha))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(lblLocal))
                            .addComponent(lblDtNasc)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmpDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmpPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDocumento)
                            .addComponent(cmpDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipo)
                            .addComponent(cmpListaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cmpNome)
                    .addComponent(jLabel1)
                    .addComponent(cmpSenhaConfirmacao)
                    .addComponent(cmpSenha)
                    .addComponent(cmpUsuario)
                    .addComponent(cmpGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDtNasc)
                            .addComponent(lblLocal))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmpDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmpPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDocumento)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmpDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmpListaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lnlUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmpSenhaConfirmacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGrupo)
                .addGap(2, 2, 2)
                .addComponent(cmpGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
       funcionario = new Funcionario(
               cmpNome.getText(),
               cmpDtNasc.getText(),
               new Documento(
                  cmpDocumento.getText(),
                  (String) cmpListaDoc.getSelectedItem()
               ),
               (String) cmpPeriodo.getSelectedItem(),
               new String(cmpSenha.getPassword()),               
               grupoSelecionado()
       );
       
       new BancoDeDados().add(funcionario);
    }//GEN-LAST:event_btCadastrarActionPerformed
    private Grupo grupoSelecionado(){
        int index = cmpGrupo.getSelectedIndex();
        if(index == 1)
            return Grupo.FUNCIONARIO;
        if(index == 2)
            return Grupo.MODERADOR;
        if(index == 3)
            return Grupo.ADMIN; 
        return null;
    }
    
    private Boolean validaCampos(){
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JTextField cmpDocumento;
    private javax.swing.JFormattedTextField cmpDtNasc;
    private javax.swing.JComboBox<String> cmpGrupo;
    private javax.swing.JComboBox<String> cmpListaDoc;
    private javax.swing.JTextField cmpNome;
    private javax.swing.JComboBox<String> cmpPeriodo;
    private javax.swing.JPasswordField cmpSenha;
    private javax.swing.JPasswordField cmpSenhaConfirmacao;
    private javax.swing.JTextField cmpUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblDtNasc;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblLocal;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lnlUsuario;
    // End of variables declaration//GEN-END:variables
}
