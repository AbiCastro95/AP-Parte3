package ejercicioextra5;

// El Tanque de Agua tiene una capacidad máxima es de 10.000 litros.
public class TanqueDeAgua {

    private final int capacidadMaxima = 10000;
    private final int capacidadInicial;

    private int capacidad;

    public TanqueDeAgua(int litros) {
        capacidadInicial = litros;
        capacidad = capacidadInicial;
    }

    public int getCapacidadInicial() {
        return capacidadInicial;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    //para saber si su capacidad está al límite o vacía
    public String estadoDelTanque() {
        String estado = null;
        if (capacidad == capacidadMaxima) {
            estado = "LIMITE";
        } else if (capacidad == 0) {
            estado = "VACIO";
        }
        return estado;
    }

    //cada vez que se lo invoca carga 500lt.
    public void cargar() {
        if (capacidad <= (capacidadMaxima - 500)) {
            capacidad += 500;
        } else {
            System.out.println("Espacio disponible insuficiente. Capacidad disponile: " + (capacidadMaxima - capacidad) + "lt");
        }

    }
}
