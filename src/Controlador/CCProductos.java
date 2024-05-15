package Controlador;

import Modelo.CMProductos;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class CCProductos {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public List ListarTablaProductos (){
    List <CMProductos> listacli = new ArrayList <>();
    // Asegúrate de tener espacios antes de "FROM", "JOIN" y "ORDER BY"
    String ConSQL ="SELECT * FROM PRODUCTO ORDER BY id_producto ASC;";
    
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
    public int InsertarProducto (Object obj []){
         int est = 0;
         String ConSql = "INSERT INTO PRODUCTOS(marca_producto,modelo_producto,color_producto,año_producto) VALUES(?,?,?,?,?)";
         
         try {
             con = cn.conectar();
             ps = con.prepareStatement(ConSql);
             ps.setObject(1, obj[0]);
             ps.setObject(2, obj[1]);
             ps.setObject(3, obj[2]);
             ps.setObject(4, obj[3]);
             ps.setObject(5, obj[4]);
             //ps.setObject(6, obj[5]);
             
             est = ps.executeUpdate();
             
          
         }
         catch (Exception e){
             System.out.println("Error al insertar"+e.getMessage());
         }
         
         return est;
    }
    public int ActualizarProducto(Object obj[]){
        int est=0;
        String Consql="UPDATE PRODUCTOS SET marca_producto=?, modelo_producto=?,color_producto=?,año_producto=? WHERE id_producto=? ";
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
            //ps.setObject(7, obj[6]); //id
            est=ps.executeUpdate();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al Actualizar al Producto");
        }
        return est;
    }
    public void BorrarProducto(int idcli)
    {
        String ConSql="DELETE FROM PRODUCTOS WHERE id_producto=? ";
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
