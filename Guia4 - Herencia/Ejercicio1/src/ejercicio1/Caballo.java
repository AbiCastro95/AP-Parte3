package ejercicio1;

public class Caballo extends Animal {

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public String Alimentarse() {
        return this.nombre + " Se alimenta de " + this.alimento;
    }
}
