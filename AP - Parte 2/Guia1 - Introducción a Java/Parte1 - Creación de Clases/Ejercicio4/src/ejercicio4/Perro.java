package ejercicio4;

public class Perro {
    
    private String name;
    private String breed;
    private String weight;
    private int age;

    public Perro (String name, String breed, String weight, int age){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.age = age;
    }
            
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void mostrarInfo(){
        System.out.println("|" + name + "|" + breed + "|"  + weight + "|"  + age +" años|");
    }
}
