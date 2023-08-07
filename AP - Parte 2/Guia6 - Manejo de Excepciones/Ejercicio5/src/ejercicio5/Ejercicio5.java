package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @author Abi Castro
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int num = (int) (Math.random() * 500) + 1;
        int numUsuario;
        int count = 0;

        try {
            do {
                count++;
                System.out.print("Ingrese un número: ");
                numUsuario = read.nextInt();
                if (numUsuario > num) {
                    System.out.println("El número ingresado es mayor.");
                } else if (numUsuario < num) {
                    System.out.println("El número ingresado es menor.");
                } else {
                    System.out.println("Ha adivinado!!");
                }
            } while (numUsuario != num);
        } catch (InputMismatchException a){
            a.printStackTrace(System.out);
        } finally {
            System.out.println("Intentos realizados: " + count);
        }
    }

}
