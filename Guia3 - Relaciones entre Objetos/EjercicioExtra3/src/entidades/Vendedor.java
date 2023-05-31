package entidades;

public class Vendedor {
    
    private final String nombre;
    private final String dni;
    private final String local;

    public Vendedor(String nombre, String dni, String local) {
        this.nombre = nombre;
        this.dni = dni;
        this.local = local;
    }

    public String getNombre() {
        return nombre;
    }
}
