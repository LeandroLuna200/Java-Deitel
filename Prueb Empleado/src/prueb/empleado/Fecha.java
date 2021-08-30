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
public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    
    private static final int[] diaPorMes=
    {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    //constructor
    public Fecha(int dia, int mes, int anio){
        if(mes <= 0 || mes >  12)
            throw new IllegalArgumentException(
                    "mes debe ser 1-12");
        
        if(dia <= 0 || ( dia > diaPorMes[mes] && !( mes == 2 && dia == 29) ))
            throw new IllegalArgumentException(
            "dia fuera del rango");
        
        if(mes == 2 && dia == 29 && !(anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)))
            throw new IllegalArgumentException(
            "dia fuera del rango para el mes y año especificado");
        
        this.dia  = dia;
        this.mes  = mes;
        this.anio = anio;
    }
    
    @Override
    public String toString(){
        return String.format("%d/%d/%d", dia, mes, anio);
    }
}
