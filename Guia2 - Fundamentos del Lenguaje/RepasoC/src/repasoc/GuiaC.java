package repasoc;

import java.util.Scanner;

public class GuiaC {

    static Scanner read = new Scanner(System.in);

    public static void ejercicio12() {
        /*Puede ser un while
            while((nota<0) || (nota>10)){
             System.out.println("ingrese nuevamente la nota");
                nota=entrada.nextInt();
         */
        int grade;
        do {
            System.out.println("Ingrese su nota.");
            grade = read.nextInt();
        } while (grade < 0 || grade > 10);
    }

    public static void ejercicio13() {
        System.out.println("Ingrese valor límite positivo.");
        int limit = read.nextInt();

        int num, add;
        add = 0;

        while (add < limit) {
            System.out.println("Ingrese un número");
            num = read.nextInt();
            add += num;
        }

        System.out.println("La suma supera el valor límite: " + add);
    }

    public static void ejercicio14() {

        int num1, num2, option;
        boolean out = false;

        System.out.println("Ingrese dos números para comenzar.");
        num1 = read.nextInt();
        num2 = read.nextInt();

        while (!out) {

            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            option = read.nextInt();

            switch (option) {
                case 1:
                    System.out.println("El resultado de la suma es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                    } else {
                        System.out.println("El resultado de la división es: " + (num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir? S|N");
                    char answer = read.next().charAt(0);
                    if (answer == 'S' || answer == 's') {
                        out = true;
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            System.out.println();
        }
        System.out.println("Fin del programa.");
    }

    public static void ejercicio15() {
        //Puedo usar un for para no usar contador
        int count = 0;
        int add = 0;

        while (count < 20) {
            System.out.print("Ingrese un número: ");
            int number = read.nextInt();

            if (number > 0) {
                add += number;
            } else if (number == 0) {
                System.out.println("Se capturó el número cero");
                break;
            }
            count++;
        }

        System.out.println("La suma de sus números es: " + add);
    }

    public static void ejercicio16() {
        /*
        Las cadenas deben llegar con un formato fijo:
        - Máximo de 5 caracteres de largo. (length<=5)
        - El primer carácter tiene que ser X. (charAt(0)=='X')
        - El último tiene que ser una O.(charAt(4)=='O')
        Las secuencias leídas que respeten el formato se consideran correctas; toda secuencia distinta de
        FDE (“&&&&&”, marca el final de los envíos) que no respete el formato se considera incorrecta.
        AL finalizar debo dar un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
         */
        String FDE = "&&&&&";
        String text;

        int countV = 0, countI = 0;

        do {
            System.out.print("Ingrese su palabra (''&&&&&'' para salir): ");
            text = read.nextLine();

            if (text.length() <= 5 && text.charAt(0) == 'X' && text.charAt(text.length() - 1) == 'O') {
                // if (text.substring(0).equals("X") & text.substring(text.length()).equals("O"))
                countV++;
            } else if (!text.equals(FDE)) {
                countI++;
            }
        } while (!text.equals(FDE));

        System.out.println("Lecturas Correctas: " + countV);
        System.out.println("Lecturas Incorrectas: " + countI);
    }

    public static void ejercicio17() {

        System.out.print("Ingrese su la cantidad de lados de su cuadrado: ");
        int num = read.nextInt();
        /*y: Filas | x: Columnas
        x++ suma la columna | y++ suma la fila simulando el paso del for.
        Puedo usar un if en las x y despues uno en las y
         */
        int x = 0;

        while (x <= (num - 1)) {
            int y = 0;
            while (y <= (num - 1)) {
                if (x == 0 || x == (num - 1) || y == 0 || y == (num - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                y++;
            }
            x++;
            System.out.println("");
        }
    }

    public static void ejercicio18() {

        for (int i = 0; i < 4; i++) {

            System.out.println("Introduzca un número entre 1 y 20:");
            int num = read.nextInt();
            //Para mostrar el error
            while (num < 1 || num > 20) {
                System.out.println("El número ingresado no está en el rango válido.");
                System.out.println("Introduzca un número entre 1 y 20:");
                num = read.nextInt();
            }

            System.out.print(num + " ");
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
