
package Modelo;

public class CMVentasM {
    int idVenta,idCliente,idProducto;
    String fechVenta, precioVenta;

    public CMVentasM() {
        idVenta = 0;
        idCliente =0;
       idProducto = 0;
    fechVenta = null;
     precioVenta = null;

    }

    public CMVentasM(int idVenta, int idCliente, int idProducto, String fechVenta, String precioVenta) {
        this.idVenta = idVenta;
        this.idCliente = idCliente;
        this.idProducto = idProducto;
        this.fechVenta = fechVenta;
        this.precioVenta = precioVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getFechVenta() {
        return fechVenta;
    }

    public void setFechVenta(String fechVenta) {
        this.fechVenta = fechVenta;
    }

    public String getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(String precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    
}
