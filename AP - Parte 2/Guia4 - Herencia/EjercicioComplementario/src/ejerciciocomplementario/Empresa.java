package ejerciciocomplementario;

/*
 * @author AbiCastro
 */
public class Empresa {

    private int contador = 0;

    public Empresa() {
    }
    
    public void contratar(Servicio servicio){
        if(servicio instanceof TrabajoPintura){
            System.out.println(servicio.detalleServicio());
            this.contador += servicio.costeTotal();
        } else if(servicio instanceof RevisionAlarma) {
            System.out.println(servicio.detalleServicio());
            this.contador += servicio.costeTotal();
        }
    }
    
    public void mostrarCostoTotalDeObras(){
        System.out.println("Costo total de obras contratadas: $" + this.contador);
    }
}
