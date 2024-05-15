
package Modelo;


public class CMEmpresa {
    int idEmpresa,idEmpleado,idProvedor,idInventario;
    String nomEmpresa, dirEmpresa, numEmpleados, userEmpresa,passEmpresa;
    public CMEmpresa(){
     idEmpresa = 0;
     idEmpleado = 0;
     idProvedor = 0;
     idInventario = 0;
     nomEmpresa = null;
     dirEmpresa = null;
    numEmpleados= null; 
    userEmpresa= null;
     passEmpresa = null;
    }

    public CMEmpresa(int idEmpresa, int idEmpleado, int idProvedor, int idInventario, String nomEmpresa, String dirEmpresa, String numEmpleados, String userEmpresa, String passEmpresa) {
        this.idEmpresa = idEmpresa;
        this.idEmpleado = idEmpleado;
        this.idProvedor = idProvedor;
        this.idInventario = idInventario;
        this.nomEmpresa = nomEmpresa;
        this.dirEmpresa = dirEmpresa;
        this.numEmpleados = numEmpleados;
        this.userEmpresa = userEmpresa;
        this.passEmpresa = passEmpresa;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(int idProvedor) {
        this.idProvedor = idProvedor;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    public String getDirEmpresa() {
        return dirEmpresa;
    }

    public void setDirEmpresa(String dirEmpresa) {
        this.dirEmpresa = dirEmpresa;
    }

    public String getNumEmpleados() {
        return numEmpleados;
    }

    public void setNumEmpleados(String numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    public String getUserEmpresa() {
        return userEmpresa;
    }

    public void setUserEmpresa(String userEmpresa) {
        this.userEmpresa = userEmpresa;
    }

    public String getPassEmpresa() {
        return passEmpresa;
    }

    public void setPassEmpresa(String passEmpresa) {
        this.passEmpresa = passEmpresa;
    }
    
}
