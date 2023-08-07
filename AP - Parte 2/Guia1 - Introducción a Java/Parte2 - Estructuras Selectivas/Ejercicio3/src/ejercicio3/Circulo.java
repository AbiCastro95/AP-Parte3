package ejercicio3;

public class Circulo {
        final double PI = 3.14;
        private double radio;
       

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
        
    public double calcularArea(){
        return PI * Math.pow(radio, 2);
        /* return PI * (radio * radio);
        Si utilizo ^ ambos términos deben ser enteros.
        */
    }
       
    public double calcularPerimetro(){
        return 2*PI*radio;
    }
}
