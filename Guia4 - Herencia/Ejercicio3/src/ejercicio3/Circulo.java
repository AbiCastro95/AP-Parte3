package ejercicio3;

public class Circulo implements calculosFormas {

    private final double RADIO;

    public Circulo(double radio) {
        this.RADIO = radio;
    }

    @Override
    public void calcularArea() {
        System.out.println("El área del círculo es: " + (PI * Math.pow(this.RADIO, 2)));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perímetro del círculo es: " + (PI * (this.RADIO * 2)));
    }

}
