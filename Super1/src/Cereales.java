public abstract class Cereales implements ConDescuento, EsAlimento{
    private String marca;
    private double precio;
    private String tipoCereal;
    private double descuento;
    private double volumen;
    private double calorias;
    private String tipoEnvase;

    public Cereales(String marca, double precio, String tipoCereal) {
        this.marca = marca;
        this.precio = precio;
        this.tipoCereal = tipoCereal;
    }

    public String getTipoEnvase() {
        return tipoEnvase;
    }

    public void setTipoEnvase(String tipoEnvase) {
        this.tipoEnvase = tipoEnvase;
    }

    @Override
    public int getCalorias() {
        return (int) calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
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

    public String getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Cereales{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", tipoCereal='" + tipoCereal + '\'' +
                ", descuento=" + descuento +
                ", volumen=" + volumen +
                ", calorias=" + calorias +
                ", tipoEnvase='" + tipoEnvase + '\'' +
                '}';
    }
}
