
package Controlador;

import Modelo.CMProductos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CCProductosM { 
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public List ListarTablaProductos (){
    List <CMProductos> listacli = new ArrayList <>();
    // Asegúrate de tener espacios antes de "FROM", "JOIN" y "ORDER BY"
    String ConSQL ="SELECT * FROM PRODUCTO ORDER BY id_producto ASC";
    
    try {
        con = cn.conectar(); //hacemos la coneccion 
        ps = con.prepareStatement(ConSQL); //preparamos la consulta
        rs = ps.executeQuery();//
        
        while(rs.next()) {
            CMProductos cli = new CMProductos();
            cli.setIdproducto(rs.getInt("id_producto"));
            cli.setMarcaproducto(rs.getString("marca_producto"));            
            cli.setModeloproducto(rs.getString("modelo_producto"));
            cli.setColorproducto(rs.getString("color_producto"));
            cli.setAñoproducto(rs.getString("año_producto"));
            listacli.add(cli);
        }
    }
    catch (Exception e) {
        System.out.println("Error al listar Productos"+e.getMessage());
    }
    return listacli;
}
}
