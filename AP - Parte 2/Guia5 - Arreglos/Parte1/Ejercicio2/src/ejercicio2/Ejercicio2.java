package ejercicio2;

/*
 * @author Abi Castro
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        /* En un nuevo proyecto en el método main de su clase principal, se pide crear un algoritmo que
           rellene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
        */
        int[] vector = new int[100];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i;
            System.out.print(i + "|");
        }
        System.out.println("");
    }

}
