package ejercicio2;

public class Computer
{
    //ATRIBUTOS
    private String trademark;
    private String cpu; //Procesador
    private String ram;
    private String storage;
    private double price;
    
    //CONSTRUCTOR
    public Computer (){};
    
    public Computer (String trademark, String cpu,
            String ram, String so, String storage, double price)
    {
       this.trademark = trademark;
       this.cpu = cpu;
       this.ram = ram;
       this.storage = storage;
       this.price = price;
   }

    //METODOS
    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}