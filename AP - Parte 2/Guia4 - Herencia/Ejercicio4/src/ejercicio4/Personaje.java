package ejercicio4;

public abstract class Personaje {

    protected Position ubicacion;
    protected String nick;
    protected int vidas = 3;
    protected int energia = 100;
    protected char orientacion = 'N';

    public Personaje(String nick, Position ubicacion) {
        this.nick = nick;
        this.ubicacion = ubicacion;
    }

    public void Disparar() {
        if (this.energia >= 10) {
            this.energia -= 10;
        }
        System.out.println("Inserte ruido de pistola.");
        System.out.println("Energia restante: " + this.energia);
    }

    public void Girar() {
        switch (orientacion) {
            case 'N':
                this.orientacion = 'E';
                System.out.println("Has girado del Norte al Este.");
                break;
            case 'E':
                this.orientacion = 'S';
                System.out.println("Has girado del Este al Sur.");
                break;
            case 'S':
                this.orientacion = 'O';
                System.out.println("Has girado del Sur al Oeste.");
                break;
            case 'O':
                this.orientacion = 'N';
                System.out.println("Has girado del Oeste al Norte.");
                break;
        }
    }

    public void Avanzar() {

        switch (this.orientacion) {
            case 'N':
                ubicacion.setY(ubicacion.getY() + 1);
                break;
            case 'S':
                ubicacion.setY(ubicacion.getY() - 1);
                break;
            case 'E':
                ubicacion.setX(ubicacion.getX() + 1);
                break;
            case 'O':
                ubicacion.setX(ubicacion.getX() - 1);
                break;
        }
        System.out.println("X: " + ubicacion.getX() + " Y: " + ubicacion.getY());
    }
}
