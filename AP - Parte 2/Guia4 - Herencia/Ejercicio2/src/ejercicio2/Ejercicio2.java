package ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        //Lavadora(float carga, float precio, String color, char letra, float peso)
        Electrodomestico lavadora = new Lavadora(9.5F, 250000F, "Azul", 'A', 20F);
        
        //Televisor(int resolucion, boolean sintonizadorTDT, float precio, String color, char letra, float peso)
        Electrodomestico televisor = new Televisor(45, true, 8000F, "Negro", 'D', 62.0F);
        
        System.out.println("Precio final Lavadora: $" + lavadora.precioFinal());
        System.out.println("Precio final Televisor: $" + televisor.precioFinal());
    }  
}
