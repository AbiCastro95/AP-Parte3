package ejercicioextra1;

/*
 * @author Abi Castro
 */
public class Pila {

    private int tope = -1;
    private String[] elementos;
    
    public Pila(int tamaño) {
        this.elementos = new String[tamaño];
    }

    public void agregar(String elemento) {
        if (!pilaLlena()) {
            tope++;
            //elementos[0]
            elementos[tope] = elemento;
        } else {
            System.out.println("No hay espacio en su pila.");
        }
    }

    public String verTope() {
        //Podria ser tope-1
        return elementos[tope];
    }

    public String quitar() {
        if (!pilaVacia()) {
            tope--;
            return elementos[tope];
        } else {
            return "Su pila está vacia";
        }
    }

    public boolean pilaVacia() {
        return tope == -1;
    }

    public boolean pilaLlena() {
        return tope == elementos.length - 1;
    }
    
    public void mostrarVector(){
        for (int i = 0; i < elementos.length; i++) {
            System.out.println(elementos[i]);
        }
    }
}
