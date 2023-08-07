package ejercicioextra4;

public class RevolverDeAgua {
    
    private int posicionActual;
    private int posicionAgua;

    public RevolverDeAgua() {
    }

    public void llenarRevolver(){
        this.posicionActual = (int) (Math.random()* 10 + 1);
        this.posicionAgua = (int) (Math.random()* 10 + 1);
    }

    public double getPosicionActual() {
        return posicionActual;
    }

    public double getPosicionAgua() {
        return posicionAgua;
    }
    
    
    public boolean mojar(){
        return this.posicionAgua == this.posicionActual;
    }
    
    public void siguienteChorro(){
        this.posicionActual =(int) (Math.random()* 10 + 1);
    }

    @Override
    public String toString() {
        return "Revolver: " + "posicionActual= " + posicionActual + ", posicionAgua= " + posicionAgua + '}';
    }
}
