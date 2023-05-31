package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        Numero valorA = new Numero(1469);

        if (valorA.esPar() == true) {
            System.out.println("Su número es par.");
        } else {
            System.out.println("Su número es impar.");
        }

        if (valorA.esPositivo() == true) {
            System.out.println("Su número es positivo.");
        } else {
            System.out.println("Su número no es positivo.");
        }

        if (valorA.esMultiplo(3) == true) {
            System.out.println("Su número es multiplo de 3.");
        } else {
            System.out.println("Su número no es multiplo de 3.");
        }
    }
}
