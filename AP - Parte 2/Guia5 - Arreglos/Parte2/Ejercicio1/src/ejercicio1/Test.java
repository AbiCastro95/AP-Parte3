package ejercicio1;

import java.util.Scanner;

/*
 * @author Abi Castro
 */
public class Test {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Cine cine = new Cine("ROMA SRL", "Rivadavia 325");
        boolean finalizar = false;

        while (true) {
            System.out.print("¿Desea crear otra película? (S/N): ");
            String opcion = read.next();

            if (opcion.equalsIgnoreCase("N")) {
                break;
            } else if (opcion.equalsIgnoreCase("S")) {
                System.out.print("Ingrese el título de la película: ");
                String titulo = read.nextLine();

                System.out.print("Ingrese el director de la película: ");
                String director = read.nextLine();

                System.out.print("Ingrese la duración de la película (en minutos): ");
                int duracion = read.nextInt();

                read.nextLine();

                cine.agregarPelicula(new Pelicula(titulo, director, duracion));

            } else {
                System.out.println("Opción inválida");
            }
        }

        System.out.println("");

        do {
            System.out.println("HOLA! ¿Cómo desea listar las películas?");
            System.out.println("1| Aquellas que duren más de la cantidad de minutos especificados por usted.");
            System.out.print("2| Listar todas las películas.\n3| Listarlas ordenadas por título.\n4| Listarlas ordenadas por director.\n5| Listarlas ordenadas por duración (de menor a mayor).");
            System.out.println("");
            System.out.println("6| SALIR");
            int opcion = read.nextInt();
            read.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el tiempo en minutos: ");
                    cine.listarDuranMas(read.nextInt());
                    break;
                case 2:
                    cine.listarTodo();
                    break;
                case 3:
                    cine.listarOrdenadasPorTituloAZ();
                    break;
                case 4:
                    cine.listarOrdenadasPorDirectorAZ();
                    break;
                case 5:
                    cine.listarMenorDuracionAMayorDuracion();
                    break;
                case 6:
                    finalizar = true; // Salir del bucle
                    System.out.println("GRACIAS POR VISITARNOS.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (!finalizar);

        read.close();
    }
}
