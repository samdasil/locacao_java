package visao;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import modelo.bean.Carro;
import modelo.bean.Categoria;
import modelo.bean.Conserto;
import modelo.bean.ItensServicos;
import modelo.bean.Marca;
import modelo.bean.Modelo;
import modelo.bean.Oficina;
import modelo.bean.Servico;
import modelo.dao.CarroDao;
import modelo.dao.CategoriaDao;
import modelo.dao.ConsertoDao;
import modelo.dao.MarcaDao;
import modelo.dao.ModeloDao;
import modelo.dao.OficinaDao;
import modelo.dao.ServicoDao;

public class TelaCadastroConserto extends javax.swing.JDialog {

    public TelaCadastroConserto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        listarCarro(cbCarro);
        listarOficina(cbOficina);
        listarServico(cbServico);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jBsalvar = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        cbCarro = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbOficina = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTdataentrada = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jTdatasaida = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLitensServicos = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbServico = new javax.swing.JComboBox<>();
        jBadicionarServico = new javax.swing.JToggleButton();
        jBdeletarServico = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("KoT - Locação de Carros  - v1.0");

        jLabel1.setFont(new java.awt.Font("Abel", 0, 18)); // NOI18N
        jLabel1.setText("Cadastro de Consertos dos Veículos");

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jBsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save-30x30.png"))); // NOI18N
        jBsalvar.setBorder(null);
        jBsalvar.setBorderPainted(false);
        jBsalvar.setContentAreaFilled(false);
        jBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        jLabel2.setText("Carro enviado *");

        cbCarro.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        cbCarro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Carro" }));

        jLabel4.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        jLabel4.setText("Data de entrada no conserto *");

        cbOficina.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        cbOficina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma Oficina" }));

        jLabel9.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        jLabel9.setText("Oficina contratada *");

