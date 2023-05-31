package ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        Computer Lenovo = new Computer();
        
        Lenovo.setTrademark("Lenovo");
        Lenovo.setCpu("i3-7G");
        Lenovo.setRam("4G");
        Lenovo.setStorage("1Tb");
        Lenovo.setPrice(150.000);
        
        System.out.println(Lenovo.getTrademark());
        System.out.println(Lenovo.getCpu());
        System.out.println(Lenovo.getRam());
        System.out.println(Lenovo.getStorage());
        System.out.println("$ " + Lenovo.getPrice());

    }
    
}
