/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.pkg4.pkg1.pruebaempleadoporcomision;

/**
 *
 * @author leand
 */
public abstract class Empleado implements PorPagar{
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    private final Fecha fechaNacimiento;
    
    public Empleado( String primerNombre, String apellidoPaterno,
            String numeroSeguroSocial, Fecha fechaNacimiento)
    {   
        this.primerNombre       = primerNombre;
        this.apellidoPaterno    = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.fechaNacimiento    = fechaNacimiento;
    }
    
    public String obtenerPrimerNombre(){
        return primerNombre;
    }
    
    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    }
    
    public String obtenerNumeroSeguroSocial(){
        return numeroSeguroSocial;
    }
    
    public Fecha obtenerFechaNacimiento(){
        return fechaNacimiento;
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s", 
                "empleado por comision", obtenerPrimerNombre(), 
                obtenerApellidoPaterno(),
                "numero de seguro social", obtenerNumeroSeguroSocial(),
                "fecha nacimiento", obtenerFechaNacimiento());
    }
    
}
