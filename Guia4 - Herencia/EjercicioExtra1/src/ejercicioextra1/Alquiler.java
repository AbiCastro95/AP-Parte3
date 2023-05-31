package ejercicioextra1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Alquiler {

    private String nombre;

    LocalDate fechaAlquiler;

    LocalDate fechaDevolucion;

    private String amarre;

    private Barco barco;

    public Alquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void calculoMontoTotal() {
        int dias = (int) ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
        if (dias > 0) {
            System.out.println("Hola " + this.nombre + ", usted abonará: $" + dias * barco.getModulo());
            System.out.println("Retiro: " + fechaAlquiler + "| Devolucion: " + fechaDevolucion);
            System.out.println("La embarcación asignadada es: " + barco.getMatricula() + ". Puede retirarla en el amarre: " + this.amarre);
        } else {
            System.out.println("Hola " + this.nombre + ", usted abonará: $" + barco.getModulo());
            System.out.println("Retiro: " + fechaAlquiler + "| Devolucion: " + fechaDevolucion);
            System.out.println("La embarcación asignadada es: " + barco.getMatricula() + ". Puede retirarla en el amarre: " + this.amarre);
        }
    }

    public void menuAlq() {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese su nombre y apellido: ");
        this.nombre = read.nextLine();
        System.out.print("¿Cuántos días desea alquilar? Si es para el mismo día ingrese 0. ");
        this.fechaDevolucion = this.fechaAlquiler.plusDays(read.nextLong());
        System.out.println("¿Qué barco desea alquilar?");
        System.out.print("1 | Kayak\n2 | Velero\n3 | Lancha\n4 | Yate\n");
        int respuesta = read.nextInt();
        switch(respuesta) {
            case 1:
                System.out.println("Usted seleccionó Kayak.");
                Barco kayak = new Barco("FGR157", 2.5F, "2012");
                this.barco = kayak;
                this.amarre = "A10";
                calculoMontoTotal();
                break;
            case 2:
                System.out.println("Usted seleccionó Velero.");
                Veleros velero = new Veleros("B154AC", 3F, "2020");
                this.barco = velero;
                this.amarre = "B05";
                System.out.print("¿Cuántos mástiles desea? ");
                velero.setCantMastiles(read.nextInt());
                calculoMontoTotal();
                break;
            case 3:
                System.out.println("Usted seleccionó Lancha.");
                BarcoConMotor lancha = new BarcoConMotor("589GYO", 4F, "2010", 15);
                this.barco = lancha;
                this.amarre = "A01";
                calculoMontoTotal();
                break;
            case 4:
                System.out.println("Usted seleccionó Yate.");
                Yates yate = new Yates("AC256F", 6.5F, "2021", 90);
                this.barco = yate;
                this.amarre = "C05";
                System.out.print("¿Cuántos camarotes desea? ");
                yate.setCamarotes(read.nextInt());
                calculoMontoTotal();
                break;
        }
    }
}
