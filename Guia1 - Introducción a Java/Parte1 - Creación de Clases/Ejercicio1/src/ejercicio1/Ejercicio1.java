package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        
       Producto Harina = new Producto(056, "Harina", 100.5, 2);
       
       Producto Aceite = new Producto(754, "Aceite", 500.10, 5);
        
       System.out.println(Harina.getDescripcion());
       System.out.println("Código: " + Harina.getCodigo());
       System.out.println("Precio: " + Harina.getPrecio() + "$");                           
       System.out.println("Stock:"+Harina.getStock());
       
       System.out.println(Aceite.getDescripcion());
       System.out.println("Código: " + Aceite.getCodigo());
       System.out.println("Precio: $" + Aceite.getPrecio());
       System.out.println("Stock:"+Aceite.getStock());
    }
}
