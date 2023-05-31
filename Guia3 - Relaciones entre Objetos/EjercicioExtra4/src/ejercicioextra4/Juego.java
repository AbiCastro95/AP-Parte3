package ejercicioextra4;

public class Juego {

    private Jugador jugador1;
    private Jugador jugador2;
    private RevolverDeAgua revolver;

    public Juego() {
    }

    public void llenarJuego(Jugador jugador1, Jugador jugador2, RevolverDeAgua r) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.revolver = r;
    }

    public void ronda() {
        System.out.println("Inicia el juego.");
        do {
            System.out.println("Es el turno de: " + jugador1.toString());
            jugador1.disparo(revolver);

            if (jugador1.isMojado() == false) {
               System.out.println("Es el turno de: " + jugador2.toString());
                jugador2.disparo(revolver);
            }
            
            if (jugador1.isMojado() == true || jugador2.isMojado() == true) {
                break;
            }
        } while (true);

        System.out.println("El juego ha finalizado.");

        if (jugador1.isMojado() == true) {
            System.out.println(jugador1.toString() + ", se ha mojado.");
        } else {
            System.out.println(jugador2.toString() + ", se ha mojado.");
        }
    }
}
