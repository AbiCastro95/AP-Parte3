package ejercicio3;

public class Rueda {

    private final String marca;
    private float presion;

    public Rueda(String marca) {
        this.marca = marca;
    }

    public float getPresion() {
        return presion;
    }

    public void inflar() {
        this.presion = 28.0F;
    }

    public void pinchar() {
        this.presion = 5.0F;
    }

    public void desinflar() {
        this.presion -= 0.5F;
    }
}
