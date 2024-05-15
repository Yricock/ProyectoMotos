
package Controlador;
import Modelo.CMInventario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class CCInventario {
        Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    public List ListarTablaProvedor (){
    List <CMInventario> listacli = new ArrayList <>();
    // Asegúrate de tener espacios antes de "FROM", "JOIN" y "ORDER BY"
    String ConSQL ="SELECT * FROM INVENTARIO ORDER BY id_inventario ASC";
    
    try {
        con = cn.conectar(); //hacemos la coneccion 
        ps = con.prepareStatement(ConSQL); //preparamos la consulta
        rs = ps.executeQuery();//
        
        while(rs.next()) {
            CMInventario cli = new CMInventario();
            cli.setIdInventario(rs.getInt("id_inventario"));
            cli.setIdEntrada(rs.getInt("id_entrada"));
            cli.setIdSalida(rs.getInt("id_salida"));
            cli.setCantiProducto(rs.getString("cant_stock"));            
            cli.setPrecioProducto(rs.getString("precio"));
            
            
            listacli.add(cli);
        }
    }
    catch (Exception e) {
        System.out.println("Error al listar Productos"+e.getMessage());
    }
    return listacli;
}  
    public int InsertarInventario (Object obj []){
         int est = 0;
         String ConSql = "INSERT INTO INVENTARIO(nom_producto,cant_stock,precio) VALUES(?,?,?)";
         
         try {
             con = cn.conectar();
             ps = con.prepareStatement(ConSql);
             ps.setObject(1, obj[0]);
             ps.setObject(2, obj[1]);
             ps.setObject(3, obj[2]);
             
             est = ps.executeUpdate();
          
         }
             
         catch (Exception e){
             System.out.println("Error al insertar"+e.getMessage());
         }
         
         return est;
    }
    public int ActualizarInventario(Object obj[]){
        int est=0;
        String Consql="UPDATE INVENTARIO SET nom_producto=?, cant_stock=?,precio=?,id_entrada,id_salida WHERE id_inventario=? ";
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
            est=ps.executeUpdate();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al Actualizar al Producto");
        }
        return est;
    }
    public void BorrarInventario(int idcli)
    {
        String ConSql="DELETE FROM INVENTARIO WHERE id_inventario=? ";
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
    /*
    public List BuscarTablaProductos (int opcionbusca, String valorbusca){
        List <CMInventario> listprod = new ArrayList <>();
        String ConSQL=null;
        if (opcionbusca==0 && valorbusca==null) {
            ConSQL ="SELECT * FROM PRODUCTOS p, CATEGORIAS_PRODUCTO cp WHERE p.id_categprod=cp.id_categprod ORDER BY p.id_producto ASC";
        } 
        else 
        {
            if (opcionbusca==1 && valorbusca!=null) {
                ConSQL ="SELECT * FROM PRODUCTOS p, CATEGORIAS_PRODUCTO cp WHERE p.id_categprod=cp.id_categprod AND p.id_producto="+valorbusca+" ORDER BY p.id_producto ASC";
            } 
            else {
                if (opcionbusca==2 && valorbusca!=null) {
                ConSQL ="SELECT * FROM PRODUCTOS p, CATEGORIAS_PRODUCTO cp WHERE p.id_categprod=cp.id_categprod AND p.nom_producto LIKE '%"+valorbusca+"%' ORDER BY p.id_producto ASC";
            }                          
             else {
                    ConSQL ="SELECT * FROM PRODUCTOS p, CATEGORIAS_PRODUCTO cp WHERE p.id_categprod=cp.id_categprod ORDER BY p.id_producto ASC";  
            }
            }
        }
        try {
            con = cn.conectar(); //hacemos la coneccion 
            ps = con.prepareStatement(ConSQL); //preparamos la consulta
            rs = ps.executeQuery();//
            while(rs.next()) {
                CMInventario cat = new CMInventario();
                cat.setIdproducto(rs.getInt("id_producto"));
                cat.setNomproducto(rs.getString("nom_producto"));
                cat.setCostoproducto(rs.getInt("costo_producto"));
                cat.setStockproducto(rs.getInt("stock_producto"));
                //cat.setIdcategoria(rs.getInt("id_categprod"));
                cat.setNomCategoria(rs.getString("nom_categprod"));
                
               
                listprod.add(cat);
            }
        }
        catch (Exception e) {
            System.out.println("Error al listar cliente "+e.getMessage());
        }
        return listprod;
    }
    */
    
    
}

