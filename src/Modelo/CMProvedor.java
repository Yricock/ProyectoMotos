package Modelo;

public class CMProvedor {
    int idProvedor;
    String nomProvedor, dircProvedor,stockProvedor,emailProvedor;

    public CMProvedor() {
        idProvedor = 0;
    nomProvedor = null;
     dircProvedor = null;
     stockProvedor= null;
    emailProvedor= null;
    }

    public CMProvedor(int idProvedor, String nomProvedor, String dircProvedor, String stockProvedor, String emailProvedor) {
        this.idProvedor = idProvedor;
        this.nomProvedor = nomProvedor;
        this.dircProvedor = dircProvedor;
        this.stockProvedor = stockProvedor;
        this.emailProvedor = emailProvedor;
    }

    public int getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(int idProvedor) {
        this.idProvedor = idProvedor;
    }

    public String getNomProvedor() {
        return nomProvedor;
    }

    public void setNomProvedor(String nomProvedor) {
        this.nomProvedor = nomProvedor;
    }

    public String getDircProvedor() {
        return dircProvedor;
    }

    public void setDircProvedor(String dircProvedor) {
        this.dircProvedor = dircProvedor;
    }

    public String getStockProvedor() {
        return stockProvedor;
    }

    public void setStockProvedor(String stockProvedor) {
        this.stockProvedor = stockProvedor;
    }

    public String getEmailProvedor() {
        return emailProvedor;
    }

    public void setEmailProvedor(String emailProvedor) {
        this.emailProvedor = emailProvedor;
    }
    
    
}
