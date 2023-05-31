package ejercicio1;

public class Numero {
    
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    /*public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }*/

    public boolean esPar() {
        return valor % 2 == 0;
    }

    public boolean esPositivo() {
        return valor >= 0;
    }
    
    public boolean esMultiplo(int valor2) {
        return valor % valor2 == 0;
    }
}
