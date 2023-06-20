package DulceGalleta;

class Venta {
    private String tipoGalleta;
    private double montoVenta;

    public Venta(String tipoGalleta, double montoVenta) {
        this.tipoGalleta = tipoGalleta;
        this.montoVenta = montoVenta;
    }

    //Accesadores son getCampo()
    //Mutadores son setCampo()

    public String getTipoGalleta() {
        return tipoGalleta;
    }

    public void setTipoGalleta(String tipoGalleta) {
        this.tipoGalleta = tipoGalleta;
    }

    public double getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(double montoVenta) {
        this.montoVenta = montoVenta;
    }
}