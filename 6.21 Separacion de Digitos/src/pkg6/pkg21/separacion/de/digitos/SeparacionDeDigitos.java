/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg21.separacion.de.digitos;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class SeparacionDeDigitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero = entrada.nextInt();   
        mostrarDigitos( numero, cantDigitos( numero ) );
        
        System.out.println(" " + cantDigitos( numero ));
    }
    
    public static int parteEnteraCociente( int a, int b)
    {
        return a/b;
    }
    
    public static int residuoEntero( int a, int b)
    {
        return a%b;
    }
    
    public static void mostrarDigitos( int num, int cantDigitos )
    {
        System.out.println("Los digitos son: ");
        
        int digito;
        for( int i= (int) (Math.pow(10, cantDigitos-1)); i > 0; i/=10)
        {
            digito= separarDigito( num, i );
            System.out.println( digito + "  ");
            num= residuoEntero( num, i);
        }
    }
    public static int separarDigito( int num, int i)
    {
        return parteEnteraCociente( num, i);
    }
    
    public static int cantDigitos( int num )
    {
        int cantidad= 0; 
        
        while( num > 0 )
        {
            num /= 10;
            cantidad++;
        }
        return cantidad;
    }
}
