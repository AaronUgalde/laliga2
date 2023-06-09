/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laligacotizacion.modelo;

import com.mycompany.laligacotizacion.controlador.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class EmpresaBD {
    
    public static ArrayList<Empresa> listaEmpresas = new ArrayList<>();
    
    public static void registrarEmpresa(String nombre){
    
        Conexion miConexion = new Conexion();
        
        try{
        
            PreparedStatement ps = miConexion.getConnection().prepareStatement("INSERT INTO empresa (nombre) VALUES (?)");
            ps.setString(1, nombre);
            ps.executeUpdate();
            
        }catch(SQLException e){
        
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se registro");
            
        }
        
    }
    
    public static void eliminarEmpresa(String nombre){
    
        Conexion miConexion = new Conexion();
        
        try{
        
            PreparedStatement ps = miConexion.getConnection().prepareStatement("DELETE FROM empresa WHERE nombre = (?)");
            ps.setString(1, nombre);
            ps.executeUpdate();
        
        }catch(SQLException e){
        
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "No se elimino la empresa");
            
        }
        
    }
    
    public static ArrayList<Empresa> obtenerEmpresas(){
    
        Conexion miConexion = new Conexion();
        ResultSet rs = null;
        listaEmpresas.clear();
        
        try{
        
            PreparedStatement ps = miConexion.getConnection().prepareStatement("SELECT * FROM empresa");
            rs = ps.executeQuery();
            
            while(rs.next()){
            
               Empresa miEmpresa = new Empresa(rs.getString(1));
               listaEmpresas.add(miEmpresa);
                
            }
           
        }catch(SQLException e){
        
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "no se obtuvieron las empresas");
            
        }
        
        System.out.println(listaEmpresas);
        return listaEmpresas;
        
    }
    
    public static Empresa obtenerEmpresa(String nombre){
    
        for(Empresa e: listaEmpresas){
        
            if(e.getNombre().equals(nombre)){
            
                return e;
                
            }
            
        }
        
        return null;
        
    }
    
}
