package ejercicioextra1jarvis;

import java.util.Random;

/*
 * @author Abi Castro
 */
public abstract class Dispositivo {

    protected float consumoBasico;
    protected int nivelRotura;
    protected boolean roto;

    public Dispositivo() {
        this.consumoBasico = 1000;
        this.nivelRotura = 0;
        this.roto = false;
    }

    public float descarga(int nivelDeInt, int tiempoEnSeg) {
        float energiaConsumida;
        energiaConsumida = consumoBasico * nivelDeInt * tiempoEnSeg;
        return energiaConsumida;
    }

    private void repararDispositivo() {
        Random random = new Random();
        double probabilidadReparacion = random.nextDouble();

        if (probabilidadReparacion <= 0.4) {
            nivelRotura = 0;
            System.out.println("Se ha reparado el dispositivo.");
        } else {
            System.out.println("No se pudo reparar el dispositivo.");
        }
    }

    public void probabilidadReparacion() {
        Random random = new Random();

        int[] numeros = {1, 2};
        double[] probabilidades = {0.4, 0.6};

        double numeroAleatorio = random.nextDouble() * suma(probabilidades);

        double sumaProbabilidades = 0.0;
        int numeroSeleccionado = -1;

        for (int i = 0; i < probabilidades.length; i++) {
            sumaProbabilidades += probabilidades[i];

            if (numeroAleatorio < sumaProbabilidades) {
                numeroSeleccionado = numeros[i];
                break;
            }
        }

    }

    private double suma(double[] numbers) {
        double sum = 0.0;

        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }
}
