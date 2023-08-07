package ejercicio4;

import java.time.LocalDate;

/*
 * @author Abi Castro
 */
public class Test {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("Juan", "Lucero", "Merlo", LocalDate.of(1978, 7, 25));
        Cuenta cuenta = new Cuenta(1234, cliente);
        
        System.out.println(cuenta.verTitular());
        cuenta.depositar(60000);
        cuenta.extraer(10000);
        System.out.println("Saldo: $" + cuenta.verSaldo());
        cuenta.extraer(19560);
        cuenta.extraer(25500);
        cuenta.depositar(5000.50);
        cuenta.listarMovimientos();
    }
    
}
