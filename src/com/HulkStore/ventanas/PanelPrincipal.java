/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.HulkStore.ventanas;

import com.HulkStore.conexion.AccionesProductos;
import com.HulkStore.conexion.DBconnection;
import com.HulkStore.datos.ListaProductos;
import com.HulkStore.datos.Producto;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author linux
 */
public class PanelPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PanelPrincipal
     */
    static int col;
    public PanelPrincipal() {
        try {
            DBconnection.crearBase();
        } catch (IOException ex) {
            Logger.getLogger(PanelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        buscaProduto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBLproductos = new javax.swing.JTable();
        TXTbusca = new javax.swing.JTextField();
        BTNbusca = new javax.swing.JButton();
        BTNnuevoproducto = new javax.swing.JButton();
        BTNingresomercaderia = new javax.swing.JButton();
        BTNventamercaderia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hulk Store");

        TBLproductos.setAutoCreateRowSorter(true);
        TBLproductos.getTableHeader().setReorderingAllowed(false);
        TBLproductos.setDefaultEditor(Object.class,null);
        TBLproductos.getTableHeader().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                col = TBLproductos.columnAtPoint(e.getPoint());
            }
        });
        TBLproductos.setModel(new javax.swing.table.DefaultTableModel(
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
        TBLproductos.setFocusable(false);
        jScrollPane1.setViewportView(TBLproductos);

        BTNbusca.setText("Buscar");
        BTNbusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNbuscaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(TXTbusca, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNbusca, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(275, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTbusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNbusca))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
        );

        BTNnuevoproducto.setText("Agregar Producto");
        BTNnuevoproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNnuevoproductoActionPerformed(evt);
            }
        });

        BTNingresomercaderia.setText("Ingreso de mercaderia");
        BTNingresomercaderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNingresomercaderiaActionPerformed(evt);
            }
        });

        BTNventamercaderia.setText("Registrar venta");
        BTNventamercaderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNventamercaderiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BTNnuevoproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTNingresomercaderia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTNventamercaderia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BTNnuevoproducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNingresomercaderia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNventamercaderia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTNbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNbuscaActionPerformed
        buscaProduto();
    }//GEN-LAST:event_BTNbuscaActionPerformed

    private void BTNnuevoproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNnuevoproductoActionPerformed
        AgregarProducto agrega = new AgregarProducto(this, true);
        agrega.setVisible(true);
    }//GEN-LAST:event_BTNnuevoproductoActionPerformed

    private void BTNingresomercaderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNingresomercaderiaActionPerformed
        if (TBLproductos.getSelectedRow() < 0){
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un item de la lista","Informacion",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            Producto prod = new Producto();
            prod.setCodigo(TBLproductos.getValueAt(TBLproductos.getSelectedRow(), 0).toString());
            prod.setDescripcion(TBLproductos.getValueAt(TBLproductos.getSelectedRow(), 1).toString());
            prod.setStockActual((int) TBLproductos.getValueAt(TBLproductos.getSelectedRow(), 2));
            IngresoMercaderia ingreso = new IngresoMercaderia(this, true, prod);
            ingreso.setVisible(true);
        }
    }//GEN-LAST:event_BTNingresomercaderiaActionPerformed

    private void BTNventamercaderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNventamercaderiaActionPerformed
        if (TBLproductos.getSelectedRow() < 0){
            javax.swing.JOptionPane.showMessageDialog(this, "Seleccione un item de la lista","Informacion",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        else if ((int)TBLproductos.getValueAt(TBLproductos.getSelectedRow(),2)<=0){
            javax.swing.JOptionPane.showMessageDialog(this, "Item sin stock, no es posible realizar ventas","Advertencia",javax.swing.JOptionPane.WARNING_MESSAGE);
        }
        else {
            Producto prod = new Producto();
            prod.setCodigo(TBLproductos.getValueAt(TBLproductos.getSelectedRow(), 0).toString());
            prod.setDescripcion(TBLproductos.getValueAt(TBLproductos.getSelectedRow(), 1).toString());
            prod.setStockActual((int) TBLproductos.getValueAt(TBLproductos.getSelectedRow(), 2));
            VentaMercaderia venta = new VentaMercaderia(this, true, prod);
            venta.setVisible(true);
        }
    }//GEN-LAST:event_BTNventamercaderiaActionPerformed

    public static void buscaProduto(){
        //popular tabla con productos cargados
        DefaultTableModel items = new DefaultTableModel();
        items.addColumn("Codigo");
        items.addColumn("Descripcion");
        items.addColumn("Stock");
        String criterioBusqueda = "Codigo";
        TBLproductos.removeAll();
        TBLproductos.setModel(items);
        switch (col){
            case 0 :
                criterioBusqueda = "Codigo";
                break;
            case 1 :
                criterioBusqueda = "Descripcion";
                break;
            case 2 :
                criterioBusqueda = "Stock";
        }
        Object [] O = null;
        ListaProductos prods = AccionesProductos.listarProductos( TXTbusca.getText(), criterioBusqueda );
        for (int i = 0; i<prods.getSize(); i++){
            items.addRow(O);
            Producto prod = prods.getProducto(i);
            items.setValueAt(prod.getCodigo(), i, 0);
            items.setValueAt(prod.getDescripcion(), i, 1);
            items.setValueAt(prod.getStockActual(), i, 2);
            items.fireTableDataChanged();
        }
    }
            
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
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNbusca;
    private javax.swing.JButton BTNingresomercaderia;
    private javax.swing.JButton BTNnuevoproducto;
    private javax.swing.JButton BTNventamercaderia;
    private static javax.swing.JTable TBLproductos;
    private static javax.swing.JTextField TXTbusca;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
