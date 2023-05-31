package ejercicioextra2;

import java.util.Scanner;

public class Viaje {

    Scanner read = new Scanner(System.in);

    private String origen;
    private String destino;
    private int peajes;

    private Vehiculo vehiculo;

    float distancia;

    public Viaje() {
    }

    public Viaje(String origen, String destino, int peajes, Vehiculo vehiculo) {
        this.origen = origen;
        this.destino = destino;
        this.peajes = peajes;
        this.vehiculo = vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void calculoDistancia() {
        float km1, km2;
        String respuesta;

        System.out.print("Ingrese la ciudad de origen: ");
        this.origen = read.nextLine();
        System.out.print("Ingrese la ciudad de destino: ");
        this.destino = read.nextLine();
        System.out.println("");
        System.out.print("¿Ambas ciudades están en la misma ruta? S|N ");
        respuesta = read.next();
        
        while (!"S".equals(respuesta.toUpperCase()) && !"N".equals(respuesta.toUpperCase())) {
            System.out.println("Opción inválida. Ingrese otra opción: S|N");
            respuesta = read.next();
        }

        if (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Kilómetro de " + this.origen + ": ");
            km1 = read.nextFloat();
            System.out.print("Kilómetro de " + this.destino + ": ");
            km2 = read.nextFloat();
            this.distancia = Math.abs(km1 - km2);
            System.out.println("La distancia es de " + this.distancia + "km.");
        } else {
            System.out.print("Introduzca la distancia en km: ");
            this.distancia = read.nextFloat();
        }
        System.out.println("");
        System.out.print("¿Cuántos peajes tiene la ruta? ");
        peajes = read.nextInt();
    }

    public int costoPeajes() {
        if (this.vehiculo instanceof Auto || this.vehiculo instanceof Camioneta) {
            return peajes * 150;
        } else {
            return peajes * 200;
        }
    }

    public float costoCombustible() {
        System.out.print("¿Qué tipo de combustible tiene su vehiculo? ");
        vehiculo.combustible.setTipo(read.next());
        System.out.print("¿Cuál es el precio actual? Ejemplo: 100,5. ");
        vehiculo.combustible.setPrecio(read.nextFloat());
        System.out.println("");

        return vehiculo.calcularConsumoCombustible(this.distancia);
    }

    public void calculoTotal() {
        float total = costoCombustible() + costoPeajes();
        System.out.println("El viaje costará: $" + total);
    }
}
