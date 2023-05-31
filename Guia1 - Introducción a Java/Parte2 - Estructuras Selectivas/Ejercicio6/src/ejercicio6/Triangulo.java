package ejercicio6;

public class Triangulo {

    final private int lado1;
    final private int lado2;
    final private int lado3;

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
/* SETTER y GETTER 
    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }
*/
    public boolean esUnTriangulo() {
        /*La regla de los triángulos plantea que la suma de dos de sus lados
        debe ser mayor a la longitud del tercer lado.*/
        if (lado1 + lado2 <= lado3) {
            return false;
        } else if (lado1 + lado3 <= lado2) {
            return false;
        } else if (lado2 + lado3 <= lado1) {
            return false;
        } else {
            return true;
        }
    }
    
    public String tipoTriangulo(){
        /*Si es un triángulo me devuelve el tipo. Si no lo es, me devuelve un mensaje.
        1) Creo  una variable con el resultado de la función.
        2) Hago la condición con los resultados que retorna.*/
        if (esUnTriangulo()){
            if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
               return "Sus lados forman un triángulo Equilátero"; 
            } else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
                return "Sus lados forman un triángulo Escaleno";
            } else {
                return "Sus lados forman un triángulo Isósceles";
            }
        } else {
            return "Con sus lados no se puede representar un triángulo!!!";
        }
    }
    
}

