package ejercicioextra1;

/*
 * @author Abi Castro
 */
public class EjercicioExtra1 {

    public static void main(String[] args) {
        Pila pila = new Pila(10);
       
        pila.agregar("Matias");
        //usar verTope
        pila.agregar("Abi");
        pila.agregar("Dani");
        pila.agregar("Rodrigo");
        pila.agregar("Cristian");
        
        pila.mostrarVector();
        
        pila.quitar();
        System.out.println("Tope: " + pila.verTope());
    } 
}
