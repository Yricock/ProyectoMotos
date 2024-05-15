package Modelo;


public class CMProductos {
    int idproducto;
    String marcaproducto, modeloproducto, colorproducto, añoproducto;
   

    public CMProductos() {
        idproducto = 0;
        marcaproducto = null;
        modeloproducto = null;
        colorproducto = null;
        añoproducto = null;
                
    }

    public CMProductos(int idproducto, String marcaproducto, String modeloproducto, String colorproducto, String añoproducto) {
        this.idproducto = idproducto;
        this.marcaproducto = marcaproducto;
        this.modeloproducto = modeloproducto;
        this.colorproducto = colorproducto;
        this.añoproducto = añoproducto;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getMarcaproducto() {
        return marcaproducto;
    }

    public void setMarcaproducto(String marcaproducto) {
        this.marcaproducto = marcaproducto;
    }

    public String getModeloproducto() {
        return modeloproducto;
    }

    public void setModeloproducto(String modeloproducto) {
        this.modeloproducto = modeloproducto;
    }

    public String getColorproducto() {
        return colorproducto;
    }

    public void setColorproducto(String colorproducto) {
        this.colorproducto = colorproducto;
    }

    public String getAñoproducto() {
        return añoproducto;
    }

    public void setAñoproducto(String añoproducto) {
        this.añoproducto = añoproducto;
    }

}   
