package modelo.animales;

import modelo.Mamifero;
import modelo.interfaces.Parir;

public class Hipopotamo extends Mamifero implements Parir {
    public Hipopotamo(String nombre, int edad, int cria) {
        super(nombre, edad, cria);
    }

    @Override
    public void amamantar() {
        System.out.println("amamantando como hipopotamo");
    }

    @Override
    public void parir() {
        System.out.println("pariendo como hipopotamo");
    }
}
