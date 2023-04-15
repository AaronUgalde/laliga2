/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.laligacotizacion.vista;

import javax.swing.JButton;

/**
 *
 * @author HP
 */
public class VentanaCliente extends javax.swing.JPanel {
    
    JButton miButton = new JButton("\u2718");
    JButton miButton1 = new JButton("Modificar");

    public VentanaCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_agrCliente = new javax.swing.JButton();
        btn_eliCliente = new javax.swing.JButton();
        jc_clientes = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setText("¿Para que cliente es el trabajo?");

        btn_agrCliente.setText("Agregar cliente");
        btn_agrCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agrClienteActionPerformed(evt);
            }
        });

        btn_eliCliente.setText("Eliminar cliente");
        btn_eliCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliClienteActionPerformed(evt);
            }
        });

        jc_clientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jc_clientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jc_clientesItemStateChanged(evt);
            }
        });

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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jc_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(171, 171, 171))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_agrCliente)
                    .addComponent(btn_eliCliente))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48)
                        .addComponent(btn_agrCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jc_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btn_eliCliente)
                        .addContainerGap(349, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agrClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agrClienteActionPerformed
        
        VentanaPrincipal.contenedor.add( VentanaPrincipal.miVentanaAgrClien);
        VentanaPrincipal.miVentanaAgrClien.setVisible(true);
        VentanaPrincipal.contenedor.revalidate();
        VentanaPrincipal.contenedor.repaint();
        this.setVisible(false);
        VentanaPrincipal.btn_anterior.setEnabled(true);
        VentanaPrincipal.btn_siguiente.setEnabled(false);
    }//GEN-LAST:event_btn_agrClienteActionPerformed

    private void btn_eliClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliClienteActionPerformed

        VentanaPrincipal.contenedor.add( VentanaPrincipal.miVentanaEliClien);
        VentanaPrincipal.miVentanaEliClien.setVisible(true);
        VentanaPrincipal.contenedor.revalidate();
        VentanaPrincipal.contenedor.repaint();
        this.setVisible(false);
        VentanaPrincipal.btn_anterior.setEnabled(true);
        VentanaPrincipal.btn_siguiente.setEnabled(false);
        
    }//GEN-LAST:event_btn_eliClienteActionPerformed

    private void jc_clientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jc_clientesItemStateChanged
        //ashdjahdjasd
    }//GEN-LAST:event_jc_clientesItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agrCliente;
    private javax.swing.JButton btn_eliCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public static javax.swing.JComboBox<String> jc_clientes;
    // End of variables declaration//GEN-END:variables
}
