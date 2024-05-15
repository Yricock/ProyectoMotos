
package Controlador;
import Modelo.CMEmpresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

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
            cli.setIdEmpresa(rs.getInt("id_empresa"));
            cli.setIdEmpleado(rs.getInt("id_empleado"));
            cli.setIdProvedor(rs.getInt("id_provedor"));
            cli.setIdInventario(rs.getInt("id_inventario"));
            cli.setNomEmpresa(rs.getString("nom_empresa"));            
            cli.setDirEmpresa(rs.getString("dir_empresa"));
            cli.setNumEmpleados(rs.getString("num_empleados"));
            //cli.setUserEmpresa(rs.getString(""));
            //cli.setPassEmpresa(rs.getString("nom_categprod"));
            listacli.add(cli);
        }
    }
    catch (Exception e) {
        System.out.println("Error al listar Productos"+e.getMessage());
    }
    return listacli;
}
    public int InsertarEmpresa (Object obj []){
         int est = 0;
         String ConSql = "INSERT INTO EMPRESA(nom_empresa,dir_empresa,num_empleados) VALUES(?,?,?)";
         
         try {
             con = cn.conectar();
             ps = con.prepareStatement(ConSql);
             ps.setObject(1, obj[0]);
             ps.setObject(2, obj[1]);
             ps.setObject(3, obj[2]);
             //si no te funciona = ps.setObject(4, obj[3]);
             
             est = ps.executeUpdate();
             
          
         }
         catch (Exception e){
             System.out.println("Error al insertar"+e.getMessage());
         }
         
         return est;
    }
    public int ActualizarEmpresa(Object obj[]){
        int est=0;
        String Consql="UPDATE EMPRESA SET nom_empresa=?, dir_empresa=?,num_empleados=?,id_empleado,id_provedor,id_inventario WHERE id_empresa=? ";
        System.out.println(Consql);
        try{
            con=cn.conectar();
            ps=con.prepareStatement(Consql);
            ps.setObject(1, obj[0]); //nombre
            ps.setObject(2, obj[1]); //costo
            ps.setObject(3, obj[2]); //stock
            ps.setObject(4, obj[3]); //categorias
            ps.setObject(5, obj[4]); //id
            ps.setObject(6, obj[5]); //id
            ps.setObject(7, obj[6]); //id
            ps.setObject(8, obj[7]); //id
            est=ps.executeUpdate();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al Actualizar al Producto");
        }
        return est;
    }
    public void BorrarProducto(int idcli)
    {
        String ConSql="DELETE FROM EMPRESA WHERE id_empresa=? ";
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
