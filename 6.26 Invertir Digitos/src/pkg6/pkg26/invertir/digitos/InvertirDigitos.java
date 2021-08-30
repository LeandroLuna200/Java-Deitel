/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg26.invertir.digitos;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class InvertirDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Ingrese un numero para inverir sus cifras: ");
        int numero = entrada.nextInt();
        
        System.out.println("Numero invertido: "+ invertirNumero( numero ) );
    }
    
    public static int invertirNumero( int numero )
    {
        int numInvertido = 0;
        int i = 1;
        while( numero > 0 )
        {
            numInvertido= (int) (numInvertido* Math.pow(10, i) + numero%10);
            numero/= 10;
        }
        return numInvertido;
    }
}
