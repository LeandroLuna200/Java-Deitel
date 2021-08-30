/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15.pkg10.creararchivosecuencial;

import java.io.Serializable;

/**
 *
 * @author leand
 */
public class Cuenta implements Serializable{
    private int cuenta;
    private String nombre;
    private String apellido;
    private double saldo;
    
    public Cuenta()
    {
        this(0, "", "", 0);
    }
    
    public Cuenta(int cuenta, String nombre, String apellido, double saldo)
    {
        this.cuenta   = cuenta;
        this.nombre   = nombre;
        this.apellido = apellido;
        this.saldo    = saldo;
    }
    
    public void establecerCuenta( int cuenta )
    {
        this.cuenta = cuenta;
    }
    
    public int obtenerCuenta()
    {
        return cuenta;
    }
    
    public void establecerNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String obtenerNombre()
    {
        return nombre;
    }
    
    public void establecerApellido(String apellido)
    {
        this.apellido = apellido;
    }
    
    public String obtenerApellido()
    {
        return apellido;
    }
    
    public void establecerSaldo( int saldo )
    {
        this.saldo = saldo;
    }
    
    public double obtenerSaldo()
    {
        return saldo;
    }
}
