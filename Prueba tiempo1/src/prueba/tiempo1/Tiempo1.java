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
public class Tiempo1 {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Tiempo1(){
        this(0, 0, 0);
    }
    
    public Tiempo1(int hora, int minuto, int segundo){
        this.hora= hora;
        this.minuto= minuto;
        this.segundo= segundo;
    }
    
    public void establecerTiempo(int hora, int minuto, int segundo){
        if(hora < 0 || hora >= 24 || minuto < 0 || minuto >= 60 || segundo < 0 || segundo >= 60)
        {
            throw new IllegalArgumentException("Hora, minuto o segundo fuera de rango");
        }
        
        this.hora= hora;
        this.minuto= minuto;
        this.segundo= segundo;
    }
    
    @Override
    public String toString(){
        return String.format("%d:%02d:%02d %s",
                ((hora == 0 || hora == 12) ? 12 : hora % 12),
                minuto, segundo, (hora < 12 ? "AM" : "PM"));
    }

    public String aStringUniversal(){
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    } 
    
}
