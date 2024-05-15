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
    
    public List ListarTabla (){
        List <CMEmpleado> listaemp = new ArrayList <>();
        String ConSQL ="SELECT * FROM EMPLEADO ORDER BY id_empleado ASC";
        
        try {
            conecta = cone.conectar(); //hacemos la coneccion 
            ps = conecta.prepareStatement(ConSQL); //preparamos la consulta
            rs = ps.executeQuery();//
            
            while(rs.next()) {
                CMEmpleado emp = new CMEmpleado();
                emp.setIdEmpleado(rs.getInt("id_empleado"));
                emp.setNomEmpleado(rs.getString("nom_empleado"));
                emp.setCargEmpleado(rs.getString("cargo"));
                emp.setSalariEmpleado(rs.getString("salario"));
                emp.setFechEmpleado(rs.getString("fecha_contratacion"));
                emp.setTelfEmpleado(rs.getString("telefono"));
                emp.setEmailEmpleado(rs.getString("email"));
                listaemp.add(emp);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al listar Empleado"+e.getMessage());
        }
        return listaemp;
    }
    public int InsertarEmpleado (Object obj []){
         int est = 0;
         String ConSql = "INSERT INTO EMPLEADO(nom_empleado,cargo,salario,fecha_contratacion,telefono,email) VALUES(?,?,?,?,?,?)";
         
         try {
             conecta = cone.conectar();
             ps = conecta.prepareStatement(ConSql);
             ps.setObject(1, obj[0]);
             ps.setObject(2, obj[1]);
             ps.setObject(3, obj[2]);
             ps.setObject(4, obj[3]);
             ps.setObject(5, obj[4]);
             ps.setObject(6, obj[5]);
             ps.setObject(7, obj[6]);
             
             est = ps.executeUpdate();
             
          
         }
         catch (Exception e){
             System.out.println("Error al insertar"+e.getMessage());
         }
         
         return est;
    }
    public int ActualizarEmpleado(Object obj[]){
        int est=0;
        String Consql="UPDATE EMPLEADO SET nom_empleado=?, cargo=?,salario=?,fecha_contratacion,telefono,email WHERE id_empleado=? ";
        System.out.println(Consql);
        try{
            conecta=cone.conectar();
            ps=conecta.prepareStatement(Consql);
            ps.setObject(1, obj[0]); //nombre
            ps.setObject(2, obj[1]); //costo
            ps.setObject(3, obj[2]); //stock
            ps.setObject(4, obj[3]); //categorias
            ps.setObject(5, obj[4]); //id
            ps.setObject(6, obj[5]); //id
            ps.setObject(7, obj[6]); //id
            est=ps.executeUpdate();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al Actualizar al Producto");
        }
        return est;
    }
    public void BorrarEmpleado(int idcli)
    {
        String ConSql="DELETE FROM EMPLEADO WHERE id_empleado=? ";
        System.out.println(ConSql);
        try 
        {
            conecta=cone.conectar(); //conectamos
            ps=conecta.prepareStatement(ConSql);
            ps.setInt(1, idcli);
            ps.executeUpdate();
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al borrar Producto"+ e.getMessage());
        }
    }
    
}
