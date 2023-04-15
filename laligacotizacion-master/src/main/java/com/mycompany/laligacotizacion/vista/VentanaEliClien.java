/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.laligacotizacion.vista;

import com.mycompany.laligacotizacion.modelo.ClienteBD;
import com.mycompany.laligacotizacion.modelo.EmpresaBD;
import static com.mycompany.laligacotizacion.vista.VentanaPrincipal.miVentanaEmpresa;

/**
 *
 * @author HP
 */
public class VentanaEliClien extends javax.swing.JPanel {

    /**
     * Creates new form VentanaEliClien
     */
    public VentanaEliClien() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_eliCliente = new javax.swing.JButton();
        jc_eliCliente = new javax.swing.JComboBox<>();

        jLabel1.setText("¿Qué cliente quieres eliminar?");

        btn_eliCliente.setText("Eliminar");
        btn_eliCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliClienteActionPerformed(evt);
            }
        });

        jc_eliCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_eliCliente)
                .addGap(294, 294, 294))
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jc_eliCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(242, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jc_eliCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(btn_eliCliente)
                .addContainerGap(280, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliClienteActionPerformed

        ClienteBD.eliminarCliente(jc_eliCliente.getSelectedItem().toString());
        VentanaPrincipal.llenarClientes((String) miVentanaEmpresa.jc_empresas.getSelectedItem());
        
    }//GEN-LAST:event_btn_eliClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliCliente;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JComboBox<String> jc_eliCliente;
    // End of variables declaration//GEN-END:variables
}