package embarcacion;

import java.util.Date;

public abstract class Embarcacion {
    private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private double eslora;
    private int fabricacion;

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(int fabricacion) {
        this.fabricacion = fabricacion;
    }

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, double eslora, int fabricacion) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.eslora = eslora;
        this.fabricacion = fabricacion;
    }


    public double calculoAlquiler() {
        if (getFabricacion() > 2020)
            return getPrecioBase() + getValorAdicional();
        return getPrecioBase();
    }
}
