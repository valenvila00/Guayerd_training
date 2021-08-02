public class EnMarcha extends Auto implements EstadoAuto{
    public EnMarcha(EstadoAuto estadoauto, int velocidad, int cantCombustible) {
        super(estadoauto, velocidad, cantCombustible);
    }

    Auto auto;
    auto.setEstadoauto();

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
