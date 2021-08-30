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
public class Factura implements PorPagar {
    private final String nroPieza;
    private final String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;
    
    public Factura(String nroPieza, String descripcion, int cantidad,
            double precioPorArticulo)
    {
        if( cantidad <= 0 )
            throw new IllegalArgumentException(
            "Cantidad debe ser >= 0");
        if( precioPorArticulo <= 0 )
            throw new IllegalArgumentException(
            "El precio por articulo debe ser >= 0");
        
        this.cantidad          = cantidad;
        this.descripcionPieza  = descripcion;
        this.nroPieza          = nroPieza;
        this.precioPorArticulo = precioPorArticulo;
    }
    
    public String obtenerNumeroPieza()
    {
        return nroPieza;
    }
    
    public String obtenerDescripcionPieza()
    {
        return descripcionPieza;
    }
    
    public void establecerCantidadDePiezas( int cantidadDePiezas )
    {
        if( cantidad <= 0 )
            throw new IllegalArgumentException(
            "Cantidad debe ser >= 0");
        this.cantidad = cantidadDePiezas;
    }
    
    public int obtenerCantidadDePieza()
    {
        return cantidad;
    }
    
    public void establecerPrecioPorArticulo( double precioPorArticulo )
    {
        if( precioPorArticulo <= 0 )
            throw new IllegalArgumentException(
            "El precio por articulo debe ser >= 0");
        this.precioPorArticulo = precioPorArticulo;
    }
    
    public double obtenerPrecioPorArticulo()
    {
        return precioPorArticulo;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
                "factura", "numero de Pieza", obtenerNumeroPieza(),
                                              obtenerDescripcionPieza(),
                "cantidad", obtenerCantidadDePieza(), "precio por articulo",
                                                    obtenerPrecioPorArticulo());
    }
    
    @Override
    public double obtenerMontoPago()
    {
        return obtenerCantidadDePieza() * obtenerPrecioPorArticulo();
    }
}
