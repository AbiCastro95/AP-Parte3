package ejercicioextra1;

public class EjercicioExtra1 {

    public static void main(String[] args) {
       
        Persona person = new Persona("Pedro", "Gomez");

        GPS gps = new GPS("Garmin", "SE2361");

        person.ubicarme(gps);
    }

}
