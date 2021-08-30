/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg25;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        
        int numero= entrada.nextInt();
        if( esPrimo(numero) == true )
            System.out.println("El numero es primo ");
        else
            System.out.println("El numero no es primo");
        
        primerosNumerosPrimos();
    }
    
    public static boolean esPrimo( int numero )
    {
        if( numero == 1)
            return false;
        for( int i = 2; i <= (int)Math.sqrt( numero ); ++i)
        {
            if( ( numero % i )== 0)
                return false;
        } 
        return true;
    }
    
    /* Determina y muestra en pantalla los primeros 
       numero primos menores que 10.000 */
    public static void primerosNumerosPrimos()
    {
        System.out.println("primeros numero primos menores que 10.000: ");
        for( int i= 1; i < 10000; ++i )
        {
            if( esPrimo(i) == true )
                System.out.print( i + ", ");
        }
    }
}
