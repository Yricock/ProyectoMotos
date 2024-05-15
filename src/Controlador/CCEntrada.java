
package Controlador;
import Modelo.CMEntrada;
import Modelo.CMEntrada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class CCEntrada {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public List ListarTablaEntrada (){
    List <CMEntrada> listacli = new ArrayList <>();
    // Asegúrate de tener espacios antes de "FROM", "JOIN" y "ORDER BY"
    String ConSQL ="SELECT * FROM PROVEDOR ORDER BY id_producto ASC";
    
    try {
        con = cn.conectar(); //hacemos la coneccion 
        ps = con.prepareStatement(ConSQL); //preparamos la consulta
        rs = ps.executeQuery();//
        
        while(rs.next()) {
            CMEntrada cli = new CMEntrada();
            cli.setIdEntrada(rs.getInt("id_producto"));
            cli.setCantInventario(rs.getString("nom_producto"));            
            cli.setFechaInventario(rs.getString("nom_categprod"));
            
            listacli.add(cli);
        }
    }
    catch (Exception e) {
        System.out.println("Error al listar Productos"+e.getMessage());
    }
    return listacli;
}
}
