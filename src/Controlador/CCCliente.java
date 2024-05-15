package Controlador;

import Modelo.CMClientes;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class CCCliente {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public List<CMClientes> ListarTabla() {
    List<CMClientes> listacli = new ArrayList<>();
    String ConSQL = "SELECT * FROM CLIENTE ORDER BY id_cliente ASC";

    try {
        con = cn.conectar(); //hacemos la coneccion 
        ps = con.prepareStatement(ConSQL); //preparamos la consulta
        rs = ps.executeQuery();//
        
        while (rs.next()) {
            CMClientes cli = new CMClientes();
            cli.setIdcliente(rs.getInt("id_cliente"));
            cli.setDnicliente(rs.getString("dni_cliente"));
            cli.setNomcliente(rs.getString("nom_cliente"));
            cli.setApecliente(rs.getString("ape_cliente"));
            cli.setDircliente(rs.getString("dir_cliente"));      
            listacli.add(cli);
        }
    } catch (Exception e) {
        System.out.println("Error al listar cliente" + e.getMessage());
    } 
    return listacli;
}
    
    public int InsertarCliente (Object obj []){
         int est = 0;
         String ConSql = "INSERT INTO CLIENTE(dni_cliente, nom_cliente, ape_cliente, dir_cliente) VALUES(?,?,?,?)";
         
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
 


    public int ActualizarCliente(Object obj[]){
        int est=0;
        String Consql="UPDATE CLIENTE SET dni_cliente=?, nom_cliente=?,ape_cliente = ?, dir_cliente=? WHERE id_cliente=?";
        try{
            con=cn.conectar();
            ps=con.prepareStatement(Consql);
            ps.setObject(1, obj[0]); //dni
            ps.setObject(2, obj[1]); //nombre
            ps.setObject(3, obj[2]); //direccion
            ps.setObject(4, obj[3]); //id
            ps.setObject(5, obj[4]);
            est=ps.executeUpdate();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al Actualizar al Cliente");
        }
        return est;
    }
    public void BorrarCliente(int idcli)
    {
        String ConSql="DELETE FROM CLIENTE WHERE id_cliente=?";
        try 
        {
            con=cn.conectar(); //conectamos
            ps=con.prepareStatement(ConSql);
            ps.setInt(1, idcli);
            ps.executeUpdate();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al borrar cliente"+ e.getMessage());
        }
 
    
    }
    
}