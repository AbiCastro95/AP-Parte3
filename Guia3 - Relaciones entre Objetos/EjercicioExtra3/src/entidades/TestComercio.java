package entidades;

import Negocio.Venta;

public class TestComercio {

    public static void main(String[] args) {

        Producto productoA = new Producto("Lavandina Ayudín 500ml", "Limpieza", 200.5F, 5);
        Producto productoB = new Producto("Acuarius POMELO 1.5l", "Agua saborizada", 250.25F, 25);
        Producto productoC = new Producto("Larga vida descremada 1l", "Lácteo", 280.0F, 15);
        
        Producto productoD = new Producto("Perfumina POET 500ml", "Limpieza", 150.0F, 8);
        Producto productoE = new Producto("Coca Cola Zero 2l", "Gaseosa", 350.0F, 10);
        Producto productoF = new Producto("Larga vida 1l", "Lácteo", 265.20F, 20);

        Vendedor vendedorA = new Vendedor("Gustavo Cerna", "22578385", "Sucursal 1");
        Vendedor vendedorB = new Vendedor("Pedro Díaz", "36974216", "Sucursal 2");
        
        Cliente clienteA = new Cliente("Juan Pérez", "Rosario");
        Cliente clienteB = new Cliente("Rocio Baez", "San Luis");
        
        Venta venta1 = new Venta(clienteA, vendedorA, productoA, productoB, productoC);
        Venta venta2 = new Venta(clienteB, vendedorB, productoD, productoE, productoF);
        
        System.out.println("Vendedor: " + vendedorA.getNombre());
        System.out.println("Nombre del cliente: " + clienteA.getNombre());
        System.out.println("Monto de la venta: " + venta1.calcularTotal());
        System.out.println("");
        System.out.println("Vendedor: " + vendedorB.getNombre());
        System.out.println("Nombre del cliente: " + clienteB.getNombre());
        System.out.println("Monto de la venta: " + venta2.calcularTotal());
        
    }

}
