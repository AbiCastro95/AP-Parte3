package ejercicio3bis;

public class Ejercicio3bis {

    
    public static void main(String[] args) {
        
        Rueda rueda1 = new Rueda("Fatte",28.0);
        Rueda rueda2 = new Rueda("Pirelli",0.0);
        rueda2.inflar();
        Rueda rueda3 = new Rueda("Fatte",28.0);
        Rueda rueda4 = new Rueda("GoodYear",18.0);
        rueda4.inflar();
        
        Auto tito = new Auto("Azul", "BCR254", rueda1, rueda2, rueda3, rueda4);
        
        tito.avazar(100);
        tito.retroceder(300);
        
      
        rueda3.desinflar();
        rueda4.pinchar();
        rueda4.inflar();
        
        tito.llenarTanque();
        
    }
    
}
