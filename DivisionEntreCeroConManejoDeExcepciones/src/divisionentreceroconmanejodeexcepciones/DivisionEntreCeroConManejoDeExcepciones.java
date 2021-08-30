/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisionentreceroconmanejodeexcepciones;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author leand
 */
public class DivisionEntreCeroConManejoDeExcepciones {

    public static int cociente( int numerador, int denominador )
            throws ArithmeticException
    {
        return numerador / denominador;
    }
    
    public static void main(String[] args) {
        Scanner explorador = new Scanner(System.in);
        boolean continuarCiclo = true;
        
        do
        {
            try
            {
                System.out.print("Introduzca un numerador entero: ");
                int numerador = explorador.nextInt();
                System.out.print("Introduzca un denominador entero: ");
                int denominador = explorador.nextInt();
        
                int resultado = cociente( numerador, denominador );
                System.out.printf("%nResultado: %d / %d = %d%n",
                   numerador, denominador, resultado);
                continuarCiclo = false;
            }
            catch( InputMismatchException inputMismatchException )
            {
                System.err.printf("%nExcepcion: %s%n",
                        inputMismatchException);
                explorador.nextLine();
                System.out.println(
                        "Debe introducir enteros. Intentelo de nuevo.");
            }
            catch( ArithmeticException arithmeticException )
            {
                System.out.printf("%nExcepcion: %s%n", arithmeticException);
                System.out.printf(
                    "Cero es un denominador invalido. Intentelo de nuevo.%n%n");
            }       
        }while( continuarCiclo );
    }
}
