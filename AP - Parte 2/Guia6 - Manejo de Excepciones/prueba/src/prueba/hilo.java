/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/*
 * @author Abi Castro
 */
public class hilo {

    public static boolean[] datos = new boolean[4];

    public static String met(int i, boolean valor) {
        String salida = " ";
       // try {
            datos[i] = valor;
            salida += datos[i];
            salida += "OK";

        //} catch (Exception e) {
        // salida += " Excepcion ";
    //}

    
        //finally {
         //   salida += " Finally ";
    //}
    salida += "--" ;
    return salida ;
}
}
