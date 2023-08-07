package entidades;

public class Producto {

    private final String descripcion;
    private final String tipoDeProducto;
    private float precioDeLista;
    private int stock;

    public Producto(String descripcion, String tipoDeProducto, float precioDeLista, int stock) {
        this.descripcion = descripcion;
        this.tipoDeProducto = tipoDeProducto;
        this.precioDeLista = precioDeLista;
        this.stock = stock;
    }
    
    public float calcularPrecioPublico() {
        if (tipoDeProducto.equals("Lácteo")) {
            return precioDeLista + (precioDeLista * 0.25F);
        } else if (tipoDeProducto.equals("Limpieza")) {
            return precioDeLista + (precioDeLista * 0.35F);
        } else {
            return precioDeLista + (precioDeLista * 0.45F);
        }
    }
}
