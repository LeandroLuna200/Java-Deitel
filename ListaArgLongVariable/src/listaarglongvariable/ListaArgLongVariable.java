/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaarglongvariable;

/**
 *
 * @author leand
 */
public class ListaArgLongVariable {
    
    public static double promedio(double ... numeros)
    {
        double total= 0.0;
        
        for(double d : numeros)
            total+= d;
        
        return total/numeros.length;
    }
    public static void main(String[] args) {
        double d1= 10.0, 
               d2= 20.0, 
               d3= 30.0, 
               d4= 40.0;
        
        System.out.printf("d1= %.1f%nd2= %.1f%nd3= %.1f%nd4= %.1f%n", 
                d1, d2, d3, d4);
        
        System.out.printf("Promedio d1, d2, d3= %.1f%n", promedio(d1, d2, d3));
        System.out.printf("Promedio d1, d2, d3 y d4= %.1f%n", promedio(d1, d2, d3, d4));
    }
    
}
