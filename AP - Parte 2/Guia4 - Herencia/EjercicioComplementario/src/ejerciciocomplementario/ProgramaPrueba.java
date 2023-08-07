package ejerciciocomplementario;

import java.time.LocalDate;

/*
 * @author AbiCastro
 */
public class ProgramaPrueba {

    public static void main(String[] args) {

        //TrabajoPintura(String trabajador, LocalDate fechaInicio, String cliente, double superficie, double precioPintura)
        TrabajoPintura trabajoPintura1 = new TrabajoPintura("Lionel Torn", LocalDate.of(2023, 5, 15), "Fundación Giran", 30.5, 1000.5);
        trabajoPintura1.setEdificacion("Oficina Ventas");
        
        TrabajoPintura trabajoPintura2 = new TrabajoPintura("Penélope Firtz", LocalDate.of(2023, 6, 5), "David Griezman", 15.0, 15000.75);
        trabajoPintura2.setEdificacion("Quincho");
        
        TrabajoPintura trabajoPintura3 = new TrabajoPintura("Federico Gómez", LocalDate.of(2023, 5, 25), "Los Soles S.R.L.", 65.2, 25000);
        trabajoPintura3.setEdificacion("Depósito");

        //RevisionAlarma(int numAlarmas, String trabajador, LocalDate fechaInicio, String cliente)
        Servicio revisionAlarma1 = new RevisionAlarma(4, "", LocalDate.of(2023, 5, 19), "CatCafe Lilo");
        Servicio revisionAlarma2 = new RevisionAlarma(2, "", LocalDate.of(2023, 6, 4), "Grace Páez");
        Servicio revisionAlarma3 = new RevisionAlarma(5, "", LocalDate.of(2023, 5, 23), "LKH S.A.");
        
        Empresa empresa = new Empresa();

        empresa.contratar(trabajoPintura1);
        empresa.contratar(trabajoPintura2);
        empresa.contratar(trabajoPintura3);
        empresa.contratar(revisionAlarma1);
        empresa.contratar(revisionAlarma2);
        empresa.contratar(revisionAlarma3);

        empresa.mostrarCostoTotalDeObras();
    }

}
