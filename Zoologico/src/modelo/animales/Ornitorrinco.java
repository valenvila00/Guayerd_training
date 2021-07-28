package modelo.animales;

import modelo.Mamifero;
import modelo.interfaces.PonerHuevo;
import modelo.interfaces.RomperCascaron;

public class Ornitorrinco extends Mamifero implements RomperCascaron, PonerHuevo {
    private boolean isPerry;

    public Ornitorrinco(String nombre, int edad, int cria, boolean isPerry) {
        super(nombre, edad, cria);
        this.isPerry = isPerry;
    }

    public boolean isPerry() {
        return isPerry;
    }

    public void setPerry(boolean perry) {
        isPerry = perry;
    }

    @Override
    public void amamantar() {

    }

    @Override
    public void ponerHuevo() {

    }

    @Override
    public void romperCascaron() {

    }
}
