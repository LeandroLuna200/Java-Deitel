/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogo1;
import javax.swing.JOptionPane;

/**
 *
 * @author Leandro
 */
public class Dialogo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido");
        
        String nombre = JOptionPane.showInputDialog("Cual es su nombre?");
        
        String mensaje= String.format("Bienvenido, %s, "
                + "a la programacion en Java", nombre);
        
        JOptionPane.showMessageDialog(null, mensaje);
    }  
}
