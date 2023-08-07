package ejercicio4;

public class Conversor {

    private static final double tipoCambio = 391.00;

    public static double convertirAPesos(double usd) {
        return usd * tipoCambio;
    }

   public static double convertirADolar(double ars) {
        return ars / tipoCambio;
    }

}
