/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.pkg4.clase.rectangulo;

/**
 *
 * @author LeandroLuna
 */
public class Rectangulo {
    private float longitud;
    private float anchura;
    
    public Rectangulo(){
        longitud = 1;
        anchura  = 1;
    }
    
    public void establecer( final float longitud, final float anchura ){
        if( longitud < 0.0 && anchura > 20.0 )
            throw new IllegalArgumentException(
                    "Longitud debe ser mayor 0.0 y menor a 20.0");
        this.longitud = longitud;
        this.anchura  = anchura;
    }
    
    public float obtenerLongitud(){
        return longitud;
    }
    
    public float obtenerAnchura(){
        return anchura;
    }
}
