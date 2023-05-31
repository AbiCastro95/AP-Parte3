package ejercicioextra1;

public class Barco {
    
    protected String matricula;
    protected float eslora;
    protected String fabricacion;

    public Barco(String matricula, float eslora, String fabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabricacion = fabricacion;
    }

    public String getMatricula() {
        return matricula;
    }
   
    public float getModulo(){
        return this.eslora * 10;
    }
}
