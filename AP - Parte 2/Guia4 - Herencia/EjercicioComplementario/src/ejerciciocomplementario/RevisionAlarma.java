package ejerciciocomplementario;

import java.time.LocalDate;

/*
 * @author AbiCastro
 */
public class RevisionAlarma extends Servicio {

    private int numAlarmas;

    public RevisionAlarma(int numAlarmas, String trabajador, LocalDate fechaInicio, String cliente) {
        super(trabajador, fechaInicio, cliente);
        this.trabajador = "Revisor Especialista Contraincendios";
        this.numAlarmas = numAlarmas;
    }

    public int getAlarmas() {
        return numAlarmas;
    }

    public void setAlarmas(int alarmas) {
        this.numAlarmas = alarmas;
    }

    @Override
    public double costeMaterial() {
        return 0;
    }

    @Override
    public double costeManoObra() {
        return (numAlarmas / 3.0) * 40;
    }

    @Override
    public double costeTotal() {
        return costeManoObra();
    }

    @Override
    public String detalleServicio() {

        String servicio = "REVISIÓN PERIÓDICA ALARMAS CONTRAINCENDIOS\n";
        servicio += "Cliente: " + this.cliente + "\n";
        servicio += "Fecha revisión: " + this.fechaInicio + "\n";
        servicio += "------------------------------------------\n";
        servicio += "TOTAL: " + costeManoObra() + "\n";
        servicio += "------------------------------------------\n";

        return servicio;
    }

}
