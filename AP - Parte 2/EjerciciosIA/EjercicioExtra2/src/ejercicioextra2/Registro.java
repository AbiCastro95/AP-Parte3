package ejercicioextra2;


/*
 * @author Abi Castro
 */
public class Registro {

    public static void main(String[] args) {
     
        Dato datos = new Dato();
        MetodosMatriz matriz = new MetodosMatriz(datos);
        matriz.rellenarDato();
        matriz.rellenarMatriz();
        matriz.mostrarMatriz();
        
    }
    
}
