package ejercicioextra1;

public class Persona {

    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void ubicarme(GPS gps) {
        gps.mover();
        //Posicion posicion = gps.obtenerUltimaPosicion();
        System.out.println("POSICION: Latitud: " + gps.obtenerUltimaPosicion().getLatitud() + " Longitud: " + gps.obtenerUltimaPosicion().getLongitud());
    }
}
