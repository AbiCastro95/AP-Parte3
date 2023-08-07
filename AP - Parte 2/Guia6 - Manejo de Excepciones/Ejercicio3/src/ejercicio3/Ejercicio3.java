package ejercicio3;

import java.util.Scanner;

/*
 * @author Abi Castro
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        String num1 = read.next();
        System.out.print("Ingrese un número entero: ");
        String num2 = read.next();

        try {
            int num1I = Integer.parseInt(num1);
            int num2I = Integer.parseInt(num2);

            DivisionNumero.divNum(num1I, num2I);
        } catch (ArithmeticException a) {
            System.out.println("No se puede dividir por Cero.");
            System.out.println(a.toString());
        } catch (NumberFormatException e) {
            System.out.println("Formato invalido");
        } finally {
            read.close();
        }
    }

}
