package modelo;

public class Pez extends Animal{

    private String color;
    private int tamanio;

    public Pez(String nombre, int edad, String color, int tamanio) {
        super(nombre, edad);
        this.color = color;
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}
