/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;
import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        
        int num1,
            num2,
            suma;
        
        System.out.println("Escriba el primer entero: ");
        num1= entrada.nextInt();
        
        System.out.println("Escriba el segundo entero: ");
        num2= entrada.nextInt();
        
        suma= num1 + num2;
        
        System.out.printf("La suma es %d%n", suma);
    }
    
}
