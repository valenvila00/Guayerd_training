import embarcacion.Capitan;
import embarcacion.Velero;
import embarcacion.Yate;

public class Main {
    public static void main(String[] args) {
        Capitan capitan = new Capitan("Pepe", "Gimenez", 12345);
        Yate yate1 = new Yate(capitan, 2000.0, 1000.0, 2, 2020, 4);
        Yate yate2 = new Yate(capitan, 3000.0, 2000.0, 4, 2021, 5);

        Velero velero1 = new Velero(capitan, 2000.0, 1000.0, 2, 2020, 5);
        Velero velero2 = new Velero(capitan, 2000.0, 1000.0, 2, 2020, 3);

        System.out.println(yate1.compararYate(yate2.getCantCamarote()));
        System.out.println(yate2.compararYate(yate1.getCantCamarote()));
        System.out.println(yate1.calculoAlquiler());
        System.out.println(yate2.calculoAlquiler());

        System.out.println(velero1.esGrande());
        System.out.println(velero2.esGrande());
        System.out.println(velero1.calculoAlquiler());
        System.out.println(velero2.calculoAlquiler());
    }

}
