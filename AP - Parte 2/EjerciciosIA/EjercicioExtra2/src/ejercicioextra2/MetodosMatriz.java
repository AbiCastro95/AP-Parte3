package ejercicioextra2;

import java.util.Scanner;

/*
 * @author Abi Castro
 */
public class MetodosMatriz {

    private final String[] vectorMes;
    private final String[] vectorCiudad;
    private String[][] matriz;
    private Dato dato;

    public MetodosMatriz(Dato dato) {
        this.vectorMes = new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        this.vectorCiudad = new String[]{"San Luis", "Merlo", "Villa Mercedes"};
        this.matriz = new String[vectorMes.length + 1][vectorCiudad.length + 1];
        this.dato = dato;
    }

    public void rellenarMatriz() {
        for (int i = 0; i < vectorMes.length + 1; i++) {
            for (int j = 0; j < vectorCiudad.length + 1; j++) {
                if (i == 0 && j == 0) {
                    this.matriz[i][j] = "";
                } else if (i == 0 && j > 0) {
                    this.matriz[i][j] = this.vectorCiudad[j - 1];
                } else if (i > 0 && j == 0) {
                    this.matriz[i][j] = this.vectorMes[i - 1];
                } else {
                    matriz[i][j] = dato.toString();
                }
            }
        }
    }

    public void rellenarDato() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        dato.setNombre(scanner.nextLine());
        System.out.print("Ingrese su apellido: ");
        dato.setApellido(scanner.nextLine());
        System.out.print("¿Cuántos milímetros llovió?");
        dato.setMilimetros(scanner.nextFloat());
    }

    public void mostrarMatriz() {
        for (int i = 0; i < vectorMes.length + 1; i++) {
            for (int j = 0; j < vectorCiudad.length + 1; j++) {
                System.out.print("|" + this.matriz[i][j] + "|");
            }
            System.out.println("");
        }
    }
}
