
package ejercicio3;


public class Ejercicio3 {

  
    public static void main(String[] args) {
        Circulo figura_1 = new Circulo( 5.75);
        
        System.out.println("Su radio es: " + figura_1.getRadio());
        System.out.println("El perímetro es: " + figura_1.calcularPerimetro());
        System.out.println("El área es: " + figura_1.calcularArea());
    }
    
}
