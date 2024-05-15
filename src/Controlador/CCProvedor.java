package Controlador;
import Modelo.CMProvedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CCProvedor {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public List ListarTablaProvedor (){
    List <CMProvedor> listacli = new ArrayList <>();
    // Asegúrate de tener espacios antes de "FROM", "JOIN" y "ORDER BY"
    String ConSQL ="SELECT * FROM PROVEDOR ORDER BY id_producto ASC";
    
    try {
        con = cn.conectar(); //hacemos la coneccion 
        ps = con.prepareStatement(ConSQL); //preparamos la consulta
        rs = ps.executeQuery();//
        
        while(rs.next()) {
            CMProvedor cli = new CMProvedor();
            cli.setIdProvedor(rs.getInt("id_producto"));
            cli.setNomProvedor(rs.getString("nom_producto"));            
            cli.setDircProvedor(rs.getString("nom_categprod"));
            cli.setStockProvedor(rs.getString("nom_categprod"));
            cli.setEmailProvedor(rs.getString("nom_categprod"));
            listacli.add(cli);
        }
    }
    catch (Exception e) {
        System.out.println("Error al listar Productos"+e.getMessage());
    }
    return listacli;
}
}


