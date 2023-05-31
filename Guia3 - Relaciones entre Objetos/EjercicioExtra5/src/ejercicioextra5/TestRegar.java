package ejercicioextra5;

/*Se pide desde el método main de una clase TestRegar:
a) Crear un Tanque y llenarlo con 5000 litros de agua.
b) Crear un Motor con este Tanque y que trabaje a velocidad Media.
c) Crear una Bomba con el motor instanciado en el punto b.
d) Hacer que la Bomba riegue y al finalizar invocar al método mostrarInfo.
 */
public class TestRegar {

    public static void main(String[] args) {

        TanqueDeAgua tanque = new TanqueDeAgua(5000);
        Motor motor = new Motor(tanque, "MEDIA");
        Bomba bomba = new Bomba(motor);

        bomba.regar();
        bomba.mostrarInfo();
    }
}
