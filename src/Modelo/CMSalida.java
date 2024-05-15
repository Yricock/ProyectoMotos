
package Modelo;

public class CMSalida {
    int idSalida;
    String cantInventario,fechaInventario,destinoInventario;

    public CMSalida() {
        idSalida = 0;
     cantInventario= null;
     fechaInventario = null;
     destinoInventario = null;
    }

    public CMSalida(int idSalida, String cantInventario, String fechaInventario, String destinoInventario) {
        this.idSalida = idSalida;
        this.cantInventario = cantInventario;
        this.fechaInventario = fechaInventario;
        this.destinoInventario = destinoInventario;
    }

    public int getIdSalida() {
        return idSalida;
    }

    public void setIdSalida(int idSalida) {
        this.idSalida = idSalida;
    }

    public String getCantInventario() {
        return cantInventario;
    }

    public void setCantInventario(String cantInventario) {
        this.cantInventario = cantInventario;
    }

    public String getFechaInventario() {
        return fechaInventario;
    }

    public void setFechaInventario(String fechaInventario) {
        this.fechaInventario = fechaInventario;
    }

    public String getDestinoInventario() {
        return destinoInventario;
    }

    public void setDestinoInventario(String destinoInventario) {
        this.destinoInventario = destinoInventario;
    }
    
    
}
