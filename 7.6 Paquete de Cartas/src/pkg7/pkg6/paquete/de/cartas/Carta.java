/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg6.paquete.de.cartas;

/**
 *
 * @author Leandro
 */
public class Carta {

    private final String cara; // cara de la carta ("As", "Dos", ...)
    private final String palo; // palo de la carta ("Corazones", "Diamantes", ...)

    // constructor de dos argumentos
    public Carta(String caraCarta, String paloCarta) {
        this.cara = caraCarta;
        this.palo = paloCarta;
    }

    // devuelve representacion string de carta
    @Override
    public String toString() {
        return cara + " de " + palo;
    }
}
