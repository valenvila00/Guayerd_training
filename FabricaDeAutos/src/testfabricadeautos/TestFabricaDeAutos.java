package testfabricadeautos;

import fabricadeautos.FabricaDeAutos;

public class TestFabricaDeAutos {
    public static void main(String[] args) {
    FabricaDeAutos fabrica = FabricaDeAutos.getInstance();
    System.out.println(fabrica.crearAutoFiat());
    System.out.println(fabrica.crearAutoFord());

    // Generamos 2 Volk en la fabrica -> Volk 0 & Volk 1
    System.out.println(fabrica.crearAutoVolk());
    System.out.println(fabrica.crearAutoVolk());

    // Generamos una "nueva" fabrica
    FabricaDeAutos fabrica2 = FabricaDeAutos.getInstance();
    // Generamos un Volk en la "nueva" fabrica
    System.out.println(fabrica2.crearAutoVolk()); // Retorna Volk 2, ya que la "nueva" fabrica es la misma.
    }
}
