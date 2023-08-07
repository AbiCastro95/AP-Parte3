package ejercicio6;

public class Ejercicio6 {

    
    public static void main(String[] args) {
        
        Triangulo figura1 = new Triangulo(10, 10, 10);
        System.out.println(figura1.tipoTriangulo());
        
        Triangulo figura2 = new Triangulo(10, 5, 7);
        System.out.println(figura2.tipoTriangulo());
        
        Triangulo figura3 = new Triangulo(7, 5, 7);
        System.out.println(figura3.tipoTriangulo());
        
        Triangulo figura4 = new Triangulo(1, 5, 7);
        System.out.println(figura4.tipoTriangulo());
    }
    
}
