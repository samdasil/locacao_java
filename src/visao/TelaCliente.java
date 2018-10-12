package visao;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.bean.Cliente;
import modelo.dao.ClienteDao;

public class TelaCliente extends javax.swing.JFrame {

    public TelaCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTcpf = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jBsalvar = new javax.swing.JToggleButton();
        jBalterar = new javax.swing.JToggleButton();
        jBeletar = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jTrg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTcnh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTnascimento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTendereco = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clientes");
        setLocation(new java.awt.Point(400, 200));

        jLabel1.setText("CPF");

        jTcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcpfActionPerformed(evt);
            }
        });

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        jBsalvar.setText("Salvar");
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

        jBalterar.setText("Alterar");
        jBalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalterarActionPerformed(evt);
            }
        });

        jBeletar.setText("Deletar");
        jBeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeletarActionPerformed(evt);
            }
        });

        jLabel3.setText("RG");

        jLabel4.setText("CNH");

        jLabel5.setText("Nascimento");

        jLabel6.setText("Endereço");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTnascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBbuscar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTnome)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBsalvar)
                                .addGap(27, 27, 27)
                                .addComponent(jBalterar)
                                .addGap(28, 28, 28)
                                .addComponent(jBeletar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTendereco)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTcnh, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTrg, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(2, 2, 2)))))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTnascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTcnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsalvar)
                    .addComponent(jBalterar)
                    .addComponent(jBeletar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcpfActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed

        buscarCodigo();
        // TODO add your handling code here:
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvarActionPerformed

        inserir();

    }//GEN-LAST:event_jBsalvarActionPerformed

    private void jBsalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBsalvarKeyPressed

    }//GEN-LAST:event_jBsalvarKeyPressed

    private void jBalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalterarActionPerformed
        // TODO add your handling code here:
        editar();
    }//GEN-LAST:event_jBalterarActionPerformed

    private void jBeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeletarActionPerformed
        // TODO add your handling code here:
        deletar();
    }//GEN-LAST:event_jBeletarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jBalterar;
    private javax.swing.JToggleButton jBbuscar;
    private javax.swing.JToggleButton jBeletar;
    private javax.swing.JToggleButton jBsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTcnh;
    private javax.swing.JTextField jTcpf;
    private javax.swing.JTextField jTendereco;
    private javax.swing.JTextField jTnascimento;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTrg;
    // End of variables declaration//GEN-END:variables

    Cliente cliente = new Cliente();
    ClienteDao clienteDao = new ClienteDao();
     
    private void inserir(){
        
        cliente.setCpf(jTcpf.getText());
        cliente.setNome(jTnome.getText());
        cliente.setRg(jTrg.getText());
        cliente.setCnh(jTcnh.getText());
        cliente.setEndereco(jTendereco.getText());
        cliente.setNascimento(Integer.parseInt(jTnascimento.getText()));

        try {
                clienteDao.inserir(cliente);
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                limparCampos();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar: "+ex.getMessage());
            }

    }// fim do método inserir

    private void buscarCodigo(){
        
        String cpf = jTcpf.getText();
        
        try {
            cliente = clienteDao.buscarCpf(cpf);

            if(jTcpf.getText() == null){
                
                JOptionPane.showMessageDialog(this, "Favor, preencher campo");
                jTcpf.requestFocus();
                
            }else if(cliente == null){
                
                JOptionPane.showMessageDialog(this, "Codigo inexistente");
            }else{
                
                int nascimento = cliente.getNascimento();
                
                jTnome.setText(cliente.getNome());
                jTrg.setText(cliente.getRg());
                jTcnh.setText(cliente.getCnh());
                jTnascimento.setText(Integer.toString(nascimento)); 
                jTendereco.setText(cliente.getEndereco());
            }
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar código "+cpf+":"+ ex.getMessage());
        }
        
        
    }//fim buscarCodigo
    
    private void editar(){
        
        cliente.setCpf(jTcpf.getText());
        cliente.setNome(jTnome.getText());
        cliente.setRg(jTrg.getText());
        cliente.setCnh(jTcnh.getText());
        cliente.setEndereco(jTendereco.getText());
        cliente.setNascimento(Integer.parseInt(jTnascimento.getText()));
        
        try {
            clienteDao.alterar(cliente);
            JOptionPane.showMessageDialog(this, "Alterado com Sucesso");
            limparCampos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao alterar "+ ex.getMessage());
        }
        
        
        }
    private void deletar(){
        String cpf = jTcpf.getText();
        try {
            
            int opcaoExc = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja EXCLUIR o cliente: "+cliente.getNome(), "Exclusão" ,JOptionPane.YES_NO_OPTION);
            
            if(opcaoExc == JOptionPane.YES_OPTION){
                clienteDao.deletar(cpf);
                JOptionPane.showMessageDialog(this, "Deletado com sucesso");
                limparCampos();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao deletar "+ex.getMessage());
        }
    }
    
    public void limparCampos(){
        jTcpf.setText("");
        jTnome.setText("");
        jTrg.setText("");
        jTendereco.setText("");
        jTcnh.setText("");
        jTnascimento.setText("");
        jTcpf.requestFocus();
    }

}
