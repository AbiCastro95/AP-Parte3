package ejercicio7;

public class Robot {
    private String name;
    private double batery = 500;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }

    public double getBatery() {
        return batery;
    }
   
    public void avanzar(double steps){
        //Cada 100 pasos consume 10 unidades de energía, solo si hay bateria suficiente.
       double energiaConsumida = steps / 100 * 10;
       if (energiaConsumida <= batery && steps <= batery * 100 / 10){
           batery -= energiaConsumida;
           System.out.println("Bateria restante: " + batery);
           System.out.println(name + " ha avanzado " + steps + " pasos.");
       } 
    }
    
    public boolean bateriaVacia(){
       return batery <= 0.00 ;
    }
}