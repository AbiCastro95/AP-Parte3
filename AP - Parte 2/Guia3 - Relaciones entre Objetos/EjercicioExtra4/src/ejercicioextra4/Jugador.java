package ejercicioextra4;

public class Jugador {
    
    private int id;
    private final String nombre;
    private boolean mojado;

    public Jugador(int id, String nombre) {
        this.nombre = "Jugador " + id + ": " + nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public boolean isMojado() {
        return mojado;
    }
    
    public void disparo(RevolverDeAgua r){
        if (r.mojar()){
            this.mojado = true;
        } else {
            this.mojado = false;
            r.siguienteChorro();
        }
        
    }
}
