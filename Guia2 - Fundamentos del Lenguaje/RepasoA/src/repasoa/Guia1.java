package repasoa;

import java.util.Scanner;

public class Guia1 {
    
    public static Scanner read = new Scanner(System.in);
    
    public static void ejercicio1() {

        System.out.println("Introduzca el primer número.");
        final int num_1 = read.nextInt();

        System.out.println("Introduzca el segundo número.");
        final int num_2 = read.nextInt();

        int add = num_1 + num_2;

        System.out.println("La suma de sus números es: " + add);
    }

    public static void ejercicio2() {
      
        System.out.println("Introduzca su nombre.");

        final String name = read.next();

        System.out.println("Hola " + name + "!!");
    }

    public static void ejercicio3() {

        System.out.println("Introduzca una frase.");
        final String text = read.nextLine();

        System.out.println("Su frase en MAYÚSCULAS es: " + text.toUpperCase());
        System.out.println("Su frase en MINÚSCULAS es: " + text.toLowerCase());
    }

    public static double ejercicio4() {

        System.out.println("Introduzca los grados Celcius.");
        final double celsius = read.nextDouble();

        double fahrenheit = 32 + (celsius * 9 / 5);
        return fahrenheit;
        
        //System.out.println(celsius + "°C son " + fahrenheit + "°F.");
    }

    public static void ejercicio5() {

        System.out.println("Introduzca un número.");
        final int num = read.nextInt();
        //Doble - Triple - Raiz2
        System.out.println("El DOBLE de " + num + " es " + num * 2);
        System.out.println("El TRIPLE de " + num + " es " + num * 3);

        if (num >= 0) {
            double sqrt = Math.sqrt(num);
            System.out.println("La raíz cuadrada de " + num + " es +-" + Math.round(sqrt));
        } else {
            System.out.println("No se puede calcular la raíz cuadrada.");
        }
    }
}
