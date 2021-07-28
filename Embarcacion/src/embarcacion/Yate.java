package embarcacion;

public class Yate extends Embarcacion {
    private int cantCamarote;

    public int getCantCamarote() {
        return cantCamarote;
    }

    public Yate(Capitan capitan, double precioBase, double valorAdicional, double eslora, int fabricacion, int cantCamarote) {
        super(capitan, precioBase, valorAdicional, eslora, fabricacion);
        this.cantCamarote = cantCamarote;
    }

    public boolean compararYate(int cantCamaroteExt) {
        return cantCamaroteExt > cantCamarote;
    }
}
