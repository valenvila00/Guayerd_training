package modelo.animales;

import modelo.Mamifero;
import modelo.interfaces.Parir;

public class Elefante extends Mamifero implements Parir {
    public Elefante(String nombre, int edad, int cria) {
        super(nombre, edad, cria);
    }

    @Override
    public void amamantar() {
        System.out.println("amamantando como Elefante");
    }

    @Override
    public void parir() {
        System.out.println("pariendo como Elefante");
    }

}
