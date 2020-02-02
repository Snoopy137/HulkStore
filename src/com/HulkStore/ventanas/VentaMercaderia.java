/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.HulkStore.ventanas;

import com.HulkStore.conexion.AccionesProductos;
import com.HulkStore.datos.Producto;
import static com.HulkStore.ventanas.PanelPrincipal.buscaProduto;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author linux
 */
public class VentaMercaderia extends javax.swing.JDialog {

    /**
     * Creates new form VentaMercaderia
     */
    public VentaMercaderia(java.awt.Frame parent, boolean modal, Producto prod) {
        super(parent, modal);
        initComponents();
        llenarCampos(prod);
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
        LBLcodigo = new javax.swing.JLabel();
        LBLdescripcion = new javax.swing.JLabel();
        LBLcantidad = new javax.swing.JLabel();
        TXTcodigo = new javax.swing.JTextField();
        TXTdescripcion = new javax.swing.JTextField();
        TXTcantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TXTstock = new javax.swing.JTextField();
        BTNcancelar = new javax.swing.JButton();
        BTNguardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LBLcodigo.setText("Codigo");

        LBLdescripcion.setText("Descripcion");

        LBLcantidad.setText("Cantidad");

        TXTcodigo.setEditable(false);
        TXTcodigo.setFocusable(false);

        TXTdescripcion.setEditable(false);
        TXTdescripcion.setFocusable(false);

        jLabel1.setText("Stock");

        TXTstock.setEditable(false);
        TXTstock.setFocusable(false);

        BTNcancelar.setText("Cancelar");
        BTNcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNcancelarActionPerformed(evt);
            }
        });

        BTNguardar.setText("Guardar");
        BTNguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNguardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLcodigo)
                    .addComponent(LBLdescripcion)
                    .addComponent(jLabel1)
                    .addComponent(LBLcantidad))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TXTcantidad)
                    .addComponent(TXTcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(TXTdescripcion)
                    .addComponent(TXTstock, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addComponent(BTNguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTNcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLcodigo)
                    .addComponent(TXTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLdescripcion)
                    .addComponent(TXTdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TXTstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLcantidad)
                    .addComponent(TXTcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNcancelar)
                    .addComponent(BTNguardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTNcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNcancelarActionPerformed
        //cerrar ventana con boton "cancelar"
        dispose();
    }//GEN-LAST:event_BTNcancelarActionPerformed

    private void BTNguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNguardarActionPerformed
        try {
            //actualiza stock con dato vendido por usuario al formulario
            Producto prod = new Producto(TXTdescripcion.getText(),Integer.parseInt(TXTstock.getText()),TXTcodigo.getText().toUpperCase());
            int resultado = AccionesProductos.ventaMercaderia(prod, Integer.parseInt(TXTcantidad.getText()));
            switch (resultado) {
                //notificacion de reultado al usario
                case 2:
                javax.swing.JOptionPane.showMessageDialog(this, "Error en carga a base de datos","Error",javax.swing.JOptionPane.ERROR_MESSAGE);
                break;
                case 1:
                dispose();
                buscaProduto();
                javax.swing.JOptionPane.showMessageDialog(this, "Carga Exitosa","Informacion",javax.swing.JOptionPane.INFORMATION_MESSAGE);
                break;
                case 3:
                javax.swing.JOptionPane.showMessageDialog(this, "Mas que el stock","Informacion",javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error en carga\nDetalle:"+ex,"Error",javax.swing.JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(AgregarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        PanelPrincipal.buscaProduto();
    }//GEN-LAST:event_BTNguardarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void llenarCampos(Producto prod) {
        TXTcodigo.setText(prod.getCodigo());
        TXTdescripcion.setText(prod.getDescripcion());
        TXTstock.setText(String.valueOf(prod.getStockActual()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNcancelar;
    private javax.swing.JButton BTNguardar;
    private javax.swing.JLabel LBLcantidad;
    private javax.swing.JLabel LBLcodigo;
    private javax.swing.JLabel LBLdescripcion;
    private javax.swing.JTextField TXTcantidad;
    private javax.swing.JTextField TXTcodigo;
    private javax.swing.JTextField TXTdescripcion;
    private javax.swing.JTextField TXTstock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
