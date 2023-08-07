package ejercicio6;

import java.util.Scanner;

/*
 * @author Abi Castro
 */
public class MatrizMagica {

    /*For-Each:
      La variable cuadrado1 se declara como un array unidimensional de tipo int[] (vector),
      en cada iteración del bucle for, cuadrado1 tomará el valor de uno de los vectores dentro de cuadrado.
      Así estoy accediendo a las filas individualmente para realizar operaciones o a los elementos dentro de ellas.
     */
    static int[][] cuadrado = new int[3][3];
    static int[] vectorNum = new int[9];

    public static void llenarMatriz() {
        Scanner read = new Scanner(System.in);

        System.out.println("Introduce los números del cuadrado (del 1 al 9)");

        int fila = 0;
        int columna = 0;

        while (fila < cuadrado.length) {
            System.out.printf("Fila %d, Columna %d: ", (fila + 1), (columna + 1));

            int num = read.nextInt();

            if (num < 1 || num > 9) {
                System.out.println("Número no válido. Ingrese un número válido (del 1 al 9):");
                continue;
                //Si es válido verifica si esta repetido, sino vuelve a la linea 27.
            }

            if (estaRepetido(num, cuadrado)) {
                System.out.println("El número ya ha sido ingresado. Ingrese otro número válido (del 1 al 9):");
                continue;
                //Si no esta repetido sigue, sino vuelve a la linea 27.
            }

            cuadrado[fila][columna] = num;
            columna++;

            if (columna == cuadrado[fila].length) {
                columna = 0;
                fila++;
            }
        }
        System.out.println("");
    }

    public static boolean verificarCuadradoMagico(int[][] cuadrado) {

        //Creo mi suma objetivo con la cual voy a comparar
        int sumaObjetivo = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];

        //Primero verifico las filas, si una es distinta da false.
        for (int[] cuadrado1 : cuadrado) {
            int sumaFila = 0;

            for (int j = 0; j < cuadrado.length; j++) {
                sumaFila += cuadrado1[j];
            }

            if (sumaFila != sumaObjetivo) {
                return false;
            }
        }

        //Si las filas estan ok reviso las columnas, si una no está correcta da false.
        for (int j = 0; j < cuadrado.length; j++) {
            int sumaColumna = cuadrado[0][j] + cuadrado[1][j] + cuadrado[2][j];

            if (sumaColumna != sumaObjetivo) {
                return false;
            }
        }

        //Si las filas y columnas estan ok verifico ambas diagonales...
        int sumaDiagonal1 = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
        int sumaDiagonal2 = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];

        /*si las filas estan ok,las columnas ok y las diagonales ok da true.
        si alguna o ambas diagonales no dan, devuelve false.
         */
        return sumaDiagonal1 == sumaObjetivo && sumaDiagonal2 == sumaObjetivo;
    }

    public static boolean estaRepetido(int num, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void imprimir() {
        boolean esMagico = verificarCuadradoMagico(cuadrado);

        for (int[] cuadrado1 : cuadrado) {
            for (int j = 0; j < cuadrado.length; j++) {
                System.out.print(cuadrado1[j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        if (esMagico) {
            System.out.println("El cuadrado es mágico. La suma es: " + (cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2]));
        } else {
            System.out.println("El cuadrado no es mágico.");
        }
    }

}
