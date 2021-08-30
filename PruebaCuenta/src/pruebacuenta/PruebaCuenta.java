/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacuenta;

import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class PruebaCuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        Cuenta miCuenta1 = new Cuenta("Leandro Luna", -15.6);
        Cuenta miCuenta2 = new Cuenta("Micaaa Natale", 7.1509);
        
        mostrarCuenta(miCuenta1);
        mostrarCuenta(miCuenta2);
        
        System.out.print("Introduzca el monto a depositar para cuenta1: ");
        double deposito = entrada.nextDouble();
        System.out.printf("%n sumando %.2f al saldo de la cuenta1%n%n",
                deposito);
        miCuenta1.depositar(deposito);
        
        mostrarCuenta(miCuenta1);
        mostrarCuenta(miCuenta2);
        
         System.out.print("Introduzca el monto a depositar para cuenta2: ");
        deposito = entrada.nextDouble();
        System.out.printf("%n sumando %.2f al saldo de la cuenta2%n%n",
                deposito);
        miCuenta2.depositar(deposito);
        
        mostrarCuenta(miCuenta1);
        mostrarCuenta(miCuenta2);
    }
    
    public static void mostrarCuenta(Cuenta cuentaAMostrar) 
    {
        System.out.printf("Saldo de %s: $%.2f%n", 
                cuentaAMostrar.obtenerNombre(), cuentaAMostrar.obtenerSaldo());
    }
}
