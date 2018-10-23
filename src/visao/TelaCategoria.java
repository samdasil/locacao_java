
package visao;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.bean.Categoria;
import modelo.dao.CategoriaDao;

public class TelaCategoria extends javax.swing.JFrame {

    public TelaCategoria() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTcodigo = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jTprecoDiaria = new javax.swing.JTextField();
        jBsalvar = new javax.swing.JToggleButton();
        jBalterar = new javax.swing.JToggleButton();
        jBeletar = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTdescricao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Categorias");
        setLocation(new java.awt.Point(400, 200));
        setPreferredSize(new java.awt.Dimension(700, 500));
        setSize(new java.awt.Dimension(500, 400));

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

        jLabel2.setText("Preço");

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

        jLabel3.setText("Nome");

        jLabel4.setText("Descrição");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54)
                        .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBbuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)
                        .addGap(60, 60, 60)
                        .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addGap(59, 59, 59)
                        .addComponent(jTprecoDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel4)
                        .addGap(35, 35, 35)
                        .addComponent(jTdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jBsalvar)
                        .addGap(27, 27, 27)
                        .addComponent(jBalterar)
                        .addGap(28, 28, 28)
                        .addComponent(jBeletar)))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBbuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2))
                    .addComponent(jTprecoDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4))
                    .addComponent(jTdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBsalvar)
                    .addComponent(jBalterar)
                    .addComponent(jBeletar))
                .addContainerGap(155, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCategoria().setVisible(true);
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
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTdescricao;
    private javax.swing.JTextField jTnome;
    private javax.swing.JTextField jTprecoDiaria;
    // End of variables declaration//GEN-END:variables
    
    Categoria categoria = new Categoria();
    CategoriaDao categoriaDao = new CategoriaDao();
    
    private void inserir(){
        
        categoria.setNome(jTnome.getText());
        categoria.setPrecoDiaria(Double.parseDouble(jTprecoDiaria.getText()));
        categoria.setDescricao(jTdescricao.getText());

        try {
                categoriaDao.inserir(categoria);
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                limparCampos();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar: "+ex.getMessage());
            }

    }// fim do método inserir

    private void buscarCodigo(){
        
        int codigo = Integer.parseInt(jTcodigo.getText());
        try {
            categoria = categoriaDao.buscarCodigo(codigo);
            if(jTcodigo.getText() == null){
                
                JOptionPane.showMessageDialog(this, "Favor, preencher campo");
                
            }else if(categoria == null){
                
                JOptionPane.showMessageDialog(this, "Codigo inexistente");
            }else{
                jTnome.setText(categoria.getNome());
                jTprecoDiaria.setText(Double.toString(categoria.getPrecoDiaria()));
                jTdescricao.setText(categoria.getDescricao());
            }
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao buscar código "+codigo+":"+ ex.getMessage());
        }
        
        
    }//fim buscarCodigo
    
    private void editar(){
        int codigo = Integer.parseInt(jTcodigo.getText());

        categoria.setCodigo(codigo);
        categoria.setNome(jTnome.getText());
        categoria.setPrecoDiaria(Double.parseDouble(jTprecoDiaria.getText()));
        categoria.setDescricao(jTdescricao.getText());
        
        try {
            categoriaDao.alterar(categoria);
            JOptionPane.showMessageDialog(this, "Alterado com Sucesso");
            limparCampos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao alterar "+ ex.getMessage());
        }
        
        
        }
    private void deletar(){
        int codigo = Integer.parseInt(jTcodigo.getText());
        try {
//CONFIRMANDO EXCLUSAO
            int opcaoExc = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja EXCLUIR a categoria: "+categoria.getNome(), "Exclusão" ,JOptionPane.YES_NO_OPTION);
            
            if(opcaoExc == JOptionPane.YES_OPTION){
                categoriaDao.deletar(codigo);
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
        jTprecoDiaria.setText("");
        jTdescricao.setText("");
        jTcodigo.requestFocus();
    }
    
}

