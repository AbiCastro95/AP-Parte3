package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        Animal perro1 = new Perro("Flora", "Croquetas", 5, "Caniche");
        Perro perro2 = new Perro("Gor", "Carne", 8, "Doberman");
        Animal gato = new Gato("Cielo", "Carne", 2, "Sphynx");
        Animal caballo = new Perro("Spirit", "Pasto", 3, "Fino");
        
        System.out.println(perro1.Alimentarse());
        System.out.println(perro2.Alimentarse());
        System.out.println(gato.Alimentarse());
        System.out.println(caballo.Alimentarse());
    }
    
}
