package visao;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.bean.Cliente;
import modelo.dao.ClienteDao;

public class TelaEditarCliente extends javax.swing.JDialog {

    public TelaEditarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTcpf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTendereco = new javax.swing.JTextField();
        jBsalvar = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        jTrg = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTcnh = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTnascimento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("KoT - Locação de Carros  - v1.0");

        jLabel1.setFont(new java.awt.Font("Abel", 0, 18)); // NOI18N
        jLabel1.setText("Alterar Clientes");

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel6.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        jLabel6.setText("Nome *");

        jLabel8.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        jLabel8.setText("CPF *");

        jLabel9.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        jLabel9.setText("Endereço *");

        jTendereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTenderecoActionPerformed(evt);
            }
        });

        jBsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save-30x30.png"))); // NOI18N
        jBsalvar.setBorder(null);
        jBsalvar.setBorderPainted(false);
        jBsalvar.setContentAreaFilled(false);
        jBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvarActionPerformed(evt);
            }
        });
        jBsalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBsalvarKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        jLabel11.setText("RG *");

        jLabel12.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        jLabel12.setText("CNH*");

        jLabel13.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        jLabel13.setText("Ano do Nascimento *");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBsalvar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTendereco)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTrg, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11))
                                        .addGap(47, 47, 47)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(47, 47, 47)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTcnh, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(jTnascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTnascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTcnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jBsalvar)
                .addGap(16, 16, 16))
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente-20x20.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pencil-20x20.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Abel", 0, 10)); // NOI18N
        jLabel14.setText("(*) Campos obrigatórios");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addGap(6, 6, 6))))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel14)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleParent(this);

        setSize(new java.awt.Dimension(523, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBsalvarKeyPressed

    }//GEN-LAST:event_jBsalvarKeyPressed

    private void jBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvarActionPerformed
        if(alterar()){
            dispose();
        }
    }//GEN-LAST:event_jBsalvarActionPerformed
    private void jTenderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTenderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTenderecoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaEditarCliente dialog = new TelaEditarCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JToggleButton jBsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTcnh;
    private javax.swing.JTextField jTcpf;
    private javax.swing.JTextField jTendereco;
    private javax.swing.JTextField jTnascimento;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTrg;
    // End of variables declaration//GEN-END:variables

    private boolean alterar(){
        Cliente cliente = new Cliente();
        ClienteDao clienteDao = new ClienteDao();
        Boolean result = null;
        
        String cpf       = jTcpf.getText();
        String rg        = jTrg.getText();
        String nome      = jTnome.getText();
        String cnh       = jTcnh.getText();
        String endereco  = jTendereco.getText();
        String nascimento= jTnascimento.getText();
        
        if(nome.equals("")){
            JOptionPane.showMessageDialog(null, "Campo 'Nome' é obrigatório.");
            jTnome.requestFocus();
            result = false;
        }else if(nascimento.equals("")){
            JOptionPane.showMessageDialog(null, "Campo 'Data de Nascimento' é obrigatório.");
            jTnascimento.requestFocus();
            result = false;
        }else if(cpf.equals("")){
            JOptionPane.showMessageDialog(null, "Campo 'CPF' é obrigatório.");
            jTcpf.requestFocus();
            result = false;
        }else if(rg.equals("")){
            JOptionPane.showMessageDialog(null, "Campo 'RG' é obrigatório.");
            jTrg.requestFocus();
            result = false;
        }else if(cnh.equals("")){
            JOptionPane.showMessageDialog(null, "Campo 'CNH' é obrigatório.");
            jTcnh.requestFocus();
            result = false;
        }else if(endereco.equals("")){
            JOptionPane.showMessageDialog(null, "Campo 'Endereço' é obrigatório.");
            jTendereco.requestFocus();
            result = false;
        }else{
            
            cliente.setCpf(cpf);
            cliente.setRg(rg);
            cliente.setNome(nome);
            cliente.setEndereco(endereco);
            cliente.setCnh(cnh);
            cliente.setNascimento(Integer.parseInt(nascimento));
            
            try {
                clienteDao.alterar(cliente);
                JOptionPane.showMessageDialog(this, "Cliente atualizado com sucesso");
                //limparCampos();
                result = true;

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao atualizar: "+ex.getMessage());
            }
        }
        return result;
    }// fim do método inserir

    public void receberDados(Cliente cliente){
        
        jTnome.setText(cliente.getNome());
        jTnascimento.setText(Integer.toString(cliente.getNascimento()));
        jTcpf.setText(cliente.getCpf());
        jTrg.setText(cliente.getRg());
        jTcnh.setText(cliente.getCnh());
        jTendereco.setText(cliente.getEndereco());
        
    }
        
    public void limparCampos(){
        jTnome.setText("");
        jTcpf.setText("");
        jTrg.setText("");
        jTcnh.setText("");
        jTendereco.setText("");
        jTnascimento.setText("");
    }
}
