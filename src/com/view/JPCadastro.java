package com.view;

import com.github.sarxos.webcam.Webcam;
import java.util.Calendar;
import com.model.Documento;
import com.model.Funcionario;
import com.model.Paciente;
import com.model.Visita;
import com.model.Visitante;
import com.utils.UppercaseDocumentFilter;
import com.sun.glass.events.KeyEvent;
import com.utils.B64;
import com.utils.BancoDeDados;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;

public class JPCadastro extends javax.swing.JPanel {

    private Paciente paciente;
    private Funcionario funcionarioLogado;
    private Visitante visitante;
    private BufferedImage image;
    private final BancoDeDados bd = new BancoDeDados();
    private final Calendar dataAtual = Calendar.getInstance();
    private final DocumentFilter filter = new UppercaseDocumentFilter();

    public JPCadastro(Funcionario funcionarioLogado) {
        initComponents();
        paciente = new Paciente();
        visitante = new Visitante();
        this.funcionarioLogado = funcionarioLogado;
        image = new BufferedImage(320, 240, BufferedImage.TYPE_INT_RGB);
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
        lnlNomeMae = new javax.swing.JLabel();
        cmpNomeMae = new javax.swing.JTextField();
        ((AbstractDocument) cmpNomeMae.getDocument()).setDocumentFilter(filter);
        lblLocal = new javax.swing.JLabel();
        cmpLocal = new javax.swing.JComboBox<>();
        lblDtNasc = new javax.swing.JLabel();
        cmpDtNasc = new javax.swing.JFormattedTextField();
        lblVinculo = new javax.swing.JLabel();
        cmpVinculo = new javax.swing.JTextField();
        ((AbstractDocument) cmpVinculo.getDocument()).setDocumentFilter(filter);
        btCadastrar = new javax.swing.JButton();
        lblImagem = new javax.swing.JLabel();
        btnCapturar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cmpRH = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmpPaciente = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        lblNome.setText("Nome visitante:");

        cmpNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmpNomeKeyPressed(evt);
            }
        });

        lblDocumento.setText("Documento:");

        cmpDocumento.setToolTipText("");
        cmpDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmpDocumentoKeyPressed(evt);
            }
        });

        lblTipo.setText("Tipo:");

        cmpListaDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RG", "RE", "CPF", "CPTS" }));

        lnlNomeMae.setText("Nome da mãe:");

        lblLocal.setText("Local:");

        cmpLocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Observação Feminina", "Observação Masculina", "Observação Infântil", "Choque", "Sutura", "Centro Obstétrico", "Centro Cirurgico", "UTI Adulto", "Berçario", "Clínica Obstétrica", "Clínica NeuroCirurgica", "Clínica Ortopédica", "Clínica Pediátrica", "UTI Pediátrica", "Clínica Cirúrgica", "Clínica de Saúde Mental", "Clínica Geral" }));

        lblDtNasc.setText("Data de Nascimento:");

        try {
            cmpDtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("    ## / ## / ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblVinculo.setText("Vínculo com paciente:");

        btCadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        lblImagem.setBackground(new java.awt.Color(153, 153, 153));
        lblImagem.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCapturar.setText("Capturar foto");
        btnCapturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapturarActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar RH do paciente:");

        cmpRH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmpRHKeyPressed(evt);
            }
        });

        jLabel2.setText("Nome paciente:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome)
                            .addComponent(lnlNomeMae)
                            .addComponent(lblVinculo)
                            .addComponent(cmpNome)
                            .addComponent(cmpVinculo)
                            .addComponent(cmpNomeMae)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDtNasc)
                                            .addComponent(cmpDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblLocal))
                                        .addGap(177, 177, 177))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmpLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblDocumento)
                                                    .addComponent(cmpDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblTipo)
                                                    .addComponent(cmpListaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(90, 90, 90)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCapturar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmpRH, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar))
                            .addComponent(cmpPaciente))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmpRH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmpPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome)
                .addGap(6, 6, 6)
                .addComponent(cmpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDtNasc)
                        .addGap(6, 6, 6)
                        .addComponent(cmpDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDocumento)
                                .addGap(6, 6, 6)
                                .addComponent(cmpDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTipo)
                                .addGap(6, 6, 6)
                                .addComponent(cmpListaDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addComponent(lblLocal))
                    .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapturar)
                    .addComponent(cmpLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(lnlNomeMae)
                .addGap(6, 6, 6)
                .addComponent(cmpNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVinculo)
                .addGap(6, 6, 6)
                .addComponent(cmpVinculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed

        if (instanciaValores()) {
            bd.add(paciente);
            limparCampos();
            System.out.println("Impressão omitida para testes, linha 247 da classe JPCadastro");
            //Zebra.print(visitante);
        }

    }//GEN-LAST:event_btCadastrarActionPerformed

    private void cmpNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpNomeKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_ENTER) {

            List<Visitante> listaBusca = new ArrayList();
            String nome = cmpNome.getText().trim();
            List<Visitante> buscaNome = bd.buscaNome(nome);
            buscaNome.forEach((a) -> {
                listaBusca.add(a);
            });
            if (listaBusca.size() == 1) {
                autoPreencher(listaBusca.get(0));
            } else {
                JFListaBusca jfListaBusca = new JFListaBusca(this, (ArrayList<Visitante>) listaBusca);
                jfListaBusca.setVisible(true);
            }
        }
    }//GEN-LAST:event_cmpNomeKeyPressed

    public void autoPreencher(Visitante visitante) {
        cmpNome.setText(visitante.getNome());
        cmpDtNasc.setText(visitante.getDataNascimento());
        cmpDocumento.setText(visitante.getDoc().getNumeroDoc());
        cmpListaDoc.setSelectedItem(visitante.getDoc().getTipoDoc());
        cmpNomeMae.setText(visitante.getNomeMae());
        setImage(B64.decodeToImage(visitante.getImagem()));
    }
    private void cmpDocumentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpDocumentoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String documento = cmpDocumento.getText();

            if (documento.length() > 8) {
                Visitante result = bd.buscaDocumento(documento);
                autoPreencher(result);
            }
        }
    }//GEN-LAST:event_cmpDocumentoKeyPressed

    public boolean instanciaValores() {

        if (preenchido()) {

            visitante = new Visitante(
                    cmpNomeMae.getText().trim(),
                    B64.encodeToString(image, "JPG"),
                    cmpNome.getText().trim(),
                    cmpDtNasc.getText().trim(),
                    new Documento(
                            cmpDocumento.getText().trim(),
                            (String) cmpListaDoc.getSelectedItem())
            );

            Visita visita = new Visita(
                    visitante,
                    cmpVinculo.getText().trim(),
                    dataAtual.getTime(),
                    (String) cmpLocal.getSelectedItem(),
                    funcionarioLogado
            );

            List<Visita> arrVisita = new ArrayList();
            arrVisita.add(visita);

            paciente = new Paciente(
                    cmpPaciente.getText().trim(),
                    cmpRH.getText().trim(),
                    arrVisita
            );

            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
            return false;
        }

    }

    private boolean preenchido() {

        if (cmpNome.getText().trim().isEmpty() || cmpDtNasc.getText().trim().isEmpty()) {
            return false;
        }
        if (cmpDocumento.getText().trim().isEmpty() || cmpNomeMae.getText().trim().isEmpty()) {
            return false;
        }
        if (cmpPaciente.getText().trim().isEmpty() || cmpVinculo.getText().trim().isEmpty()) {
            return false;
        }
        return cmpLocal.getSelectedIndex() != 0;

    }

    public void limparCampos() {
        cmpRH.setText("");
        cmpNome.setText("");
        cmpDtNasc.setText("");
        cmpDocumento.setText("");
        cmpListaDoc.getItemAt(0);
        cmpNomeMae.setText("");
        cmpPaciente.setText("");
        cmpLocal.getItemAt(0);
        cmpVinculo.setText("");
        lblImagem.setIcon(new ImageIcon());

    }

    private void btnCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarActionPerformed

        Webcam webcam = Webcam.getDefault();
        if (webcam != null) {
            JFWebCam frameWebCam = new JFWebCam(this);
            frameWebCam.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Camera não conectada ou apresentando defeito.");
        }

    }//GEN-LAST:event_btnCapturarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ArrayList<Visitante> listaBusca = new ArrayList();
        String rh = cmpRH.getText().trim();
        ArrayList<Visitante> buscaRH = (ArrayList<Visitante>) bd.busca(rh);
        buscaRH.forEach((a) -> {
            listaBusca.add(a);
        });
        if (listaBusca.size() == 1) {
            autoPreencher(listaBusca.get(0));
        } else {
            JFListaBusca jfListaBusca = new JFListaBusca(this, listaBusca);
            jfListaBusca.setVisible(true);
        }

        paciente = bd.buscaRH(cmpRH.getText().trim());
        cmpPaciente.setText(paciente.getNome());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cmpRHKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmpRHKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnBuscar.doClick();
        }
    }//GEN-LAST:event_cmpRHKeyPressed

    public void setImage(BufferedImage image) {

        this.image = image;
        lblImagem.setIcon(new ImageIcon(
                image.getScaledInstance(160, 120, Image.SCALE_FAST)));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCapturar;
    private javax.swing.JTextField cmpDocumento;
    private javax.swing.JFormattedTextField cmpDtNasc;
    private javax.swing.JComboBox<String> cmpListaDoc;
    private javax.swing.JComboBox<String> cmpLocal;
    private javax.swing.JTextField cmpNome;
    private javax.swing.JTextField cmpNomeMae;
    private javax.swing.JTextField cmpPaciente;
    private javax.swing.JTextField cmpRH;
    private javax.swing.JTextField cmpVinculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblDtNasc;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblLocal;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblVinculo;
    private javax.swing.JLabel lnlNomeMae;
    // End of variables declaration//GEN-END:variables
}
