package ejercicioextra2;

public abstract class Vehiculo {

    protected String marca;
    protected String modelo;
    protected Combustible combustible;

    public abstract float calcularConsumoCombustible(float distancia);
}
