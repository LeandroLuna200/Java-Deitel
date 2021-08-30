/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg16.coleccionarraylist;

import java.util.ArrayList;

/**
 *
 * @author leand
 */
public class ColeccionArrayList {

    public static void main(String[] args) {
        ArrayList<String> elementos = new ArrayList<String>();
        
        elementos.add("Rojo");
        elementos.add("verde");
        
        System.out.println(
                "Mostrar contenido de la lista con ciclo controlado por contador:");
        
        for(int i= 0; i< elementos.size(); i++)
            System.out.printf("%s%n", elementos.get(i));
        
        mostrar(elementos, 
                "Mostrar contenido de la lista con ciclo mejorado:");
        elementos.add("Azul");
        elementos.add("Blanco");
        mostrar(elementos, "Dos nuevos elementos");
        
        elementos.remove("Blanco");
        mostrar(elementos, "Elimina Blanco");
        
        elementos.remove(0);
        mostrar(elementos, "Elimina Rojo");
        
        System.out.printf("Rojo %s esta en la lista%n", 
                elementos.contains("Rojo")? "" : "no" );
        
        System.out.printf("Tam del ArrayList: %d%n", elementos.size());
    }
    
    public static void mostrar(ArrayList<String> elementos, String descripcion)
    {
        System.out.println(descripcion);
        
        for(String elem :  elementos)
            System.out.print(elem + "\n");
        System.out.println();
    }
}
