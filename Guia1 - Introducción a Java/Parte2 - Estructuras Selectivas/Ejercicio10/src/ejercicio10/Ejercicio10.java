package ejercicio10;

public class Ejercicio10 {

    public static void main(String[] args) {
        
        Pensador valor = new Pensador(2023);
        
        System.out.println("Número a analizar: " + valor.getValor());
        System.out.println("Número invertido: " + valor.invertir(valor.getValor()));
        System.out.println("Par Anterior: " + valor.parAntes());
        System.out.println("Par Posterior: " + valor.parPosterior());
        System.out.println("Primer dígito: " + valor.primerDigito(valor.getValor()));
        System.out.println("Último dígito: " + valor.ultimoDigito(valor.getValor()));
    }
    
}
