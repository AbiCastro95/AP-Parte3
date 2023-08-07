
package guia5ej7;


public class MatrizContenida {
    private final int[][]MATRIZM;
    private final int[][]MATRIZP;

    public MatrizContenida(int[][] matrizM, int[][] matrizP) {
        this.MATRIZM = matrizM;
        this.MATRIZP = matrizP;
    }
    
    public boolean verificarMatrizContenida(){
        int filaM = MATRIZM.length;
        int columnaM = MATRIZM[0].length;
        int filaP = MATRIZP.length;
        int columnaP = MATRIZP[0].length;
        
        for (int i = 0; i <= filaM - filaP; i++) {
            for (int j = 0; j <= columnaM - columnaP; j++) {
                if (verificarSubmatriz(i,j)) {
                    System.out.println("La submatriz P se encuentra en la matriz M en los indices: ");
                    for (int x = i; x < i + filaP; x++) {
                        for (int y = j; y < j + columnaP; y++) {
                            System.out.print(x + "," + y + " ");
                        }
                    }
                    System.out.println();
                    return true;
                }
            }
        }
        System.out.println("La matriz P no esta contenida en la matriz M.");
        return false;
    }
    
    private boolean verificarSubmatriz(int inicioFila, int inicioColumna) {
        int filaP = MATRIZP.length;
        int columnaP = MATRIZP[0].length;
        
        for (int i = 0; i < filaP; i++){
            for (int j = 0; j < columnaP; j++) {
                if (MATRIZM[inicioFila + i][inicioColumna + j] != MATRIZP[i][j]) {
                    return false;
                }
            }
        }
        return true;       
    }   
}
