package fabricadeautos;

public class FabricaDeAutos {

    private int totalAutosFiat;
    private int totalAutosFord;
    private int totalAutosVolk;

    private static class Fabrica {
        public static FabricaDeAutos instance = new FabricaDeAutos();
    }

    private FabricaDeAutos(){}

    public static FabricaDeAutos getInstance(){
        return Fabrica.instance;
    }

    public String crearAutoVolk() {
        return new String("Auto Volk #" + totalAutosVolk++ + " creado.");
    }

    public String crearAutoFord() {
        return new String("Auto Ford #" + totalAutosFord++ + " creado.");
    }

    public String crearAutoFiat() {
        return new String("Auto Fiat #" + totalAutosFiat++ + " creado.");
    }

    public String generarInforme() {
        return new String("Total de Autos Fiat vendidos: " + totalAutosFiat
                + "\nTotal de Autos Ford vendidos: " + totalAutosFord
                + "\nTotal de Autos Volk vendidos: " + totalAutosVolk);
    }

}
