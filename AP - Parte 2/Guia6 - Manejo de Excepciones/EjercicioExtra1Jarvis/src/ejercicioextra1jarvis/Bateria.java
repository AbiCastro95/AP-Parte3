package ejercicioextra1jarvis;

/*
 * @author Abi Castro
 */
class Bateria {

    private float carga;
    private int nivelDanio;
    private boolean daniado;

    public Bateria() {
        this.carga = Float.MAX_VALUE;
        this.daniado = false;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    public boolean isDaniado() {
        return daniado;
    }

    public void setDaniado(boolean daniado) {
        this.daniado = daniado;
    }
    
}
