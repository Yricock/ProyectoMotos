
package Modelo;

public class CMEntrada {
    int idEntrada;
    String cantInventario,fechaInventario;

    public CMEntrada() {
     idEntrada = 0;
     cantInventario= null;
     fechaInventario = null;
    }

    public CMEntrada(int idEntrada, String cantInventario, String fechaInventario) {
        this.idEntrada = idEntrada;
        this.cantInventario = cantInventario;
        this.fechaInventario = fechaInventario;
    }

    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
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
    
    
}
