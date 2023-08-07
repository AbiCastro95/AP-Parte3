package ejercicioextra1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Abi Castro
 */
public class EjercicioExtra1 {

    public static void main(String[] args) {
        
        ArrayList<Integer> listNum = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        
        final int CORTE = -99;
        int suma = 0;
                
        do {
            System.out.print("Introduzca un número entero (-99 para finalizar): ");
            int num = scanner.nextInt();
            scanner.nextLine();
                    
            if(num != CORTE){
                listNum.add(num);
                suma += num;
            }else {
                System.out.println("Ingreso terminado.");
                break;
            }
        }while(true);
        
        System.out.println("Cantidad de valores introducidos: " + listNum.size());
        System.out.println("La suma de sus número es: " + suma);
        System.out.println("El promedio es de: " + (float) suma / listNum.size());
    }
}