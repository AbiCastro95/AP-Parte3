package ejercicio5;

public class Utilitario {


    public static void dibujaCuadrado(int lado) {
        //Ciclo PARA i
        for (int i = 0; i <= lado - 1; i++) {
            //Ciclo PARA j
            for (int j = 0; j <= lado - 1; j++) {
                if (i == 0 || i == lado-1 || j == 0 || j == lado-1) {
                    System.out.print("*");
                } else {
                    if (i > 0 || i < lado-0 && j > 0 || j < lado-1) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }

    public static void elMayorEs(int num1, int num2, int num3) {
        if (num1 == num2 && num2 == num3) {
            System.out.println("Sus números son iguales.");
        } else {
            if (num1 > num2 && num1 > num3) {
                System.out.println("El número 1 es el mayor.");
            } else {
                if (num2 > num3) {
                    System.out.println("El número 2 es el mayor.");
                } else {
                    System.out.println("El número 3 es el mayor.");
                }
            }
        }

    }

    public static void elDiaEs(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No existe ese día");
        }
    }
}
