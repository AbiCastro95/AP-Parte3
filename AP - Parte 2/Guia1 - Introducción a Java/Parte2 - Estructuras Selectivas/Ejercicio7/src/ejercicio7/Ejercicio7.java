package ejercicio7;

public class Ejercicio7 {

    public static void main(String[] args) {
        Robot tito = new Robot("Tito");

        double steps = 1;
        double count = 1;
        //Mientras la batería del robot no esté vacía avanzar 1 paso y consume 0.1u de energía.
        do {
            tito.avanzar(steps);
            System.out.println("Pasos dados: " + count++);
        } while (!tito.bateriaVacia() && steps <= tito.getBatery() * 100 / 10);

        /*for (count = 1; !tito.bateriaVacia() && steps <= tito.getBatery() * 100 / 10; count++) {
            tito.avanzar(steps);
            System.out.println("Pasos dados: " + count);
        }*/
        if (!tito.bateriaVacia()) {
            System.out.println(tito.getName() + " no tiene suficiente bateria para avanzar.");
        }

        System.out.println("Bateria: " + tito.getBatery());
    }

}
