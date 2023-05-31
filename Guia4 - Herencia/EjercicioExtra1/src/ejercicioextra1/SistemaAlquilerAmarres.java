package ejercicioextra1;

import java.time.LocalDate;

public class SistemaAlquilerAmarres {

    public static void main(String[] args) {

        Alquiler alquiler = new Alquiler(LocalDate.now());
        alquiler.menuAlq();
    }

}
