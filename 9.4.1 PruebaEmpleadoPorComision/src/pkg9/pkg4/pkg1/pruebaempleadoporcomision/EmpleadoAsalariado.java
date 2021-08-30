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
public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;
    
    public EmpleadoAsalariado( String primerNombre, String apellidoPaterno,
            String numeroSeguroSocial, Fecha fechaNacimiento,
            double salarioSemanal){
        super( primerNombre, apellidoPaterno, numeroSeguroSocial,
                fechaNacimiento);
        if( salarioSemanal < 0.0 )
            throw new IllegalArgumentException(
            "El salario mensual debe ser >= 0.0");
        this.salarioSemanal = salarioSemanal;
    }
    
    public void establecerSalario( double salarioSemanal )
    {
        if( salarioSemanal < 0.0 )
            throw new IllegalArgumentException(
            "El salario mensual debe ser >= 0.0");
        this.salarioSemanal = salarioSemanal;
    }
    
    public double obtenerSalarioSemanal(){
        return salarioSemanal;
    }
    
    /**
     *
     *  implementa el método de la interfaz PorPagar
     */
    @Override
    public double obtenerMontoPago(){
        return obtenerSalarioSemanal();
    }
    
    @Override
    public String toString(){
        return String.format("Empleado Asalariado: %s%n%s: $%,.2f", 
                super.toString(), "salario semanal", obtenerSalarioSemanal());
    }
}
