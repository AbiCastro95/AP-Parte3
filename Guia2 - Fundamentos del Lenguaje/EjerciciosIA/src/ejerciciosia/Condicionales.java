package ejerciciosia;

import java.util.Scanner;

public class Condicionales {

    static Scanner read = new Scanner(System.in);

    public static void ejercicio1() {

        System.out.println("Introduce tu edad.");
        int age = read.nextInt();

        if (age > 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("No eres mayor");
        }
    }

    public static void ejercicio2() {

        System.out.println("Introduzca su calificación de 0 a 100.");
        int grade = read.nextInt();
        char letter;
        //Divido por 10 para agrupar por decadas 100,90,80,70,60
        switch (grade / 10) {
            case 10:
            case 9:
                letter = 'A';
                break;
            case 8:
                letter = 'B';
                break;
            case 7:
                letter = 'C';
                break;
            case 6:
                letter = 'D';
                break;
            default:
                letter = 'F';
                break;
        }
        System.out.println("Tu calificación es " + letter);
    }

    public static void ejercicio3() {

        System.out.println("Hola! Primero introduce el precio del producto a adquirir.");
        double price = read.nextInt();
        System.out.println("Ahora introduce tu edad.");
        int age = read.nextInt();

        double discount;

        if (age < 18) {
            discount = price * 10 / 100;
        } else {
            discount = price * 5 / 100;
        }

        System.out.println("Usted va a abonar: $" + (price - discount));
    }

    public static void ejercicio4() {

        System.out.println("Hola! Primero introduce tu peso en KG.");
        double weight = read.nextDouble();
        System.out.println("Ahora introduce tu altura en MT.");
        double height;
        height = read.nextDouble();

        double imc = weight / Math.pow(height, 2);

        if (imc < 18.5) {
            System.out.println("Su IMC es de: " + imc + ". Usted tiene un PESO BAJO");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Su IMC es de: " + imc + ". Usted tiene un PESO NORMAL");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Su IMC es de: " + imc + ". Usted tiene SOBREPESO");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Su IMC es de: " + imc + ". Usted tiene OBESIDAD en grado 1");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Su IMC es de: " + imc + ". Usted tiene OBESIDAD en grado 2");
        } else if (imc >= 40) {
            System.out.println("Su IMC es de: " + imc + ". Usted tiene OBESIDAD en grado 3");
        }

        System.out.println("Nota: El IMC es una medida aproximada y no tiene en cuenta la distribución de la masa muscular");
        System.out.println("Por lo que no se recomienda utilizarlo como único indicador de salud.");
    }

    public static void ejercicio5() {

        System.out.print("Ingrese el radio de su círculo. ");
        double radius = read.nextDouble();

        System.out.println("El área de su círculo es: " + (Math.PI * (Math.pow(radius, 2))));
        System.out.println("El perímetro de su círculo es: " + (2 * Math.PI * radius));

    }

    public static void ejercicio6() {

        System.out.print("Ingrese su texto: ");
        String text = read.nextLine();

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            if (Character.isLetter(letter)) {
                count++;
            }
        }

        System.out.println("El número de letras en la cadena es: " + count);
    }

    public static void ejercicio7() {

        System.out.print("Ingrese un número y el sistema le devolverá los resultados de la multiplicación del 1 al 10. ");
        int num = read.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d.\n", num, i, (num * i));
        }
    }

    public static void ejercicio8() {

        System.out.println("Ingrese el valor inicial y el valor final del rango a analizar,presione ENTER luego de introducir cada número: ");
        int num1 = read.nextInt();
        int num2 = read.nextInt();

        for (int i = num1; i <= num2; i++) {
            boolean esPrimo = true;

            if (i < 2) {
                esPrimo = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            if (esPrimo) {
                System.out.println(i + " ");
            }
        }
    }

    public static void ejercicio9() {

        System.out.print("Ingrese un número y el sistema le devolverá el cuadrado de dicho número. ");
        int num = read.nextInt();

        System.out.printf("El cuadrado de %d es: %d.\n", num, (int) (Math.pow(num, 2)));
    }

    public static void ejercicio10() {

        System.out.print("Ingrese su texto: ");
        String text = read.nextLine();

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char letter = text.toLowerCase().charAt(i);

            if (Character.isLetter(letter) && letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u') {
                count++;
            }
        }
        System.out.println("El número de consonantes en la cadena es: " + count);
    }

    public static void ejercicio11() {

        System.out.print("Ingrese un número y el sistema le devolverá todos los pares desde 2 hasta dicho número. ");
        int num = read.nextInt();

        for (int i = 2; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void ejercicio12() {

        System.out.print("Ingrese su palabra: ");
        String text = read.next();

        boolean esPalindromo = true;
        
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La cadena \"" + text + "\" es un palíndromo.");
        } else {
            System.out.println("La cadena \"" + text + "\" no es un palíndromo.");
        }
    }
    
    public static void ejercicio13(){
        
        System.out.println("El programa va a generar un número del 1 al 100 y usted deberá adivinarlo.");
        
        int target = (int) (Math.random() * 100) + 1;
        int num;
        
        do {
            System.out.print("Ingrese un número: ");
            num = read.nextInt();
            
            if(num > target){
                System.out.println("El número ingresado es MAYOR.");
            } else if (num < target){
                System.out.println("El número ingresado es MENOR.");
            }
        } while (num != target);
        
        System.out.println("El número ingresado es CORRECTO.");
    }
}
