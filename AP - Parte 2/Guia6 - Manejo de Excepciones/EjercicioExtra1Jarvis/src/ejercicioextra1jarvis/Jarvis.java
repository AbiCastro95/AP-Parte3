package ejercicioextra1jarvis;

import java.util.Random;

/*
 * @author Abi Castro
 */
public class Jarvis {

    public static void main(String[] args) {

        Armadura armadura = new Armadura("Rojo", "Dorado", 100);

        //120 segundos
        System.out.println("bateria inicial: " + armadura);
        armadura.caminar();
        armadura.correr();

//        

}
