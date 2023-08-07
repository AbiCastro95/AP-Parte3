package ejercicio3;

import java.util.Scanner;

/*
 * @author Abi Castro
 */
public class Ejercicio3 {

    public static void main(String[] args) {
     
        Scanner read = new Scanner(System.in);
        int count = 0;

        System.out.println("¿De qué tamaño desea sea su vector?");
        int n = read.nextInt();

        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
        System.out.println("¿Qué número desea buscar?");
        int respuesta = read.nextInt();

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == respuesta) {
                count++;
                System.out.println("El número ingresado está en la posición: " + (i + 1));
            }
        }

        if (count == 0) {
            System.out.println("El número no se encuentra dentro de su arreglo.");
        } else {
            System.out.println("El número " + respuesta + " se repitió: " + count + " veces.");
        }
    }
}
