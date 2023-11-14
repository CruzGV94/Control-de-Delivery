package Form;

import java.awt.BorderLayout;
import java.io.Serializable;

public class Principal extends javax.swing.JFrame implements Serializable{

    private ProductosFm productos;
    Enviar enviar = new Enviar();
    ProductosFm productosFM = new ProductosFm();

    public Principal() {
        super("Pincipal");
        initComponents();

        productos = new ProductosFm();
//        ProductosFm prod = new ProductosFm();

        productos.setSize(750, 495);
        productos.setLocation(0, 0);

        PnlTemp.removeAll();
        PnlTemp.add(productos, BorderLayout.CENTER);
        PnlTemp.revalidate();
        PnlTemp.repaint();
        dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnProd = new javax.swing.JButton();
        BtnEnviar = new javax.swing.JButton();
        BtnHistorial = new javax.swing.JButton();
        PnlTemp = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        BtnProd.setText("PRODUCTOS");
        BtnProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProdActionPerformed(evt);
            }
        });

        BtnEnviar.setText("ENVIAR PRODUCTOS ");
        BtnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnviarActionPerformed(evt);
            }
        });

        BtnHistorial.setText("HISTORIAL DE PRODUCTOS ");
        BtnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnlTempLayout = new javax.swing.GroupLayout(PnlTemp);
        PnlTemp.setLayout(PnlTempLayout);
        PnlTempLayout.setHorizontalGroup(
            PnlTempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PnlTempLayout.setVerticalGroup(
            PnlTempLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(BtnProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnEnviar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnHistorial)
                .addContainerGap(297, Short.MAX_VALUE))
            .addComponent(PnlTemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnProd)
                    .addComponent(BtnEnviar)
                    .addComponent(BtnHistorial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PnlTemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnviarActionPerformed
        Enviar env = new Enviar();
        env.setSize(850, 500);
        env.setLocation(0, 0);
        PnlTemp.removeAll();
        PnlTemp.add(env, BorderLayout.CENTER);
        PnlTemp.revalidate();
        PnlTemp.repaint();
    }//GEN-LAST:event_BtnEnviarActionPerformed

    private void BtnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHistorialActionPerformed

        Historial his = new Historial();
        his.setSize(750, 495);
        his.setLocation(0, 0);

        PnlTemp.removeAll();
        PnlTemp.add(his, BorderLayout.CENTER);
        PnlTemp.revalidate();
        PnlTemp.repaint();
    }//GEN-LAST:event_BtnHistorialActionPerformed

    private void BtnProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProdActionPerformed
//        ProductosFm prod = new ProductosFm();
        productos.setSize(750, 495);
        productos.setLocation(0, 0);

        PnlTemp.removeAll();
        PnlTemp.add(productos, BorderLayout.CENTER);
        PnlTemp.revalidate();
        PnlTemp.repaint();
    }//GEN-LAST:event_BtnProdActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        Historial historial = new Historial();
        historial.guardarDatos();
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Principal().setVisible(true);
                Principal prin = new Principal();

                prin.setVisible(true);
                prin.setLocationRelativeTo(null);
                prin.setTitle("Productos");
                prin.setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEnviar;
    private javax.swing.JButton BtnHistorial;
    private javax.swing.JButton BtnProd;
    private javax.swing.JPanel PnlTemp;
    // End of variables declaration//GEN-END:variables
}
