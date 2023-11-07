public abstract class Detergente implements ConDescuento, EsAlimento{
    private double precio;
    private String marca;
    private double descuento;
    private double volumen;
    private String tipoEnvase;

    public void detergente (double precio, String marca){
        this.precio=precio;
        this.marca=marca;
    }

    public String getmarca(){
        return marca;
    }
    public void setmarca(String marca){
        this.marca = marca;
    }

    public double getPrecio(){
        return precio;
    }
    public void setPrecio(){
        this.precio=precio;
    }

    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPrecioDescuento() {
        return precio - (precio * descuento / 100);
    }

    public String getTipoEnvase() {
        return tipoEnvase;
    }
    public void setTipoEnvase(String tipoEnvase) {
        this.tipoEnvase = tipoEnvase;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getVolumen() {
        return volumen;
    }

    @Override
    public String toString() {
        return "Detergente{" +
                "precio=" + precio +
                ", Marca='" + marca + '\'' +
                ", descuento=" + descuento +
                ", volumen=" + volumen +
                ", tipoEnvase='" + tipoEnvase + '\'' +
                '}';
    }
}
