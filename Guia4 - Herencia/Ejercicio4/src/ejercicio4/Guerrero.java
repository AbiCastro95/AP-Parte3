package ejercicio4;

public class Guerrero extends Personaje {

    private boolean caballo;

    public Guerrero(String nick, Position ubicacion) {
        super(nick, ubicacion);
    }

    @Override
    public void Avanzar() {
        if (this.caballo) {
            switch (this.orientacion) {
                case 'N':
                    ubicacion.setY(ubicacion.getY() + 10);
                    break;
                case 'S':
                    ubicacion.setY(ubicacion.getY() - 10);
                    break;
                case 'E':
                    ubicacion.setX(ubicacion.getX() + 10);
                    break;
                case 'O':
                    ubicacion.setX(ubicacion.getX() - 10);
                    break;
            }
        } else {
            super.Avanzar();
        }
    }

    @Override
    public void Disparar() {
        if (energia < 30) {
            this.caballo = false;
            System.out.println("Has perdido a tu caballo.");
        }
        super.Disparar();
    }
}
