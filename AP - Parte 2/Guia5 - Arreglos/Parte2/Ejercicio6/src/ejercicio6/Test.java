package ejercicio6;

/*
 * @author Abi Castro
 */
public class Test {

    public static void main(String[] args) {

        Catalogo cat = new Catalogo();

        Producto uno = new Perfumeria(100, 1, "Perfume bonito", "Paco", 200.0, 500);
        Producto dos = new Perfumeria(200, 2, "Perfume feo", "Pulver", 400.0, 1000);

        Producto tres = new Ropa("Seda", 3, "Ropa fina", " Adidas", 500.0, 2000);
        Producto cuatro = new Ropa("Algodon", 4, "Ropa clasica", " Nike", 1000.0, 4000);

        Producto cinco = new Electrodomestico(3500, 5, "Aire acondicionado", "Samsung", 20000.0, 50);
        Producto seis = new Electrodomestico(3000, 6, "Heladera", "Philips", 40000.0, 55);

        cat.agregarProductos(tres);
        cat.agregarProductos(uno);
        cat.agregarProductos(cuatro);
        cat.agregarProductos(seis);
        cat.agregarProductos(dos);
        cat.agregarProductos(cinco);

        System.out.println("------------------------------------------------------");

        cat.infoPorCategoria();

        System.out.println("------------------------------------------------------");

        cat.listarRopas();

        System.out.println("------------------------------------------------------");

        cat.listarPerfumes();

        System.out.println("------------------------------------------------------");

        cat.listarElectrodomesticos();

        System.out.println("------------------------------------------------------");
    }
}
