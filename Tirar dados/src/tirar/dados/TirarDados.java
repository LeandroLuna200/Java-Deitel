/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tirar.dados;

import java.security.SecureRandom;

/**
 *
 * @author Leandro
 */
public class TirarDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SecureRandom numerosAleatorios = new SecureRandom();
        
        //itera 20 veces
        for( int contador = 1; contador <= 20; ++contador )
        {
            //elige numeros aleatorios del 1 al 6
            int cara = 1 + numerosAleatorios.nextInt(6);
            
            System.out.printf("%d  ", cara);
            
            if( contador % 5 == 0)
                System.out.println();
        }
    }
    
}
