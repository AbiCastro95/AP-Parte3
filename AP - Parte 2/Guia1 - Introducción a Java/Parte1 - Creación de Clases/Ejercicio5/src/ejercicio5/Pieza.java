package ejercicio5;

public class Pieza {
    //ATRIBUTOS
    private String name;
    private String movement;
    private double value;
    
    //CONSTRUCTORES
    public Pieza (){} //Para usar los set
    
    public Pieza (String name, double value){
        this.name = name;
        this.value = value;
    }

    //METODOS
   public void setName(String name) {
        this.name = name;
    }
    
     public void setMovement(String movement) {
        this.movement = movement;
    }
     
    public void setValue(double value) {
        this.value = value;
    }
 
    public void mostrarInfo(){
        System.out.println(name);
        System.out.println("Movimiento: " + movement);
        System.out.println("Valor= " + value);
    }
}