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
public class EmpleadoPorHora extends Empleado{
    private double sueldo;
    private double horas;
    
    public EmpleadoPorHora( String primerNombre, String apellidoPaterno,
            String numeroSeguroSocial, Fecha fechaNacimiento,
            double sueldo, double horas )
    {
        super( primerNombre, apellidoPaterno, numeroSeguroSocial,
                fechaNacimiento );
        
        if( sueldo < 0.0 )
            throw new IllegalArgumentException(
            "El sueldo debe ser >= 0.0");
        
        if( horas < 0.0 || horas > 168.0 )
            throw new IllegalArgumentException(
            "Las horas deben ser >= 0.0 y <= 168.0");
         
        this.horas = horas;
        this.sueldo = sueldo;
        
    }
    
    public void establecerSueldo( double sueldo )
    {
        if( sueldo < 0.0 )
            throw new IllegalArgumentException(
              "El sueldo debe ser >= 0.0");
        this.sueldo = sueldo;
    }
    
    public double obtenerSueldo()
    {
        return sueldo;
    }
    
    public void establecerHoras( double horas )
    {
        if( horas < 0.0 || horas > 168.0 )
            throw new IllegalArgumentException(
            "Las horas deben ser >= 0.0 y <= 168.0");
        this.horas = horas;
    }
    
    public double obtenerHoras()
    {
        return horas;
    }
    
    @Override
    public double obtenerMontoPago()
    {
        if( obtenerHoras() <= 40 )
            return obtenerSueldo() * obtenerHoras();
        else
            return 40 * obtenerSueldo() + ( obtenerHoras() - 40 )
                        * obtenerSueldo() * 1.5;  
    }
    
    @Override
    public String toString()
    {
        return String.format( "empleado por horas: %s%n%s: $%,.2f; %s: %,.2f",
                super.toString(), "sueldo por hora", obtenerHoras(),
                "horas trabajadas", obtenerSueldo() );
    }
}
