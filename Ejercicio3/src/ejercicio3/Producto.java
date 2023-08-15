package ejercicio3;

/*
 * @author Abigail Castro
 */
public class Producto {

    private String nombre;
    private float precio;
    private String tipo;

    public Producto(String nombre, float precio, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }


}
