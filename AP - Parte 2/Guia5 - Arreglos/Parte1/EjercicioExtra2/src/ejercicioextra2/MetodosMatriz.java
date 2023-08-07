package ejercicioextra2;

import java.util.Scanner;

/*
 * @author Abi Castro
 */
public class MetodosMatriz {

    private final String[] VECTORMES;
    private final String[] VECTORCIUDAD;
    private final Dato[][] MATRIZ;
    private Dato dato;
    private Scanner scanner;

    public MetodosMatriz(Dato dato) {
        this.VECTORMES = new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        this.VECTORCIUDAD = new String[]{"San Luis", "Merlo", "Villa Mercedes"};
        this.MATRIZ = new Dato[VECTORMES.length + 1][VECTORCIUDAD.length + 1];
        this.dato = dato;
        this.scanner = new Scanner(System.in);
    }

    public void rellenarMatriz() {
        for (int i = 0; i < VECTORMES.length; i++) {
            for (int j = 0; j < VECTORCIUDAD.length; j++) {
                /*if (i == 0 && j == 0) {
                    this.MATRIZ[i][j] = "";
                } else if (i == 0 && j > 0) {
                    this.MATRIZ[i][j] = this.VECTORCIUDAD[j - 1];
                } else if (i > 0 && j == 0) {
                    this.MATRIZ[i][j] = this.VECTORMES[i - 1];
                } else {
                    System.out.println("Ciudad: " + MATRIZ[0][j]);
                    System.out.println("Mes: " + MATRIZ[i][0]);
                    MATRIZ[i][j] = rellenarDato();
                }*/
                System.out.println("Mes: " + VECTORMES[i]);
                System.out.println("Ciudad: " + VECTORCIUDAD[j]);
                Dato nuevoDato = new Dato();
                MATRIZ[i][j] = rellenarDato(nuevoDato);
            }
        }
    }

    public Dato rellenarDato(Dato dato) {

        System.out.print("Ingrese su nombre: ");
        dato.setNombre(scanner.nextLine());
        System.out.print("Ingrese su apellido: ");
        dato.setApellido(scanner.nextLine());
        System.out.print("¿Cuántos milímetros llovió? ");
        dato.setMilimetros(scanner.nextFloat());
        scanner.nextLine();

        return dato;
    }

    public void mostrarMatriz() {
        System.out.print(String.format("%-15s", ""));
        for (String ciudad : VECTORCIUDAD) {
            System.out.print(String.format("%-25s", ciudad));
        }
        System.out.println();

        // Imprimir filas de la matriz
        for (int i = 0; i < VECTORMES.length; i++) {
            // Imprimir nombre del mes
            System.out.print(String.format("%-15s", VECTORMES[i]));

            // Imprimir datos de lluvia de cada ciudad para el mes dado
            for (int j = 0; j < VECTORCIUDAD.length; j++) {
                System.out.print(String.format("%-25s", MATRIZ[i][j] != null ? MATRIZ[i][j].toString() : ""));
            }

            System.out.println();
        }
    }

    public float obtenerPromedioMaximoGlobal() {
        //El más bajo posible
        float maxPromedio = -Float.MAX_VALUE;

        for (int i = 0; i < VECTORMES.length; i++) {
            for (int j = 0; j < VECTORCIUDAD.length; j++) {
                float promedio = MATRIZ[i][j].getMilimetros();
                if (promedio > maxPromedio) {
                    maxPromedio = promedio;
                }
            }
        }
        return maxPromedio;
    }

    public float promedioMaximoPorCiudad(String ciudad) {
        //El más bajo posible
        float maxPromedio = -Float.MAX_VALUE;
        int ciudadIndex = -1;

        for (int i = 0; i < VECTORCIUDAD.length; i++) {
            if (VECTORCIUDAD[i].equalsIgnoreCase(ciudad)) {
                ciudadIndex = i;
                break;
            }
        }
        if (ciudadIndex != -1) {
            for (int i = 0; i < VECTORMES.length; i++) {
                float promedio = MATRIZ[i][ciudadIndex].getMilimetros();
                if (promedio > maxPromedio) {
                    maxPromedio = promedio;
                }
            }
        }
        return maxPromedio;
    }
}
