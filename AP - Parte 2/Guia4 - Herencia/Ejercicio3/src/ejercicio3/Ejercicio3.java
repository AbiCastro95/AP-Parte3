package ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(5);
        circulo.calcularArea();
        circulo.calcularPerimetro();

        Rectangulo rectangulo = new Rectangulo(8, 2);
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
    }

}
