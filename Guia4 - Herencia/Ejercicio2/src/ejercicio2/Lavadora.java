package ejercicio2;

public class Lavadora extends Electrodomestico{
    
    private float carga;

    public Lavadora() {
    }

    public Lavadora(float carga, float precio, String color, char letra, float peso) {
        super(precio, color, letra, peso);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    @Override
    public float precioFinal() {
        this.precio = super.precioFinal();
        if(carga > 30){
            this.precio += 500;
        }
        return this.precio;
    }

        
}
