
package visao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.bean.Marca;
import modelo.bean.Oficina;
import modelo.conexao.FabricaConexao;
import modelo.dao.MarcaDao;
import modelo.dao.OficinaDao;

public class TelaOficina extends javax.swing.JFrame {

    public TelaOficina() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTcodigo = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jBsalvar = new javax.swing.JToggleButton();
        jBalterar = new javax.swing.JToggleButton();
        jBeletar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Oficinas");
        setLocation(new java.awt.Point(400, 200));

        jLabel1.setText("Código");

        jTcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcodigoActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBbuscar)
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35)
                                .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jBsalvar)
                                .addGap(29, 29, 29)
                                .addComponent(jBalterar)
                                .addGap(26, 26, 26)
                                .addComponent(jBeletar)))
                        .addContainerGap(17, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBsalvar)
                    .addComponent(jBalterar)
                    .addComponent(jBeletar))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcodigoActionPerformed

    private void jBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvarActionPerformed
        
        inserir();
        
    }//GEN-LAST:event_jBsalvarActionPerformed

    private void jBsalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBsalvarKeyPressed
        
    }//GEN-LAST:event_jBsalvarKeyPressed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
       
        buscarCodigo();
        // TODO add your handling code here:
    }//GEN-LAST:event_jBbuscarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaOficina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOficina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOficina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOficina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOficina().setVisible(true);
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
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTnome;
    // End of variables declaration//GEN-END:variables
    
    Oficina oficina = new Oficina();
    OficinaDao oficinaDao = new OficinaDao();
    
    private void inserir(){
        
        oficina.setNome(jTnome.getText());

        try {
                oficinaDao.inserir(oficina);
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                limparCampos();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar: "+ex.getMessage());
            }

    }// fim do método inserir

    private void buscarCodigo(){
        
        int codigo = Integer.parseInt(jTcodigo.getText());
        try {
            oficina = oficinaDao.buscarCodigo(codigo);
            if(jTcodigo.getText() == null){
                
                JOptionPane.showMessageDialog(this, "Favor, preencher campo");
                
            }else if(oficina == null){
                
                JOptionPane.showMessageDialog(this, "Codigo inexistente");
            }else{
                jTnome.setText(oficina.getNome());
            }
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar código "+codigo+":"+ ex.getMessage());
        }
        
        
    }//fim buscarCodigo
    
    private void editar(){
        int codigo = Integer.parseInt(jTcodigo.getText());
        String descricao = jTnome.getText();
        oficina.setCodigo(codigo);
        oficina.setNome(descricao);
        
        try {
            oficinaDao.alterar(oficina);
            JOptionPane.showMessageDialog(this, "Alterado com Sucesso");
            limparCampos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao alterar "+ ex.getMessage());
        }
        
        
        }
    private void deletar(){
        int codigo = Integer.parseInt(jTcodigo.getText());
        try {
            
            int opcaoExc = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja EXCLUIR a oficina: "+oficina.getNome(), "Exclusão" ,JOptionPane.YES_NO_OPTION);
            
            if(opcaoExc == JOptionPane.YES_OPTION){
                oficinaDao.deletar(codigo);
                JOptionPane.showMessageDialog(this, "Deletado com sucesso");
                limparCampos();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao deletar "+ex.getMessage());
        }
    }
    
    public void limparCampos(){
        jTcodigo.setText("");
        jTnome.setText("");
        jTcodigo.requestFocus();
    }
    
}
