/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumagraficos;

import javax.swing.JOptionPane;

/**
 *
 * @author Leandro
 */
public class SumaGraficos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero numero"));
        
        String mensaje = String.format("La suma de %d y %d es: %d",
                numero1, numero2, numero1 + numero2);
        
        JOptionPane.showMessageDialog(null, mensaje);
    }

}
