
package Controlador;

import Modelo.CMVentasM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class CCVentas {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    public List ListarTablaVentas (){
    List <CMVentasM> listacli = new ArrayList <>();
    // Asegúrate de tener espacios antes de "FROM", "JOIN" y "ORDER BY"
    String ConSQL ="SELECT * FROM VENTA ORDER BY id_venta ASC";
    
    try {
        con = cn.conectar(); //hacemos la coneccion 
        ps = con.prepareStatement(ConSQL); //preparamos la consulta
        rs = ps.executeQuery();//
        
        while(rs.next()) {
            CMVentasM cli = new CMVentasM();
            cli.setIdVenta(rs.getInt("id_venta"));
            cli.setIdCliente(rs.getInt("id_cliente"));
            cli.setIdProducto(rs.getInt("id_producto"));
            cli.setFechVenta(rs.getString("fecha_venta"));            
            cli.setPrecioVenta(rs.getString("precio_venta"));
            
            
            listacli.add(cli);
        }
    }
    catch (Exception e) {
        System.out.println("Error al listar Productos"+e.getMessage());
    }
    return listacli;
}
    public int InsertarVentas (Object obj []){
         int est = 0;
         String ConSql = "INSERT INTO VENTAS(fecha_venta,precio_venta) VALUES(?,?)";
         
         try {
             con = cn.conectar();
             ps = con.prepareStatement(ConSql);
             ps.setObject(1, obj[0]);
             ps.setObject(2, obj[1]);
             //ps.setObject(3, obj[2]);
             //ps.setObject(3, obj[2]);
             
             est = ps.executeUpdate();
             
          
         }
         catch (Exception e){
             System.out.println("Error al insertar"+e.getMessage());
         }
         
         return est;
    }
    public int ActualizarVentas(Object obj[]){
        int est=0;
        String Consql="UPDATE VENTAS SET FECHA=?, servicio_tecnico=?,año_garantia=?,id_producto WHERE id_seguro=? ";
        System.out.println(Consql);
        try{
            con=cn.conectar();
            ps=con.prepareStatement(Consql);
            ps.setObject(1, obj[0]); //nombre
            ps.setObject(2, obj[1]); //costo
            ps.setObject(3, obj[2]); //stock
            ps.setObject(4, obj[3]); //categorias
            ps.setObject(5, obj[4]); //id
            //ps.setObject(5, obj[4]); //id
            est=ps.executeUpdate();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al Actualizar al Producto");
        }
        return est;
    }
    public void BorrarProducto(int idcli)
    {
        String ConSql="DELETE FROM SEGURO_MOTO WHERE id_seguro=? ";
        System.out.println(ConSql);
        try 
        {
            con=cn.conectar(); //conectamos
            ps=con.prepareStatement(ConSql);
            ps.setInt(1, idcli);
            ps.executeUpdate();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al borrar Producto"+ e.getMessage());
        }
    }
    
}
