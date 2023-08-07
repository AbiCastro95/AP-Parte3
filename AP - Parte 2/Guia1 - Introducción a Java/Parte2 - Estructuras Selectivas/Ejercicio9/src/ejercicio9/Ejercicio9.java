package ejercicio9;

public class Ejercicio9 {

    public static void main(String[] args) {
        Fecha fecha1 = new Fecha (11 , 06 , 1995);
        Fecha fecha2 = new Fecha (14 , 04 , 2023);
        
        System.out.println("¿El año " + fecha1.getYear() + " es bisiesto? " + fecha1.esBisiesto());
        System.out.println("¿El año " + fecha2.getYear() + " es bisiesto? " + fecha2.esBisiesto());
        
        
        System.out.println("Han pasado: " + fecha2.calcularAños(fecha1) + " años.");
    }
    
}
