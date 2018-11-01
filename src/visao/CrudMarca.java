
package visao;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.bean.Marca;
import modelo.dao.MarcaDao;


public class CrudMarca extends javax.swing.JFrame {

  
    public CrudMarca() {
        initComponents();
        listarMarca();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMarca = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTcodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMarca = new javax.swing.JTable();
        btAlterar = new javax.swing.JToggleButton();
        btDeletar = new javax.swing.JToggleButton();
        btInserir = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listar Marcas");
        setBackground(new java.awt.Color(51, 51, 51));
        setLocation(new java.awt.Point(350, 150));

        pnMarca.setBackground(new java.awt.Color(204, 204, 255));
        pnMarca.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Código:");

        jTcodigo.setEditable(false);
        jTcodigo.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        jTcodigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nome:");

        jTnome.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        jTnome.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnMarcaLayout = new javax.swing.GroupLayout(pnMarca);
        pnMarca.setLayout(pnMarcaLayout);
        pnMarcaLayout.setHorizontalGroup(
            pnMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMarcaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnMarcaLayout.setVerticalGroup(
            pnMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMarcaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tbMarca.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        tbMarca.setForeground(new java.awt.Color(102, 102, 102));
        tbMarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Marca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbMarca.getTableHeader().setReorderingAllowed(false);
        tbMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMarcaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbMarca);
        if (tbMarca.getColumnModel().getColumnCount() > 0) {
            tbMarca.getColumnModel().getColumn(0).setResizable(false);
            tbMarca.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbMarca.getColumnModel().getColumn(1).setResizable(false);
            tbMarca.getColumnModel().getColumn(1).setPreferredWidth(319);
        }

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pencil-35x35.png"))); // NOI18N
        btAlterar.setToolTipText("Editar");
        btAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete-35x35.png"))); // NOI18N
        btDeletar.setToolTipText("Excluir");
        btDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });

        btInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/plus-35-35.png"))); // NOI18N
        btInserir.setToolTipText("Inserir");
        btInserir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btInserir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAlterar)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btAlterar)
                        .addComponent(btDeletar))
                    .addComponent(btInserir))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDeletarActionPerformed

    private void tbMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMarcaMouseClicked
        
        int linha = tbMarca.getSelectedRow();
        jTcodigo.setText(tbMarca.getValueAt(linha, 0).toString());
        jTnome.setText(tbMarca.getValueAt(linha, 1).toString());
        jTnome.requestFocus();
        
    }//GEN-LAST:event_tbMarcaMouseClicked

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btInserirActionPerformed

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
            java.util.logging.Logger.getLogger(CrudMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudMarca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudMarca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btAlterar;
    private javax.swing.JToggleButton btDeletar;
    private javax.swing.JToggleButton btInserir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTnome;
    private javax.swing.JPanel pnMarca;
    private javax.swing.JTable tbMarca;
    // End of variables declaration//GEN-END:variables


    public void listarMarca(){
        try {
            List<Marca> lista = new MarcaDao().listar();
            DefaultTableModel tabela = (DefaultTableModel) tbMarca.getModel();
            
            for(Marca marca: lista){
                tabela.addRow(new Object[]{marca.getCodigo(),marca.getDescricao()});
            }//fim for
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar."+ex.getMessage());
        }
    }//fim listagem de marca
}
