
package Modelo;

public class CMSeguroMoto {
    int idSeguro,idProducto;
    String piezasMoto, servicioMoto,añogaMoto;

    public CMSeguroMoto() {
       idSeguro = 0;
       idProducto = 0;
    piezasMoto = null;
     servicioMoto = null;
     añogaMoto= null;
    }

    public CMSeguroMoto(int idSeguro, int idProducto, String piezasMoto, String servicioMoto, String añogaMoto) {
        this.idSeguro = idSeguro;
        this.idProducto = idProducto;
        this.piezasMoto = piezasMoto;
        this.servicioMoto = servicioMoto;
        this.añogaMoto = añogaMoto;
    }

    public int getIdSeguro() {
        return idSeguro;
    }

    public void setIdSeguro(int idSeguro) {
        this.idSeguro = idSeguro;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getPiezasMoto() {
        return piezasMoto;
    }

    public void setPiezasMoto(String piezasMoto) {
        this.piezasMoto = piezasMoto;
    }

    public String getServicioMoto() {
        return servicioMoto;
    }

    public void setServicioMoto(String servicioMoto) {
        this.servicioMoto = servicioMoto;
    }

    public String getAñogaMoto() {
        return añogaMoto;
    }

    public void setAñogaMoto(String añogaMoto) {
        this.añogaMoto = añogaMoto;
    }
    
}
