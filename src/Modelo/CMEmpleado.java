
package Modelo;


public class CMEmpleado {
    int idEmpleado,idVenta;
    String nomEmpleado,CargEmpleado,salariEmpleado,fechEmpleado,telfEmpleado,emailEmpleado, passusuario, userusuario;
    
    public CMEmpleado()
    {
        idEmpleado=0;
        idVenta=0;
        nomEmpleado=null;
        CargEmpleado=null;
        salariEmpleado=null;
        fechEmpleado=null;
        telfEmpleado=null;
        emailEmpleado=null;
        passusuario = null;
        userusuario = null;
    }

    public CMEmpleado(int idEmpleado, int idVenta, String nomEmpleado, String CargEmpleado, String salariEmpleado, String fechEmpleado, String telfEmpleado, String emailEmpleado, String passusuario, String userusuario) {
        this.idEmpleado = idEmpleado;
        this.idVenta = idVenta;
        this.nomEmpleado = nomEmpleado;
        this.CargEmpleado = CargEmpleado;
        this.salariEmpleado = salariEmpleado;
        this.fechEmpleado = fechEmpleado;
        this.telfEmpleado = telfEmpleado;
        this.emailEmpleado = emailEmpleado;
        this.passusuario = passusuario;
        this.userusuario = userusuario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getNomEmpleado() {
        return nomEmpleado;
    }

    public void setNomEmpleado(String nomEmpleado) {
        this.nomEmpleado = nomEmpleado;
    }

    public String getCargEmpleado() {
        return CargEmpleado;
    }

    public void setCargEmpleado(String CargEmpleado) {
        this.CargEmpleado = CargEmpleado;
    }

    public String getSalariEmpleado() {
        return salariEmpleado;
    }

    public void setSalariEmpleado(String salariEmpleado) {
        this.salariEmpleado = salariEmpleado;
    }

    public String getFechEmpleado() {
        return fechEmpleado;
    }

    public void setFechEmpleado(String fechEmpleado) {
        this.fechEmpleado = fechEmpleado;
    }

    public String getTelfEmpleado() {
        return telfEmpleado;
    }

    public void setTelfEmpleado(String telfEmpleado) {
        this.telfEmpleado = telfEmpleado;
    }

    public String getEmailEmpleado() {
        return emailEmpleado;
    }

    public void setEmailEmpleado(String emailEmpleado) {
        this.emailEmpleado = emailEmpleado;
    }

    public String getPassusuario() {
        return passusuario;
    }

    public void setPassusuario(String passusuario) {
        this.passusuario = passusuario;
    }

    public String getUserusuario() {
        return userusuario;
    }

    public void setUserusuario(String userusuario) {
        this.userusuario = userusuario;
    }

    
}