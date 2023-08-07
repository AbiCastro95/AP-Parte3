package ejercicio5;

public class Ejercicio5 {

    public static void main(String[] args) {
      
        Pieza pieza1 = new Pieza();
        
        pieza1.setName("Peon");
        pieza1.setMovement("Apertura: 2 adelante. En juego: 1 adelante. Captura: 1 diagonal");
        pieza1.setValue(0.5);
        
        pieza1.mostrarInfo();
    }
}
