package sisup;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author André Batista
 * @version 1
 */
public class CadastroCodBarrasForm extends javax.swing.JFrame {

    public CadastroCodBarrasForm() {
        initComponents();
    }
    CodigoBarrasDao dao;
    CodigoBarras cb;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblCodBar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BtoSalvar = new javax.swing.JButton();
        BtoExcluir = new javax.swing.JButton();
        BtoSair = new javax.swing.JButton();
        BtoInserir = new javax.swing.JButton();
        EdtCodigo = new javax.swing.JTextField();
        EdtDescricao = new javax.swing.JTextField();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        TblCodBar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Barras", "Qntd Embalagem", "Acresc/Desco", "Preço", "Preço Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TblCodBar);
        if (TblCodBar.getColumnModel().getColumnCount() > 0) {
            TblCodBar.getColumnModel().getColumn(0).setResizable(false);
            TblCodBar.getColumnModel().getColumn(1).setResizable(false);
            TblCodBar.getColumnModel().getColumn(2).setResizable(false);
            TblCodBar.getColumnModel().getColumn(3).setResizable(false);
            TblCodBar.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setText("Codigo.:");

        BtoSalvar.setText("Salvar");
        BtoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoSalvarActionPerformed(evt);
            }
        });

        BtoExcluir.setText("Excluir");
        BtoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoExcluirActionPerformed(evt);
            }
        });

        BtoSair.setText("Sair");
        BtoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoSairActionPerformed(evt);
            }
        });

        BtoInserir.setText("Inserir");
        BtoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoInserirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtoInserir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtoExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtoSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EdtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EdtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BtoSalvar)
                    .addComponent(EdtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EdtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(BtoInserir)
                        .addGap(18, 18, 18)
                        .addComponent(BtoExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtoSair)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoExcluirActionPerformed
        try {
            Integer linhaSelecionada = TblCodBar.getSelectedRow();
            if (linhaSelecionada < 0) {
                JOptionPane.showMessageDialog(null, "Você deve selecionar um registro!");
            } else {
                String codigo = (TblCodBar.getModel().getValueAt(linhaSelecionada, 0).toString());
                String descricao = EdtDescricao.getText();
                Object[] opcoes = {"Sim", "Não"};
                if (JOptionPane.showOptionDialog(null, "Deseja realmente excluir o Registro? \n " + "Codigo de Barras.: " + codigo + "\n"
                        + "Descrição.: " + descricao + "\n  ", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]) == 0) {
                    cb.setCodbar(codigo);
                    cb.setCodpro(Integer.parseInt(EdtCodigo.getText()));
                    dao = new CodigoBarrasDao();
                    dao.excluir(cb);
                    JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
                    InsereDadosPorCodigoTabela();
                } else {
                    return;
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: Ocorreu um erro ao excluir o registro! Por favor contate o Suporte Técnico." + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro" + e.getMessage());
            e.printStackTrace();
        }

        EdtDescricao.requestFocus();    }//GEN-LAST:event_BtoExcluirActionPerformed

    private void BtoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtoSairActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        InsereDadosPorCodigoTabela();
    }//GEN-LAST:event_formWindowActivated
    private void InsereDadosPorCodigoTabela() {
        Integer pesquisar = Integer.parseInt(EdtCodigo.getText());
        if (!pesquisar.equals("")) {
            DefaultTableModel modelo = (DefaultTableModel) TblCodBar.getModel();
            modelo.setNumRows(0);
            try {
                CodigoBarrasDao cbdao = new CodigoBarrasDao();
                ArrayList<CodigoBarras> lista = buscaPorCodigo(pesquisar);
                for (CodigoBarras codb : lista) {
                    String[] novaLinha = {
                        codb.getCodbar(),
                        codb.getQntdemb().toString(),
                        codb.getAcresdesc().toString(),
                        codb.getPreco().toString(),
                        codb.getTotal().toString()};
                    modelo.addRow(novaLinha);

                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro: Ocorreu um erro inexperado durante a pesquisa! Contate o Suporte Técnico." + ex.getMessage());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: Ocorreu um erro inexperado! Contate o Suporte Técnico." + e.getMessage());
            }
        }
    }

    private void BtoInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoInserirActionPerformed
        DefaultTableModel tabela = (DefaultTableModel) TblCodBar.getModel();
        Integer linhas = tabela.getRowCount();
        Integer colunas = tabela.getColumnCount();
        //linhas++;
        //tabela.setNumRows(linhas);
        Object[] novaLinha = new Object[colunas];
        tabela.insertRow(linhas++, novaLinha);
        Integer editar = linhas++;
        TblCodBar.setEditingRow(editar);
        /*        cb.setCodbar(tabela.getValueAt(linhas, 0).toString());
        cb.setQntdemb(Integer.parseInt(tabela.getValueAt(linhas, 1).toString()));
        cb.setAcresdesc(Integer.parseInt(tabela.getValueAt(linhas, 3).toString()));
        cb.setPreco(Double.parseDouble(tabela.getValueAt(linhas, 4).toString()));
         */

    }//GEN-LAST:event_BtoInserirActionPerformed

    private void BtoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoSalvarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) TblCodBar.getModel();
        ArrayList<CodigoBarras> lista = null;
        for (CodigoBarras cod : lista) {

        }

    }//GEN-LAST:event_BtoSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCodBarrasForm().setVisible(true);

            }

        });
    }

    public ArrayList<CodigoBarras> buscaPorCodigo(Integer codigo) throws Exception {
        Connection con = Conexao.getInstancia();
        PreparedStatement ps = null;
        ResultSet rs;
        ArrayList<CodigoBarras> lista = new ArrayList<>();
        try {
            String sql = "Select * from arqbar where codpro = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            while (rs.next()) {
                cb = new CodigoBarras();
                cb.setCodigo(rs.getInt("codigo"));
                cb.setCodpro(rs.getInt("codpro"));
                cb.setCodbar(rs.getString("codbar"));
                cb.setQntdemb(rs.getInt("qntdemb"));
                cb.setAcresdesc(rs.getInt("acresdesc"));
                cb.setPreco(rs.getDouble("preco"));
                cb.setTotal(rs.getDouble("total"));
                lista.add(cb);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: Ocorreu um erro inexperado! " + e.getMessage());
        }
        return lista;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtoExcluir;
    private javax.swing.JButton BtoInserir;
    private javax.swing.JButton BtoSair;
    private javax.swing.JButton BtoSalvar;
    private javax.swing.JTextField EdtCodigo;
    private javax.swing.JTextField EdtDescricao;
    private javax.swing.JTable TblCodBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void recebecodigo(String codigo, String descricao) {
        EdtCodigo.setText(codigo);
        EdtDescricao.setText(descricao);
        EdtCodigo.setEnabled(false);
        EdtDescricao.setEnabled(false);

    }
}
