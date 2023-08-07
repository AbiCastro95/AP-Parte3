package ejercicio6;

import java.util.ArrayList;

/*
 * @author Abi Castro
 */
public class Catalogo {

    private ArrayList<Producto> productos = new ArrayList();

    public void agregarProductos(Producto prod) {
        productos.add(prod);
        System.out.println("Producto agregado.");
    }

    //Puedo trabajar 3 listas
    public void infoPorCategoria() {
        int contR = 0;
        int contP = 0;
        int contE = 0;
        for (Producto aux : productos) {
            if (aux instanceof Ropa) {
                contR++;
            } else if (aux instanceof Perfumeria) {
                contP++;
            } else {
                contE++;
            }
        }
        System.out.println("Se encuentran : " + contE + " Electrodomesticos");
        System.out.println("Se encuentran : " + contP + " Diferentes perfumes");
        System.out.println("Se encuentran : " + contR + " Diferentes ropas");
    }

    public void listarElectrodomesticos() {
        for (Producto aux : productos) {
            if (aux instanceof Electrodomestico) {
                System.out.println(((Electrodomestico) aux));
            }
        }
    }

    public void listarRopas() {
        for (Producto aux : productos) {
            if (aux instanceof Ropa) {
                System.out.println(((Ropa) aux));
            }
        }
    }

    public void listarPerfumes() {
        for (Producto aux : productos) {
            if (aux instanceof Perfumeria) {
                System.out.println(((Perfumeria) aux));
            }
        }
    }
}