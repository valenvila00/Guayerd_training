package modelo;

public abstract class Mamifero extends Animal {
    private int cria;

    public Mamifero(String nombre, int edad, int cria) {
        super(nombre, edad);
        this.cria = cria;
    }

    public int getCria() {
        return cria;
    }

    public void setCria(int cria) {
        this.cria = cria;
    }

    public abstract void amamantar();
}
