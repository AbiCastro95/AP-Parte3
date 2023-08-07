package ejercicio1;

/*
 * @author Abi Castro
 */
public class PruebaArreglo {

    public static void main(String[] args) {

        int[] lista1 = {1, 2, 3, 4, 5, 6, 7, 8};

        int[][] matrix = {{1, 2, 3}, {2, 1}, {2, 3, 7, 4}};

        Arreglo.sumarLista(lista1);
        int aux = Arreglo.cuentaCaracter("murmullo", 'o');
        System.out.println("" + aux);

        aux = Arreglo.cuentaVocales("murcielago");
        System.out.println("vocales= " + aux);

        aux = Arreglo.buscarMayor(matrix);
        System.out.println("el mayor de la matrix es: " + aux);
    }

}
