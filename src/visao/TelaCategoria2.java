package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.bean.Categoria;
import modelo.dao.CategoriaDao;

public class TelaCategoria2 extends javax.swing.JInternalFrame {

    public TelaCategoria2() {
        initComponents();
        
        try {
            preenchertbCategoria();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCategoria2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbBuscar = new javax.swing.JLabel();
        btBuscar = new javax.swing.JToggleButton();
        jtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCategoria = new javax.swing.JTable();
        btListar = new javax.swing.JToggleButton();
        btInserir = new javax.swing.JToggleButton();
        btAlterar = new javax.swing.JToggleButton();
        btExcluir = new javax.swing.JToggleButton();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("KoT - Categorias");
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        lbBuscar.setText("Buscar");

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa-20x20.png"))); // NOI18N
        btBuscar.setBorder(null);
        btBuscar.setContentAreaFilled(false);

        jtBuscar.setColumns(5);
        jtBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtBuscar.setBorder(null);

        tbCategoria.setFont(new java.awt.Font("Droid Serif", 0, 10)); // NOI18N
        tbCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Preço da Diária", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCategoria.setToolTipText("");
        tbCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCategoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCategoria);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbBuscar)
                .addGap(18, 18, 18)
                .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbBuscar)
                        .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        btListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/list-35x35.png"))); // NOI18N
        btListar.setText("Atualizar");
        btListar.setBorder(null);
        btListar.setContentAreaFilled(false);
        btListar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btListar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarActionPerformed(evt);
            }
        });

        btInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/plus-35-35.png"))); // NOI18N
        btInserir.setText("Inserir");
        btInserir.setBorder(null);
        btInserir.setContentAreaFilled(false);
        btInserir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btInserir.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pencil-35x35.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.setBorder(null);
        btAlterar.setContentAreaFilled(false);
        btAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAlterar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete-35x35.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setBorder(null);
        btExcluir.setContentAreaFilled(false);
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btListar, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btListar)
                .addGap(18, 18, 18)
                .addComponent(btInserir)
                .addGap(18, 18, 18)
                .addComponent(btAlterar)
                .addGap(18, 18, 18)
                .addComponent(btExcluir)
                .addContainerGap(68, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 680, 425);
    }// </editor-fold>//GEN-END:initComponents

    Categoria categoria = new Categoria();
    
    private void btListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarActionPerformed
        try {
            preenchertbCategoria();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCategoria2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btListarActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        TelaCadastroCategoria obj = new TelaCadastroCategoria(null, true);
        obj.setVisible(true);
    }//GEN-LAST:event_btInserirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        // HABILITA ALTERAÇÃO DOS DADOS E HABILITA O BOTAO SALVAR E EXCLUIR
        int celula = tbCategoria.getSelectedRow();
        
        //VALIDA SELEÇÃO DE LINHA 
        if(celula == -1){
            JOptionPane.showMessageDialog(null, "Selecione um registro !");
        }else{
            TelaEditarCategoria obj = new TelaEditarCategoria(null, true);
                   
            categoria.setCodigo((int) tbCategoria.getModel().getValueAt(celula, 0));
            categoria.setNome(tbCategoria.getModel().getValueAt(celula, 1).toString());
            categoria.setPrecoDiaria((Double) tbCategoria.getModel().getValueAt(celula, 2));
            categoria.setDescricao(tbCategoria.getModel().getValueAt(celula, 3).toString());
            
            obj.setVisible(true);
            obj.receberDados(categoria);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btExcluirActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        try {
            preenchertbCategoria();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCategoria2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formFocusGained

    private void tbCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCategoriaMouseClicked
        int celula = tbCategoria.getSelectedRow();

        categoria.setCodigo((int) tbCategoria.getModel().getValueAt(celula, 0));
        categoria.setNome(tbCategoria.getModel().getValueAt(celula, 1).toString());
        categoria.setPrecoDiaria(Double.parseDouble(tbCategoria.getModel().getValueAt(celula, 2).toString()));
        categoria.setDescricao(tbCategoria.getModel().getValueAt(celula, 3).toString());
        
        
    }//GEN-LAST:event_tbCategoriaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btAlterar;
    private javax.swing.JToggleButton btBuscar;
    private javax.swing.JToggleButton btExcluir;
    private javax.swing.JToggleButton btInserir;
    private javax.swing.JToggleButton btListar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtBuscar;
    private javax.swing.JLabel lbBuscar;
    private javax.swing.JTable tbCategoria;
    // End of variables declaration//GEN-END:variables

    //METODO PARA PREENCHER A TABELA BAIRRO
    public void preenchertbCategoria() throws SQLException{
        //Categoria categoria = new Categoria();
        CategoriaDao catDao = new CategoriaDao();
        List<Categoria> lista = new ArrayList<>();
        lista = catDao.listar();
        
        tbCategoria.getColumnModel().getColumn(0).setPreferredWidth(5);
        tbCategoria.getColumnModel().getColumn(1).setPreferredWidth(20);
        tbCategoria.getColumnModel().getColumn(2).setPreferredWidth(10);
        tbCategoria.getColumnModel().getColumn(3).setPreferredWidth(50);
        DefaultTableModel modelo = (DefaultTableModel)tbCategoria.getModel();
        modelo.setNumRows(0);
        
        for(Categoria categoria : lista){
            modelo.addRow(new Object[]{ categoria.getCodigo(), categoria.getNome(), categoria.getDescricao(), categoria.getPrecoDiaria() });
        }
    }

}
