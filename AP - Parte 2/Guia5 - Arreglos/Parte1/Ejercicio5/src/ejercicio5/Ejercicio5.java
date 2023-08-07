package ejercicio5;

/*
 * @author Abi Castro
 */
public class Ejercicio5 {

    public static void main(String[] args) {
       
        int[][] matrix1 = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] matrix2 = {{0, 2, -4}, {-2, 0, -2}, {4, 2, 0}};
        
        int count = 0;

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                if (matrix1[i][j] == -matrix2[i][j]) {
                    count++;
                }
            }
        }
       
        if(count == 9){
            System.out.println("Su matriz secundaria es anti simétrica.");
        } else {
            System.out.println("Su matriz secundaria no corresponde a la verificación especificada.");
        }
    }

}
