package ejercicio1;

public class Gato extends Animal {

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

   @Override
    public String Alimentarse() {
        return this.nombre + " Se alimenta de " + this.alimento;
    }
}
