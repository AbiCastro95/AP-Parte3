package repasob;

import java.util.Scanner;

public class Guia2 {

    public static Scanner read = new Scanner(System.in);

    public static void ejercicio6(int num1, int num2) {

        int max = Math.max(num1, num2);
        System.out.println("El mayor es " + max);

        /*if (num1 == num2) {
            System.out.println("Estos números son iguales");
        } else if (num1 > num2){
            System.out.println(num1 + " es el mayor.");
        } else {
            System.out.println(num2 + " es el mayor.");
        }*/
    }

    public static void ejercicio7(int num1) {

        if (num1 % 2 == 0) {
            System.out.println("Su número es par.");
        } else {
            System.out.println("Su número es impar.");
        }
    }

    public static void ejercicio8() {

        System.out.println("Escriba una frase.");
        String text = read.nextLine();

        final String target = "eureka";

        System.out.println("Las cadenas son iguales? " + text.equals(target));
    }

    public static void ejercicio9() {
        String text;

        do {
            System.out.println("Escriba una frase.");
            text = read.nextLine();
            if (text.length() != 8) {
                System.out.println("INCORRECTO");
            }
        } while (text.length() != 8);

        System.out.println("CORRECTO");

    }

    public static void ejercicio10() {

        System.out.println("Escriba una frase.");
        String text = read.nextLine();
        
        //frase.indexOf("A") == 0
        if (text.charAt(0) == 'A') {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }

    public static void ejercicio11() {

        System.out.print("¿Que tipo de motor tiene?");
        int type = read.nextInt();

        switch (type) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
                break;
        }

    }

}
