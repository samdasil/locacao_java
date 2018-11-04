package visao;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.bean.Oficina;
import modelo.dao.OficinaDao;

public class TelaConsultarOficina extends javax.swing.JInternalFrame {

    public TelaConsultarOficina() {
        initComponents();
        listarOficina();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbBuscar = new javax.swing.JLabel();
        btBuscar = new javax.swing.JToggleButton();
        jtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbOficina = new javax.swing.JTable();
        lbLogo = new javax.swing.JLabel();
        btAtualizar = new javax.swing.JToggleButton();
        lbResultado = new javax.swing.JLabel();
        btVisualizar = new javax.swing.JToggleButton();
        btInserir = new javax.swing.JToggleButton();
        btAlterar = new javax.swing.JToggleButton();
        btExcluir = new javax.swing.JToggleButton();

        setBorder(null);
        setClosable(true);
        setTitle("KoT - Oficinas");
        setToolTipText("");
        setFont(new java.awt.Font("Abel", 0, 12)); // NOI18N
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/oficina-20x20.png"))); // NOI18N
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        lbBuscar.setFont(new java.awt.Font("Abel", 1, 14)); // NOI18N
        lbBuscar.setText("Buscar");

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lupa-20x20.png"))); // NOI18N
        btBuscar.setToolTipText("Buscar");
        btBuscar.setBorder(null);
        btBuscar.setContentAreaFilled(false);
        btBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jtBuscar.setColumns(5);
        jtBuscar.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        jtBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtBuscar.setBorder(null);

        tbOficina.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        tbOficina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbOficina.setToolTipText("");
        tbOficina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbOficinaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbOficina);

