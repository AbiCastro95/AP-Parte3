package ejercicio4;

public class TestHerencia {

    public static void main(String[] args) {

        Position position = new Position(0, 0);

        Personaje jugador = new Guerrero("Thor", position);

        while (jugador.orientacion != 'O') {
            jugador.Girar();
        }

        for (int i = 0; i < 5; i++) {
            jugador.Avanzar();
        }

        for (int i = 0; i < 8; i++) {
            jugador.Disparar();
        }
    }

}
