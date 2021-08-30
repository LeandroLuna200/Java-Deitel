/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.pkg4.pkg1.pruebaempleadoporcomision;

/**
 *
 * Ejemplo de herencia
 */
public class EmpleadoPorComision extends Empleado{
    
    private double ventasBrutas;
    private double tarifaComision;
    
    public EmpleadoPorComision( String primerNombre, String apellidoPaterno,
            String numeroSeguroSocial, Fecha fechaNacimiento,
            double ventasBrutas, double tarifaComision)
    {
        super( primerNombre, apellidoPaterno, numeroSeguroSocial,
                fechaNacimiento );
        
        if( ventasBrutas < 0.0 )
            throw new IllegalArgumentException(
            "Las ventas brutas deben ser >= 0.0");
        if( tarifaComision <= 0.0 || tarifaComision >= 1.0 )
            throw new IllegalArgumentException(
            "La tarifa social deben ser >= 0.0 y >= 1.0");
        
        
        this.ventasBrutas       = ventasBrutas;
        this.tarifaComision     = tarifaComision;
    }
    
    
    
    public void establecerVentasBrutas( double ventasBrutas )
    {
        if( ventasBrutas <= 0.0)
            throw new IllegalArgumentException(
            "Las ventas brutas deben ser >= 0.0");
        this.ventasBrutas = ventasBrutas;
    }
    
    public double obtenerVentasBrutas(){
        return ventasBrutas;
    }
    
    public void establecerTarifaComision( double tarifaComision){
        if( tarifaComision <= 0.0 || tarifaComision >= 1.0 )
            throw new IllegalArgumentException(
            "La tarifa de comision deben ser >= 0.0 y >= 1.0");
        
        this.tarifaComision = tarifaComision;
    }
    
    public double obtenerTarifaComision(){
        return tarifaComision;
    }
    
    @Override
    public double obtenerMontoPago(){
        return obtenerTarifaComision() * obtenerVentasBrutas();
    }
    
    @Override
    public String toString(){
        return String.format("“%s: %s%n%s: %.2f%n%s: %.2f",
                "Empleado por comision", super.toString(),
                "ventas brutas", obtenerVentasBrutas(),
                "tarida por comision", obtenerTarifaComision());
    }
}
