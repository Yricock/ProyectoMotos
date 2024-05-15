package Modelo;


public class CMClientes {
    int idcliente;
    String nomcliente, apecliente, dircliente, fechacompra, dnicliente;
             
    
    public CMClientes(){
     idcliente = 0;
     dnicliente = null;
     nomcliente = null;
     apecliente = null;
     dircliente = null;
     
    }

    public CMClientes(int idcliente, String dnicliente, String nomcliente, String apecliente, String dircliente) {
        this.idcliente = idcliente;
        this.dnicliente = dnicliente;
        this.nomcliente = nomcliente;
        this.apecliente = apecliente;
        this.dircliente = dircliente;
        
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNomcliente() {
        return nomcliente;
    }

    public void setNomcliente(String nomcliente) {
        this.nomcliente = nomcliente;
    }

    public String getApecliente() {
        return apecliente;
    }

    public void setApecliente(String apecliente) {
        this.apecliente = apecliente;
    }

    public String getDircliente() {
        return dircliente;
    }

    public void setDircliente(String dircliente) {
        this.dircliente = dircliente;
    }


    public String getDnicliente() {
        return dnicliente;
    }

    public void setDnicliente(String dnicliente) {
        this.dnicliente = dnicliente;
    }

        
}
