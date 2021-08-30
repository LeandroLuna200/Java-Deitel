/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.pkg24imprimirrombos;

/**
 *
 * @author Leandro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantFilas= 5;
        
//        System.out.println("123456789");
//        System.out.print("hola");
        for( int i= 1; i <= cantFilas; ++i)
        {
            for( int j= cantFilas-1; j >= i; j--)
                System.out.print(" ");
            for( int k= 1; k <= 2*i-1; ++k)
                System.out.print("*");
//            System.out.print("error");
            System.out.println("");
        }
        for( int i= cantFilas-1; i > 0; --i)
        {
            for( int j= cantFilas; j > i; j--)
                System.out.print(" ");
            for( int k= 0; k < 2*i-1; ++k)
                System.out.print("*");
//            System.out.print("error");
            System.out.println("");
        }
    }
    
}