        try {
            MaskFormatter mascara = new MaskFormatter("##/##/####");
            mascara.setPlaceholderCharacter('_');/*
            jTdataentrada.setFormatterFactory(
                */
                jTdataentrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascara));

            } catch (java.text.ParseException ex) {
                ex.printStackTrace();

            };//);
            jTdataentrada.setFont(new java.awt.Font("Abel", 0, 14));

            jLabel5.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
            jLabel5.setText("Data de saída do conserto *");

            try {
                MaskFormatter mascara = new MaskFormatter("##/##/####");
                mascara.setPlaceholderCharacter('_');/*
                jTdatasaida.setFormatterFactory(
                    */
                    jTdatasaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascara));

                } catch (java.text.ParseException ex) {
                    ex.printStackTrace();

                };//);
                jTdatasaida.setFont(new java.awt.Font("Abel", 0, 14));

                jLitensServicos.setModel(new javax.swing.AbstractListModel<String>() {
                    String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
                    public int getSize() { return strings.length; }
                    public String getElementAt(int i) { return strings[i]; }
                });
                jScrollPane1.setViewportView(jLitensServicos);

                jLabel6.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
                jLabel6.setText("Lista de serviços realizados no veículo");

                jLabel3.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
                jLabel3.setText("Serviços *");

                cbServico.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
                cbServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione os serviços" }));

                jBadicionarServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ok-20x20.png"))); // NOI18N
                jBadicionarServico.setBorder(null);
                jBadicionarServico.setBorderPainted(false);
                jBadicionarServico.setContentAreaFilled(false);
                jBadicionarServico.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jBadicionarServicoActionPerformed(evt);
                    }
                });

                jBdeletarServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/deletar-20x20.png"))); // NOI18N
                jBdeletarServico.setBorder(null);
                jBdeletarServico.setBorderPainted(false);
                jBdeletarServico.setContentAreaFilled(false);
                jBdeletarServico.setEnabled(false);
                jBdeletarServico.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jBdeletarServicoActionPerformed(evt);
                    }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBsalvar)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTdataentrada))
                                .addGap(173, 173, 173))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTdatasaida, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cbOficina, javax.swing.GroupLayout.Alignment.LEADING, 0, 213, Short.MAX_VALUE)
                                .addComponent(cbCarro, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBdeletarServico)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(55, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbServico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(19, 19, 19)
                                        .addComponent(jBadicionarServico))
                                    .addComponent(jScrollPane1))
                                .addGap(16, 16, 16))))
                );
                jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTdataentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTdatasaida, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbOficina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBadicionarServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbServico))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBdeletarServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jBsalvar)
                        .addGap(20, 20, 20))
                );

                jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/conserto-20x20.png"))); // NOI18N

                jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/plus-20-20.png"))); // NOI18N

                jLabel8.setFont(new java.awt.Font("Abel", 0, 10)); // NOI18N
                jLabel8.setText("(*) Campos obrigatórios");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jSeparator1)
                                .addGap(6, 6, 6))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel7))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(16, 16, 16))
                );

                getAccessibleContext().setAccessibleParent(this);

                setSize(new java.awt.Dimension(662, 537));
                setLocationRelativeTo(null);
            }// </editor-fold>//GEN-END:initComponents

    private void jBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvarActionPerformed
        inserir();
        dispose();
    }//GEN-LAST:event_jBsalvarActionPerformed

    DefaultListModel item = new DefaultListModel();
    private void jBadicionarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBadicionarServicoActionPerformed
        // ADICIONAR ITEM NA LISTA
        item.addElement(cbServico.getSelectedItem());
        jLitensServicos.setModel(item);
    }//GEN-LAST:event_jBadicionarServicoActionPerformed

    private void jBdeletarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdeletarServicoActionPerformed
        // DELETAR ITEM DA LISTA
        //item;
    }//GEN-LAST:event_jBdeletarServicoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(TelaCadastroConserto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroConserto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroConserto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroConserto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadastroConserto dialog = new TelaCadastroConserto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCarro;
    private javax.swing.JComboBox<String> cbOficina;
    private javax.swing.JComboBox<String> cbServico;
    private javax.swing.JToggleButton jBadicionarServico;
    private javax.swing.JToggleButton jBdeletarServico;
    private javax.swing.JToggleButton jBsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jLitensServicos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JFormattedTextField jTdataentrada;
    public javax.swing.JFormattedTextField jTdatasaida;
    // End of variables declaration//GEN-END:variables

    Conserto conserto = new Conserto();
    ConsertoDao carroDao = new ConsertoDao();
    
    private void inserir(){
        try {
            Carro     carro     = (Carro) cbCarro.getSelectedItem();
            Oficina   oficina   = (Oficina) cbOficina.getSelectedItem();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date entrada = formato.parse(jTdataentrada.getText());
            //Date saida   = formato.parse(jTdatasaida.getText());
            
            if(jTdataentrada.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Campo 'Data de Entrada' é obrigatório.");
                jTdataentrada.requestFocus();
            }else if(cbCarro.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(null, "Campo 'Carro' é obrigatório.");
                cbCarro.requestFocus();
            }else if(cbOficina.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(null, "Campo 'Oficina' é obrigatório.");
                cbOficina.requestFocus();
            }else{
                
                conserto.setDataEntrada(entrada);
                //conserto.setDataEntrada(saida);
                conserto.setDataEntrada(entrada);
                conserto.setCarro(carro);
                conserto.setOficina(oficina);
                
                try {
                    carroDao.inserir(conserto);
                    JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
                } catch (SQLException ex) {
                    System.out.println("Erro ao inserir: " + ex.getMessage());
                }
            }
        } catch (ParseException ex) { 
            JOptionPane.showMessageDialog(null, "Erro na data de entrada: "+ ex.getMessage());
        }
    }
    
    private void listarCarro(JComboBox combo){
        try {
            List<Carro> lista = new CarroDao().listar();
            for (Carro carro : lista){
                combo.addItem(carro);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao carregar combobox de carros: " + ex.getMessage());
        }
        
    }
    
    private void listarOficina(JComboBox combo){
        try {
            List<Oficina> lista = new OficinaDao().listar();
            for (Oficina oficina : lista){
                combo.addItem(oficina);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao carregar combobox de oficinas: " + ex.getMessage());
        }
        
    }
    
    private void listarServico(JComboBox combo){
        try {
            List<Servico> lista = new ServicoDao().listar();
            for (Servico servico : lista){
                combo.addItem(servico);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao carregar combobox de carros: " + ex.getMessage());
        }
        
    }
}
