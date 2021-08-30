/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15.pkg7.consultacredito;

/**
 * Enumeración para las opciones del programa de consulta de crédito.
 * @author leand
 */
public enum OpcionMenu {
    // declara el contenido del tipo enum
    SALDO_CERO(1),
    SALDO_CREDITO(2),
    SALDO_DEBITO(3),
    FIN(4);
    
    private final int valor; 
    
    //constructor
    private OpcionMenu(int valor)
    {
        this.valor = valor;
    }
}
