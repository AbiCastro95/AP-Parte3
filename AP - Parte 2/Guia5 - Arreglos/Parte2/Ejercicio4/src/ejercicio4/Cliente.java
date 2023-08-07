package ejercicio4;

import java.time.LocalDate;

/*
 * @author Abi Castro
 */
public class Cliente {

    private String nombre;
    private String apellido;
    private String localidad;
    private LocalDate fNacimiento;

    public Cliente(String nombre, String apellido, String localidad, LocalDate fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.localidad = localidad;
        this.fNacimiento = fNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + ", " + apellido + " | Fecha de Nacimiento: " + fNacimiento + " | Localidad: " + localidad;
    }
    
    
}
