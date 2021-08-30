/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.pkg9.redondeo;
import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class Redondeo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double y = entrada.nextDouble();
        
//        y= Math.floor(y);

//        y = Math.floor(y * 10 + 0.5) / 10; // redondea y en la posición de las décimas
        
        y = Math.floor(y * 100 + 0.5) / 100; // redondea y en la posición de las centésimas
        
        System.out.println( y );
    }
    
}
