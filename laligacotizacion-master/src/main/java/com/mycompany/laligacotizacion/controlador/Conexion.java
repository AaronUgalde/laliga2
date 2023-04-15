package com.mycompany.laligacotizacion.controlador;

import java.sql.*;


/**
 * Clase que permite conectar con la base de datos
 * @author chenao
 *
 */
public class Conexion {
   static String bd = "laliga";
   static String login = "root";
   static String password = "1234";
   static String urlPruebas = "jdbc:hsqldb:file:resources/BD/laliga";
   static String url = "jdbc:hsqldb:file:./resources/BD/laliga";
   
   Connection conn = null;

   /** Constructor de DbConnection */
   public Conexion() {
      try{
         //obtenemos el driver de para mysql
         Class.forName("org.hsqldb.jdbcDriver");
         //obtenemos la conexi�n
         conn = DriverManager.getConnection(urlPruebas,login,password);

         if (conn!=null){
             System.out.println(conn);
            System.out.println("Conecci�n a base de datos "+bd+" OK");
         }
      }
      catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }catch(Exception e){
         System.out.println(e);
      }
   }
   /**Permite retornar la conexi�n*/
   public Connection getConnection(){
      return conn;
   }

   public void desconectar(){
      conn = null;
   }

}