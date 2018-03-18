/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JNLGHX1
 */
public class juego {
    public String[] generar_pregunta (){
        try {
            Connection miconexion;            
            miconexion = DriverManager.getConnection("jdbc:mysql://149.56.108.68:3306/admin_castro?autoReconnect=true&useSSL=false","castro","yu9W~c62");            
            PreparedStatement miStatement = miconexion.prepareStatement("SELECT * FROM `preguntas` ORDER BY RAND() LIMIT 1");
           ResultSet myrs = miStatement.executeQuery();           
            //4 Recorrer el ResultSet 
            String[] s = new String[2];
                while (myrs.next()){
                    s[0] = myrs.getString("Preguntas");
                    s[1] = myrs.getString("Respuestas");
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
