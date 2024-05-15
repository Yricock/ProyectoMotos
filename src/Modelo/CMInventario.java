
package Modelo;

public class CMInventario {
    int idInventario,idEntrada,idSalida;
    String nomProducto, cantiProducto , precioProducto;

    public CMInventario() {
     idInventario = 0;
     idEntrada = 0;
     idSalida = 0;
     idInventario = 0;
     nomProducto = null;
     cantiProducto = null;
    precioProducto= null; 
    }

    public CMInventario(int idInventario, int idEntrada, int idSalida, String nomProducto, String cantiProducto, String precioProducto) {
        this.idInventario = idInventario;
        this.idEntrada = idEntrada;
        this.idSalida = idSalida;
        this.nomProducto = nomProducto;
        this.cantiProducto = cantiProducto;
        this.precioProducto = precioProducto;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }

    public int getIdSalida() {
        return idSalida;
    }

    public void setIdSalida(int idSalida) {
        this.idSalida = idSalida;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public String getCantiProducto() {
        return cantiProducto;
    }

    public void setCantiProducto(String cantiProducto) {
        this.cantiProducto = cantiProducto;
    }

    public String getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(String precioProducto) {
        this.precioProducto = precioProducto;
    }
    
    
}
