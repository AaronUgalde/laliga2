/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.laligacotizacion.vista;

import com.mycompany.laligacotizacion.modelo.Cliente;
import com.mycompany.laligacotizacion.modelo.ClienteBD;
import com.mycompany.laligacotizacion.modelo.Empresa;
import com.mycompany.laligacotizacion.modelo.EmpresaBD;
import com.mycompany.laligacotizacion.modelo.PDF;
import com.mycompany.laligacotizacion.modelo.Producto;
import java.awt.BorderLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    protected static VentanaAgrClien miVentanaAgrClien = new VentanaAgrClien();
    protected static VentanaAgrEmp miVentanaAgrEmp = new VentanaAgrEmp();
    protected static VentanaCliente miVentanaCliente = new VentanaCliente();
    protected static VentanaEliClien miVentanaEliClien = new VentanaEliClien();
    protected static VentanaEliEmp miVentanaEliEmp = new VentanaEliEmp();
    protected static VentanaEmpresa miVentanaEmpresa = new VentanaEmpresa();
    protected static VentanaProductos miVentanaProductos = new VentanaProductos();
    protected static ArrayList<Empresa> misEmpresas;
    protected static ArrayList<Cliente> misClientes;
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        
        initComponents();
        llenarEmpresas();
        this.setLocationRelativeTo(null);
        
        miVentanaAgrClien.setSize(650,550);
        miVentanaAgrEmp.setSize(650,550);
        miVentanaCliente.setSize(650,550);
        miVentanaEliClien.setSize(650,550);
        miVentanaEliEmp.setSize(650,550);
        miVentanaEmpresa.setSize(650,550);
        miVentanaProductos.setSize(650,550);
        
        contenedor.add(miVentanaAgrClien, BorderLayout.CENTER);
        contenedor.add(miVentanaAgrEmp, BorderLayout.CENTER);
        contenedor.add(miVentanaCliente, BorderLayout.CENTER);
        contenedor.add(miVentanaEliClien, BorderLayout.CENTER);
        contenedor.add(miVentanaEliEmp, BorderLayout.CENTER);
        contenedor.add(miVentanaEmpresa, BorderLayout.CENTER);
        contenedor.add(miVentanaProductos, BorderLayout.CENTER);
        
        miVentanaAgrClien.setVisible(false);
        miVentanaAgrEmp.setVisible(false);
        miVentanaCliente.setVisible(false);
        miVentanaEliClien.setVisible(false);
        miVentanaEliEmp.setVisible(false);
        miVentanaProductos.setVisible(false);
        
        btn_anterior.setEnabled(false);
        btn_generarPDF.setVisible(false);
        btn_generarPDF.setEnabled(false);
        
    }

    static void llenarEmpresas(){
    
        misEmpresas = EmpresaBD.obtenerEmpresas();
        miVentanaEmpresa.jc_empresas.removeAllItems();
        miVentanaEliEmp.jc_eliEmpresa.removeAllItems();
        
        for(int i=0; i<misEmpresas.size(); i++){
        
            miVentanaEmpresa.jc_empresas.addItem(misEmpresas.get(i).getNombre());
            miVentanaEliEmp.jc_eliEmpresa.addItem(misEmpresas.get(i).getNombre());
            
        }
        
    }
    
    static void llenarClientes(String nombre_empresa){
    
        misClientes = ClienteBD.obtenerClientes(nombre_empresa);
        miVentanaCliente.jc_clientes.removeAllItems();
        miVentanaEliClien.jc_eliCliente.removeAllItems();
        
        for(int i=0; i<misClientes.size(); i++){
        
            miVentanaCliente.jc_clientes.addItem(misClientes.get(i).getNombre());
            miVentanaEliClien.jc_eliCliente.addItem(misClientes.get(i).getNombre());
                    
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_anterior = new javax.swing.JButton();
        btn_siguiente = new javax.swing.JButton();
        btn_generarPDF = new javax.swing.JButton();
        contenedor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_anterior.setText("anterior");
        btn_anterior.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btn_anterior.setVerifyInputWhenFocusTarget(false);
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });

        btn_siguiente.setText("siguiente");
        btn_siguiente.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btn_siguiente.setVerifyInputWhenFocusTarget(false);
        btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguienteActionPerformed(evt);
            }
        });

        btn_generarPDF.setText("generarPDF");
        btn_generarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarPDFActionPerformed(evt);
            }
        });

        contenedor.setBackground(new java.awt.Color(51, 153, 0));
        contenedor.setPreferredSize(new java.awt.Dimension(650, 550));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addComponent(btn_anterior)
                .addGap(73, 73, 73)
                .addComponent(btn_generarPDF)
                .addGap(97, 97, 97)
                .addComponent(btn_siguiente)
                .addGap(287, 287, 287))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_generarPDF)
                    .addComponent(btn_anterior)
                    .addComponent(btn_siguiente))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed

       if (miVentanaCliente.isVisible() || miVentanaAgrEmp.isVisible() || miVentanaEliEmp.isVisible()){
           
           miVentanaCliente.setVisible(false);
           miVentanaAgrEmp.setVisible(false);
           miVentanaEliEmp.setVisible(false);
           miVentanaEmpresa.setVisible(true);
           btn_anterior.setEnabled(false);
           btn_siguiente.setEnabled(true);
                   
       }else if(miVentanaProductos.isVisible() || miVentanaEliClien.isVisible() || miVentanaAgrClien.isVisible()){

           miVentanaProductos.setVisible(false);
           miVentanaEliClien.setVisible(false);
           miVentanaAgrClien.setVisible(false);
           miVentanaCliente.setVisible(true);
           btn_siguiente.setEnabled(true);
           btn_generarPDF.setEnabled(false);
           btn_generarPDF.setVisible(false);
           
       }
        
    }//GEN-LAST:event_btn_anteriorActionPerformed

    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed

        if(miVentanaEmpresa.isVisible()){
        
            btn_anterior.setEnabled(true);
            miVentanaEmpresa.setVisible(false);
            miVentanaCliente.setVisible(true);
            llenarClientes((String) miVentanaEmpresa.jc_empresas.getSelectedItem());
            
        }else if(miVentanaCliente.isVisible()){
        
            btn_siguiente.setEnabled(false);
            btn_generarPDF.setVisible(true);
            btn_generarPDF.setEnabled(true);
            miVentanaCliente.setVisible(false);
            miVentanaProductos.setVisible(true);
            Producto.listaProductos.clear();
        
        }
        
    }//GEN-LAST:event_btn_siguienteActionPerformed

    private void btn_generarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarPDFActionPerformed
        
        PDF miPdf = new PDF(VentanaEmpresa.jc_empresas.getSelectedItem().toString(), ClienteBD.getCliente(VentanaCliente.jc_clientes.getSelectedItem().toString()), VentanaProductos.tf_nombreProyecto.getText(), Producto.getListaProductos(), VentanaProductos.ta_notas.getText(), VentanaProductos.tf_fechaDelProyecto.getText());
        try {
            miPdf.generarPDF();
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_generarPDFActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JButton btn_anterior;
    protected static javax.swing.JButton btn_generarPDF;
    protected static javax.swing.JButton btn_siguiente;
    protected static javax.swing.JPanel contenedor;
    // End of variables declaration//GEN-END:variables
}
