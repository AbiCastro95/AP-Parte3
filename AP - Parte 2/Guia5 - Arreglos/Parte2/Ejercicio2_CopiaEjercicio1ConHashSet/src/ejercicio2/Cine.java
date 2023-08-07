package ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;

/*
 * @author Abi Castro
 */
public class Cine {

    private String nombre;
    private String direccion;
    private HashSet<Pelicula> proyecciones;
    private ArrayList<Pelicula> listaSet;

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.proyecciones = new HashSet<>();
        this.listaSet = new ArrayList(proyecciones);
    }

    public void agregarPelicula(Pelicula newMovie) {
        this.proyecciones.add(newMovie);
    }

    public void listarTodo() {
        for (Pelicula movie : this.proyecciones) {
            System.out.println(movie);
        }
    }

    public void listarDuranMas(int minutos) {
        for (Pelicula movie : this.proyecciones) {
            if (movie.getDuracion() > minutos) {
                System.out.println(movie);
            }
        }
    }

    public void listarMenorDuracionAMayorDuracion() {
        //Uso SORT y le doy un comparador especializado para que ordene de menor a mayor
        this.listaSet.sort(new Comparator<Pelicula>() {
         
            @Override
            /* Elegí usar un IF, ELSE IF.
            Si pelicula1 tiene una duración menor que pelicula2, devuelve -1.
            De lo contrario: si pelicula1 tiene una duración mayor que pelicula2, devuelve 1, sino, si las duraciones son iguales, devuelve 0.
            El ordenamiento sería -1 0 1
            */
            public int compare(Pelicula pelicula1, Pelicula pelicula2) {
                return pelicula1.getDuracion() < pelicula2.getDuracion() ? -1
                        : pelicula1.getDuracion() > pelicula2.getDuracion() ? 1 : 0;
            }
        });
        for (Pelicula pelicula : this.proyecciones) {
            System.out.println(pelicula);
        }
    }

    public void listarOrdenadasPorTituloAZ() {
        this.listaSet.sort(new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula pelicula1, Pelicula pelicula2) {
                return pelicula1.getTitulo().compareTo(pelicula2.getTitulo());
            }
        });
        for (Pelicula pelicula : this.proyecciones) {
            System.out.println(pelicula);
        }
    }

    public void listarOrdenadasPorDirectorAZ() {
        this.listaSet.sort(new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula pelicula1, Pelicula pelicula2) {
                return pelicula1.getDirector().compareTo(pelicula2.getDirector());
            }
        });
        for (Pelicula pelicula : this.proyecciones) {
            System.out.println(pelicula);
        }
    }
}