        lbLogo.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/oficina-48x48.png"))); // NOI18N
        lbLogo.setText("Oficinas");
        lbLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbLogo.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/atualizar-20x20.png"))); // NOI18N
        btAtualizar.setToolTipText("Atualizar lista");
        btAtualizar.setBorder(null);
        btAtualizar.setContentAreaFilled(false);
        btAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        lbResultado.setFont(new java.awt.Font("Abel", 1, 12)); // NOI18N
        lbResultado.setForeground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbBuscar)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btAtualizar))
                            .addComponent(lbResultado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbLogo)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbBuscar)
                                .addComponent(jtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbResultado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        btVisualizar.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        btVisualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/list-35x35.png"))); // NOI18N
        btVisualizar.setText("Visualizar");
        btVisualizar.setBorder(null);
        btVisualizar.setBorderPainted(false);
        btVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVisualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVisualizar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVisualizarActionPerformed(evt);
            }
        });

        btInserir.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        btInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/plus-35-35.png"))); // NOI18N
        btInserir.setText("Inserir");
        btInserir.setBorder(null);
        btInserir.setBorderPainted(false);
        btInserir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btInserir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btInserir.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btAlterar.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pencil-35x35.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.setBorder(null);
        btAlterar.setBorderPainted(false);
        btAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAlterar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Abel", 0, 14)); // NOI18N
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete-35x35.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setBorder(null);
        btExcluir.setBorderPainted(false);
        btExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btVisualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        setBounds(0, 0, 724, 470);
    }// </editor-fold>//GEN-END:initComponents

    Oficina oficina = new Oficina();
    OficinaDao oficinaDao = new OficinaDao();
    
    private void btVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVisualizarActionPerformed
        // HABILITA ALTERAÇÃO DOS DADOS E HABILITA O BOTAO SALVAR E EXCLUIR
        int celula = tbOficina.getSelectedRow();
        
        //VALIDA SELEÇÃO DE LINHA 
        if(celula == -1){
            JOptionPane.showMessageDialog(null, "Selecione um registro !");
        }else{
            TelaVisualizarOficina obj = new TelaVisualizarOficina(null, true);
                   
            oficina.setCodigo((int) tbOficina.getModel().getValueAt(celula, 0));
            oficina.setNome(tbOficina.getModel().getValueAt(celula, 1).toString());
            
            obj.receberDados(oficina);
            obj.setVisible(true);

        }
    }//GEN-LAST:event_btVisualizarActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        TelaCadastroOficina obj = new TelaCadastroOficina(null, true);
        obj.setVisible(true);
        listarOficina();
    }//GEN-LAST:event_btInserirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        // HABILITA ALTERAÇÃO DOS DADOS E HABILITA O BOTAO SALVAR E EXCLUIR
        int celula = tbOficina.getSelectedRow();
        
        //VALIDA SELEÇÃO DE LINHA 
        if(celula == -1){
            JOptionPane.showMessageDialog(null, "Selecione um registro !");
        }else{
            TelaEditarOficina obj = new TelaEditarOficina(null, true);
                   
            oficina.setCodigo((int) tbOficina.getModel().getValueAt(celula, 0));
            oficina.setNome(tbOficina.getModel().getValueAt(celula, 1).toString());
            
            obj.receberDados(oficina);
            obj.setVisible(true);
            //atualiza tabela
            listarOficina();
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        deletar();
        
        //atualiza tabela
        listarOficina();
    }//GEN-LAST:event_btExcluirActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        //atualiza tabela
        listarOficina();
    }//GEN-LAST:event_formFocusGained

    private void tbOficinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbOficinaMouseClicked
        int celula = tbOficina.getSelectedRow();

        oficina.setCodigo((int) tbOficina.getModel().getValueAt(celula, 0));
        oficina.setNome(tbOficina.getModel().getValueAt(celula, 1).toString());
        
        
    }//GEN-LAST:event_tbOficinaMouseClicked

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        buscarOficina();
        jtBuscar.requestFocus();
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        jtBuscar.setText("");
        jtBuscar.requestFocus();
        lbResultado.setText("");
        listarOficina();
    }//GEN-LAST:event_btAtualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btAlterar;
    private javax.swing.JToggleButton btAtualizar;
    private javax.swing.JToggleButton btBuscar;
    private javax.swing.JToggleButton btExcluir;
    private javax.swing.JToggleButton btInserir;
    private javax.swing.JToggleButton btVisualizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtBuscar;
    private javax.swing.JLabel lbBuscar;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JTable tbOficina;
    // End of variables declaration//GEN-END:variables

    //METODO PARA PREENCHER A TABELA MARCA
    public void listarOficina(){
        try {
            List<Oficina> lista = new OficinaDao().listar();
            DefaultTableModel tabela = (DefaultTableModel) tbOficina.getModel();
            
            tbOficina.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbOficina.getColumnModel().getColumn(1).setPreferredWidth(20);            
            tabela.setNumRows(0);
            
            for(Oficina oficina: lista){
                tabela.addRow(new Object[]{oficina.getCodigo(), oficina.getNome()});
            }//fim for
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar."+ex.getMessage());
        }
    }//fim listagem de oficina
    
    //METODO PARA PREENCHER A TABELA MARCA POS BUSCA
    public void buscarOficina(){
        try {
            String busca = jtBuscar.getText();
            List<Oficina> lista = new OficinaDao().buscar(busca);
            if(lista.isEmpty()){
                JOptionPane.showMessageDialog(null, "Não há resultados para : "+ busca);
            }else{
                DefaultTableModel tabela = (DefaultTableModel) tbOficina.getModel();
                lbResultado.setText(lista.size() + " resultado(s) encontrado(s).");

                //tbOficina.getColumnModel().getColumn(0).setPreferredWidth(5);
                //tbOficina.getColumnModel().getColumn(1).setPreferredWidth(20);            
                tabela.setNumRows(0);

                for(Oficina oficina: lista){
                    tabela.addRow(new Object[]{oficina.getCodigo(), oficina.getNome()});
                }//fim for
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar busca."+ex.getMessage());
        }
    }//fim listagem de oficina

    //METODO PARA DELETAR MARCA
    private void deletar(){
        int celula = tbOficina.getSelectedRow();
        int codigo = (int) tbOficina.getModel().getValueAt(celula, 0);
        try {
            
            int opcaoExc = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja EXCLUIR a oficina: "+oficina.getNome(), "Exclusão" ,JOptionPane.YES_NO_OPTION);
            
            if(opcaoExc == JOptionPane.YES_OPTION){
                oficinaDao.deletar(codigo);
                JOptionPane.showMessageDialog(this, "Deletado com sucesso");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao deletar "+ex.getMessage());
        }
    }
}
