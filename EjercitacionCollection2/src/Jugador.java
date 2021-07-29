public class Jugador implements Comparable <Jugador>{

    private int nroCamiseta;
    private String nombre;
    private boolean lesionado;
    private boolean titular;

    public Jugador(int nroCamiseta, String nombre, boolean lesionado, boolean titular) {
        this.nroCamiseta = nroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public int getNroCamiseta() { return this.nroCamiseta; }

    public String getNombre() { return nombre; }

    public boolean isLesionado() { return lesionado; }

    public boolean isTitular() { return titular; }

    @Override
    public int compareTo(Jugador o) {
        if(this.getNroCamiseta() > o.getNroCamiseta()){ return 1; }
        else if(this.getNroCamiseta() < o.getNroCamiseta()){ return -1; }
        return 0;
    }
}
