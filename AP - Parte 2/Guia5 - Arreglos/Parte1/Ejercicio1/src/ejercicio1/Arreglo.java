package ejercicio1;

/*
 * @author Abi Castro
 */
public class Arreglo {

    /* a) static void sumarLista(int[] listaInt): muestra por pantalla la suma y el promedio de los mismos.
       b) static int buscarMayor(int[][] matrizIrregular): retorna el entero más grande que se encuentra en el arreglo.
       c) static int cuentaVocales(String palabra): retorna la cantidad de vocales que tiene la cadena. Crear dentro el array String[] vocales = {a, e, i, o, u}
       d) static int cuentaCaracter(String palabra, char letra): retorna la cantidad de veces que se repite el caracter en la cadena.
     */
    public static void sumarLista(int[] listaInt) {
        float suma = 0F;
        float promedio;

        for (int i = 0; i < listaInt.length; i++) {
            suma += listaInt[i];
        }
        promedio = suma / listaInt.length;

        System.out.println("La suma de su arreglo es: " + suma);
        System.out.println("El promedio de se arreglo es: " + promedio);
    }

    public static int buscarMayor(int[][] matrizIrregular) {
        int numMayor = Integer.MIN_VALUE;

        for (int i = 0; i < matrizIrregular.length; i++) {
            for (int j = 0; j < matrizIrregular[i].length; j++) {

                if (matrizIrregular[i][j] > numMayor) {
                    numMayor = matrizIrregular[i][j];
                }
            }
        }
        return numMayor;
    }

    public static int cuentaVocales(String palabra) {
        String[] vocales = {"a", "e", "i", "o", "u"};
        int contador = 0;

        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < vocales.length; j++) {
                //String.valueOf() convierte el carácter actual en la palabra a una cadena antes de compararlo con las vocales
                if (vocales[j].equals(String.valueOf(palabra.charAt(i)))) {
                    contador++;
                    break;  // Si se encuentra una vocal, se sale del bucle interno
                }
            }
        }
        return contador;
    }

    public static int cuentaCaracter(String palabra, char letra) {
        int aux = 0;

        for (int i = 0; i < palabra.length(); i++) {

            if (palabra.charAt(i) == letra) {

                aux += 1;
            }
        }
        return aux;
    }
}
