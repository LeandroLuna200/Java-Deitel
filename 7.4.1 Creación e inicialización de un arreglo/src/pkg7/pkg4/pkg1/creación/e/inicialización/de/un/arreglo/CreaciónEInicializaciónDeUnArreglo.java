/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg4.pkg1.creación.e.inicialización.de.un.arreglo;

/**
 *
 * @author Leandro
 */
public class CreaciónEInicializaciónDeUnArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = { 10, 20, 30, 40, 50 };
        
        System.out.printf("%s%8s%n", "Indice", "Valor");
        
        for(int contador = 0; contador < arreglo.length; contador++)
            System.out.printf("%5d%8d%n", contador, arreglo[ contador ]);        
    }
        
}
