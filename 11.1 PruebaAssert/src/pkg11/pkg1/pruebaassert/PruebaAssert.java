/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11.pkg1.pruebaassert;

import java.util.Scanner;

/**
 *
 * @author leand
 */
public class PruebaAssert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escriba un numero entre 0 y 10: ");
        int numero = entrada.nextInt();
        
        //asegura el valor entre 0 y 10
        assert(numero >= 0 && numero <= 10) : "numero incorrecto " + numero;
        
        System.out.printf("Usted escribio %d%n", numero);
    }
    
}
