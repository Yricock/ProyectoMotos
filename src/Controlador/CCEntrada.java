
package Controlador;
import Modelo.CMEntrada;
import Modelo.CMEntrada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class CCEntrada {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public List ListarTablaEntrada (){
    List <CMEntrada> listacli = new ArrayList <>();
    // Asegúrate de tener espacios antes de "FROM", "JOIN" y "ORDER BY"
    String ConSQL ="SELECT * FROM ENTRADA_INVENTARIO ORDER BY id_entrada ASC";
    
    try {
        con = cn.conectar(); //hacemos la coneccion 
        ps = con.prepareStatement(ConSQL); //preparamos la consulta
        rs = ps.executeQuery();//
        
        while(rs.next()) {
            CMEntrada cli = new CMEntrada();
            cli.setIdEntrada(rs.getInt("id_entrada"));
            cli.setCantInventario(rs.getString("cantidad"));            
            cli.setFechaInventario(rs.getString("fecha_entrada"));
            
            listacli.add(cli);
        }
    }
    catch (Exception e) {
        System.out.println("Error al listar Productos"+e.getMessage());
    }
    return listacli;
}
    public int InsertarEntrada (Object obj []){
         int est = 0;
         String ConSql = "INSERT INTO ENTRADA_INVENTARIO(cantidad,fecha_entrada) VALUES(?,?)";
         
         try {
             con = cn.conectar();
             ps = con.prepareStatement(ConSql);
             ps.setObject(1, obj[0]);
             ps.setObject(2, obj[1]);
             ps.setObject(3, obj[2]);
             //ps.setObject(3, obj[2]);
             
             est = ps.executeUpdate();
             
          
         }
         catch (Exception e){
             System.out.println("Error al insertar"+e.getMessage());
         }
         
         return est;
    }
    public int ActualizarProducto(Object obj[]){
        int est=0;
        String Consql="UPDATE ENTRADA_INVENTARIO SET cantidad=?, fecha_inventario=?, WHERE id_entrada=? ";
        System.out.println(Consql);
        try{
            con=cn.conectar();
            ps=con.prepareStatement(Consql);
            ps.setObject(1, obj[0]); //nombre
            ps.setObject(2, obj[1]); //costo
            ps.setObject(3, obj[2]); //stock
            //ps.setObject(4, obj[3]); //categorias
            //ps.setObject(5, obj[4]); //id
            est=ps.executeUpdate();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al Actualizar al Producto");
        }
        return est;
    }
    public void BorrarProducto(int idcli)
    {
        String ConSql="DELETE FROM ENTRADA_INVENTARIO WHERE id_entrada=? ";
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
