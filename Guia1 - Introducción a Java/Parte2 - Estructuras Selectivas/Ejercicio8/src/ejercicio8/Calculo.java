package ejercicio8;

import static java.lang.Math.sqrt;

public class Calculo {

    public static boolean esPrimo(int num) {
        boolean esPrimo = true;
        //finaliza en la mitad del número. Ej: 6mod2==0 y 6mod3==0 => false | 5mod2==1 y 5mod(5/2)==1 => true
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                esPrimo = false;
            }
        }
        return esPrimo && num > 1;
    }
    
    public static int valorAbsoluto(int value) {
        return Math.abs(value);
    }

    public static void calcularRaices(int a, int b, int c) {
        //Ecuacion de segundo grado: x=(-b +- V(b)2 - 4ac)/2a

        int potenciaB = b * b;
        int multiplicacion = 4 * a * c;

        //El término ((b)2 - 4ac)) tiene que ser positivo
        if (potenciaB - multiplicacion >= 0) {
            double raiz1 = ((-b + sqrt(potenciaB - multiplicacion)) / 2 * a);
            double raiz2 = ((-b - sqrt(potenciaB - multiplicacion)) / 2 * a);
            System.out.println("Raices: X1= " + raiz1 + " X2= " + raiz2);
        } else {
            System.out.println("No tiene raíces reales.");
        }
    }
}
