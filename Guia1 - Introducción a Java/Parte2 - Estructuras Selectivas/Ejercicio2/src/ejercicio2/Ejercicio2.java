package ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
      Cuadrilatero figura = new Cuadrilatero ( 70, 50);
        
        System.out.println("El perímetro es:" + figura.calcularPerimetro());
        System.out.println("El área es : " + figura.calcularArea() );
        figura.respuesta();
        
        figura.setLargo(50);
        
        System.out.println("El Largo de su figura es: " + figura.getLargo() + ". El Alto de su figura es: " + figura.getAlto());
        figura.respuesta();
    }
    
}
