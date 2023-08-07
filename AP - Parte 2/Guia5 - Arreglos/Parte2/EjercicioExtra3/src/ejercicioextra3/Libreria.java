package ejercicioextra3;

import java.util.HashSet;
import java.util.Scanner;

/*
 * @author Abi Castro
 */
public class Libreria {

    Scanner read = new Scanner(System.in);
    HashSet<Libro> biblioteca;

    public Libreria() {
        this.biblioteca = new HashSet();
    }

    public Libreria(Libro libro) {
        this.biblioteca = new HashSet();
    }

    public void agregarLibro(Libro nuevo) {
        biblioteca.add(nuevo);
    }

    public boolean prestamo() {

        System.out.println("Ingrese el título del libro que desea pedir: ");
        String aux = read.nextLine();

        for (Libro libro : biblioteca) {
            int cant = libro.getEjemplaresPrestados();

            if (libro.getTitulo().equalsIgnoreCase(aux) && libro.getEjemplares() > 0) {
                libro.setEjemplaresPrestados(cant + 1);
                System.out.println("Libro prestado." + libro.getEjemplaresPrestados());
                return true;
            } else {
                System.out.println("No se encontraron ejemplares para prestar.");
            }
        }
        return false;
    }

    public boolean devolucion() {
        System.out.println("Ingrese el título del libro que desea devolver: ");
        String aux = read.nextLine();

        for (Libro libro : biblioteca) {
            int cant = libro.getEjemplaresPrestados();

            if (libro.getTitulo().equalsIgnoreCase(aux) && libro.getEjemplaresPrestados() > 0) {
                libro.setEjemplaresPrestados(cant - 1);
                return true;
            }
        }
        return false;
    }
}
