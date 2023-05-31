package ejercicio3;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        Rueda ruedaDelDer = new Rueda("Pirelli");
        ruedaDelDer.inflar();
        Rueda ruedaDelIzq = new Rueda("Pirelli");
        ruedaDelIzq.inflar();
        Rueda ruedaTraDer = new Rueda("Pirelli");
        ruedaTraDer.inflar();
        Rueda ruedaTraIzq = new Rueda("Pirelli");
        ruedaTraIzq.inflar();
        
        Auto gol = new Auto("Violeta", "ABO503", ruedaDelDer, ruedaDelIzq, ruedaTraDer, ruedaTraIzq);
        
        gol.avanzar(100F);
        gol.avanzar(200F);
        
        gol.getRueda1().pinchar();
        System.out.println(gol.getRueda1().getPresion());
        gol.getRueda1().inflar();
        gol.getRueda2().desinflar();
        gol.getRueda2().inflar();
        
        gol.retroceder(100F);
        gol.retroceder(200F);
        
        gol.llenarTanque();
        
        gol.retroceder(200F);
    }
    
}
