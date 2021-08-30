/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg16.esmultiplo;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class EsMultiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros: ");
        
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();
        
        System.out.println( multiplo( num1, num2 ));
    }
    
    public static boolean multiplo( int num1, int num2)
    {
        int multiplo= num1;
        
        if( num1 == 1 )
            return true;

        for( int i = 2; multiplo <= num2; ++i )
        {
            if( multiplo == num2 )
                return true;
            multiplo= num1* i;
        }
        return false;
    }
    
}
