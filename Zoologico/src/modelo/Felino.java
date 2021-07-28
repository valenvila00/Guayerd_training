package modelo;

import modelo.enums.TipoFelinoEnum;
import modelo.interfaces.Parir;

public class Felino extends Mamifero implements Parir {
    private TipoFelinoEnum tipoFelino;

    public TipoFelinoEnum getTipoFelino() {
        return tipoFelino;
    }

    public void setTipoFelino(TipoFelinoEnum tipoFelino) {
        this.tipoFelino = tipoFelino;
    }

    public Felino(String nombre, int edad, int cria, TipoFelinoEnum tipoFelino) {
        super(nombre, edad, cria);
        this.tipoFelino = tipoFelino;
    }

    @Override
    public void amamantar() {
        System.out.println("Amamantando");
    }

    @Override
    public void parir() {
        System.out.println("pariendo como un felino");
    }
}

