package ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {

        double dolaresConvertidos = Conversor.convertirAPesos(500);
        double pesosConvertidos = Conversor.convertirADolar(25700);

        System.out.println("ARS " + dolaresConvertidos);
        System.out.println("USD " + pesosConvertidos);

    }
}
