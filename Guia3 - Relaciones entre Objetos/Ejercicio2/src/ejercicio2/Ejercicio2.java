package ejercicio2;

import java.time.LocalDate;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        Kiosco sucursal1 = new Kiosco("Victor Lemos 2548", "Más Barato X Docena", "30-71500212-0");
        
        Empleado empleado1 = new Empleado("Juan", "López", "34860156", LocalDate.of(2019, 1, 25));
        Empleado empleado2 = new Empleado("Nuria", "Tocce", "38521784", LocalDate.of(2018, 6, 2));
        Empleado empleado3 = new Empleado("Tomás", "Kyota", "50875692", LocalDate.of(2022, 10, 16));
        
        sucursal1.incorporacionEmpleado(empleado1);
        sucursal1.incorporacionEmpleado(empleado2);
        sucursal1.incorporacionEmpleado(empleado3);
        
        sucursal1.mayorAntiguedad();
    }
    
}
