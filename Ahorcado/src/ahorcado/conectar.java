
package Mantenimiento;
import java.sql.Connection;
import java.sql.DriverManager;

public class conectar {
    Connection conectar=null;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/ahorcado?autoReconnect=true&useSSL=false","root","");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return conectar;
    }
    
}
