package ejercicioextra2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/*
 * @author Abi Castro
 */
public class EjercicioExtra2 {

    public static void main(String[] args) {
        /*
        - Agregar 5 yo, mostrar la lista nombres y disco.
        - El usuario agrega 5 en un bucle.
        - en un switch preguntar: 1 desea agregar otro, 2 mostrar todo, 3 eliminar cantante, 4 salir.
        al final mostrar la lista con los cambios.
         */
        Scanner read = new Scanner(System.in);

        TreeSet<CantanteFamoso> listaCantantes = new TreeSet();
        ArrayList<CantanteFamoso> listaUsuario = new ArrayList();

        int opcion;

        listaCantantes.add(new CantanteFamoso("Michael Jackson", "Thriller"));
        listaCantantes.add(new CantanteFamoso("Backstreet Boys", "Millennium"));
        listaCantantes.add(new CantanteFamoso("Madonna", "Like a Virgin"));
        listaCantantes.add(new CantanteFamoso("The Beatles", "Sgt. Pepper's Lonely Hearts Club Band"));
        listaCantantes.add(new CantanteFamoso("Freddie Mercury", "Queens - Greatest Hits"));

        System.out.println("----- LISTA 5 CANTANTES PROPIA -----");
        for (CantanteFamoso aux : listaCantantes) {
            System.out.println(aux);
        }

        System.out.println("");

//        for (int i = 0; i < 5; i++) {
//            System.out.print("Ingrese el nombre del cantante: ");
//            String nombre = read.nextLine();
//            System.out.print("Ingrese el disco más vendido: ");
//            String disco = read.nextLine();
//
//            listaCantantes.add(new CantanteFamoso(nombre, disco));
//        }

        do {
            System.out.println("");
            System.out.println("1| Agregar un cantante.\n2| Eliminar cantante.\n3| Mostrar todo.\n4| Salir.");
            opcion = read.nextInt();
            read.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del cantante: ");
                    String nombre = read.nextLine();
                    System.out.print("Ingrese el disco más vendido: ");
                    String disco = read.nextLine();

                    CantanteFamoso cantanteAAgregar = new CantanteFamoso(nombre, disco);
                    listaUsuario.add(cantanteAAgregar);
                    listaCantantes.add(cantanteAAgregar);

                    System.out.println("Se agregó a: " + cantanteAAgregar);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del cantante a eliminar: ");
                    nombre = read.nextLine();
                    System.out.print("Ingrese el disco más vendido: ");
                    disco = read.nextLine();

                    CantanteFamoso cantanteAEliminar = new CantanteFamoso(nombre, disco);

                    if (listaCantantes.contains(cantanteAEliminar) && listaUsuario.contains(cantanteAEliminar)) {
                        listaCantantes.remove(cantanteAEliminar);
                        listaUsuario.remove(cantanteAEliminar);
                        System.out.println("Se removió a: " + cantanteAEliminar);
                    } else {
                        System.out.println("No se encontró el artista.");
                    }
                    break;
                case 3:
                    for (CantanteFamoso aux : listaUsuario) {
                        System.out.println(aux);
                    }
                    break;
                case 4:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 4);

        System.out.println("---------- LISTA COMBINADA ----------");
        for (CantanteFamoso aux : listaCantantes) {
            System.out.println(aux);
        }
    }
}
