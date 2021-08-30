/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg22.manipulacionarreglos;

import java.util.Arrays;

/**
 *
 * @author leand
 */
public class ManipulacionArreglos {

    public static void main(String[] args) {
        double[] arregloDouble = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(arregloDouble);
        System.out.println("arregloDouble: ");

        for (double valor : arregloDouble) {
            System.out.printf("%.1f - ", valor);
        }

        int[] arregloLleno = new int[10];
        Arrays.fill(arregloLleno, 7);
        mostrarArreglo(arregloLleno, "arregloLleno");

        int[] arregloInt = {1, 2, 3, 4, 5};
        int[] copiaArreglo = new int[arregloInt.length];
        System.arraycopy(arregloInt, 0, copiaArreglo, 0, arregloInt.length);
        mostrarArreglo(copiaArreglo, "copiaArreglo");

        boolean b = Arrays.equals(arregloInt, copiaArreglo);
        System.out.printf("%n%narregloInt %s copiaArreglo%n",
                (b ? "==" : "!="));

        int ubicacion = Arrays.binarySearch(arregloInt, 5);

        if (ubicacion >= 0) {
            System.out.println("Se encontro 5 en el elemento " + ubicacion);
        } else {
            System.out.println("No se encontro el 5");
        }
        
        ubicacion = Arrays.binarySearch(arregloInt, 1509);

        if (ubicacion >= 0) {
            System.out.println("Se encontro 1509 en el elemento " + ubicacion);
        } else {
            System.out.println("No se encontro el 1509");
        }
    }
    
    public static void mostrarArreglo(int[] arregloInt, String nombre)
    {
        System.out.println();
        System.out.println(nombre);
        
        for(int valor : arregloInt)
            System.out.print(valor);
    }

}
