package ejercicioextra2;

public class Jugador {
    
    private String nombre;
    private int clasificacion;
    
    public Jugador(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void tirarDado(Dado dado){
        dado.generarNumero();
        this.clasificacion += dado.verNro();
    }
    
    public int verClasificacion(){
        return this.clasificacion;
    }
}
