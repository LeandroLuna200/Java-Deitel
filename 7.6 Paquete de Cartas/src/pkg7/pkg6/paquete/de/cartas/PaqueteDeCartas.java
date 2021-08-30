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
public class PaqueteDeCartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaqueteDeCartasDeJuego miBaraja = new PaqueteDeCartasDeJuego();
        miBaraja.barajar();
        
        for( int i = 1; i <= 52; i++ )
        {
            System.out.printf("%-19s", miBaraja.repartirCarta());
            
            if( i % 4 == 0 )
                System.out.println("");
        }
    }
}
