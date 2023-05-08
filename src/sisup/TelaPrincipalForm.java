package sisup;

import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaPrincipalForm extends javax.swing.JFrame {

    CadastroProdutoForm cadpro;
    CadastroClienteForm cadcli;
    CadastroFornecedorForm cadfor;

    public TelaPrincipalForm() {
        Boolean Lencontrado;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TlbPrincipal = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuPrincipal = new javax.swing.JMenu();
        mnucadcli = new javax.swing.JMenuItem();
        mnucadfor = new javax.swing.JMenuItem();
        mnucadpro = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        mnucadpais = new javax.swing.JMenuItem();
        mnucadestado = new javax.swing.JMenuItem();
        mnucadcidade = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnusair = new javax.swing.JMenuItem();
        Editar = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        chkbarrabotoes = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("SisUP - Sistema Controle Up Info!");
        setName("FormPrincipal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1024, 800));
        setSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        TlbPrincipal.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisup/icones/cadastrocliente.png"))); // NOI18N
        jButton1.setToolTipText("Cadastro Cliente");
        jButton1.setFocusable(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(40, 40));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        TlbPrincipal.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisup/icones/cadastrofornecedor.png"))); // NOI18N
        jButton2.setToolTipText("Cadastro Fornecedor");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMaximumSize(new java.awt.Dimension(40, 40));
        jButton2.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        TlbPrincipal.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisup/icones/cadastroproduto.png"))); // NOI18N
        jButton3.setToolTipText("Cadastro Produtos");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMaximumSize(new java.awt.Dimension(40, 40));
        jButton3.setMinimumSize(new java.awt.Dimension(40, 40));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        TlbPrincipal.add(jButton3);
        jButton3.getAccessibleContext().setAccessibleDescription("Cadastro Produtos");

        MenuPrincipal.setText("Cadastro");

        mnucadcli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        mnucadcli.setText("Cadastro Cliente");
        mnucadcli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnucadcliActionPerformed(evt);
            }
        });
        MenuPrincipal.add(mnucadcli);

        mnucadfor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        mnucadfor.setText("Cadastro Fornecedor");
        mnucadfor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnucadforActionPerformed(evt);
            }
        });
        MenuPrincipal.add(mnucadfor);

        mnucadpro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        mnucadpro.setText("Cadastro Produto");
        mnucadpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnucadproActionPerformed(evt);
            }
        });
        MenuPrincipal.add(mnucadpro);
        MenuPrincipal.add(jSeparator1);

        jMenu1.setText("Outros Cadastros");

        mnucadpais.setText("País");
        jMenu1.add(mnucadpais);

        mnucadestado.setText("Estado");
        jMenu1.add(mnucadestado);

        mnucadcidade.setText("Cidade");
        jMenu1.add(mnucadcidade);

        MenuPrincipal.add(jMenu1);
        MenuPrincipal.add(jSeparator2);

        mnusair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnusair.setText("Sair");
        mnusair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnusairActionPerformed(evt);
            }
        });
        MenuPrincipal.add(mnusair);

        jMenuBar1.add(MenuPrincipal);

        Editar.setText("Editar");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Barra de Status");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        Editar.add(jCheckBoxMenuItem1);

        chkbarrabotoes.setSelected(true);
        chkbarrabotoes.setText("Barra de Botões");
        chkbarrabotoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbarrabotoesActionPerformed(evt);
            }
        });
        Editar.add(chkbarrabotoes);

        jMenuBar1.add(Editar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TlbPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TlbPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(537, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("FormPrincipal");
        getAccessibleContext().setAccessibleDescription("");
        getAccessibleContext().setAccessibleParent(this);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnucadcliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnucadcliActionPerformed
        if (cadcli == null) {
            cadcli = new CadastroClienteForm();
            cadcli.setVisible(true);
        } else {
            cadcli.setVisible(true);

        }
    }

    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }//GEN-LAST:event_mnucadcliActionPerformed

    private void mnusairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnusairActionPerformed

        Object[] options = {"Sim", "Cancelar"};
        if (JOptionPane.showOptionDialog(null, "Deseja realmente sair?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == 0) {
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_mnusairActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        /* if (JOptionPane.showConfirmDialog(null, "Deseja realmente sair?") == JOptionPane.OK_OPTION) {
            System.exit(0);
        }*/
        Object[] opcoes = {"Sim", "Cancelar"};
        if (JOptionPane.showOptionDialog(null, "Deseja realmente sair?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]) == 0) {
            System.exit(0);
        } else {

        }

    }//GEN-LAST:event_formWindowClosing

    private void mnucadproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnucadproActionPerformed
        if (cadpro == null) {
            try {
                cadpro = new CadastroProdutoForm();
            } catch (Exception ex) {
                Logger.getLogger(TelaPrincipalForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            cadpro.setVisible(true);
        } else {
            cadpro.setVisible(true);

        }

    }//GEN-LAST:event_mnucadproActionPerformed

    private void chkbarrabotoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbarrabotoesActionPerformed
        // TODO add your handling code here:
        if (chkbarrabotoes.isSelected()) {
            TlbPrincipal.setVisible(true);
        } else {
            TlbPrincipal.setVisible(false);
        }
    }//GEN-LAST:event_chkbarrabotoesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mnucadcli.doClick();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        mnucadpro.doClick();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mnucadfor.doClick();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void mnucadforActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnucadforActionPerformed
        if (cadfor == null) {
            cadfor = new CadastroFornecedorForm();
            cadfor.setVisible(true);
        } else {
            cadfor.setVisible(true);
        }
    }//GEN-LAST:event_mnucadforActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                

}*
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalForm.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalForm.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalForm.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalForm.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalForm().setVisible(true);
            }
        });
    }

    public static void mensagemSimples(String mensa) {
        JOptionPane.showMessageDialog(null, mensa);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Editar;
    private javax.swing.JMenu MenuPrincipal;
    private javax.swing.JToolBar TlbPrincipal;
    private javax.swing.JCheckBoxMenuItem chkbarrabotoes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem mnucadcidade;
    private javax.swing.JMenuItem mnucadcli;
    private javax.swing.JMenuItem mnucadestado;
    private javax.swing.JMenuItem mnucadfor;
    private javax.swing.JMenuItem mnucadpais;
    private javax.swing.JMenuItem mnucadpro;
    private javax.swing.JMenuItem mnusair;
    // End of variables declaration//GEN-END:variables
}
