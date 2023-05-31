package ejercicio1;

public class Perro extends Animal {

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public String Alimentarse() {
        return this.nombre + " se alimenta de " + this.alimento;
    }
}
