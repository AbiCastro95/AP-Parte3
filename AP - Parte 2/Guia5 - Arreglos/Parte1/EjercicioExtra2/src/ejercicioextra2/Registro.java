package ejercicioextra2;


/*
 * @author Abi Castro
 */
public class Registro {

    public static void main(String[] args) {
     
        Dato datos = new Dato();
        MetodosMatriz matriz = new MetodosMatriz(datos);
        //matriz.rellenarDato();
        matriz.rellenarMatriz();
        matriz.mostrarMatriz();   
        
        System.out.println("El mayor promedio más alto registrado es: " + matriz.obtenerPromedioMaximoGlobal());
        System.out.println("El mayor promedio más alto de: " + matriz.promedioMaximoPorCiudad("San Luis"));
        System.out.println("El mayor promedio más alto de: " + matriz.promedioMaximoPorCiudad("Merlo"));
        System.out.println("El mayor promedio más alto de: " + matriz.promedioMaximoPorCiudad("Villa Mercedes"));
    }
    
}
