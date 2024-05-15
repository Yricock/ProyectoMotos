
package Controlador;
import Modelo.CMEmpresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CCEmpresa {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public List ListarTablaEmpresa (){
    List <CMEmpresa> listacli = new ArrayList <>();
    // Asegúrate de tener espacios antes de "FROM", "JOIN" y "ORDER BY"
    String ConSQL ="SELECT * FROM CLIENTES ORDER BY id_cliente ASC";
    
    try {
        con = cn.conectar(); //hacemos la coneccion 
        ps = con.prepareStatement(ConSQL); //preparamos la consulta
        rs = ps.executeQuery();//
        
        while(rs.next()) {
            CMEmpresa cli = new CMEmpresa();
            cli.setIdEmpresa(rs.getInt("id_producto"));
            cli.setIdEmpleado(rs.getInt("id_producto"));
            cli.setIdProvedor(rs.getInt("id_producto"));
            cli.setIdInventario(rs.getInt("id_producto"));
            cli.setNomEmpresa(rs.getString("nom_producto"));            
            cli.setDirEmpresa(rs.getString("nom_categprod"));
            cli.setNumEmpleados(rs.getString("nom_categprod"));
            cli.setUserEmpresa(rs.getString("nom_categprod"));
            cli.setPassEmpresa(rs.getString("nom_categprod"));
            listacli.add(cli);
        }
    }
    catch (Exception e) {
        System.out.println("Error al listar Productos"+e.getMessage());
    }
    return listacli;
}

    
}
