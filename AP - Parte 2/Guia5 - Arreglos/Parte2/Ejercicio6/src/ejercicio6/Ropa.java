package ejercicio6;

/*
 * @author Abi Castro
 */
public class Ropa extends Producto{

    private String tipoTela;

    public Ropa(String tipoTela, int codigo, String descripcion, String marca, Double precioLista, int stock) {
        super(codigo, descripcion, marca, precioLista, stock);
        this.tipoTela = tipoTela;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.tipoTela + ". Precio: $" + calcularPrecioPublico();
    }

    @Override
    public Double calcularPrecioPublico() {
        return precioLista * 1.40;
    }
}
