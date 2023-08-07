package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * @author Abi Castro
 */
public class Cine {

    private String nombre;
    private String direccion;
    private ArrayList<Pelicula> proyecciones;

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.proyecciones = new ArrayList<>();
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
        this.proyecciones.sort(new Comparator<Pelicula>() {
         
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
        this.proyecciones.sort(new Comparator<Pelicula>() {
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
        this.proyecciones.sort(new Comparator<Pelicula>() {
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
