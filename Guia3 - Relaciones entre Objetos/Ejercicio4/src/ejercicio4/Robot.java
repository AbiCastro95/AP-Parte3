package ejercicio4;

import java.util.Scanner;

public class Robot {

    static Scanner read = new Scanner(System.in);

    private Bateria bateria;
    private final String nombre;
    private boolean activo;

    public Robot(String nombre) {
        this.activo = true;
        this.nombre = nombre;
        this.bateria = new Bateria(1000F);
    }

    public String getNombre() {
        return nombre;
    }

    public void avanzar(int pasos) {
        int consumo = pasos / 10;

        /* for para que consuma hasta donde llegue
        double consumo = 0.1;
        int i;
        if (this.activo) {
            for(i = 0; i < pasos && consumo <= bateria.getCarga() ; i++){
                consumo = i * 0.1;
            }
        if (i == pasos){
            System.out.println(this.nombre + " ha avanzado " + pasos + " pasos.");
            System.out.println("Bateria restante: " + bateria.getCarga());
        } else {
            System.out.println(this.nombre + " ha avanzado" + i + ". Bateria insuficiente.");
        }
        bateria.setCarga(bateria.getCarga() - consumo);
        }
         */
        if (this.activo) {
            if (bateria.getCarga() >= consumo) {
                //Bateria restante
                bateria.setCarga(bateria.getCarga() - consumo);
                System.out.println(this.nombre + " ha avanzado " + pasos + " pasos.");
                System.out.println("Bateria restante: " + bateria.getCarga());
            } else {
                System.out.println(this.nombre + " no puede avanzar. Bateria insuficiente.");
            }
        } else {
            System.out.println(this.nombre + " está dormido, para jugar debe despertarlo.");
        }
    }

    public void retroceder(int pasos) {
        int consumo = pasos / 10;

        if (this.activo) {
            if (bateria.getCarga() >= consumo) {
                //Bateria restante
                bateria.setCarga(bateria.getCarga() - consumo);
                System.out.println(this.nombre + " ha retrocedido " + pasos + " pasos.");
                System.out.println("Bateria restante: " + bateria.getCarga());
            } else {
                System.out.println(this.nombre + " no puede retroceder. Bateria insuficiente.");
            }
        } else {
            System.out.println(this.nombre + " está dormido, para jugar debe despertarlo.");
        }
    }

    public void avanzar() {
        System.out.println("¿Cuántos pasos desea avanzar?");
        int pasos = read.nextInt();

        int consumo = pasos / 10;

        if (bateria.getCarga() >= consumo) {
            bateria.setCarga(bateria.getCarga() - consumo);
            System.out.println(this.nombre + " ha avanzado " + pasos + " pasos.");
        } else {
            System.out.println(this.nombre + " no puede avanzar. Bateria insuficiente.");
        }

    }

    public void retroceder() {
        System.out.println("¿Cuántos pasos desea retroceder?");
        int pasos = read.nextInt();

        int consumo = pasos / 10;

        if (bateria.getCarga() >= consumo) {
            bateria.setCarga(bateria.getCarga() - consumo);
            System.out.println(this.nombre + " ha retrocedido " + pasos + " pasos.");
        } else {
            System.out.println(this.nombre + " no puede retroceder. Bateria insuficiente.");
        }

    }

    public void dormir() {
        if (activo == true) {
            this.activo = false;
            System.out.println("Pasando a reposo.");
        } else {
            System.out.println("El robot ya se encuentra dormido.");
        }
    }

    public void despertar() {
        if (activo == false) {
            this.activo = true;
            System.out.println("Hola! que tal.");
        } else {
            System.out.println("Ya estoy despierto!");
        }
    }

    public void recargar() {
        bateria.setCarga(1000);
    }

    public boolean bateriaLlena() {
        return bateria.getCarga() == 1000;
    }

    public boolean bateriaVacia() {
        return bateria.getCarga() == 0;
    }

    public float energiaActual() {
        return bateria.getCarga();
    }
}
