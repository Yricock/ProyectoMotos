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
            cli.setAñoproducto(rs.getString("año_categprod"));
            listacli.add(cli);
        }
    }
    catch (Exception e) {
        System.out.println("Error al listar Productos"+e.getMessage());
    }
    return listacli;
}

    /*
    public int InsertarProducto (Object obj []){
        int est = 0;
        String ConSql = "INSERT INTO PRODUCTOS(nom_producto,costo_producto,stock_producto,id_categprod) VALUES(?,?,?,?)";
        
        try {
            con = cn.conectar();
            ps = con.prepareStatement(ConSql);
            ps.setObject(1, obj[0]);
            ps.setObject(2, obj[1]);
            ps.setObject(3, obj[2]);
            ps.setObject(4, obj[3]);
            
            est = ps.executeUpdate();
        }
        catch (Exception e){
            System.out.println("Error al insertar"+e.getMessage());
        }
        return est;
    }
    
    
    public int ActualizarProducto(Object obj[]){
    int est = 0;
    String Consql = "UPDATE PRODUCTOS SET nom_producto=?, costo_producto=?, stock_producto=? WHERE id_producto=?";
    Connection con = null;
    PreparedStatement ps = null;
    try {
        con = cn.conectar();
        ps = con.prepareStatement(Consql);
        ps.setObject(1, obj[0]); // nombre
        ps.setObject(2, obj[1]); // costo
        ps.setObject(3, obj[2]); // stock
        ps.setObject(4, obj[3]); // id
        est = ps.executeUpdate();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al Actualizar al Producto: " + e.getMessage());
    } finally {
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
        }
    }
    return est;
}

    
    
    
    
    
    public void BorrarProducto(int idcli)
    {
        String ConSql="DELETE FROM PRODUCTOS WHERE id_producto=?";
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
    
    
    
    public void CargarComboCategorias(JComboBox comb){
        String ConSQL="SELECT * FROM CATEGORIAS_PRODUCTO ORDER BY id_categprod";
        try {
            con = cn.conectar(); //hacemos la coneccion 
            ps = con.prepareStatement(ConSQL); //preparamos la consulta
            rs = ps.executeQuery();// devuelve los datos de la consulta
            
            while(rs.next()){
                comb.addItem(rs.getString("nom_categprod"));
            }
        }
        catch (Exception e) {
            System.out.println("Error al cargar combo categorias"+e.getMessage());
        }
    }
    public int idCategoria(String nomcateg){
        int idcategoria=0;
        String ConSQL="SELECT * FROM CATEGORIAS_PRODUCTO WHERE nom_categprod='"+nomcateg+"'";
        try {
            con = cn.conectar(); //hacemos la coneccion 
            ps = con.prepareStatement(ConSQL); //preparamos la consulta
            rs = ps.executeQuery();// devuelve los datos de la consulta
            
            while(rs.next()){
                idcategoria=rs.getInt("id_categprod");
            }
        }
        catch (Exception e) {
            System.out.println("Error al enviar id categoria"+e.getMessage());
        }
        return idcategoria;
    }  
        
    public List<CMProductos> BuscarProductos(int OpcionBusqueda, String ValorBusqueda) {
    List<CMProductos> listacli = new ArrayList<>();

    String ConSQL = null;
    if (OpcionBusqueda == 0 && ValorBusqueda == null) {
        ConSQL = "SELECT * FROM PRODUCTOS p, CATEGORIAS_PRODUCTO cp WHERE p.id_categprod = cp.id_categprod ORDER BY id_producto ASC";
    } 
    else {
        if (OpcionBusqueda == 1 && ValorBusqueda!=null) {
            ConSQL = "SELECT * FROM PRODUCTOS p, CATEGORIAS_PRODUCTO cp WHERE p.id_categprod = cp.id_categprod AND p.id_producto = " +ValorBusqueda+ " ORDER BY id_producto ASC";                                                            
        } 
        else {
             if (OpcionBusqueda == 2 && ValorBusqueda != null) { // bucar por nombre
            ConSQL = "SELECT * FROM PRODUCTOS p, CATEGORIAS_PRODUCTO cp WHERE p.id_categprod = cp.id_categprod AND p.nom_producto LIKE '%" +ValorBusqueda+ "%' ORDER BY id_producto ASC";
            } 
             else {
            ConSQL = "SELECT * FROM PRODUCTOS p, CATEGORIAS_PRODUCTO cp WHERE p.id_categprod = cp.id_categprod ORDER BY id_producto ASC";
            }
        }                     
       
    }
    try {
        con = cn.conectar(); //hacemos la coneccion 
        ps = con.prepareStatement(ConSQL); //preparamos la consulta
        rs = ps.executeQuery();//
        
        while(rs.next()) {
            CMProductos cli = new CMProductos();
            cli.setIdproducto(rs.getInt("id_producto"));
            cli.setNomproducto(rs.getString("nom_producto"));
            cli.setCostoproducto(rs.getInt("costo_producto"));
            cli.setStockproducto(rs.getInt("stock_producto"));
            cli.setNomcategoria(rs.getString("nom_categprod"));
            listacli.add(cli);
        }
    }
    catch (Exception e) {
        System.out.println("Error al listar Productos"+e.getMessage());
    }
    return listacli;
}
     */     
}
