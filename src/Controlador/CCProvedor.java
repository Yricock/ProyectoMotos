package Controlador;
import Modelo.CMProvedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CCProvedor {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public List ListarTablaProvedor (){
    List <CMProvedor> listacli = new ArrayList <>();
    // Asegúrate de tener espacios antes de "FROM", "JOIN" y "ORDER BY"
    String ConSQL ="SELECT * FROM PROVEEDOR ORDER BY id_producto ASC";
    
    try {
        con = cn.conectar(); //hacemos la coneccion 
        ps = con.prepareStatement(ConSQL); //preparamos la consulta
        rs = ps.executeQuery();//
        
        while(rs.next()) {
            CMProvedor cli = new CMProvedor();
            cli.setIdProvedor(rs.getInt("id_proveerdor"));
            cli.setNomProvedor(rs.getString("nom_proveedor"));            
            cli.setDircProvedor(rs.getString("dirc_proveedor"));
            cli.setStockProvedor(rs.getString("stock_proveedor"));
            cli.setEmailProvedor(rs.getString("email_proveedor"));
            listacli.add(cli);
        }
    }
    catch (Exception e) {
        System.out.println("Error al listar Productos"+e.getMessage());
    }
    return listacli;
}
    public int InsertarProveedor (Object obj []){
         int est = 0;
         String ConSql = "INSERT INTO PROVEEDOR(nom_proveedor,dirc_proveedor,stock_proveedor,email_proveedor) VALUES(?,?,?,?)";
         
         try {
             con = cn.conectar();
             ps = con.prepareStatement(ConSql);
             ps.setObject(1, obj[0]);
             ps.setObject(2, obj[1]);
             ps.setObject(3, obj[2]);
             ps.setObject(4, obj[3]);
             //ps.setObject(5, obj[4]);
             
             est = ps.executeUpdate();
             
          
         }
         catch (Exception e){
             System.out.println("Error al insertar"+e.getMessage());
         }
         
         return est;
    }
    public int ActualizarProveedor(Object obj[]){
        int est=0;
        String Consql="UPDATE PROVEEDOR SET nom_provedor=?, dirc_proveedor=?,stock_proveedor=?,email_proveedor WHERE id_proveedor=? ";
        System.out.println(Consql);
        try{
            con=cn.conectar();
            ps=con.prepareStatement(Consql);
            ps.setObject(1, obj[0]); //nombre
            ps.setObject(2, obj[1]); //costo
            ps.setObject(3, obj[2]); //stock
            ps.setObject(4, obj[3]); //categorias
            ps.setObject(5, obj[4]); //id
            est=ps.executeUpdate();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al Actualizar al Producto");
        }
        return est;
    }
    public void BorrarProveedor(int idcli)
    {
        String ConSql="DELETE FROM PROVEEDOR WHERE id_proveedor=? ";
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


