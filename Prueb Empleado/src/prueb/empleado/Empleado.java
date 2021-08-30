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
public class Empleado {
    private final String nombre;
    private final String apellido;
    private final Fecha fechaNacimiento;
    private final Fecha fechaContratacion;
    
    public Empleado(String nombre, String apellido, Fecha fechaNacimiento, 
            Fecha fechaContratacion){
        this.nombre= nombre;
        this.apellido = apellido;
        this.fechaNacimiento= fechaNacimiento;
        this.fechaContratacion= fechaContratacion;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s Contratado: %s Nacimiento: %s", 
                nombre, apellido, fechaContratacion, fechaNacimiento);
    }
}
