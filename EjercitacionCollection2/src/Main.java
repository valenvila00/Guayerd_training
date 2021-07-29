public class Main {
    public static void main(String[] args) {
        Jugador jugador0 = new Jugador(1, "Valen", false, true);
        Jugador jugador1 = new Jugador(3, "Juan", true, true);
        Jugador jugador2 = new Jugador(2, "Santi", true, false);
        Equipo equipo1 = new Equipo("Estudiantes de la Plata");

        equipo1.addJugador(jugador1);
        equipo1.addJugador(jugador0);
        equipo1.addJugador(jugador2);
        System.out.println(equipo1.getCantidadJugadoresLesionados());
        equipo1.mostrarJugadoresTitulares();

        Equipo equipo2 = new Equipo("River");
        System.out.println(equipo2.getCantidadJugadoresLesionados());
        equipo2.mostrarJugadoresTitulares();
    }
}
