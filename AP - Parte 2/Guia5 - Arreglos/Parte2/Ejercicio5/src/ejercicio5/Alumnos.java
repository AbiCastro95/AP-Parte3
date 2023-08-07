package ejercicio5;

import java.util.Objects;

/*
 * @author Abi Castro
 */
public class Alumnos {

    private String legajo;
    private String apellido;
    private String nombre;
    private int grado;

    public Alumnos(String legajo, String apellido, String nombre, int grado) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.grado = grado;
    }

    public String getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "Alumno: " + legajo + " - " + apellido + ", " + nombre + ". Año de cursado: " + grado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.legajo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumnos other = (Alumnos) obj;
        if (!Objects.equals(this.legajo, other.legajo)) {
            return false;
        }
        return true;
    }    
}