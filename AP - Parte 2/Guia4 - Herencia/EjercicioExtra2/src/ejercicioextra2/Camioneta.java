package ejercicioextra2;

public class Camioneta extends Vehiculo {

    public Camioneta() {
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    @Override
    public float calcularConsumoCombustible(float distancia) {
        return distancia * 0.1F * combustible.getPrecio();
    }
}
