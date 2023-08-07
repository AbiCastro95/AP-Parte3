/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra1jarvis;

/*
 * @author Abi Castro
 */
class Repulsor {

    private int consumoBasico;
    private int nivelDanio;
    private boolean daniado;

    public Repulsor() {
        this.consumoBasico = 10;
        this.nivelDanio = 0;
        this.daniado = false;
    }

    public float usar(int nivelDeInt, int tiempoEnSeg) {
        float energiaConsumida;
        energiaConsumida = consumoBasico * nivelDeInt * tiempoEnSeg;
        return energiaConsumida;
    }
}
