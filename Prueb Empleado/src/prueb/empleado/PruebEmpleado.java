/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueb.empleado;

/**
 *
 * @author leand
 */
public class PruebEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fecha fechaNac  = new Fecha(1,1,1998);
        Fecha fechaCont = new Fecha(20,2,2021);
        
        Empleado empleado = new Empleado("Leandro",  "Luna", fechaNac, fechaCont);
        
        System.out.println(empleado);
    }
    
}
