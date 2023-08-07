package ejercicio6;

/*
 * @author Abi Castro
 */
public class Electrodomestico extends Producto{

    private int consumoW;

    public Electrodomestico(int consumoW, int codigo, String descripcion, String marca, Double precioLista, int stock) {
        super(codigo, descripcion, marca, precioLista, stock);
        this.consumoW = consumoW;
    }

    public int getConsumoW() {
        return consumoW;
    }

    public void setConsumoW(int consumoW) {
        this.consumoW = consumoW;
    }

    @Override
    public String toString() {
        return super.toString() + ". Consumo: " + this.consumoW + ". Precio: $" + calcularPrecioPublico();
    }

    @Override
    public Double calcularPrecioPublico() {
        return precioLista * 1.25;
    }
}
