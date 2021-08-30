/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg2.design2;

import javax.swing.JFrame;

/**
 *
 * @author Leandro
 */
public class Design2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArteLineal panel= new ArteLineal();
        
        JFrame aplicacion= new JFrame();
        
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        aplicacion.add(panel);
        aplicacion.setSize(500, 500);
        aplicacion.setVisible(true);
    }
    
}
