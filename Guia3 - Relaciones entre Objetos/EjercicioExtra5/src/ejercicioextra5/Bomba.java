package ejercicioextra5;

public class Bomba {

    private final Motor motor;

    public Bomba(Motor motor) {
        this.motor = motor;
    }

    //hace que el Motor consuma agua hasta que su tanque quede completamente vacío.
    public void regar() {
        do {
            motor.consumirAgua();
            motor.cambiarVelocidad();
        } while (!"VACIO".equals(motor.getTanque().estadoDelTanque()));
    }

    //muestra por pantalla la carga inicial del tanque, la velocidad del motor.
    public void mostrarInfo() {
        System.out.println("Capacidad inicial: " + motor.getTanque().getCapacidadInicial() + "lt.");
        System.out.println("Capacidad final: " + motor.getTanque().getCapacidad() + "lt.");
        System.out.println("Velocidad final del motor: " + motor.getVelocidad());
    }
}
