package ejercicio4;

public class TestJuego {

    public static void main(String[] args) {

        Robot tito = new Robot("Tito");

        /*
        Hombre ricardo = new Hombre();
        
        Hombre pedro = new Hombre();

        ricardo.jugarConRobot(tito);
        pedro.jugarConRobot(tito);
         */
        
        Hombre juana = new Hombre();
        juana.menuJuego(tito);
    }

}
