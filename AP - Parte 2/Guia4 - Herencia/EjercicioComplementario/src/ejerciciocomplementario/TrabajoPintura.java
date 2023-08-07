package ejerciciocomplementario;

import java.time.LocalDate;

/*
 * @author AbiCastro
 */
public class TrabajoPintura extends Servicio {

    private String edificacion;
    private double superficie;
    private double precioPintura;

    public TrabajoPintura(String trabajador, LocalDate fechaInicio, String cliente, double superficie, double precioPintura) {
        super(trabajador, fechaInicio, cliente);
        this.superficie = superficie;
        this.precioPintura = precioPintura;
    }

    public String getEdificacion() {
        return edificacion;
    }

    public void setEdificacion(String edificacion) {
        this.edificacion = edificacion;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecioPintura() {
        return precioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        this.precioPintura = precioPintura;
    }

    @Override
    public double costeMaterial() {
        return (this.superficie / 7.8) * this.precioPintura;
    }

    @Override
    public double costeManoObra() {
        return (this.superficie / 10) * 9.5;
    }

    @Override
    public double costeTotal() {
        double total = costeMaterial() + costeManoObra();

        if (this.superficie < 50) {
            double costeAdicional = total * 0.15;
            total += costeAdicional;
        }

        return total;
    }

    @Override
    public String detalleServicio() {

        String servicio = "TRABAJO DE PINTURA\n";
        servicio += "Cliente: " + this.cliente + "\n";
        servicio += "Fecha de inicio: " + this.fechaInicio + "\n";
        servicio += "Superficie: " + this.edificacion + "\n";
        servicio += "------------------------------------------\n";
        servicio += "Pintor: " + this.trabajador + "\n";
        servicio += "Coste Material: " + costeMaterial() + "\n";
        servicio += "Coste Mano Obra: " + costeManoObra() + "\n";

        if (this.superficie < 50) {
            double costeAdicional = costeTotal() - costeMaterial() - costeManoObra();
            servicio += "Coste Adicional: " + costeAdicional + "\n";
        }

        servicio += "TOTAL: " + costeTotal() + "\n";
        servicio += "------------------------------------------\n";

        return servicio;
    }

}
