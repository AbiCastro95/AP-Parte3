package ejercicio3;

public class Rectangulo implements calculosFormas {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("El área del rectánculo es: " + base * altura);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perímetro del rectángulo es: " + ((base + altura) * 2));
    }

}
