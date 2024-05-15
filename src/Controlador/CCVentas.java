
package Controlador;

import Modelo.CMVentasM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class CCVentas {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    public List ListarTablaProvedor (){
    List <CMVentasM> listacli = new ArrayList <>();
    // Asegúrate de tener espacios antes de "FROM", "JOIN" y "ORDER BY"
    String ConSQL ="SELECT * FROM SEGURO_MOTO ORDER BY id_seguro ASC";
    
    try {
        con = cn.conectar(); //hacemos la coneccion 
        ps = con.prepareStatement(ConSQL); //preparamos la consulta
        rs = ps.executeQuery();//
        
        while(rs.next()) {
            CMVentasM cli = new CMVentasM();
            cli.setIdVenta(rs.getInt("id_producto"));
            cli.setIdCliente(rs.getInt("id_producto"));
            cli.setIdProducto(rs.getInt("id_producto"));
            cli.setFechVenta(rs.getString("nom_producto"));            
            cli.setPrecioVenta(rs.getString("nom_categprod"));
            
            
            listacli.add(cli);
        }
    }
    catch (Exception e) {
        System.out.println("Error al listar Productos"+e.getMessage());
    }
    return listacli;
}

}
