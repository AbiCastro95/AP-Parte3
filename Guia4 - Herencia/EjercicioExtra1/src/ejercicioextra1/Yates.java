package ejercicioextra1;

public class Yates extends BarcoConMotor {

   private int camarotes;

    public Yates(String matricula, float eslora, String añoFabricacion, int potencia) {
        super(matricula, eslora, añoFabricacion, potencia);
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public float getModulo() {
        return super.getModulo() + this.camarotes;
    }

    
}
