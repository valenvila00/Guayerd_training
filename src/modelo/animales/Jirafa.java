package modelo.animales;

import modelo.Mamifero;
import modelo.interfaces.Parir;

public class Jirafa extends Mamifero implements Parir {
    public Jirafa(String nombre, int edad, int cria) {
        super(nombre, edad, cria);
    }

    @Override
    public void amamantar() {
        System.out.println("amamantando como jirafa");
    }

    @Override
    public void parir() {
        System.out.println("pariendo como jirafa");
    }
}
