package ejercicioextra2;

import java.util.Scanner;

public class EjercicioExtra2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Viaje viaje = new Viaje();
        Combustible combustible = new Combustible();
        int respuesta;

        System.out.println("Hola! Bienvenido al asistente de viajes terrestres.");
        System.out.println("----------------------------------------------------");
        System.out.println("DISTANCIA");
        System.out.println("----------------------------------------------------");
        viaje.calculoDistancia();
        System.out.println("----------------------------------------------------");
        System.out.println("VEHÍCULO");
        System.out.println("----------------------------------------------------");
        do {
            System.out.print("¿Qué tipo de vehiculo posee?\n1| AUTO\n2| CAMIONETA\n3| CAMIÓN\n");
            respuesta = read.nextInt();

            switch (respuesta) {
                case 1:
                    System.out.println("Has seleccionado AUTO. Ingrese sus datos para realizar el cálculo:");
                    Auto auto = new Auto();
                    
                    System.out.print("Marca: ");
                    read.nextLine();
                    auto.setMarca(read.nextLine());
                    System.out.print("Modelo: ");
                    auto.setModelo(read.nextLine());
                    auto.setCombustible(combustible);
                    
                    viaje.setVehiculo(auto);
                    viaje.calculoTotal();
                    break;
                case 2:
                    System.out.println("Has seleccionado CAMIONETA. Ingrese sus datos para realizar el cálculo:");
                    Camioneta camioneta = new Camioneta();
                    
                    System.out.print("Marca: ");
                    read.nextLine();
                    camioneta.setMarca(read.nextLine());
                    System.out.print("Modelo: ");
                    camioneta.setModelo(read.nextLine());
                    camioneta.setCombustible(combustible);
                    
                    viaje.setVehiculo(camioneta);
                    viaje.calculoTotal();
                    break;
                case 3:
                    System.out.println("Has seleccionado CAMION. Ingrese sus datos para realizar el cálculo:");
                    Camion camion = new Camion();
                    
                    System.out.print("Marca: ");
                    read.nextLine();
                    camion.setMarca(read.nextLine());
                    System.out.print("Modelo: ");
                    camion.setModelo(read.nextLine());
                    camion.setCombustible(combustible);
                    
                    viaje.setVehiculo(camion);
                    viaje.calculoTotal();
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (respuesta < 1 || respuesta > 3);
        System.out.println("");
        System.out.println("Gracias por utilizar nuestro asistente.");
    }

}
