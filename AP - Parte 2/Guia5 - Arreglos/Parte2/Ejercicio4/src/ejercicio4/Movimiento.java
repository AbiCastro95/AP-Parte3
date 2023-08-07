package ejercicio4;

import java.time.LocalDate;

/*
 * @author Abi Castro
 */
public class Movimiento {

    private LocalDate fecha;
    private char tipo;
    private double importe;
    private double saldo;

    public Movimiento(LocalDate fecha, char tipo, double importe, double saldo) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.importe = importe;
        this.saldo = saldo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public char getTipo() {
        return tipo;
    }

    public double getImporte() {
        return importe;
    }

    public double getSaldo() {
        return saldo;
    }
}
