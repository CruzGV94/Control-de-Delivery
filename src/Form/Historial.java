package Form;

import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

public class Historial extends javax.swing.JPanel implements Serializable {

    DefaultTableModel modelo = new DefaultTableModel();

    public Historial() {
        initComponents();
        cargarDatos();
        //guardarDatos();
        //this.setLocationRelativeTo(null);
        modelo.addColumn("vehiculo");
        modelo.addColumn("Distacion");
        modelo.addColumn("Monto");
        modelo.addColumn("Fecha creacion");
        modelo.addColumn("Fecha entrega");

        for (int i = 0; i < ProductosFm.contador; i++) {
            Object[] fila = {ProductosFm.nombre[i], ProductosFm.distancias[i] + "Km", ProductosFm.totalPrecio, ProductosFm.fechasinicio[i], ProductosFm.fechasfinal[i]};
            modelo.addRow(fila);
        }
        //cargarDatos();
        guardarDatos();
        jTable1.setModel(modelo);
    }

    private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("datosTabla.dat"))) {
            Object obj = ois.readObject();
            if (obj instanceof Object[][]) {
                Object[][] data = (Object[][]) obj;
                for (Object[] fila : data) {
                    modelo.addRow(fila);
                }
            }
            System.out.println("Datos cargados exitosamente.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void guardarDatos() {
        try (ObjectOutputStream tab = new ObjectOutputStream(new FileOutputStream("datosTabla.dat"))) {
            Object[][] data = new Object[modelo.getRowCount()][modelo.getColumnCount()];
            for (int i = 0; i < modelo.getRowCount(); i++) {
                for (int j = 0; j < modelo.getColumnCount(); j++) {
                    data[i][j] = modelo.getValueAt(i, j);
                }
            }
            tab.writeObject(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("HISTORIAL DE PEDIDOS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
