package guia5extras2;

public class Registro {

    private Dato[][] registro;
    private String[] meses;
    private String[] ciudades;

    public Registro() {
        meses = new String[12];
        ciudades = new String[3];
        registro = new Dato[meses.length][ciudades.length];
       
    }

    private void cargarCiudades(String ciudad){
        for(int i =0; i<ciudades.length; i++){
            if(ciudades[i]==null){
                ciudades[i]=ciudad;
            }
        }
    }
            
    public final void cargarMeses(){
        meses[0]="enero";
        meses[1]="febrero";
        meses[2]="marzo";
        meses[3]="abril";
        meses[4]="mayo";
        meses[5]="junio";
        meses[6]="julio";
        meses[7]="agosto";
        meses[8]="septiembre";
        meses[9]="octubre";
        meses[10]="noviembre";
        meses[11]="diciembre";
    }
            
    public void llenarRegistro(Dato datoGenerico) {
        for (int m = 0; m < meses.length; m++) {
            for (int c = 0; c < ciudades.length; c++) {
                if (registro[m][c] == null) {
                    if (datoGenerico.getMes().equals(meses[m]) && datoGenerico.getLocalidad().equals(ciudades[c])) {
                        registro[m][c] = datoGenerico;

                    }
                }
            }
        }
    }
    
    public void imprimeMatriz() {  /// ojo!! probar haciendo toString tambien
        System.out.println("- - Imprime para control - -");
        for (int f = 0; f < meses.length; f++) {
            for (int c = 0; c < ciudades.length; c++) {
                System.out.print("[" + registro[f][c].getMilimetros() + "] ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    /*    ABIGAIL CASTRO
    public void rellenarMatriz() {

        for (int i = 0; i < vectorMes.length + 1; i++) {
            for (int j = 0; j < vectorCiudad.length + 1; j++) {
                if (i == 0 && j == 0) {
                    this.matriz[i][j] = "";
                } else if (i == 0 && j > 0) {
                    this.matriz[i][j] = this.vectorCiudad[j - 1];
                } else if (i > 0 && j == 0) {
                    this.matriz[i][j] = this.vectorMes[i - 1];
                } else {
                    matriz[i][j] = dato.toString();
                }
            }
        }
    }*/
}
