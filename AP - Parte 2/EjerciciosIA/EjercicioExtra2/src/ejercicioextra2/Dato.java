package ejercicioextra2;

/*
 * @author Abi Castro
 */
public class Dato {

    private String apellido;
    private String nombre;
    private float milimetros;

    public Dato() {
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMilimetros(float milimetros) {
        this.milimetros = milimetros;
    }

    @Override
    public String toString() {
        return apellido + ", " + nombre + ", milimetros: " + milimetros;
    }

}
