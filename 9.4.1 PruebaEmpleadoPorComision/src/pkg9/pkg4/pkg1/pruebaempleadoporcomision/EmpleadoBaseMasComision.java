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
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salarioBase;
    
    public EmpleadoBaseMasComision( String primerNombre, String apellidoPaterno,
            String numeroSeguroSocial, Fecha fechaNacimiento,
            double ventasBrutas, double tarifaComision, double salarioBase)
    {
        // llamada explícita al constructor de la superclase EmpleadoPorComision
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, fechaNacimiento
                ,ventasBrutas, tarifaComision);
        
        if( salarioBase <= 0.0 )
            throw new IllegalArgumentException(
            "El salario base debe ser >= 1.0");
        
        this.salarioBase        = salarioBase;
    }
    
    public void establecerSalarioBase( double salarioBase ){
        if( salarioBase < 0.0 )
            throw new IllegalArgumentException(
            "El salario debe ser >= 0.0");
        this.salarioBase= salarioBase;
    }
    
    public double obtenerSalarioBase(){
        return salarioBase;
    }
    
    @Override
    public double obtenerMontoPago(){
        return obtenerSalarioBase() + super.obtenerMontoPago();
    }
    
    @Override
    public String toString(){
        return String.format("%s %s%n%s: %.2f", 
                "con sueldo base", super.toString(),
                "sueldo base", obtenerSalarioBase());
    } 
}