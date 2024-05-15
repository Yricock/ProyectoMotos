
package Controlador;
import Modelo.CMSalida;
import Modelo.CMSalida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.Date; 
public class CCSalida {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public List ListarTabla (){
    List <CMSalida> listacli = new ArrayList <>();
    // Asegúrate de tener espacios antes de "FROM", "JOIN" y "ORDER BY"
    String ConSQL ="SELECT * FROM SALIDA_ENTRADA ORDER BY id_salida ASC";
    
    try {
        con = cn.conectar(); //hacemos la coneccion 
        ps = con.prepareStatement(ConSQL); //preparamos la consulta
        rs = ps.executeQuery();//
        
        while(rs.next()) {
            CMSalida cli = new CMSalida();
            cli.setIdSalida(rs.getInt("id_salida"));
            cli.setCantInventario(rs.getString("cantidad"));            
            cli.setFechaInventario(rs.getString("fecha"));
            cli.setDestinoInventario(rs.getString("destino"));
            listacli.add(cli);
        }
    }
    catch (Exception e) {
        System.out.println("Error al listar Productos"+e.getMessage());
    }
    return listacli;
}
   // Añade esta importación para trabajar con fechas SQL

public int InsertarSalida(Object obj[]){
    int est = 0;
    String ConSql = "INSERT INTO SALIDA_ENTRADA(cantidad, fecha, destino) VALUES (?, ?, ?)";

    try {
        con = cn.conectar();
        ps = con.prepareStatement(ConSql);
        ps.setObject(1, obj[0]); // cantidad
        ps.setObject(2, obj[1]); // fecha_salida
        ps.setObject(3, obj[2]); // destino

        est = ps.executeUpdate();
    }
    catch (Exception e){
        System.out.println("Error al insertar"+e.getMessage());
    }

    return est;
}

public int ActualizarSalida(Object obj[]){
    int est = 0;
    String Consql = "UPDATE SALIDA_ENTRADA SET cantidad=?, fecha=?, destino=? WHERE id_salida=? ";
    System.out.println(Consql);
    try {
        con = cn.conectar();
        ps = con.prepareStatement(Consql);
        ps.setObject(1, obj[0]); // cantidad
        ps.setObject(2, obj[1]); // fecha_salida
        ps.setObject(3, obj[2]); // destino
        ps.setObject(4, obj[3]); // id_salida

        est = ps.executeUpdate();
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, "Error al Actualizar al Producto");
    }
    return est;
}

    public void BorrarSalida(int idcli)
    {
        String ConSql="DELETE FROM SALIDA_ENTRADA WHERE id_salida=?";
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
