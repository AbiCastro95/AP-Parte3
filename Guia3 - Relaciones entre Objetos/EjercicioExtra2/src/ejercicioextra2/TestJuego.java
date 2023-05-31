package ejercicioextra2;

public class TestJuego {

  
    public static void main(String[] args) {
        
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        Dado dado3 = new Dado();
        
        Jugador pocho = new Jugador("Pocho");
        
        pocho.tirarDado(dado1);
        pocho.tirarDado(dado2);
        pocho.tirarDado(dado3);
        System.out.println(dado1.verNro()+ " "+ dado2.verNro() + " " + dado3.verNro());
        
        System.out.println(pocho.getNombre() + ": " + pocho.verClasificacion());
        
        Dado dado4 = new Dado();
        Dado dado5 = new Dado();
        Dado dado6 = new Dado();
        
        Jugador pepe = new Jugador("Pepe");
        
        pepe.tirarDado(dado4);
        pepe.tirarDado(dado5);
        pepe.tirarDado(dado6);
        System.out.println(dado4.verNro()+ " "+ dado5.verNro() + " " + dado6.verNro());
        
        System.out.println(pepe.getNombre() + ": " + pepe.verClasificacion());
    }
    
}
