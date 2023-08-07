package ejercicio2;

public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizadorTDT, float precio, String color, char letra, float peso) {
        super(precio, color, letra, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

   @Override
    public float precioFinal() {
        float precioFinal = super.precioFinal();
        if (resolucion > 40) {
            precioFinal *= 1.3;
        }
        if (sintonizadorTDT){
            precioFinal += 500;
        }
        return precioFinal;
    }

}
