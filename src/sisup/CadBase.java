package sisup;

import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class CadBase extends javax.swing.JFrame {

    int teste = 0;

    public CadBase() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame2 = new javax.swing.JFrame();

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    public void bloqueiaCampos() {

        for (int i = 0; i < getContentPane().getComponentCount(); i++) {
            //varre todos os componentes
            Component c = getContentPane().getComponent(i);
            Component e = getContentPane().getComponent(i);
            if (c instanceof JTextField) {
                //apaga os valores
                JTextField field = (JTextField) c;
                field.setEnabled(false);

            }
            if (e instanceof JCheckBox) {
                JCheckBox field = (JCheckBox) e;
                field.setEnabled(false);
            }
        }
    }

    public void liberaCampos() {

        for (int i = 0; i < getContentPane().getComponentCount(); i++) {
            //varre todos os componentes
            Component c = getContentPane().getComponent(i);
            Component e = getContentPane().getComponent(i);
            if (c instanceof JTextField) {
                //apaga os valores
                JTextField field = (JTextField) c;
                field.setEnabled(true);
            }
            if (e instanceof JCheckBox) {
                JCheckBox field = (JCheckBox) e;
                field.setEnabled(true);
            }
        }
    }

    public void limpaCampos() {
        for (int i = 0; i < getContentPane().getComponentCount(); i++) {
            //varre todos os componentes
            Component c = getContentPane().getComponent(i);
            if (c instanceof JTextField) {
                //apaga os valores
                JTextField field = (JTextField) c;
                field.setText("");
            }

        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadBase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame jFrame2;
    // End of variables declaration//GEN-END:variables
}
