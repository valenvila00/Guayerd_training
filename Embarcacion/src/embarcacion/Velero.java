package embarcacion;

import java.util.Date;

public class Velero extends Embarcacion {
    private int cantMastiles;

    public int getCantMastiles() {
        return cantMastiles;
    }

    public Velero(Capitan capitan, double precioBase, double valorAdicional, double eslora, int fabricacion, int cantMastiles) {
        super(capitan, precioBase, valorAdicional, eslora, fabricacion);
        this.cantMastiles = cantMastiles;

    }

    public boolean esGrande() {
        return getCantMastiles() > 4;
    }
}
