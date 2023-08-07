package ejercicio3;

public class Auto {

    private final String color;
    private final String patente;
    private float combustible = 50.0F;

    private final Rueda rueda1;
    private final Rueda rueda2;
    private final Rueda rueda3;

    public Auto(String color, String patente, Rueda r1, Rueda r2, Rueda r3, Rueda r4) {
        this.color = color;
        this.patente = patente;
        this.rueda1 = r1;
        this.rueda2 = r2;
        this.rueda3 = r3;
        this.rueda4 = r4;
    }

    public Rueda getRueda1() {
        return rueda1;
    }

    public Rueda getRueda2() {
        return rueda2;
    }

    public Rueda getRueda3() {
        return rueda3;
    }

    public Rueda getRueda4() {
        return rueda4;
    }
    private final Rueda rueda4;

    public void avanzar(float metros) {
        float consumo = metros / 10;
        if (consumo > 0 && consumo <= this.combustible) {
            System.out.println("Se han avanzado " + metros + "mts.");
            this.combustible -= consumo;
        } else {
            System.out.println("Debe llenar el tanque.");
        }
        System.out.println("Combustible disponible: " + this.combustible + "lt.");
    }

    public void retroceder(float metros) {
        float consumo = metros / 10;
        if (consumo > 0 && consumo <= this.combustible) {
            System.out.println("Se han retrocedido " + metros + "mts.");
            this.combustible -= consumo;
        } else {
            System.out.println("Debe llenar el tanque.");
        }
        System.out.println("Combustible disponible: " + this.combustible + "lt.");
    }

    public void llenarTanque() {
        this.combustible = 50.0F;
        System.out.println("Tanque lleno. " + combustible + "lt.");
    }
}
