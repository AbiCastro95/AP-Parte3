package ejercicio3bis;

public class Rueda {

    private String marca;

    private double presion;

    public Rueda() {
    }

    public Rueda(String marca, double presion) {
        this.marca = marca;
        this.presion = presion;
    }

    public void inflar() {
        presion = 28.0;
        System.out.println("Se ha inflado la rueda, " + presion + "PSI");
    }

    public void pinchar() {
        presion = 0.0;
        System.out.println("Se ha pinchado la rueda, " + presion + "PSI");
    }

    public void desinflar() {
        if (presion <= 28.0){
            presion -= 0.5;
        }
        System.out.println("Presion : " + presion + "PSI");
    }
}
