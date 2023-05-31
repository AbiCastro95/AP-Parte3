package ejercicioextra1;

public class GPS {

    private final String marca;
    private final String modelo;
    private Posicion ultimaUbicacion;

    public GPS(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ultimaUbicacion = new Posicion(0, 0);
    }

    public Posicion obtenerUltimaPosicion() {
        if (this.ultimaUbicacion.getLatitud() == 0 && this.ultimaUbicacion.getLongitud() == 0) {
            System.out.println("DISPOSITIVO NO CALIBRADO, POSICION DE FABRICA ESTABLECIDA...");
        }
        return this.ultimaUbicacion;
    }

   
    public void mover() {
        double latitud = Math.random();
        double longitud = Math.random();
        Posicion nueva = new Posicion(latitud, longitud);
        this.ultimaUbicacion = nueva;
    }
}
