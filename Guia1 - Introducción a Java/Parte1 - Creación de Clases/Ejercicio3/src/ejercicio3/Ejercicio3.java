package ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
      Jugador jugador1 = new Jugador();
      
      jugador1.setName("Juan");
      jugador1.setNationality("Argentino");
      jugador1.setAge(29);
      jugador1.setScore(140);
      
      System.out.println("NAME: " + jugador1.getName());
      System.out.println("NATIONALITY: " + jugador1.getNationality());
      System.out.println("AGE: " + jugador1.getAge());
      System.out.println("SCORE: " + jugador1.getScore());
    }
    
}
