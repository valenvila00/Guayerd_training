public class SinNafta extends Auto implements EstadoAuto{
    public SinNafta(EstadoAuto estadoauto, int velocidad, int cantCombustible) {
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
        System.out.println("No tienes nafta para ponerlo en contacto");
        return false;
    }
}
