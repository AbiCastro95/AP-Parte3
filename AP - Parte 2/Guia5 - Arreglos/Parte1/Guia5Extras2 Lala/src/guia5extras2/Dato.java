package guia5extras2;

public class Dato {

    private String apellido;
    private String nombre;
    private int milimetros;
    private String mes;
    private String localidad;

    public Dato(String apellido, String nombre, int milimetros, String mes, String localidad) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.milimetros = milimetros;
        this.mes = mes;
        this.localidad = localidad;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMilimetros() {
        return milimetros;
    }

    public void setMilimetros(int milimetros) {
        this.milimetros = milimetros;
    }

}
