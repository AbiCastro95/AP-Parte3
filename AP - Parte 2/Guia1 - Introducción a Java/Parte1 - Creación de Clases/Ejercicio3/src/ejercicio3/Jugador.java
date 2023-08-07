package ejercicio3;

public class Jugador {
   
    //ATRIBUTOS
    private String name;
    private String nationality;
    private int age;
    private int score;
    
    //MÉTODOS
    public Jugador (){};
    
    public Jugador (String name, String nat, int age, int scr){
        this.name = name;
        nationality = nat;
        this.age = age;
        score = scr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
