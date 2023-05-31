package ejercicio2;

public abstract class Electrodomestico {

    protected float precio;
    protected String color;
    protected char consumoEnergetico;
    protected float peso;

    public Electrodomestico() {
    }

    public Electrodomestico(float precio, String color, char letra, float peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(letra);
        this.peso = peso;
    }

    
    public char comprobarConsumoEnergetico(char letra) {
        if(letra >= 'A' && letra < 'F'){
            return letra;
        } else {
            return 'F';
        }
        /*switch (letra) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                return letra;
            default:
                return 'F';
        }*/
    }

    public String comprobarColor(String color) {
        //puede ser un if
        switch (color.toLowerCase()) {
            case "negro":
            case "rojo":
            case "azul":
            case "gris":
                return color;
            default:
                return "blanco";
        }
    }

    public float precioFinal() {
        //Sumamos según el tipo
        switch (this.consumoEnergetico) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;
        }
        //Sumamos según el peso
        if (this.peso >= 1 && this.peso < 20) {
            this.precio += 100;
        } else if (this.peso >= 20 && this.peso < 50) {
            this.precio += 500;
        } else if (this.peso >= 50 && this.peso < 80) {
            this.precio += 800;
        } else if (this.peso >= 80) {
            this.precio += 1000;
        }
        return precio;
    }
}
