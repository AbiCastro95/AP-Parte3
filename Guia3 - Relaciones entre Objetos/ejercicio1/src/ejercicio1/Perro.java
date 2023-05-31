package ejercicio1;

public class Perro {

    private final String nombre;
    private final String raza;
    private final int edad;
    private final String tamanio;

    public Perro(String nombre, String raza, int edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

   @Override
    public String toString() {
        return nombre + ", " + edad + " años. ";
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
