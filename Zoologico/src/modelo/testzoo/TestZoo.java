package modelo.testzoo;

import modelo.Felino;
import modelo.animales.Ornitorrinco;
import modelo.enums.TipoFelinoEnum;

public class TestZoo {
    public static void main(String[] args) {
        Felino felino1 = new Felino("Tomy", 23, 2, TipoFelinoEnum.LEON);
        System.out.println(felino1.getNombre());
        System.out.println(felino1.getEdad());
        System.out.println(felino1.getCria());
        System.out.println(felino1.getTipoFelino());
        felino1.amamantar();
        felino1.parir();

        Ornitorrinco perry = new Ornitorrinco("Perry el Ornitorrinco", 14, 0, false);
        if(perry.isPerry()){
            System.out.println("Es perry el ornitorrinco");
        }else{
            System.out.println("AGENTE P!");
        }
    }
}
