/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg6.paquete.de.cartas;

import java.security.SecureRandom;

/**
 *
 * @author Leandro
 */
public class PaqueteDeCartasDeJuego {
    private Carta[] paquete;
    private int cartaActual;
    private static final int NUMERO_DE_CARTAS = 52;
    
    // generador de numeros aleatorios
    private static final SecureRandom numerosAleatorios = new SecureRandom();
    
    public PaqueteDeCartasDeJuego()
    {
        String[] caras = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis",          
                    "Siete", "Ocho", "Nueve", "Diez", "Joker", "Reina", "Rey" };
        String[] palos = { "Corazones", "Diamantes", "Treboles", "Picas" };
        
        paquete = new Carta[NUMERO_DE_CARTAS]; // crea un arreglo de Cartas
        cartaActual = 0;
        
        for (int cuenta = 0; cuenta < paquete.length; cuenta++)
            paquete[ cuenta ] = new Carta( caras[cuenta % 13], palos[cuenta /13 ]);
    }
    
    public void barajar()
    {
        cartaActual = 0;
        
        // para cada carta selecciona otra carta aleatoria (0 a 51) y las intercambia
        for( int primera = 0; primera < paquete.length; primera++)
        {
            // seleccionau n numero aleatorio entre 0 y 51
            int segunda =   numerosAleatorios.nextInt(NUMERO_DE_CARTAS);
            
            // intercambia cartaActual con la carta seleccionada al azar
            Carta temp = paquete[ primera ];
            paquete[ primera ] = paquete[ segunda ];
            paquete[segunda] = temp;
        }
    }
    
    // reparte uan carta
    public Carta repartirCarta()
    {
        // determina si quedan cartas por repartir
        if( cartaActual < paquete.length )
            return paquete[cartaActual++]; // devuelve la carta actual en el arreglo
        else
            return null; // no hay mnas cartas disponibles
    }
}
