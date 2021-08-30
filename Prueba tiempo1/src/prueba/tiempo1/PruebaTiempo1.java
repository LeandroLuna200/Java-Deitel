/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.tiempo1;

/**
 *
 * @author leand
 */
public class PruebaTiempo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tiempo1 tiempo = new Tiempo1();
        
        mostrarTiempo("Despues de crear el objeto tiempo", tiempo);
        System.out.println();
        
        tiempo.establecerTiempo(15, 0, 9);
        mostrarTiempo("Despues de llamar a establecerTiempo", tiempo);
        
        try{
            tiempo.establecerTiempo(88, 99, 99);    
        }catch(IllegalArgumentException e){
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        
        mostrarTiempo("Despues de llamar a establecer con valores invalidos", tiempo);
    }
    
    public static void mostrarTiempo(String mensaje, Tiempo1 t){
        System.out.printf("%s%nTiempo Universal: %s%nTiempo Estandar: %s%n",
                mensaje, t.aStringUniversal(), t.toString());
    }
}
