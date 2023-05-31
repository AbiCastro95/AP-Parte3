package ejercicioextra4;

public class RuletaRusa {

    public static void main(String[] args) {
        
        RevolverDeAgua revolver = new RevolverDeAgua();
        revolver.llenarRevolver();
        
        Jugador jugador1 = new Jugador(1, "Pedro");
        Jugador jugador2 = new Jugador(2, "Juan");
        
        Juego juego = new Juego();
        
        juego.llenarJuego(jugador1, jugador2, revolver);
        
        juego.ronda();
    }
    
}
