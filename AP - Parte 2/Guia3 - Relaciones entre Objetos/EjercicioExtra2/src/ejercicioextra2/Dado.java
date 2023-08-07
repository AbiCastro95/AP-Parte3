package ejercicioextra2;

public class Dado {

    private int numero;

    public Dado() {
        this.numero = 0;
    }

    public void generarNumero() {
        /* Math.random() genera un número aleatorio entre 0 (incluido) y 1 (excluido).
        Entonces, Math.random() * 6 multiplicará ese número aleatorio por 6,
        obteniendo así un número aleatorio entre 0 (incluido) y 6 (excluido).
        Luego, se suma 1 a ese resultado mediante + 1.
        Esto se hace para ajustar el rango del número aleatorio y
        obtener un número entero entre 1 (incluido) y 7 (excluido).
        
        0.0*6 = 0.0 + 1 = 1.0 => int 1 | | 0.9*6 = 5.4 + 1 = 6.4 => int 6
         */
        int valor = (int) (Math.random() * 6 + 1);
        if (this.numero <= 0) {
            this.numero = valor;
        }
    }

    public int verNro() {
        return this.numero;
    }
}
