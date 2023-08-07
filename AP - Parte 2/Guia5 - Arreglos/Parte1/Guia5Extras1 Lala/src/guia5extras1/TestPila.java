package guia5extras1;


public class TestPila {

    public static void main(String[] args) {
/*Luego, desde el método main de una clase TestPila, se pide:
a) Crear una Pila de 10 posiciones.
b) Agregar a la Pila 5 palabras.
c) Mostrar los datos guardados en la Pila sin perderlos.*/
    Pila diez = new Pila(10);
    diez.agregar("Lala");
    diez.agregar("está");
    diez.agregar("codeando");
    diez.agregar("un");
    diez.agregar("domingo");
    diez.imprimirPila();
       

    }
}
