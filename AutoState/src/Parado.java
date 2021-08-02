public class Parado extends Auto implements EstadoAuto {
    public Parado(EstadoAuto estadoauto, int velocidad, int cantCombustible) {
        super(estadoauto, velocidad, cantCombustible);
    }

    @Override
    public void frenar() {

    }

    @Override
    public void acelerar() {

    }

    @Override
    public boolean contacto() {
        return false;
    }
}
