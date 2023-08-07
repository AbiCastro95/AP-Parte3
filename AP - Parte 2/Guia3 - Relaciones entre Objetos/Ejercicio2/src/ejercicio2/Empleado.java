package ejercicio2;

import java.time.LocalDate;

public class Empleado {

    private final String nombre;
    private final String apellido;
    private final String dni;
    private final LocalDate fechaDeIngreso;

   
    public Empleado(String nombre, String apellido, String dni, LocalDate fechaDeIngreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public LocalDate getFechaDeIngreso() {
        return fechaDeIngreso;
    }

     @Override
    public String toString() {
        return nombre + " "+ apellido + ". DNI n°: " + dni + ".";
    }
}
