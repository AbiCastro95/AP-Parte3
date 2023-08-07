package ejercicio1;

public class Persona {

    private final String nombre;
    private final String apellido;
    private final int edad;
    private final int documento;

    private Perro perro1;
    private Perro perro2;
    private Perro perro3;

    public Persona(String nombre, String apellido, int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public void adoptarPerro(Perro perro) {

        if (perro1 == null) {
            this.perro1 = perro;
            System.out.println("He adoptado a: " + this.perro1.getNombre());
        } else if (perro2 == null) {
            this.perro2 = perro;
            System.out.println("He adoptado a: " + this.perro2.getNombre());
        } else if (perro3 == null) {
            this.perro3 = perro;
            System.out.println("He adoptado a: " + this.perro3.getNombre());
        } else {
            System.out.println("Ya no puedo adoptar.");
        }
    }

    public Perro perroMasGrande() {

        if (perro1 == null && perro2 == null && perro3 == null) {
            return null;
        }

        Perro perroMasGrande = this.perro1;

        if (perro2 != null && perro2.getEdad() > perroMasGrande.getEdad()) {
            perroMasGrande = this.perro2;
        } else if (perro3 != null && perro3.getEdad() > perroMasGrande.getEdad()) {
            perroMasGrande = this.perro3;
        } 
        return perroMasGrande;
    }
}
