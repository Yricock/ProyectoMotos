package Controlador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import Modelo.CMEmpleado;

public class CCEmpleado {
    PreparedStatement ps;
    ResultSet rs;
    Conexion cone=new Conexion();
    Connection conecta;
    
    //Connection con;
    //Conexion cn = new Conexion();
    
    public CMEmpleado ValidarUsuario(String user, String pass)
    {
        CMEmpleado cme=new CMEmpleado();
        String ConSQL="SELECT * FROM EMPLEADO " +
                      "WHERE user_empleado=? AND " +
                      "pass_empleado=?";
        
        try {
            conecta=cone.conectar();
            ps=conecta.prepareStatement(ConSQL);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
              cme.setIdEmpleado(rs.getInt("id_empleado"));
              cme.setUserusuario(rs.getString("user_empleado"));
              cme.setPassusuario("pass_empleado");
            }
            
            
        } catch (Exception e) {
            //vacio
        }
        
        return cme;
    }
    
    public List ListarTablaUsuario (){
        List <CMEmpleado> listaemp = new ArrayList <>();
        String ConSQL ="SELECT * FROM EMPLEADO ORDER BY id_empleado ASC";
        
        try {
            conecta = cone.conectar(); //hacemos la coneccion 
            ps = conecta.prepareStatement(ConSQL); //preparamos la consulta
            rs = ps.executeQuery();//
            
            while(rs.next()) {
                CMEmpleado emp = new CMEmpleado();
                emp.setIdEmpleado(rs.getInt("id_empleado"));
                emp.setNomEmpleado(rs.getString("dni_usuario"));
                emp.setCargEmpleado(rs.getString("nom_usuario"));
                emp.setSalariEmpleado(rs.getString("ape_usuario"));
                emp.setFechEmpleado(rs.getString("telf_usuario"));
                emp.setTelfEmpleado(rs.getString("dir_usuario"));
                emp.setEmailEmpleado(rs.getString("dir_usuario"));
                listaemp.add(emp);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al listar Empleado"+e.getMessage());
        }
        return listaemp;
    }
    
    /*public int InsertarUsuario (Object obj []){
        int est = 0;
        String ConSql = "INSERT INTO USUARIOS(dni_usuario,nom_usuario,ape_usuario,telf_usuario,dir_usuario) VALUES(?,?,?,?,?)";
         
        try {
            conecta = cone.conectar();
            ps = conecta.prepareStatement(ConSql);
            ps.setObject(1, obj[0]);
            ps.setObject(2, obj[1]);
            ps.setObject(3, obj[2]);
            ps.setObject(4, obj[3]);
            ps.setObject(5, obj[4]);
             
            est = ps.executeUpdate();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al Agregar  al Usuario");
        }
        return est;
    }
    
    public int ActualizarUsuario(Object obj[]){
        int est=0;
        String Consql="UPDATE USUARIOS SET dni_usuario=?, nom_usuario=?, ape_usuario=?, telf_usuario=?,,dir_usuario=? WHERE id_usuario=?";
        try{
            conecta=cone.conectar();
            ps=conecta.prepareStatement(Consql);
            ps.setObject(1, obj[0]); //dni
            ps.setObject(2, obj[1]); //nombre
            ps.setObject(3, obj[2]); //apellido
            ps.setObject(4, obj[3]); //telefono
            ps.setObject(5, obj[4]); //direccion
            est=ps.executeUpdate();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al Actualizar al Cliente");
        }
        return est;
    }
    
    public void BorrarUsuario(int idcli)
    {
        String ConSql="DELETE FROM USUARIOS WHERE id_usuario=?";
        try 
        {
            conecta=cone.conectar(); //conectamos
            ps=conecta.prepareStatement(ConSql);
            ps.setInt(1, idcli);
            ps.executeUpdate();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al borrar cliente"+ e.getMessage());
        }
    }*/
}
