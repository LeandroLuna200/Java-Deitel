/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinar.numero;

import java.util.Scanner;
import java.security.SecureRandom;

/**
 *
 * @author leand
 */

public class AdivinarNUmero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final SecureRandom aleatorio = new SecureRandom();
        Scanner entrada = new Scanner(System.in);
        
        int numeroUsuario = entrada.nextInt();
        int numeroAleatorio = 1 + aleatorio.nextInt(100);
        int contadorIntentos = 1;
        
        System.out.println(numeroAleatorio);
        
        while( contadorIntentos != 10){
            if(numeroUsuario == numeroAleatorio){
                System.out.println("Adivinaste el numero. FELICIDADES!!!");
                contadorIntentos = 10;
            }else {
            if( numeroUsuario < numeroAleatorio )
                System.out.println("El numero ingresado es menor");
            else
                System.out.println("El numero ingresado es mayor");
            
            ++contadorIntentos;
            numeroUsuario = entrada.nextInt();
            }
        }
    }
    
}
