package ejercicio6;

/*
 * @author Abi Castro
 */
public abstract class Producto {

    protected int codigo;
    protected String descripcion;
    protected String marca;
    protected Double precioLista;
    protected int stock;

    public Producto(int codigo, String descripcion, String marca, Double precioLista, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.precioLista = precioLista;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(Double precioLista) {
        this.precioLista = precioLista;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto: " + codigo + ", " + descripcion + ", marca: " + marca + ", stock: " + stock;
    }
    
    public abstract Double calcularPrecioPublico();
}
