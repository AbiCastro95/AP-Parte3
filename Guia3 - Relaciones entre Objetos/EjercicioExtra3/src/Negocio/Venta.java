package Negocio;

import entidades.Cliente;
import entidades.Vendedor;
import entidades.Producto;

public class Venta {

    private final Cliente cliente;
    private final Vendedor vendedor;
    private final Producto producto1;
    private final Producto producto2;
    private final Producto producto3;

    public Venta(Cliente cliente, Vendedor vendedor, Producto producto1, Producto producto2, Producto producto3) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.producto1 = producto1;
        this.producto2 = producto2;
        this.producto3 = producto3;
    }

    public float calcularTotal() {
        float total = producto1.calcularPrecioPublico() + producto2.calcularPrecioPublico() + producto3.calcularPrecioPublico();
        if (cliente.getCiudad().equals("San Luis")) {
            return total = total - total * 0.10F;
        } else {
            return total = total - total * 0.15F;
        }
    }
}
