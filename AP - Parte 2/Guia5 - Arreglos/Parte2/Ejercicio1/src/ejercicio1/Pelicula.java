package ejercicio1;

/*
 * @author Abi Castro
 */
public class Pelicula{

    private String titulo;
    private String director;
    private int duracion;

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Pelicula: " + titulo + ", " + director + ", " + duracion + " minutos.";
    }

  
}
