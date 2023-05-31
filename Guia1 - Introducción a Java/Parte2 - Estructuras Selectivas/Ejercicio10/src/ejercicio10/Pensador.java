package ejercicio10;

public class Pensador {

    private int value;

    public Pensador(int value) {
        this.value = value;
    }

    public int getValor() {
        return value;
    }

    public void setValor(int value) {
        this.value = value;
    }

    public int invertir(int value) {
        /* 1) obtener el último dígito.
           2) agregar el dígito al número invertido.
           3) eliminar el último dígito del número original.
         */
        int inverted = 0;
        while (value != 0) {
            int digit = value % 10;
            inverted = inverted * 10 + digit;
            value = value / 10;
        }
        return inverted;
    }

    public int parAntes() {
        /* Si el módulo del número anterior con 2 da cero, significa que es par y retorna el número; si no, retorna el predecesor.
           Caso A) value=2023 => 2023-1=2022 => 2022%2==0 => previous 2022 => return 2022
           Caso B) value=2024 => 2024-1=2023 => 2023%2!=0 => previous 2024-2 => return 2022
         */
        int previous;
        if ((value - 1) % 2 == 0) {
            previous = value - 1;
        } else {
            previous = value - 2;
        }
        return previous;
    }

    public int parPosterior() {
        /* Si el módulo del número posterior con 2 da cero, significa que es par y retorna el número; si no, retorna el próximo.
           Caso A) value=2023 => 2023+1=2024 => 2024%2==0 => later=2024 => return 2024
           Caso B) value=2024 => 2024+1=2025 => 2025%2!=0 => later=2024+2 => return 2026
         */
        int later;
        if ((value + 1) % 2 == 0) {
            later = value + 1;
        } else {
            later = value + 2;
        }
        return later;
    }
    
    public int primerDigito(int value) {
        /* Tengo que dividir mi valor por 10 hasta que este en 0 pero para el primer dígito guardo en una variable antes de dividir.
        Ej. value=105 => 1° digit=105 value=10 => 2° digit=10 value=1 => 3° digit=1 value=0 => cierra y retorna digit, que es 1.        
        */
        int digit = 0;
        while (value != 0) {
            digit = value;
            value = value / 10;
        }
        return digit;
    }
    
    public int ultimoDigito(int value) {
        return value % 10;
    }
}
