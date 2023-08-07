package ejercicio2;

import java.time.LocalDate;

public class Kiosco {

    private final String direccion;
    private final String nombre;
    private final String cuit;
    
    private Empleado empleado1;
    private Empleado empleado2;
    private Empleado empleado3;

    public Kiosco(String direccion, String nombre, String cuit) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public void incorporacionEmpleado(Empleado empleado) {
        
        if (empleado1 == null){
            empleado1 = empleado; 
        } else if (empleado2 == null){
            empleado2 = empleado; 
        } else if (empleado3 == null){
            empleado3 = empleado; 
        } else{
            System.out.println("Cupos completos.");
        }
    }

    public void mayorAntiguedad() {
        
        if(empleado1 == null && empleado2 == null && empleado3 == null){
            System.out.println("No se encontraron empleados en la grilla.");
        }
        
        LocalDate date1 = empleado1.getFechaDeIngreso();
        LocalDate date2 = empleado2.getFechaDeIngreso();
        LocalDate date3 = empleado3.getFechaDeIngreso();
        
        if(date1.isBefore(date2) && date1.isBefore(date3)){
            System.out.println("El empleado con mayor antiguedad es: " + empleado1.toString() + " Ingreso: "  + date1);
        } else if (date2.isBefore(date1) && date2.isBefore(date3)){
            System.out.println("El empleado con mayor antiguedad es: " + empleado2.toString() + " Ingreso: " + date2);
        } else {
            System.out.println("El empleado con mayor antiguedad es: " + empleado3.toString() + " Ingreso: "  + date3);
        }
        
    }
}
