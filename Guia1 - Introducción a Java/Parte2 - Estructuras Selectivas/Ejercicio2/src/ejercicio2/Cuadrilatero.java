package ejercicio2;

public class Cuadrilatero {
    
    private int largo;
    private int alto;

    public Cuadrilatero(int largo, int alto) {
        this.largo = largo;
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int calcularPerimetro() {
        return 2*largo + 2*alto;
    }

    public int calcularArea() {
        return largo*alto;
    }

    public boolean esUnCuadrado() {
        return (largo == alto);
    }
    
    public void respuesta(){
        if (esUnCuadrado()==true){
            System.out.println("Su figura es un cuadrado");
        } else {
            System.out.println("Su figura no es un cuadrado");
        }
    }
}
