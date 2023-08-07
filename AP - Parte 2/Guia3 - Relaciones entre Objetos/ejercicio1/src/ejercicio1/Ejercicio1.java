package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Persona cliente1 = new Persona("Pedro", "Gonzales", 35, 34087975);

        Perro firu1 = new Perro("Blanca", "Bichón Maltes", 7, "Chico");
        Perro firu2 = new Perro("Milo", "Micro Caniche", 2, "Mini");
        Perro firu3 = new Perro("Amparo", "Labrador", 5, "Grande");
        Perro firu4 = new Perro("Salame", "Golden Retriever", 6, "Grande");

        cliente1.adoptarPerro(firu1);
        cliente1.adoptarPerro(firu2);
        cliente1.adoptarPerro(firu3);
        cliente1.adoptarPerro(firu4);

        System.out.println("El perro más viejo es: " + cliente1.perroMasGrande());
    }
    
}
