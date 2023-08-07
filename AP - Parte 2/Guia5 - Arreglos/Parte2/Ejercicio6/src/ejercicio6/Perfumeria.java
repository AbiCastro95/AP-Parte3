package ejercicio6;

/*
 * @author Abi Castro
 */
public class Perfumeria extends Producto {

    private int tamanioEnCC;

    public Perfumeria(int tamanioEnCC, int codigo, String descripcion, String marca, Double precioLista, int stock) {
        super(codigo, descripcion, marca, precioLista, stock);
        this.tamanioEnCC = tamanioEnCC;
    }

    public int getTamanioEnCC() {
        return tamanioEnCC;
    }

    public void setTamanioEnCC(int tamanioEnCC) {
        this.tamanioEnCC = tamanioEnCC;
    }

    @Override
    public String toString() {
        return super.toString() + "CC: " + this.tamanioEnCC + ". Precio: $" + calcularPrecioPublico(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double calcularPrecioPublico() {
        int aux = tamanioEnCC / 100;
        return precioLista + (1 + (0.20 * aux));
    }
    /*
    @Override
    public void calcularPrecio() {
        double aux = cc;
        double porcentaje = 0;
        while (aux >= 100) {
            aux -= 100;
            porcentaje += 20;
        }
        precioLista = (int) (precioLista + (precioLista / 100 * porcentaje));
    }
    */
}
