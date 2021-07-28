package modelo;

import modelo.enums.TipoCaninoEnum;
import modelo.interfaces.Parir;

public class Canino extends Mamifero implements Parir {

    private TipoCaninoEnum tipoCanino;

    public Canino(String nombre, int edad, int cria, TipoCaninoEnum tipoCanino) {
        super(nombre, edad, cria);
        this.tipoCanino = tipoCanino;
    }

    @Override
    public void parir() {
        System.out.println("pariendo como canino");
    }

    @Override
    public void amamantar() {
        System.out.println("amamantando como canino");
    }
}
