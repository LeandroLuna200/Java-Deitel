/*
    Elmáximo común divisor(MCD)de dos enteros es el entero más grande que puede 
dividir de manera uniforme a cada uno de los dos números. Escriba un método 
llamado mcd que devuelva el máximo común divisor de dos enteros. 
[Sugerencia: tal vez sea conveniente que utilice el algoritmo de Euclides. 
Puede encontrar información acerca de este algoritmo en 
es.wikipedia.org/wiki/Algoritmo_de_Euclides]. 
Incorpore el método en una aplicación que reciba como entrada dos valores del 
usuario y muestre el resultado.
 */
package pkg6.pkg27.maximo.comun.divisor;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class MaximoComunDivisor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        
        System.out.println("El mcd es: " + mcd( numero1, numero2 ));
    }
    
    public static int mcd( int num1, int num2 )
    {
        if( num1 == 0)
            return num2;
        if( num2 == 0 )
            return num1;
        return mcd( num2, num1%num2);
    }
}
