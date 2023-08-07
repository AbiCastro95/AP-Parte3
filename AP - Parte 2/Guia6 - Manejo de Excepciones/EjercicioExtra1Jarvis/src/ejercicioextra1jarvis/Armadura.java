package ejercicioextra1jarvis;

import java.util.Random;

/*
 * @author Abi Castro
 */
public class Armadura {

    private String colorPrimario;
    private String colorSecundario;
    private int nivelResistencia;
    private int nivelSalud;

    private Propulsor botaDer;
    private Propulsor botaIzq;

    private Repulsor guanteDer;
    private Repulsor guanteIzq;

    private Generador generador;
    private Bateria bateria;

    private Sintetizador sintetizador;
    private Consola consola;

    public Armadura(String colorPrimario, String colorSecundario, int nivelResistencia) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelResistencia = nivelResistencia;
        this.nivelSalud = 100;
        this.bateria = new Bateria();
        this.botaDer = new Propulsor();
        this.botaIzq = new Propulsor();
        this.guanteDer = new Repulsor();
        this.guanteIzq = new Repulsor();
        this.generador = new Generador();
        this.sintetizador = new Sintetizador();
        this.consola = new Consola();
    }

    public void caminar() {
        float consumir = botaDer.usar(1, 1200) + botaIzq.usar(1, 1200);
        bateria.setCarga(bateria.getCarga() - consumir);
        System.out.println("Consumiste: " + consumir + " bateria.");
        System.out.println("Te queda: " + bateria.getCarga());
    }

    public void correr() {
        float consumir = botaDer.usar(2, 240) + botaIzq.usar(2, 240);
        bateria.setCarga(bateria.getCarga() - consumir);
        System.out.println("Consumiste: " + consumir + " bateria.");
        System.out.println("Te queda: " + bateria.getCarga());
    }

    public void propulsarse() {
        float consumir = botaDer.usar(3, 120) + botaIzq.usar(3, 120);
        bateria.setCarga(bateria.getCarga() - consumir);
        System.out.println("Consumiste: " + consumir + " bateria.");
        System.out.println("Te queda: " + bateria.getCarga());
    }

    public void volar() {
        float consumirBotas = botaDer.usar(3, 120) + botaIzq.usar(3, 120);
        float consumirGuantes = guanteDer.usar(2, 120) + guanteIzq.usar(2, 120);
        bateria.setCarga(bateria.getCarga() - consumirBotas - consumirGuantes);
        System.out.println("Consumiste: " + (consumirBotas + consumirGuantes) + " bateria.");
        System.out.println("Te queda: " + bateria.getCarga());
    }

    public void consumoArmas() {
        float consumir = guanteDer.usar(3, 120) + guanteIzq.usar(3, 120);
        bateria.setCarga(bateria.getCarga() - consumir);
        System.out.println("Consumiste: " + consumir + " bateria.");
        System.out.println("Te queda: " + bateria.getCarga());
    }

    public void consumoMensaje() {
        consola.descarga(1, 20000);
        System.out.println("Te queda: " + bateria.getCarga());
    }

    public void consumoHablar() {
        sintetizador.descarga(1, 20000);
        System.out.println("Te queda: " + bateria.getCarga());
    }

    @Override
    public String toString() {
        return "Armadura{" + "bateria=" + bateria.getCarga() + '}';
    }

}
