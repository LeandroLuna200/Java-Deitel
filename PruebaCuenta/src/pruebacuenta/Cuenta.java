/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacuenta;

/**
 *
 * @author Leandro
 */
public class Cuenta {
    private String nombre;
    private double saldo;
    
    public Cuenta( String nombre, double saldo)
    {
        this.nombre = nombre;
        
        if( saldo > 0.0)
            this.saldo= saldo;
    }
    
    public void depositar( double montoDeposito)
    {
        if(montoDeposito > 0.0)
            saldo= saldo + montoDeposito;
    }
    
    public double obtenerSaldo()
    {
        return saldo;
    }
    
    public void establecerNombre( String nombre )
    {
        this.nombre= nombre;
    }
    
    public String obtenerNombre()
    {
        return nombre;
    }
}
