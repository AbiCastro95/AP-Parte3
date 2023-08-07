package ejercicio3;
/*
 * @author Abi Castro
 */
public class Cliente {

    private String dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;

    public Cliente(String dni, String nombre, String apellido, String ciudad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return "Cliente: dni: " + dni + ", " + nombre + ", " + apellido + ". " + ciudad + ", " + direccion;
    }
    
    
}
