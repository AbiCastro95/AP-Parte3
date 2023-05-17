package ejercicio4;

import java.util.Scanner;

public class Hombre {

    static Scanner read = new Scanner(System.in);

    public Hombre() {
    }

    public void jugarConRobot(Robot robot) {
        robot.despertar();
        robot.avanzar(500);
        robot.retroceder(20);
        System.out.println(robot.getNombre() + " tiene " + robot.energiaActual() + " energia.");
        robot.dormir();
    }

    public void menuJuego(Robot robot) {
        int opcion;

        do {
            System.out.println("¿Qué desea hacer con el robot?");
            System.out.println(" 1| Avanzar \n 2| Retroceder \n 3| Energia Restante \n 4| Recargar Energia \n 5| Dormir");
            opcion = read.nextInt();
            switch (opcion) {
                case 1:
                    robot.avanzar();
                    break;
                case 2:
                    robot.retroceder();
                    break;
                case 3:
                    System.out.println("Bateria restante: " + robot.energiaActual());
                    
                    break;
                case 4:
                    robot.recargar();
                    break;
                case 5:
                    robot.dormir();
                    break;
                default:
                    System.out.println("La opción ingresada no es correcta.");
            }
        } while (opcion != 5);
    }
}
