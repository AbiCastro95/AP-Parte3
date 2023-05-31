package ejercicioextra1;

public class Veleros extends Barco{
    
    private int cantMastiles;

    public Veleros(String matricula, float eslora, String añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
    }

    public void setCantMastiles(int cantMastiles) {
        this.cantMastiles = cantMastiles;
    }

    @Override
    public float getModulo() {
        return super.getModulo() + this.cantMastiles; 
    }
}
