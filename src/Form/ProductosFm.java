package Form;

import Clases.Productos;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Clases.Serializar;
import java.io.Serializable;

public class ProductosFm extends javax.swing.JPanel implements Serializable{

    public static int[] distancia = {0, 0, 0};
    public static String[] nombres = {"Motocicleta1", "Motocicleta2", "Motocicleta3"};
    public static int contador = 0;

    public static String[] fechasinicio = new String[10];
    public static String[] fechasfinal = new String[10];
    public static String[] nombre = new String[10];
    public static String[] distancias = new String[10];
    //public static double[] totalPrecio = new double[10];
    public static double totalPrecio = 0.0;

    private Enviar enviarFrame;
    private ArrayList<Productos> listaPedidos = new ArrayList<>();
    private ArrayList<Productos> listaProd = new ArrayList<>();
    private ArrayList<Productos> listaPedidosVehiculo1 = new ArrayList<>();  // Lista de pedidos para vehículo 1
    private ArrayList<Productos> listaPedidosVehiculo2 = new ArrayList<>();  // Lista de pedidos para vehículo 2
    private ArrayList<Productos> listaPedidosVehiculo3 = new ArrayList<>();  // Lista de pedidos para vehículo 3

    public ProductosFm() {
        initComponents();
        llenarTablaProd();
        llenarTablaPedidos();
        enviarFrame = new Enviar();
        int valor = cbxEnviar.getSelectedIndex();
        txtKm.setText(String.valueOf(distancia[valor]));
    }

    public void llenarTablaProd() {
        listaProd.add(new Productos("Hamburguesa", 35, 0));
        listaProd.add(new Productos("Pizza", 60, 0));
        listaProd.add(new Productos("Papas", 15, 0));
        listaProd.add(new Productos("Coca-Cola", 5, 0));
        //JTable tabla = new JTable();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance();
        for (Productos producto : listaProd) {
            Object[] fila = {producto.getNombre(), formatoMoneda.format(producto.getPrecio())};
            modelo.addRow(fila);
        }
        TablaProductos.setModel(modelo);

        ArrayList<Productos> productosDeserializados = Serializar.deserializarProductos("productos.dat");

    }

    public void llenarTablaPedidos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");

        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance();

        for (Productos producto : listaPedidos) {
            Object[] fila = {producto.getNombre(), formatoMoneda.format(producto.getPrecio())};
            modelo.addRow(fila);
        }
        TablaPedido.setModel(modelo);
    }

    public void PasarDatos() {
        // Obtener el índice de la fila seleccionada
        int filaSeleccionada = TablaProductos.getSelectedRow();
        String distancia = txtKm.getText();
        // Verificar si hay una fila seleccionada
        if (filaSeleccionada != -1 && !distancia.isEmpty()) {
            // Obtener el nombre y el precio del producto seleccionado
            String nombre = (String) TablaProductos.getValueAt(filaSeleccionada, 0);
            double precio = Double.parseDouble(((String) TablaProductos.getValueAt(filaSeleccionada, 1)).replace("Q", ""));
            //String distancia = txtKm.getText();
            int valor = Integer.parseInt(txtKm.getText());

            // Obtener el vehículo seleccionado
            String vehiculo = cbxEnviar.getSelectedItem().toString();

            switch (vehiculo) {
                case "Vehículo 1 ":
                    listaPedidosVehiculo1.add(new Productos(nombre, precio, valor));
                    break;
                case "Vehículo 2 ":
                    listaPedidosVehiculo2.add(new Productos(nombre, precio, valor));
                    break;
                case "Vehículo 3":
                    listaPedidosVehiculo3.add(new Productos(nombre, precio, valor));
                    break;
            }
            // Añadir el producto a la lista de pedidos
            listaPedidos.add(new Productos(nombre, precio, valor));
            //totalPrecio[contador] += precio;
            totalPrecio += precio;
            jLlTotal.setText("Total: Q" + totalPrecio);
            // Llenar la tabla de pedidos nuevamente
            llenarTablaPedidos();
        } else {
            JOptionPane.showMessageDialog(this, "Llene campos vacios");
        }
    }

    public void vaciarTablaPedidos() {
        DefaultTableModel modelo = (DefaultTableModel) TablaPedido.getModel();
        modelo.setRowCount(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPedido = new javax.swing.JTable();
        BtnAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbxEnviar = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtKm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLlTotal = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Productos ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Pedido ");

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaProductos);

        TablaPedido.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(TablaPedido);

        BtnAgregar.setText("AGREGAR PRODUCTO SELECCIONADO A LA LISTA ");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        jLabel4.setText("VEHÍCULO");

        cbxEnviar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vehículo 1 ", "Vehículo 2 ", "Vehículo 3" }));
        cbxEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEnviarActionPerformed(evt);
            }
        });

        jLabel5.setText("Distancia a Recorrer ");

        jLabel6.setText("Km");

        jLlTotal.setText("Total ");

        btnConfirmar.setText("CONFIRMAR PEDIDO ");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel2)
                        .addGap(325, 325, 325)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29)
                                .addComponent(cbxEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 331, Short.MAX_VALUE)
                                .addComponent(btnConfirmar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(BtnAgregar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(101, 101, 101)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAgregar)
                    .addComponent(jLlTotal))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnConfirmar))
                .addContainerGap(117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed

        int filaSeleccionada = TablaProductos.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un prodcucta en la tabla.", "Selección Requerida", JOptionPane.WARNING_MESSAGE);
            return;
        }
        PasarDatos();
    }//GEN-LAST:event_BtnAgregarActionPerformed

//Funcion para asignar prodcutos 
    private void asignarProdutosALista(ArrayList<Productos> Lista) {
        for (Productos productos : listaPedidos) {
            listaPedidos.add(new Productos(productos.getNombre(), productos.getPrecio(), productos.getDistancia()));
        }
    }

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try {
            if (distancia[cbxEnviar.getSelectedIndex()] != Integer.parseInt(txtKm.getText()) && Integer.parseInt(txtKm.getText()) <= 10 && Integer.parseInt(txtKm.getText()) > 0) {
                int dist = Integer.parseInt(txtKm.getText());
                distancia[cbxEnviar.getSelectedIndex()] = dist;
                JOptionPane.showMessageDialog(null, "Se guardo correctamente.");

                vaciarTablaPedidos();
                //llenarTablaPedidos();
            } else {
                JOptionPane.showMessageDialog(null, "Valor incorrecto");
                int dist = cbxEnviar.getSelectedIndex();
                txtKm.setText(String.valueOf(distancia[dist]));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor solo ingrese valores numericos.");
        }

        listaPedidos.clear();
        totalPrecio = 0.0;
        llenarTablaPedidos();
        Serializar.serializarProductos(listaProd, "productos.dat");
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void cbxEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEnviarActionPerformed
        // TODO add your handling code here:
        int valor = cbxEnviar.getSelectedIndex();
        txtKm.setText(String.valueOf(distancia[valor]));
    }//GEN-LAST:event_cbxEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JTable TablaPedido;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton btnConfirmar;
    public static javax.swing.JComboBox<String> cbxEnviar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLlTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextField txtKm;
    // End of variables declaration//GEN-END:variables
}
