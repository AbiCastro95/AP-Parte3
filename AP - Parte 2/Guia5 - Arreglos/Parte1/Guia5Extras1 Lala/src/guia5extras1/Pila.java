package guia5extras1;

import java.util.Arrays;

public class Pila {

    private int tope = -1;
    private String[] elementos;

    public Pila(int tamanio) {
        this.elementos = new String[tamanio];
    }

    /*agregar(elem:String):void -> Incrementa en 1 el valor de tope y el String que recibe se 
guardará en el tope de la Pila, siempre y cuando la Pila no esté llena.*/
    public void agregar(String elem) {
        if (this.tope <= (elementos.length)) {
            this.tope = this.tope + 1;
            elementos[tope] = elem;
        }
    }

//verTope():String -> Retorna el String guardado en el tope de la Pila sin eliminarlo
    public String verTope() {
        return elementos[tope];
    }
//quitar():String -> Retorna el String guardado en el tope de la Pila eliminándolo (decrementa en 1 el valor de tope).

    public String quitar() {
        elementos[tope] = null;
        this.tope = this.tope - 1;
        return elementos[tope];
    }

//pilaVacia():boolean -> Devuelve true si el valor de tope es igual a -1.
    public boolean pilaVacia() {
        return this.tope == (-1);
    }

//pilaLlena():boolean -> Devuelve true si el valor de tope es igual a la longitud del arreglo menos uno.
    public boolean pilaLlena() {
        return this.tope == elementos.length - 1;
    }

    public void imprimirPila() {
        for (int i = 0; i < elementos.length; i++) {
            System.out.println("[" + elementos[elementos.length-1-i] + "] ");
        }
        System.out.println("");

    }
}
