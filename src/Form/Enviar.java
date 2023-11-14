package Form;

import Clases.HiloIm1;
import Clases.hilo2;
import Clases.hilo3;
import Form.ProductosFm;
import java.awt.Image;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Enviar extends javax.swing.JPanel implements Serializable{

    public Enviar() {
        initComponents();

        jLabelDistancia1.setText("Distacia: " + String.valueOf(ProductosFm.distancia[0]) + "Km");
        jLabelDistancia2.setText("Distacia: " + String.valueOf(ProductosFm.distancia[1]) + "Km");
        jLabelDistancia3.setText("Distacia: " + String.valueOf(ProductosFm.distancia[2]) + "Km");

        ImageIcon imagen1 = new ImageIcon(getClass().getResource("motorista3.png"));
        Image img1 = imagen1.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        jLabelim1.setIcon(new ImageIcon(img1));

        ImageIcon imagen2 = new ImageIcon(getClass().getResource("motorista3.png"));
        Image img2 = imagen2.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        jLabelim2.setIcon(new ImageIcon(img2));
//        
        ImageIcon imagen3 = new ImageIcon(getClass().getResource("motorista3.png"));
        Image img3 = imagen3.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        jLabelim3.setIcon(new ImageIcon(img3));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnEnviarTodo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelDistancia1 = new javax.swing.JLabel();
        btnEnviar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabelDistancia2 = new javax.swing.JLabel();
        btnEnviar2 = new javax.swing.JButton();
        btnEnviar3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabelDistancia3 = new javax.swing.JLabel();
        PnlEnviar = new javax.swing.JPanel();
        jLabelim1 = new javax.swing.JLabel();
        jLabelim2 = new javax.swing.JLabel();
        jLabelim3 = new javax.swing.JLabel();
        pnlChoque = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("VISUALIZACIÓN DE TRAYECTORIAS ");

        btnEnviarTodo.setText("ENVIAR TODO");
        btnEnviarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarTodoActionPerformed(evt);
            }
        });

        jLabel1.setText("Motocicleta 1");

        btnEnviar1.setText("Enviar ");
        btnEnviar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviar1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Motocicleta 2");

        btnEnviar2.setText("Enviar ");
        btnEnviar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviar2ActionPerformed(evt);
            }
        });

        btnEnviar3.setText("Enviar ");
        btnEnviar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviar3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Motocicleta 3");

        PnlEnviar.setBackground(new java.awt.Color(255, 255, 255));
        PnlEnviar.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout PnlEnviarLayout = new javax.swing.GroupLayout(PnlEnviar);
        PnlEnviar.setLayout(PnlEnviarLayout);
        PnlEnviarLayout.setHorizontalGroup(
            PnlEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlEnviarLayout.createSequentialGroup()
                .addGroup(PnlEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelim1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnlEnviarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PnlEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelim2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelim3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 565, Short.MAX_VALUE))
        );
        PnlEnviarLayout.setVerticalGroup(
            PnlEnviarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlEnviarLayout.createSequentialGroup()
                .addComponent(jLabelim1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelim2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabelim3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 101, Short.MAX_VALUE))
        );

        pnlChoque.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout pnlChoqueLayout = new javax.swing.GroupLayout(pnlChoque);
        pnlChoque.setLayout(pnlChoqueLayout);
        pnlChoqueLayout.setHorizontalGroup(
            pnlChoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 48, Short.MAX_VALUE)
        );
        pnlChoqueLayout.setVerticalGroup(
            pnlChoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelDistancia1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnEnviar1)
                            .addComponent(jLabel4)
                            .addComponent(jLabelDistancia2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEnviar2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEnviar3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelDistancia3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addComponent(PnlEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel2)
                        .addGap(80, 80, 80)
                        .addComponent(btnEnviarTodo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlChoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEnviarTodo)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDistancia1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEnviar1)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDistancia2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEnviar2)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDistancia3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEnviar3))
                            .addComponent(PnlEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlChoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btnEnviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviar1ActionPerformed

        HiloIm1 hilo1 = new HiloIm1();
        hilo1.start();
    }//GEN-LAST:event_btnEnviar1ActionPerformed

    private void btnEnviarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarTodoActionPerformed

        HiloIm1 hilo1 = new HiloIm1();
        hilo1.start();

        hilo2 hilo2 = new hilo2();
        hilo2.start();

        hilo3 hilo3 = new hilo3();
        hilo3.start();
    }//GEN-LAST:event_btnEnviarTodoActionPerformed

    private void btnEnviar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviar2ActionPerformed

        hilo2 hilo2 = new hilo2();
        hilo2.start();
    }//GEN-LAST:event_btnEnviar2ActionPerformed

    private void btnEnviar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviar3ActionPerformed

        hilo3 hilo3 = new hilo3();
        hilo3.start();
    }//GEN-LAST:event_btnEnviar3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlEnviar;
    private javax.swing.JButton btnEnviar1;
    private javax.swing.JButton btnEnviar2;
    private javax.swing.JButton btnEnviar3;
    private javax.swing.JButton btnEnviarTodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabelDistancia1;
    private javax.swing.JLabel jLabelDistancia2;
    private javax.swing.JLabel jLabelDistancia3;
    public static javax.swing.JLabel jLabelim1;
    public static javax.swing.JLabel jLabelim2;
    public static javax.swing.JLabel jLabelim3;
    private javax.swing.JPanel pnlChoque;
    // End of variables declaration//GEN-END:variables
}
