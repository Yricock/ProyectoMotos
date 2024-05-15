
package Controlador;
import Modelo.CMInventario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class CCInventario {
        Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    public List ListarTablaProvedor (){
    List <CMInventario> listacli = new ArrayList <>();
    // Asegúrate de tener espacios antes de "FROM", "JOIN" y "ORDER BY"
    String ConSQL ="SELECT * FROM SEGURO_MOTO ORDER BY id_seguro ASC";
    
    try {
        con = cn.conectar(); //hacemos la coneccion 
        ps = con.prepareStatement(ConSQL); //preparamos la consulta
        rs = ps.executeQuery();//
        
        while(rs.next()) {
            CMInventario cli = new CMInventario();
            cli.setIdInventario(rs.getInt("id_producto"));
            cli.setIdEntrada(rs.getInt("id_producto"));
            cli.setIdSalida(rs.getInt("id_producto"));
            cli.setCantiProducto(rs.getString("nom_producto"));            
            cli.setPrecioProducto(rs.getString("nom_categprod"));
            
            
            listacli.add(cli);
        }
    }
    catch (Exception e) {
        System.out.println("Error al listar Productos"+e.getMessage());
    }
    return listacli;
}

    
}
