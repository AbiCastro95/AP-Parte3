package integradora;

import java.util.Scanner;

public class ExtrasG1 {

    public static Scanner read = new Scanner(System.in);

    public static void ejercicio1() {

        System.out.println("Ingrese la cantidad de minutos a convertir.");
        int min = read.nextInt();

        int day = min / 1440;
        int mod = min % 1440;
        int hs = mod / 60;

        System.out.println(day + "Dias " + hs + " Horas.");
    }

    public static void ejercicio2() {

        int A = (int) (Math.random() * 10 + 1);
        int B = (int) (Math.random() * 10 + 1);
        int C = (int) (Math.random() * 10 + 1);
        int D = (int) (Math.random() * 10 + 1);
        System.out.println("A: " + A + " B: " + B + " C: " + C + " D: " + D);

        int aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("A: " + A + " B: " + B + " C: " + C + " D: " + D);
    }

    public static void ejercicio3() {

        System.out.println("Ingrese una letra.");
        char letter = read.next().charAt(0);

        letter = Character.toLowerCase(letter);

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("La letra " + letter + " es una vocal.");
        } else {
            System.out.println("No se ha ingresado una vocal.");
        }
    }

    public static void ejercicio4() {

        int num = 0;

        while (num < 1 || num > 10) {
            System.out.println("Ingrese un número.");
            num = read.nextInt();
        }

        switch (num) {
            case 1:
            case 2:
            case 3:
                for (int i = 0; i < num; i++) {
                    System.out.print("I");
                }
                System.out.println("");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                for (int i = 0; i < 1; i++) {
                    System.out.print("V");
                    for (int j = 0; j < num - 5; j++) {
                        System.out.print("I");
                    }
                }
                System.out.println("");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
        }
    }

    public static void ejercicio5() {

        String type;
        do {
            System.out.println("Ingrese el tipo de socio (A , B, C)");
            type = read.next().toUpperCase();
        } while (!type.equals("A") && !type.equals("B") && !type.equals("C"));

        System.out.println("Ingrese el costo de su tratamiento.");
        double price = read.nextDouble();

        switch (type.charAt(0)) {
            case 'A':
                System.out.println("El valor a abonar es: $" + (price - (price * 50 / 100)));
                break;
            case 'B':
                System.out.println("El valor a abonar es: $" + (price - (price * 35 / 100)));
                break;
            case 'C':
                System.out.println("El valor a abonar es: $" + price);
                break;
        }

    }

    public static void ejercicio6() {

        double altura, cant160 = 0, promGen = 0, suma = 0;

        System.out.print("Ingrese la cantidad de personas a ingresar: ");
        int n = read.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la altura de la persona número " + (i + 1));
            altura = read.nextDouble();

            if (altura < 1.60) {
                cant160++;
            }
            suma += altura;
        }

        if (n > 0) {
            promGen = suma / n;
        }
        double prom160 = cant160 / n;

        System.out.println("Promedio de personas por debajo de 1.60m: " + prom160 + "%.");
        System.out.println("Promedio general de estaturas: " + promGen + "m.");
    }

    public static void ejercicio7() {

        int num, i = 0, suma = 0;
        int max = 0, min = 0;

        System.out.print("Ingrese la cantidad de números a ingresar: ");
        int n = read.nextInt();

        //Verificamos que solo introduzca números válidos
        while (n <= 0) {
            System.out.print("Cantidad inválida. Reingrese la cantidad: ");
            n = read.nextInt();
        }

        while (i < n) {
            System.out.print("Ingrese un número. ");
            num = read.nextInt();
            System.out.println("Guardando número.");

            suma += num;

            if (i == 0) {
                max = num;
                min = num;
            } else {
                max = Math.max(max, num);
                min = Math.min(min, num);
            }

            i++;
        }
        double prom = (double) suma / n;

        System.out.println("El valor máximo obtenido es: " + max);
        System.out.println("El valor mínimo obtenido es: " + min);
        System.out.println("El promedio es: " + prom);
    }

    public static void ejercicio8() {

        int num;
        int cantNum = 0;
        int par = 0, impar = 0;

        while (true) {
            System.out.print("Ingrese un número. ");
            num = read.nextInt();

            cantNum++;

            if (num < 0) {
                System.out.println("No se cuentan números negativos.");
                continue;
            }

            par = (num % 2 == 0) ? (par + 1) : par;
            impar = (num % 2 != 0) ? (impar + 1) : impar;

            if (num % 5 == 0) {
                System.out.println("Se encontró un múltiplo de 5.");
                System.out.println("Cantidad de números leidos: " + cantNum);
                System.out.println("Cantidad de pares obtenidos: " + par);
                System.out.println("Cantidad de impares obtenidos: " + impar);
                break;
            }
        }

    }

    public static void ejercicio9() {

        int cociente = 0, residuo;

        System.out.print("Ingrese el dividendo (el número a dividir): ");
        int dividendo = read.nextInt();
        System.out.print("Ingrese el divisor (el número por el que va a dividir): ");
        int divisor = read.nextInt();

        while (divisor <= 1) {
            System.out.print("Divisor no válido, reingrese el divisor: ");
            divisor = read.nextInt();
        }

        do {
            residuo = dividendo - divisor;
            cociente++;
            dividendo = residuo;
        } while (residuo >= divisor);

        System.out.println("El resultado de su división es: " + cociente);
        System.out.println("El resto es: " + residuo);
    }

    public static void ejercicio10() {

        System.out.println("El sistema procedera a crear los números del 1 al 10, luego los multiplicara y usted intentara adivinar el resultado.");
        int target = (int) ((Math.random() * 10 + 1) * (Math.random() * 10 + 1));

        System.out.print("Ingrese su respuesta: ");
        int num = read.nextInt();

        while (num != target) {
            if (num > target) {
                System.out.println("Te has pasado.");
            } else {
                System.out.println("Te has quedado corto.");
            }
            System.out.print("Número incorrecto, reingrese su respuesta: ");
            num = read.nextInt();
        }

        if (num == target) {
            System.out.println("Felicidades has acertado!!");
        }

    }

    public static int ejercicio11(int num) {

        if (num == 0) {
            return 1; // El número 0 tiene un solo dígito
        }

        int count = 0;
        num = Math.abs(num);

        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static void ejercicio12() {

        //Tres for para las centenas (i), decenas (j) y unidades (k).
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    /*i o j o k es igual a 3? si es true lo reemplaza por "E" de lo contrario
                    convierte el dígito en una cadena (String.valueOf(i))
                    Hacer con string y replace
                     */
                    String digitI = (i == 3) ? "E" : String.valueOf(i);
                    String digitJ = (j == 3) ? "E" : String.valueOf(j);
                    String digitK = (k == 3) ? "E" : String.valueOf(k);

                    System.out.println(digitI + "-" + digitJ + "-" + digitK);
                }
            }
        }

    }

    public static void ejercicio13() {

        System.out.print("Ingrese la altura de la escalera a crear: ");
        int num = read.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
