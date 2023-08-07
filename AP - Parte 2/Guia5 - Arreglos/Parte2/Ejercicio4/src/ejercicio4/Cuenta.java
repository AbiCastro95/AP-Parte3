package ejercicio4;

import java.time.LocalDate;
import java.util.LinkedList;

/*
 * @author Abi Castro
 */
public class Cuenta {

    private long numero;
    private double saldo;
    private double interesAnual;
    private Cliente titular;
    private LinkedList<Movimiento> movimientos;

    public Cuenta(long numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.movimientos = new LinkedList<>();
    }

    public void depositar(double cantidad) {
        this.saldo += cantidad;
        Movimiento newMove = new Movimiento(LocalDate.now(), 'D', cantidad, this.saldo);
        this.movimientos.add(newMove);
    }

    public void extraer(double cantidad) {
        if (this.saldo > cantidad) {
            this.saldo -= cantidad;
            Movimiento newMove = new Movimiento(LocalDate.now(), 'E', cantidad, this.saldo);
            this.movimientos.add(newMove);
        }
    }

    public void cambiarInteresAnual(double valor) {
        this.interesAnual = valor;
    }

    public Cliente verTitular() {
        return this.titular;
    }

    public double verSaldo() {
        return this.saldo;
    }

    public void listarMovimientos() {
        System.out.println("||   FECHA    || TIPO ||  IMPORTE  ||   SALDO   ||");
        for (Movimiento move : movimientos) {

            String fecha = move.getFecha().toString();
            String tipo = String.valueOf(move.getTipo());
            String importe = String.format("$%.2f", move.getImporte());
            String saldo = String.format("$%.2f", move.getSaldo());

            String formattedLine = String.format("|| %-10s || %-4s || %-9s || %-9s ||", fecha, tipo, importe, saldo);
            System.out.println(formattedLine);
        }
    }

}

