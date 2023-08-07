package ejercicio4;

/*
 * @author Abi Castro
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        /*En un nuevo proyecto, en el método main de su clase principal, se pide realizar un algoritmo
          que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.*/

        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println("");
        }
    }
}
