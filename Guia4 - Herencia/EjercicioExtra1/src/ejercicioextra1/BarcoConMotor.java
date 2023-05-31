package ejercicioextra1;

public class BarcoConMotor extends Barco {
    
    protected int potencia;
    
    public BarcoConMotor(String matricula, float eslora, String añoFabricacion, int potencia) {
        super(matricula, eslora, añoFabricacion);
        this.potencia = potencia;
    }

    @Override
    public float getModulo() {
        return super.getModulo() + this.potencia;
    }
}
