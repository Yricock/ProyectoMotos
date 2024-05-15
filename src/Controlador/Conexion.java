
package Controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    Connection cone;
    String url,usuario,pass; //para la Base de datos
    
    public Conexion(){
        cone=null;
    }
 
public Connection conectar()
{
    try {
      
        Class.forName("oracle.jdbc.OracleDriver");
        url="jdbc:oracle:thin:@localhost:1521:XE";
        usuario="MOTOS";
        pass="123";
        cone=DriverManager.getConnection(url, usuario, pass);
               
      
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null,"No se pudo realizar la Conexion"+e.getMessage());
    }
    return cone;
}

public void desconectar()
{
    try {
        cone.close();
    } 
    catch (Exception e) {
        JOptionPane.showMessageDialog(null,"No se pudo realizar la Desconexion"+e.getMessage());
    }
}        
    
        
    
}
