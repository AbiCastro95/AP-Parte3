package ejercicioextra3;

import java.util.Scanner;

/*
 * @author Abi Castro
 */
public class EjercicioExtra3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Libreria libreria = new Libreria();
        
        while (true){
            System.out.print("Ingrese el titulo del libro: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el autor: ");
            String autor = scanner.nextLine();
            System.out.print("Ingrese la cantidad de libros a agregar: ");
            int ejemplares = scanner.nextInt();
            scanner.nextLine();
            
            Libro libro = new Libro(nombre, autor, ejemplares);
            libreria.agregarLibro(libro);
            
            System.out.print("¿Desea agregar otro? S|N ");
            char opcion = scanner.next().toLowerCase().charAt(0);
            
            if(opcion == 'n'){
                System.out.println("Libros agregados");
            }
            
        }
        
    }
    
}
