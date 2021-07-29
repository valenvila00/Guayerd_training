import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Equipo {
    private final String nombre;
    private List<Jugador> jugadores = new ArrayList<Jugador>();

    public Equipo(String nombre) { this.nombre = nombre; }

    public void addJugador(Jugador j) { jugadores.add(j); }

    public void mostrarJugadoresTitulares(){
        List<Jugador> titulares = jugadores.stream()
                .filter(Jugador::isTitular).sorted().collect(Collectors.toList());
        for(Jugador titular:titulares){
            System.out.println(titular.getNroCamiseta()+" "+titular.getNombre());
        }
    }

    public int getCantidadJugadoresLesionados(){
        int counter = 0;
        for(Jugador jugador: jugadores){
            if(jugador.isTitular() && jugador.isLesionado()){
                counter +=1;
            }
        }
        return counter;
    }
}
