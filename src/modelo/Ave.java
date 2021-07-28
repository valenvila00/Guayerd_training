package modelo;

import modelo.interfaces.PonerHuevo;
import modelo.interfaces.RomperCascaron;

public class Ave extends Oviparo implements PonerHuevo, RomperCascaron {

    private String color;

    public Ave(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    @Override
    public void ponerHuevo() {
        System.out.println("Poniendo el Huevo");
    }

    @Override
    public void romperCascaron() {
        System.out.println("Rompiendo el cascaron");
    }
}
