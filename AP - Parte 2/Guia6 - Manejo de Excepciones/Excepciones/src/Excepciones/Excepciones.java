package Excepciones;

import static java.lang.Integer.parseInt;

/*
 * @author Abi Castro
 */
public class Excepciones {

    public static void main(String[] args) {

        String text = null;
        
        try {
            //Ejercicio 1
            int length = text.length();
            System.out.println(length);
        } catch (NullPointerException e) {
            System.out.println("Se encontró un error. " + e.getMessage());
        }
        
        //Ejercicio 2
        int[] vector = new int[5];
        
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(vector[i]);
            }
        } catch (ArrayIndexOutOfBoundsException variable) {
            System.out.println("El Indice fuera de rango.");
            System.out.println("Error en: " + variable.fillInStackTrace());
            for (int i = 0; i < 5; i++) {
                System.out.println(vector[i]);
            }
        }
    }
}
