/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JNLGHX1
 */
public class DB {
    public String nombre_db="proyecto_agua",user_db="root",password_db="";
    public String[] top_usuarios (){
        try {
            Connection miconexion;            
            miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+nombre_db+"?autoReconnect=true&useSSL=false",user_db,password_db);            
            PreparedStatement miStatement = miconexion.prepareStatement("SELECT * FROM `users` ORDER BY `users`.`tiempo` ASC LIMIT 5");
           ResultSet myrs = miStatement.executeQuery();           
            //4 Recorrer el ResultSet 
            String[] s = new String[5];
            int a=0;
                while (myrs.next()){
                    s[a] = myrs.getString("username");
                  //  System.out.println(s[a]);
                    a++;
                }
             //5 Cerrar la Conexión a la BD
            miconexion.close();
            return s;
        } catch (SQLException ex) {
           System.out.println ("no conecta " + ex.getMessage() );
            return new String[5];
        } 
    }
    public String[] generar_pregunta (){
        try {
            Connection miconexion;            
            miconexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+nombre_db+"?autoReconnect=true&useSSL=false",user_db,password_db);            
            PreparedStatement miStatement = miconexion.prepareStatement("SELECT * FROM `preguntas` ORDER BY RAND() LIMIT 1");
           ResultSet myrs = miStatement.executeQuery();           
            //4 Recorrer el ResultSet 
            String[] s = new String[2];
                while (myrs.next()){
                    s[0] = myrs.getString("pregunta");
                    s[1] = myrs.getString("imagen");
                    s[2] = myrs.getString("id");
                    break;
                }            
             //5 Cerrar la Conexión a la BD
            miconexion.close();
            return s;
        } catch (SQLException ex) {
           System.out.println ("no conecta " + ex.getMessage() );
            return new String[5];
        } 
    }
}
